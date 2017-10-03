/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="USERS")
public class Users {

	@Column(name="ID")	
	@Id
	private int id;
	@Column(name="DNI")	
	private int dni;
	@Column(name="DNI_TYPE")	
	private int dniType;
	@Column(name="COUNTRY")	
	private int country;
	@Column(name="EMAIL")	
	private String eMail;
	@Column(name="FIRST_NAME")	
	private String firstName;
	@Column(name="LAST_NAME")	
	private String lastName;
	@Column(name="ADDRESS")	
	private String address;
	@Column(name="PHONE")	
	private String phone;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getDniType() {
		return dniType;
	}
	public void setDniType(int dniType) {
		this.dniType = dniType;
	}
	public int getCountry() {
		return country;
	}
	public void setCountry(int country) {
		this.country = country;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
}
