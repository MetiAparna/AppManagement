package com.app.Appmanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
//import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="app_services_info")
public class AppEntity implements Serializable
{
	@Id
	 @GenericGenerator(name="auto_gen", strategy="increment")
     @GeneratedValue(generator="auto_gen")
	@Column(name="alt_key")
	private long alt_key;
	
	@Column(name="service_name")
	private String service_name;
	
	@Column(name="url")
	private String url;
	
	@Column(name="status")
    private String status;
	
	@Column(name="created_date")
    private String created_date;
	
	@Column(name="created_by")
    private String created_by;
	
	@Column(name="modify_date")
     private String modify_date;
	
	@Column(name="modify_by")
     private String modify_by;

	
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModify_date() {
		return modify_date;
	}

	public void setModify_date(String modify_date) {
		this.modify_date = modify_date;
	}

	public String getModify_by() {
		return modify_by;
	}

	public void setModify_by(String modify_by) {
		this.modify_by = modify_by;
	}

	@Override
	public String toString() {
		return "AppEntity [alt_key=" + alt_key + ", service_name=" + service_name + ", url=" + url + ", status="
				+ status + ", created_date=" + created_date + ", created_by=" + created_by + ", modify_date="
				+ modify_date + ", modify_by=" + modify_by + "]";
	}
	

}
