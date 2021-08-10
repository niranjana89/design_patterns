/**
 * 
 */
package com.java.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author niranjana
 *
 */
public class Product implements Subject {
	
	private int id;
	
	private String name;
	
	private String status; 
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	public Product(int id, String name, String status) {
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	
	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
		this.notifyObservers();
	}
	
	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unregisterObserver(Observer observer) {
		observers.remove(observer);
	}
	
	

	@Override
	public void notifyObservers() {
		System.out.println("Notifying all the users");
		for( Observer o : observers) {
			o.update(this.name, this.status);
		}
	}

}
