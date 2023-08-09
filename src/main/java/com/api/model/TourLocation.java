package com.api.model;

import jakarta.persistence.*;


@Entity
public class TourLocation {
	
	@Id
	private int locationId;
	private String city;
	private String pincode;
	private String latitude;
	private String longitude;
	private boolean visited;
	
	public TourLocation(int locationId, String city, String pincode, String latitude, String longitude,
			boolean visited) {
		super();
		this.locationId = locationId;
		this.city = city;
		this.pincode = pincode;
		this.latitude = latitude;
		this.longitude = longitude;
		this.visited = visited;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public TourLocation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
}
