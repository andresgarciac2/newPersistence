/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import java.util.Date;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name = "ACADEMIC_OFFER")
@NamedQueries({
		@NamedQuery(name = "AcademicOffer.findAll", 
				query = "select ao FROM AcademicOffer ao order by id"),
		@NamedQuery(name = "AcademicOffer.findById", //Devuelve todas las ofertas que hay en la tabla con el ID buscado
		query = "select ao FROM AcademicOffer ao where id = :id"),
		@NamedQuery(name = "AcademicOffer.findByStartDatePeriod", //Devuelve las ofertas encontradas entre un periodo de fechas de inicio.
		query = "select ao FROM AcademicOffer ao where startDate between ?1 and ?2"),
		@NamedQuery(name = "AcademicOffer.findByEndDatePeriod", //Devuelve todas las ofertas que hay entre un periodo de fechas de finalizacion
		query = "select ao FROM academic_offer ao where end_date between ?1 and ?2"),

})
public class AcademicOffer {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_AcademicOfferSequence")
	@SequenceGenerator(name = "id_AcademicOfferSequence", sequenceName = "ACADEMIC_OFFER_SEQ")
	private int id;
	@Column(name = "CREATE_BY")
	private int createBy;
	@Column(name = "CREATION_DATE")
	private Date creationDate;
	@Column(name = "START_DATE")
	private Date startDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "NAME")
	private String name;
	@Column(name = "DESCRIPTION")
	private String description;
	@Column(name = "TYPE")
	private int type;
	@Column(name = "STATE")
	private int state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCreateBy() {
		return createBy;
	}

	public void setCreateBy(int createBy) {
		this.createBy = createBy;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

}
