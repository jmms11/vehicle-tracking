/**
 * 
 */
package com.teclogi.security.tracking.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teclogi.security.tracking.controller.ITrackingController;
import com.teclogi.security.tracking.service.ITrackingService;
import com.teclogi.security.tracking.service.dto.SatellitesInformationDTO;

/**
 * @author JhonMauricio
 *
 */
@RestController
@RequestMapping("/tracking")
public class TrackingControllerImpl implements ITrackingController {
	/**
	 * Inicialización al servicio interno que realiza el tracking
	 */
	@Autowired
	ITrackingService trackingService;


	/**
	 * @param satellitesInformation
	 * @return ResponseEntity<Object>
	 */
	@Override
	@PostMapping
	public ResponseEntity<Object> vehicleTracking(@RequestBody SatellitesInformationDTO satellitesInformation) throws Exception {
		return trackingService.tracking(satellitesInformation);
	}
	

}
