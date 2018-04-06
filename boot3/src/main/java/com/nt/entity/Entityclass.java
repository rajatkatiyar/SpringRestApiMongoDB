package com.nt.entity;

import org.springframework.data.annotation.Id;

public class Entityclass {
	
	@Id
	private String Email;
private String first_Name;
private String Last_Name;

private String Address;

public String getEmail() {
	return Email;
}

public void setEmail(String email) {
	Email = email;
}

public String getFirst_Name() {
	return first_Name;
}

public void setFirst_Name(String first_Name) {
	this.first_Name = first_Name;
}

public String getLast_Name() {
	return Last_Name;
}

public void setLast_Name(String last_Name) {
	Last_Name = last_Name;
}

public String getAddress() {
	return Address;
}

public void setAddress(String address) {
	Address = address;
}


}
