package com.teclogi.security.tracking.service.utils;
/**
 * 
 * @author JhonMauricio
 *
 */
public enum SatellitePositionEnum {
	
	SPUTNIK (-500, -200),
	EXPLORER (100, -100),
	ASTERIX (500, 100);
	
	private double x;
	private double y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	SatellitePositionEnum(double x, double y) {
		this.x = x;
		this.y=y;
	}
	
	/**
	 * 
	 * @return x
	 */
	public double getX() {
		return x;
	}

	/**
	 * 
	 * @return y
	 */
	public double getY() {
		return y;
	}
}
