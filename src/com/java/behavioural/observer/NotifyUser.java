package com.java.behavioural.observer;

public class NotifyUser implements Observer {

	private String name;
	
	private String email;
	
	public NotifyUser(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	@Override
	public void update(String productName, String availability) {
		System.out.println("Hi " +this.name + ", your product: " + productName + " is " + availability);
		//Send email
	}

}
