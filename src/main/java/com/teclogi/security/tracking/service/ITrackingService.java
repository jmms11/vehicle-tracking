/**
 * 
 */
package com.teclogi.security.tracking.service;

import org.springframework.http.ResponseEntity;

import com.teclogi.security.tracking.service.dto.SatellitesInformationDTO;

/**
 * @author JhonMauricio
 *
 */
public interface ITrackingService {
	
    /**
     * @param satellitesInformationDTO
     * @return ResponseEntity<Object>
     */
	ResponseEntity<Object>  tracking(SatellitesInformationDTO satellitesInformationDTO);

}
