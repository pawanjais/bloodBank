package com.bloodbank.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name="admin")
@NamedQueries({
	@NamedQuery(name = "Admin.adminLogin", query = "from Admin d where d.adminUsername=? and d.adminPassword=?"),
	@NamedQuery(name = "Admin.adminsearch", query = "select d from Admin d where d.adminName=?")
})



@Entity
public class Admin {

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@Column(name="username")
	private String adminUsername;
	
	
	@Column(name="name")
	private String adminName;
	
	@Column(name="password")
	private String adminPassword;
	
	

	public Admin(String adminUsername, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminPassword = adminPassword;
	}

	@Override
	public String toString() {
		return "Admin [adminUsername=" + adminUsername + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ "]";
	}

	public Admin(String adminUsername, String adminName, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
	

}
