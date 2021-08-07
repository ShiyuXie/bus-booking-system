package com.aprilxie.bbs.model;

import java.util.ArrayList;

public class TripSchedule {
	private String Id;
	private String tripDate;
	private int availableSeats;
	private Trip tripDetail;
	private ArrayList<Ticket> ticketsSold;
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
	 * @return the tripDate
	 */
	public String getTripDate() {
		return tripDate;
	}
	/**
	 * @param tripDate the tripDate to set
	 */
	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
	}
	/**
	 * @return the availableSeats
	 */
	public int getAvailableSeats() {
		return availableSeats;
	}
	/**
	 * @param availableSeats the availableSeats to set
	 */
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	/**
	 * @return the tripDetail
	 */
	public Trip getTripDetail() {
		return tripDetail;
	}
	/**
	 * @param tripDetail the tripDetail to set
	 */
	public void setTripDetail(Trip tripDetail) {
		this.tripDetail = tripDetail;
	}
	/**
	 * @return the ticketsSold
	 */
	public ArrayList<Ticket> getTicketsSold() {
		return ticketsSold;
	}
	/**
	 * @param ticketsSold the ticketsSold to set
	 */
	public void setTicketsSold(ArrayList<Ticket> ticketsSold) {
		this.ticketsSold = ticketsSold;
	}
	
	
}
