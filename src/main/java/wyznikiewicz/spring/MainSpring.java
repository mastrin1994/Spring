package wyznikiewicz.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import wyznikiewicz.spring.api.UsersRepository;
import wyznikiewicz.spring.domain.User;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

		UsersRepository usersRepository = context.getBean("usersRepository", UsersRepository.class);
		
		User janek = usersRepository.createUser("janek");
	}

}
