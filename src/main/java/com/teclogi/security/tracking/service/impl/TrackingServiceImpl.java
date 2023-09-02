package com.teclogi.security.tracking.service.impl;

import java.awt.geom.Point2D;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.teclogi.security.tracking.service.ITrackingService;
import com.teclogi.security.tracking.service.dto.SatelliteDTO;
import com.teclogi.security.tracking.service.dto.SatellitesInformationDTO;
import com.teclogi.security.tracking.service.dto.VehicleLocationDTO;
import com.teclogi.security.tracking.service.utils.GeolocationUtils;
import com.teclogi.security.tracking.service.utils.SatellitePositionEnum;

/**
 * 
 * @author JhonMauricio
 *
 */
@Service
public class TrackingServiceImpl implements ITrackingService {
	
	@Autowired
	GeolocationUtils geolocationUtils;
	
	
    /**
     * @param satellitesInformation
     * @return ResponseEntity<Object>
     */
	@Override
    public ResponseEntity<Object> tracking(SatellitesInformationDTO satellitesInformationDTO) {
        
    	// Se definen los tres satelites con sus posiciones y distancias(radio)
    	SatelliteDTO sputnik = new SatelliteDTO(SatellitePositionEnum.SPUTNIK.getX(),
    			SatellitePositionEnum.SPUTNIK.getY(), 
    			satellitesInformationDTO.getSatellites().get(0).getDistance());
    	
    	SatelliteDTO explorer = new SatelliteDTO(SatellitePositionEnum.EXPLORER.getX(), 
    			SatellitePositionEnum.EXPLORER.getY(),
    			satellitesInformationDTO.getSatellites().get(1).getDistance());
    	
    	SatelliteDTO asterix = new SatelliteDTO(SatellitePositionEnum.ASTERIX.getX(),
    			SatellitePositionEnum.ASTERIX.getY(),
    			satellitesInformationDTO.getSatellites().get(2).getDistance());

        // Se calcula la intersección de los tres satelites
        Point2D[] intersections = geolocationUtils.triangulate(sputnik, explorer, asterix);

        // Retorna los puntos de intersección
        if (intersections.length > 0) {
            for (Point2D punto : intersections) {
            	VehicleLocationDTO vehicleLocation = new VehicleLocationDTO();
            	vehicleLocation.setPosition(punto);
            	vehicleLocation.setInDanger(true);
            	return ResponseEntity.ok(vehicleLocation);
            }
        }
            return new ResponseEntity<>("No hay intersecciones entre las tres circunferencias.",HttpStatus.NOT_FOUND);
        
    }

}



