package com.fgn.domain;

public class StationRequest {
	

	public StationRequest(String cTRISO, String bRAND, String vEHICLE, String mODE, String qRY) {
		super();
		CTRISO = cTRISO;
		BRAND = bRAND;
		VEHICLE = vEHICLE;
		MODE = mODE;
		QRY = qRY;
	}
	private String CTRISO;
	private String BRAND;
	private String VEHICLE;
	private String MODE;
	private String QRY;
	public String getCTRISO() {
		return CTRISO;
	}
	public void setCTRISO(String cTRISO) {
		CTRISO = cTRISO;
	}
	public String getBRAND() {
		return BRAND;
	}
	public void setBRAND(String bRAND) {
		BRAND = bRAND;
	}
	public String getVEHICLE() {
		return VEHICLE;
	}
	public void setVEHICLE(String vEHICLE) {
		VEHICLE = vEHICLE;
	}
	public String getMODE() {
		return MODE;
	}
	public void setMODE(String mODE) {
		MODE = mODE;
	}
	public String getQRY() {
		return QRY;
	}
	public void setQRY(String qRY) {
		QRY = qRY;
	}
	
}
