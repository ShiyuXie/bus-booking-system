package com.aprilxie.bbs.model;

public class Ticket {

	private String Id;
	private String seatNumber;
	private boolean cancellable;
	private String journeyDate;
	private User passenger;
	private TripSchedule tripSchedule;
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
	 * @return the seatNumber
	 */
	public String getSeatNumber() {
		return seatNumber;
	}
	/**
	 * @param seatNumber the seatNumber to set
	 */
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	/**
	 * @return the cancellable
	 */
	public boolean isCancellable() {
		return cancellable;
	}
	/**
	 * @param cancellable the cancellable to set
	 */
	public void setCancellable(boolean cancellable) {
		this.cancellable = cancellable;
	}
	/**
	 * @return the journeyDate
	 */
	public String getJourneyDate() {
		return journeyDate;
	}
	/**
	 * @param journeyDate the journeyDate to set
	 */
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	/**
	 * @return the passenger
	 */
	public User getPassenger() {
		return passenger;
	}
	/**
	 * @param passenger the passenger to set
	 */
	public void setPassenger(User passenger) {
		this.passenger = passenger;
	}
	/**
	 * @return the tripSchedule
	 */
	public TripSchedule getTripSchedule() {
		return tripSchedule;
	}
	/**
	 * @param tripSchedule the tripSchedule to set
	 */
	public void setTripSchedule(TripSchedule tripSchedule) {
		this.tripSchedule = tripSchedule;
	}
	
	
}
