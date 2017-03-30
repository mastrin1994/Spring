package wyznikiewicz.spring.api;

import wyznikiewicz.spring.domain.User;

public interface UsersRepository {
	User createUser(String name);
	void setLogger(Logger logger);
}
