package com.java.behavioural.observer;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Product product = new Product(1, "Nokia 1110", "Unavailable");
		
		NotifyUser user1 = new NotifyUser("Mike", "Mike@gmail.com");
		NotifyUser user2 = new NotifyUser("Rachel", "rachel@gmail.com");
		
		//Add to subscriber list
		product.registerObserver(user1);
		product.registerObserver(user2);
		
		
		System.out.println(product.getStatus());
		try {
			System.out.println("setting the status to available");
			Thread.sleep(5000);
			product.setStatus("available");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
