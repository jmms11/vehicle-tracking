/**
 * 
 */
package com.teclogi.security.tracking.service.dto;

import java.util.List;


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
public class SatellitesInformationDTO {
	
	private List<SateliteDTO> satellites;

	public List<SateliteDTO> getSatellites() {
		return satellites;
	}

	public void setSatellites(List<SateliteDTO> satellites) {
		this.satellites = satellites;
	}
	
	
	

}
