package com.java.observe.observer;

import com.java.observe.observable.User;

import org.apache.log4j.Logger;
import org.springframework.web.client.RestTemplate;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by hjl on 2016/12/16.
 */
public class UserObserver implements Observer{

	private static Logger logger = Logger.getLogger(UserObserver.class);
	RestTemplate restTemplate = new RestTemplate();
	@Override
	public void update(Observable o, Object arg) {
		logger.info("update" + this.toString());
		User user = restTemplate.getForObject("http://localhost:8080/getUser" , User.class);
		logger.info(user.toString());
	}
}
