/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="USERS")

@NamedQueries({
	@NamedQuery(name = "Users.findAll", 
			query = "select usr FROM Users usr order by id"),
	@NamedQuery(name = "Users.findById", //Devuelve un usuario específico por su identificador en el sistema
	query = "select usr FROM Users usr where id = :id"),
	@NamedQuery(name = "Users.findByDni", //Devuelve el usuario que tenga el DNI indicado, del tipo indicado
	query = "select usr FROM Users usr where dniType = :dniType and dni = :dni"),
	//@NamedQuery(name = "Users.findByDni", //Devuelve los usuarios que tengan el DNI del tipo indicado
	//query = "select usr FROM Users usr where dniType = :dniType"),
	@NamedQuery(name = "Users.findByCountry", //Devuelve los usuarios del país indicado
	query = "select usr FROM Users usr where country = :country"),
	@NamedQuery(name = "Users.findByEMail", //Devuelve el usuario con el email indicado
	query = "select usr FROM Users usr where eMail = :eMail"),
	@NamedQuery(name = "Users.findByFirstNamePart", //Devuelve los usuarios que tengan un segmento de texto específico; no es case sensitive
	query = "select usr FROM Users usr where UPPER(firstName) like  UPPER(:firstName)"), //llamar así: query.setParamter("firstName", "%" + companyName + "%") para cadenas parciales
	@NamedQuery(name = "Users.findByLastNamePart", //Devuelve los usuarios que tengan un segmento de texto específico; no es case sensitive
	query = "select usr FROM Users usr where UPPER(lastName) like  UPPER(:lastName)") //llamar así: query.setParamter("firstName", "%" + companyName + "%") para cadenas parciales

	
})

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
