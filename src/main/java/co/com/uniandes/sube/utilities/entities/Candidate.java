/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;



/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="CANDIDATE")
public class Candidate {

	@Column(name="USER_ID")	
	@Id
	private int userId;	
	@Column(name="BIRTHDATE")	
	private Date birthDate;
	@Column(name="CITY")	
	private int city;
	@Column(name="DEPARTMENT")	
	private int department;
	@Column(name="LEVEL_OF_SCHOOLING")	
	private int levelOfSchooling;
	@Column(name="STRATUM")	
	private int stratum;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getLevelOfSchooling() {
		return levelOfSchooling;
	}
	public void setLevelOfSchooling(int levelOfSchooling) {
		this.levelOfSchooling = levelOfSchooling;
	}
	public int getStratum() {
		return stratum;
	}
	public void setStratum(int stratum) {
		this.stratum = stratum;
	}	
}
