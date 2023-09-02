/**
 * 
 */
package com.teclogi.security.tracking.service.dto;

import java.util.List;



/**
 * @author JhonMauricio
 *
 */
public class SatellitesInformationDTO {
	
	private List<SatelliteInformationDTO> satellites;
	
	/**
	 * 
	 * @return satellites
	 */
	public List<SatelliteInformationDTO> getSatellites() {
		return satellites;
	}

	/**
	 * 
	 * @param satellites
	 */
	public void setSatellites(List<SatelliteInformationDTO> satellites) {
		this.satellites = satellites;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SatellitesInformationDTO [satellites=");
		builder.append(satellites);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
