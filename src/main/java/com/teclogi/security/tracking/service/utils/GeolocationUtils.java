/**
 * 
 */
package com.teclogi.security.tracking.service.utils;

import java.awt.geom.Point2D;

import org.springframework.stereotype.Service;

import com.teclogi.security.tracking.service.dto.SatelliteDTO;

/**
 * @author JhonMauricio
 *
 */
@Service
public class GeolocationUtils {
	
    /**
     *  Método para calcular la intersección de tres circunferencias
     * @param s1
     * @param s2
     * @param s3
     * @return
     */
    public Point2D[] triangulate(SatelliteDTO s1, SatelliteDTO s2, SatelliteDTO s3) {
        // Calcular las distancias entre los getPositions de las circunferencias
        double d12 = s1.getPosition().distance(s2.getPosition());
        double d13 = s1.getPosition().distance(s3.getPosition());
        double d23 = s2.getPosition().distance(s3.getPosition());

        // Calcular las coordenadas de los puntos de intersección
        if (d12 <= s1.getRadius() + s2.getRadius() && d13 <= s1.getRadius() + s3.getRadius() && d23 <= s2.getRadius() + s3.getRadius()) {
            // Las circunferencias se intersectan
            double x1 = s1.getPosition().getX();
            double y1 = s1.getPosition().getY();
            double r1 = s1.getRadius();
            double x2 = s2.getPosition().getX();
            double y2 = s2.getPosition().getY();
            double r2 = s2.getRadius();
            double x3 = s3.getPosition().getX();
            double y3 = s3.getPosition().getY();
            double r3 = s3.getRadius();

            // Calcular las coordenadas de los puntos de intersección
            double a = 2 * (x1 - x2);
            double b = 2 * (y1 - y2);
            double c = r2 * r2 - r1 * r1 - x2 * x2 + x1 * x1 - y2 * y2 + y1 * y1;
            double d = 2 * (x1 - x3);
            double e = 2 * (y1 - y3);
            double f = r3 * r3 - r1 * r1 - x3 * x3 + x1 * x1 - y3 * y3 + y1 * y1;

            double x = (e * c - b * f) / (e * a - b * d);
            double y = (d * c - a * f) / (d * b - a * e);

            Point2D puntoInterseccion = new Point2D.Double(x, y);

            return new Point2D[] { puntoInterseccion };
        } else {
            // No hay intersección entre las circunferencias
            return new Point2D[0];
        }
    }

}
