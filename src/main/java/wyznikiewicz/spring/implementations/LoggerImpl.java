package wyznikiewicz.spring.implementations;

import java.util.Date;

import wyznikiewicz.spring.api.Logger;

public class LoggerImpl implements Logger {

	public void log(String message) {
		System.out.println(new Date() + ": " + message);

	}

}
