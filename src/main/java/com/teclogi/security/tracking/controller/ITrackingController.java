package com.teclogi.security.tracking.controller;

import org.springframework.http.ResponseEntity;

import com.teclogi.security.tracking.service.dto.SatellitesInformationDTO;

/**
 * 
 * @author JhonMauricio
 *
 */
public interface ITrackingController {
	
    /**
     * @param satellitesInformation
     * @return ResponseEntity<Object>
     */
    ResponseEntity<Object> vehicleTracking(SatellitesInformationDTO satellitesInformation) throws Exception;

}
