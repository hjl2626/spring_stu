package com.java.observe.observable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.java.observe.observer.UserObserver;

import java.util.Observable;

/**
 * Created by hjl on 2016/12/16.
 */
public class User extends Observable{

	private String name;

	private String age;

	public User(){
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		this.setChanged();
		this.notifyObservers(this);
		return this;
	}

	public String getAge() {
		return age;
	}

	public User setAge(String age) {
		this.age = age;
		this.setChanged();
		this.notifyObservers(this);
		return this;
	}

	@Override
	public String toString() {
		return "User{" +
				"name='" + name + '\'' +
				", age='" + age + '\'' +
				'}';
	}
}
