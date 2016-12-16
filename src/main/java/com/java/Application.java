package com.java; /**
 * Created by hjl on 2016/12/16.
 */

import com.java.observe.observable.User;
import com.java.gloable.UserUtil;
import com.java.schedule.ScheduledTasks;

import org.apache.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableScheduling
@ComponentScan({"com.java"})
@RestController
@RequestMapping("/")
public class Application {

	private static Logger logger = Logger.getLogger(Application.class);

	@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public String home() {

		return ScheduledTasks.date;
	}

	@RequestMapping(value = "getUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser() {
		return UserUtil.user;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}