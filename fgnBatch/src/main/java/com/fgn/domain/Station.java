package com.fgn.domain;

import java.util.Date;

public class Station {
	private Integer id;
	private String originalId;
	private String type;
	private String address;
	private String city;
	private String district;
	private Date lastUpdate;
	private Float lat;
	private Float lng;
	private String name;
	private String openHours;
	private String phone;
	private String postalCode;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOriginalId() {
		return originalId;
	}
	public void setOriginalId(String originalId) {
		this.originalId = originalId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Float getLat() {
		return lat;
	}
	public void setLat(Float lat) {
		this.lat = lat;
	}
	public Float getLng() {
		return lng;
	}
	public void setLng(Float lng) {
		this.lng = lng;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOpenHours() {
		return openHours;
	}
	public void setOpenHours(String openHours) {
		this.openHours = openHours;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public String toString() {
		return "Station [id=" + id + ", originalId=" + originalId + ", type=" + type + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", lastUpdate=" + lastUpdate + ", lat=" + lat + ", lng="
				+ lng + ", name=" + name + ", openHours=" + openHours + ", phone=" + phone + ", postalCode="
				+ postalCode + "]";
	}
	
}
