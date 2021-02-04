package com.flysaa.airway;

import java.util.ArrayList;
import java.time.*;
import com.flysaa.airway.FlightTicket;

public class Flight {

	public Flight() {
	}

	private int flightNo;
	private String flightName;
	private String from;
	private String to;
	private ZonedDateTime departureDate;
	private ZonedDateTime arrivalDate;

	public int getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(int flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public ZonedDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(ZonedDateTime departureDate) {
		this.departureDate = departureDate;
	}

	public ZonedDateTime getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(ZonedDateTime arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public void addFlight(int flightNo, String flightName, String from, String to, ZonedDateTime departureDate,
			ZonedDateTime arrivalDate) {
		this.setFlightNo(flightNo);
		this.setFlightName(flightName);
		this.setFrom(from);
		this.setTo(to);
		this.setDepartureDate(departureDate);
		this.setArrivalDate(arrivalDate);
	}

	public void aviableFlight(ArrayList<Flight> flights) {
		System.out.println("=====Avaiable  Flights=====");
		for (int i = 0; i < flights.size(); i++) {
			if (flights.get(i) != null) {
				System.out.println(i + ". FlightNo: " + flights.get(i).getFlightNo());
				System.out.println(i + ". Flight name: " + flights.get(i).getFlightName());
				System.out.println(i + ". From: " + flights.get(i).getFrom());
				System.out.println(i + ". To: " + flights.get(i).getTo());
				System.out.println(i + ". Departure date: " + flights.get(i).getDepartureDate());
				System.out.println(i + ". Arrivial date: " + flights.get(i).getArrivalDate());

				System.out.println();// to create space
			} // end of if block
		} // end of for loop
	}// end of method

	public void display() {
		System.out.println("=====Flight details for Customer=====");
		System.out.println("Flight Number: " + flightNo);
		System.out.println("Flight Name: " + flightName);
		System.out.println("Flight From: " + from);
		System.out.println("Flight To: " + to);
		System.out.println("Flight Departure date: " + departureDate);
		System.out.println("Flight Arrival date: " + arrivalDate);

	}// end of display method

	public String toString() {
		return "Flight Flight Number: " + getFlightNo() + ",Flight Name: " + getFlightName() + ",Flight From: "
				+ getFrom() + ",Flight To: " + getTo() + ",Departure Date: " + getDepartureDate() + ",ArrivalDate: "
				+ getArrivalDate();

	}// end of toString method.

}// end of class
