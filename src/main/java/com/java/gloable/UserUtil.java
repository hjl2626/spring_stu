package com.java.gloable;

import com.java.observe.observable.User;
import com.java.observe.observer.UserObserver;

/**
 * Created by hjl on 2016/12/16.
 */
public class UserUtil {
	public static User user;
	static {
		user = new User();
		user.addObserver(new UserObserver());
	}
}
