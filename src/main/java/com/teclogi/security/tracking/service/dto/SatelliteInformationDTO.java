package com.teclogi.security.tracking.service.dto;

/**
 * @author JhonMauricio
 *
 */
public class SatelliteInformationDTO {

	private String name;
	
	private double distance;

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return distance
	 */
	public double getDistance() {
		return distance;
	}

	/**
	 * 
	 * @param distance
	 */
	public void setDistance(double distance) {
		this.distance = distance;
	}

	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SateliteDTO [name=");
		builder.append(name);
		builder.append(", distance=");
		builder.append(distance);
		builder.append("]");
		return builder.toString();
	}
	
	
}
