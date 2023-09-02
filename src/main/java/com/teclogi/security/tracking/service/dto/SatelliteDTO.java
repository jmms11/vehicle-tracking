/**
 * 
 */
package com.teclogi.security.tracking.service.dto;

import java.awt.geom.Point2D;

/**
 * @author JhonMauricio
 *
 */
public class SatelliteDTO {
	
    private Point2D position;
    private double radius;

    /**
     * 
     * @param x
     * @param y
     * @param radius
     */
    public SatelliteDTO(double x, double y, double radius) {
        this.position = new Point2D.Double(x, y);
        this.radius = radius;
    }

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
	 * @return radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * 
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Satellite [position=");
		builder.append(position);
		builder.append(", radius=");
		builder.append(radius);
		builder.append("]");
		return builder.toString();
	}
    
    
}
