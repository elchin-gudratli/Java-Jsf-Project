package com.bilgeadam.beans;

import java.io.Serializable;
import java.sql.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("serial")
@ManagedBean(name="kontrolbean")
@SessionScoped
public class YonetimliNesne implements Serializable{
	
	private Float ffloat;
	private Boolean bboolean;
	private byte  bbyte;
	private short sshort;
	private char  cchar;
	private String sstring;
	private Date ddate;
	
	public Float getFfloat() {
		return ffloat;
	}
	public void setFfloat(Float ffloat) {
		this.ffloat = ffloat;
	}
	public Boolean getBboolean() {
		return bboolean;
	}
	public void setBboolean(Boolean bboolean) {
		this.bboolean = bboolean;
	}
	public byte getBbyte() {
		return bbyte;
	}
	public void setBbyte(byte bbyte) {
		this.bbyte = bbyte;
	}
	public short getSshort() {
		return sshort;
	}
	public void setSshort(short sshort) {
		this.sshort = sshort;
	}
	public char getCchar() {
		return cchar;
	}
	public void setCchar(char cchar) {
		this.cchar = cchar;
	}
	public String getSstring() {
		return sstring;
	}
	public void setSstring(String sstring) {
		this.sstring = sstring;
	}
	public Date getDdate() {
		return ddate;
	}
	public void setDdate(Date ddate) {
		this.ddate = ddate;
	}
	public void Uyu()
	{
		
	}

}
