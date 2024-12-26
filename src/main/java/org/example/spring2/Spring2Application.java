package org.example.spring2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Spring2Application implements CommandLineRunner {

    @Autowired//싱글톤으로 만들어서 램에 있는 객체의 주소를 찾아줌.
    Environment env;
    //설정된 값을 가지고 오는 객체
    //스프링 시작시에 싱글톤으로 프리 로딩 되어 있는 객체


    public static void main(String[] args) {
        SpringApplication.run(Spring2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String port = env.getProperty("server.port","8888");
        //프로퍼티(속성,특징)은 String리턴
        System.out.println("==================================================");
        System.out.println("스프링 부트 시작");
        System.out.println("http://localhost:"+port);
        System.out.println("==================================================");
    }
}
