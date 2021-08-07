package com.aprilxie.bbs.model;

public class Trip {
	private String Id;
	private int fare;
	private String journeyTime;
	private Stop srcStop;
	private Stop destStop;
	private Agency agency;
	private Bus bus;
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the fare
	 */
	public int getFare() {
		return fare;
	}
	/**
	 * @param fare the fare to set
	 */
	public void setFare(int fare) {
		this.fare = fare;
	}
	/**
	 * @return the journeyTime
	 */
	public String getJourneyTime() {
		return journeyTime;
	}
	/**
	 * @param journeyTime the journeyTime to set
	 */
	public void setJourneyTime(String journeyTime) {
		this.journeyTime = journeyTime;
	}
	/**
	 * @return the srcStop
	 */
	public Stop getSrcStop() {
		return srcStop;
	}
	/**
	 * @param srcStop the srcStop to set
	 */
	public void setSrcStop(Stop srcStop) {
		this.srcStop = srcStop;
	}
	/**
	 * @return the destStop
	 */
	public Stop getDestStop() {
		return destStop;
	}
	/**
	 * @param destStop the destStop to set
	 */
	public void setDestStop(Stop destStop) {
		this.destStop = destStop;
	}
	/**
	 * @return the agency
	 */
	public Agency getAgency() {
		return agency;
	}
	/**
	 * @param agency the agency to set
	 */
	public void setAgency(Agency agency) {
		this.agency = agency;
	}
	/**
	 * @return the bus
	 */
	public Bus getBus() {
		return bus;
	}
	/**
	 * @param bus the bus to set
	 */
	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	
}
