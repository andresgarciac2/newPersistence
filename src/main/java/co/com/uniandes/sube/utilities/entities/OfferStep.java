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


/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="OFFER_STEP")

@NamedQueries({
	@NamedQuery(name = "OfferStep.findAll", 
			query = "select ofst FROM OfferStep ofst order by id"),
	@NamedQuery(name = "OfferStep.findById", //Devuelve el paso que hay en la tabla con el ID buscado
	query = "select ofst FROM OfferStep ofst where id = :id"),
	@NamedQuery(name = "OfferStep.findByConfigurationId", //Devuelve los pasos encontrados de una identificación específica.
	query = "select ofst FROM OfferStep ofst where configurationId = :configurationId"),
	@NamedQuery(name = "OfferStep.findByOfferId", //Devuelve los pasos configurados para una oferta
	query = "select ofst FROM OfferStep ofst where offerId = :offerId"),
	@NamedQuery(name = "OfferStep.findByType", //Devuelve los pasos configurados para una oferta que sean de un tipo específico
	query = "select ofst FROM OfferStep ofst where offerId = :offerId and type = :type"),
	@NamedQuery(name = "OfferStep.findByNamePart", //Devuelve los pasos que tenga n un segmento de texto específico; no es case sensitive
	query = "select ofst FROM OfferStep ofst where UPPER(name) like  UPPER(:name)") //llamar así: query.setParamter("name", "%" + name + "%") para cadenas parciales
	
})

public class OfferStep {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_OfferStepSequence")
	@SequenceGenerator(name = "id_OfferStepSequence", sequenceName = "OFFER_STEP_SEQ")
	private int id;	
	@Column(name="CONFIGURATION_ID")	
	private int configurationId;
	@Column(name="OFFER_ID")	
	private int offerId;
	@Column(name="TYPE")	
	private String type;
	@Column(name="NAME")	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getConfigurationId() {
		return configurationId;
	}
	public void setConfigurationId(int configurationId) {
		this.configurationId = configurationId;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}

}
