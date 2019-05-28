### https://github.com/simjunbo/web-application-server (3장 ~ 6장)
### https://github.com/simjunbo/jwp-basic (6장 ~ 12장)


# 용어정리
* 서블릿 : Controller, HttpRequest, HttpResponse를 추상화해 인터페이스로 정의해 놓은 표준.
* 서블릿 컨테이너 : 서블릿 컨테이너는 이 서블릿 표준에 대한 구협을 담당. (웹 서버)
* Embedded 톰캣 : jar 파일을 이용해서 톰캣서버를 실행할 수 있다.
* 서블릿의 한계를 (동적 html)를 극복하기 위해 등장한 것이 jsp
* JSP의 복잡도가 증가하면서 한계를 극복하기 위해 등장한 기술이 JSTL(JavaServer Pages Standard Tag Library)와 EL(Expression Language)
* 프론터 컨트롤러 패턴 : DispatcherServlet 처럼 각 컨트롤러의 앞에 모든 요청을 받아 작업을 위하는 방식
* 포워딩과 리다이렉트 : https://sdevstudy.tistory.com/26
* DAO(Data Access Object) : 데이터베이스에 대한 접근 로직 처리를 담당하는 객체
* if/else가 아닌 인터페이스를 통해 문제를 해결하는 것이 확장가능하고 깔끔한 코드를 구현할 수 있다.
