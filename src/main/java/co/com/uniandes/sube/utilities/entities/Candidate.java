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

import java.util.Date;



/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="CANDIDATE")

@NamedQueries({
	@NamedQuery(name = "Candidate.findAll", 
			query = "select can FROM Candidate can order by userId"),
	@NamedQuery(name = "Candidate.findByUserId", //Devuelve todos los candidatos que hay en la tabla con el ID buscado
	query = "select can FROM Candidate can where userId = :userId"),
	@NamedQuery(name = "Candidate.findBetweenBirthDate", //Devuelve los candidatos encontrados entre un periodo de fechas de nacimiento.
	query = "select can FROM Candidate can where birthDate between ?1 and ?2"),
	@NamedQuery(name = "Candidate.findByCity", //Devuelve los candidatos encontrados entre un periodo de fechas de inicio.
	query = "select can FROM Candidate can where city = :city"),
	@NamedQuery(name = "Candidate.findByDepartment", //Devuelve los candidatos encontrados entre un periodo de fechas de inicio.
	query = "select can FROM Candidate can where department = :department"),
	@NamedQuery(name = "Candidate.findByLevelOfSchooling", //Devuelve los candidatos encontrados entre un periodo de fechas de inicio.
	query = "select can FROM Candidate can where levelOfSchooling = :levelOfSchooling"),
	@NamedQuery(name = "Candidate.findByStratum", //Devuelve los candidatos encontrados entre un periodo de fechas de inicio.
	query = "select can FROM Candidate can where stratum = :stratum"),
	@NamedQuery(name = "Candidate.findBetweenStratum", //Devuelve los candidatos encontrados entre un periodo de fechas de inicio.
	query = "select can FROM Candidate can where stratum between ?1 and ?2")
	
})
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
