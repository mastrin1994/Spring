package wyznikiewicz.spring;

import wyznikiewicz.spring.api.Logger;
import wyznikiewicz.spring.api.UsersRepository;
import wyznikiewicz.spring.domain.User;
import wyznikiewicz.spring.implementations.LoggerImpl;
import wyznikiewicz.spring.implementations.UsersRepositoryImpl;

public class Main {

	public static void main(String[] args) {
		Logger logger = new LoggerImpl();
		UsersRepository usersRepository = new UsersRepositoryImpl();
		usersRepository.setLogger(logger);
		
		User user = usersRepository.createUser("janek");
	}

}
