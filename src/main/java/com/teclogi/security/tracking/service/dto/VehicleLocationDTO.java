package com.teclogi.security.tracking.service.dto;

import java.awt.geom.Point2D;

/**
 * VehicleLocationDTO se usara para retornar la posición del vehiculo y si está en peligro
 * @author JhonMauricio
 *
 */
public class VehicleLocationDTO {
	
	private Point2D position;
	private boolean isInDanger;
	
	/**
	 * 
	 * @return position
	 */
	public Point2D getPosition() {
		return position;
	}
	/**
	 * 
	 * @param position
	 */
	public void setPosition(Point2D position) {
		this.position = position;
	}
	/**
	 * 
	 * @return isInDanger
	 */
	public boolean isInDanger() {
		return isInDanger;
	}
	/**
	 * 
	 * @param isInDanger
	 */
	public void setInDanger(boolean isInDanger) {
		this.isInDanger = isInDanger;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VehicleLocationDTO [position=");
		builder.append(position);
		builder.append(", isInDanger=");
		builder.append(isInDanger);
		builder.append("]");
		return builder.toString();
	}
	

}
