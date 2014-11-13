package com.main;

import java.lang.reflect.InvocationTargetException;

import com.testreflection.CreateInstance;

public class test {
	
	public static void main(String[] args) {
		
		CreateInstance ci = new CreateInstance();
		try {
			
			String[] parameters = new String[2];
			parameters[0] = "sign in";
			parameters[1] = "password";
			
			ci.execute("HomePage", "openHomePage");
			ci.execute("PIPPage", "verifySku");
			ci.execute("HomePage", "signIn",parameters);
			ci.execute("HomePage", "searchSkuNumber", "123456");
			ci.execute("PLPPage", "clickOnFirstProduct");
			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | NoSuchMethodException
				| SecurityException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
