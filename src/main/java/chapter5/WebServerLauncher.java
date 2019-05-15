package chapter5;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * webapp/WEB-INF/classes 가 Root로 잡히기 때문에 Output Path 변경해 주어야 함.
 */
public class WebServerLauncher {
	public static void main(String[] args) throws Exception {
		String webappDirLocation = "webapp/";
		Tomcat tomcat = new Tomcat();
		String webPort = System.getenv("PORT");
		if (webPort == null || webPort.isEmpty()) {
			webPort = "8080";
		}

		tomcat.setPort(Integer.valueOf(webPort));
		Connector connector = tomcat.getConnector();
		connector.setURIEncoding("UTF-8");
		tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
		System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());
		tomcat.start();
		tomcat.getServer().await();
	}
}
