package wyznikiewicz.spring.implementations;

import wyznikiewicz.spring.api.Logger;
import wyznikiewicz.spring.api.UsersRepository;
import wyznikiewicz.spring.domain.User;

public class UsersRepositoryImpl implements UsersRepository {
	private Logger logger;
	
	public UsersRepositoryImpl(Logger logger, String localization, String dbName) {
		this.logger = logger;
		logger.log("Lokalizacja repozytorium: " + localization + "/" + dbName);
	}

	public User createUser(String name) {
		logger.log("Tworzenie użytkownika " + name);
		return new User(name);
	}


}
