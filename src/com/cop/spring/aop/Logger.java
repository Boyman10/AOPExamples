package com.cop.spring.aop;

public class Logger {

	public void aboutToTakePhoto() {
		
		// Should turn this class as an aspect to advice on the camera class..
		System.out.println("About to take photo...");
	}
}
