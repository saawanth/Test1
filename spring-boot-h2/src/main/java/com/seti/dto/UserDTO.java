package com.seti.dto;


import javax.validation.constraints.NotNull;

import com.seti.custom.validators.Date;
import com.seti.custom.validators.Email;
import com.seti.custom.validators.Locale;

public class UserDTO {
	
	@NotNull
    private String name;
	@NotNull
	private String phoneNumber;
	@NotNull
	@Email
	private String email;
	@NotNull
	@Date
	private String dob;
	@NotNull
	@Locale
	private String locale;
	

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
