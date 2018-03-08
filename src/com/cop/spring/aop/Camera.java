package com.cop.spring.aop;

public class Camera {

	/**
	 * NO arg constructor to help spring factory instantiate a bean
	 */
	public Camera() {
		
	}
	
	
	public void snap() {
		
		System.out.println("SNAP");
	}
}
