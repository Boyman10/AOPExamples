package com.cop.spring.aop;

/**
 * This class is called an Aspect
 * @author John
 *
 */
public class Logger {
	/**
	 * NO arg constructor to help spring factory instantiate a bean
	 */
	public Logger() {
		
	}
	
	/*
	 * This method advises
	 * it is a join point
	 */
	public void aboutToTakePhoto() {
		
		// Should turn this class as an aspect to advice on the camera class..
		System.out.println("About to take photo...");
	}
}
