package com.app.Appmanagement.dto;

import java.io.Serializable;

public class Appdto implements Serializable
{
	private long alt_key;
	private String service_name;
	private String url;
	//private String status;
	private String created_date;
	//private String created_by;
	private String modify_date;
//	private String modify_by;
	public long getAlt_key() {
		return alt_key;
	}
	public void setAlt_key(long alt_key) {
		this.alt_key = alt_key;
	}
	public String getService_name() {
		return service_name;
	}
	public void setService_name(String service_name) {
		this.service_name = service_name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getModify_date() {
		return modify_date;
	}
	public void setModify_date(String modify_date) {
		this.modify_date = modify_date;
	}
	

}
