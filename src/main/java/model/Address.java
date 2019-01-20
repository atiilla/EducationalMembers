package model;

import mAbstract.EducationalMember;

public class Address extends EducationalMember{

	private String streetname;
	private String city;

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
