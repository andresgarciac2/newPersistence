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
@Table(name="OFFER_STEP_CONFIGURATION")
public class OfferStepConfiguration {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_OfferStepConfigurationSequence")
	@SequenceGenerator(name = "id_OfferStepConfigurationSequence", sequenceName = "OFFER_STEP_CONFIGURATION_SEQ")
	private int id;	
	@Column(name="OFFER_ID")	
	private int offerId;
	@Column(name="SERIALIZE_SETTINGS")	
	private String serializeSettings;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOfferId() {
		return offerId;
	}
	public void setOfferId(int offerId) {
		this.offerId = offerId;
	}
	public String getSerializeSettings() {
		return serializeSettings;
	}
	public void setSerializeSettings(String serializeSettings) {
		this.serializeSettings = serializeSettings;
	}

	
	

}
