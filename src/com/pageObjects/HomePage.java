package com.pageObjects;

public class HomePage {

	public void openHomePage(){
		System.out.println("Home Page is open");
	}
	
	public void signIn(String[] parameters){
		System.out.println("User Logged in with user id "+parameters[0] +" password "+ parameters[1]);
	}
	
	public void searchSkuNumber(String sku){
		System.out.println("User searched sku "+ sku);
	}
}
