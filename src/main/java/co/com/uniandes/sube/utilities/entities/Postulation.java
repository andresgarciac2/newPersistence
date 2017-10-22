/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="POSTULATION")

@NamedQueries({
	@NamedQuery(name = "Postulation.findAll", 
			query = "select pos FROM Postulation pos order by id"),
	@NamedQuery(name = "Postulation.findById", //Devuelve una postulación con un ID específico
	query = "select pos FROM Postulation pos where id = :id"),
	@NamedQuery(name = "Postulation.findByUserId", //Devuelve todas las postulaciones para el candidato buscado
	query = "select pos FROM Postulation pos where userId = :userId"),
	@NamedQuery(name = "Postulation.findByOfferId", //Devuelve todas las postulaciones para la oferta indicada
	query = "select pos FROM Postulation pos where offerId = :offerId"),
	@NamedQuery(name = "Postulation.findBetweenCreationDate", //Devuelve las postulaciones entre un periodo de fechas
	query = "select pos FROM Postulation pos where creationDate between ?1 and ?2"),
	@NamedQuery(name = "Postulation.findByOfferCurrentStep", //Devuelve todas las postulaciones para la oferta indicada que se encuentren en el paso solicitado
	query = "select pos FROM Postulation pos where offerId = :offerId and currentStep = :currentStep"),
	@NamedQuery(name = "Postulation.findByState", //Devuelve todas las postulaciones para la oferta indicada que estén en el estado indicado
	query = "select pos FROM Postulation pos where offerId = :offerId and state = :state")

	
})

public class Postulation {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_PostulationSequence")
	@SequenceGenerator(name = "id_PostulationSequence", sequenceName = "POSTULATION_SEQ")
	private int id;
	@Column(name="USER_ID")	
	private int userId;
	@Column(name="OFFER_ID")
	private int offerId;
	@Column(name="CREATION_DATE")	
	private Date creationDate;
	@Column(name="CURRENT_STEP")
	private int currentStep;
	@Column(name="STATE")	
	private int state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
}
