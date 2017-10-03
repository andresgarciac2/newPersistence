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


/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="OFFER_STEP")
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
