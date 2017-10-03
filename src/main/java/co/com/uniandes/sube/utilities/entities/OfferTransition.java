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
public class OfferTransition {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_OfferTransitionSequence")
	@SequenceGenerator(name = "id_OfferTransitionSequence", sequenceName = "OFFER_TRANSITION_SEQ")
	private int id;	
	@Column(name="OFFER_ID")	
	private int offerId;
	@Column(name="SOURCE_STEP")	
	private int sourceStep;
	@Column(name="TARGET_STEP")	
	private int targetStep;
	@Column(name="CONDITIONS")	
	private String conditions;
	
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
	public int getSourceStep() {
		return sourceStep;
	}
	public void setSourceStep(int sourceStep) {
		this.sourceStep = sourceStep;
	}
	public int getTargetStep() {
		return targetStep;
	}
	public void setTargetStep(int targetStep) {
		this.targetStep = targetStep;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
}
