package com.testreflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateInstance {
	
	public void execute(String className,String MethodName) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		className = "com.pageObjects."
				+ className;
		Class<?> c = Class.forName(className);
		Object object = c.newInstance();
		Method m = c.getDeclaredMethod(MethodName, new Class<?>[0]);
		m.invoke(object);
	}
	
	public void execute(String className,String MethodName, String parameter) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		className = "com.pageObjects."
				+ className;
		Class<?> c = Class.forName(className);
		Object object = c.newInstance();
		Method m = c.getDeclaredMethod(MethodName, new Class<?>[]{String.class});
		m.invoke(object,parameter);
	}
	
	public void execute(String className,String MethodName,String[] parameter) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		
		className = "com.pageObjects."
				+ className;
		Class<?> c = Class.forName(className);
		Object object = c.newInstance();
		Method m = c.getDeclaredMethod(MethodName, new Class<?>[]{String[].class});
		m.invoke(object,new Object[]{parameter});
	}
}
