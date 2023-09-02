package com.teclogi.security.tracking.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author JhonMauricio
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SateliteDTO {

	private String name;
	
	private double distance;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
