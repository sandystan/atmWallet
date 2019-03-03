package com.sandhya.atmWallet.models.decl;

public interface IUser {
	public static final String ENTITY = "user";
	public int getUserId();

	public void setUserId(int userId);

	public String getUsername();

	public void setUsername(String username);

	public String getFirstName();

	public void setFirstName(String firstName);

	public String getLastName();

	public void setLastName(String lastName);

	public String getMobileNumber();

	public void setMobileNumber(String mobileNumber);

	public String getEmail();

	public void setEmail(String email);

	public String getCity();

	public void setCity(String city);
}
