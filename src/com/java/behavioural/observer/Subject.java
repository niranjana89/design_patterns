package com.java.behavioural.observer;

/**
 * @author niranjana
 *
 */
public interface Subject {

	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObservers();
	
}
