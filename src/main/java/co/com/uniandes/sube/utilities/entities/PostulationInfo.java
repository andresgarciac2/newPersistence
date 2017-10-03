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

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="POSTULATION_INFO")
public class PostulationInfo {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_PostulationInfoSequence")
	@SequenceGenerator(name = "id_PostulationInfoSequence", sequenceName = "POSTULATION_INFO_SEQ")
	private int id;
	@Column(name="ATTRIBUTE_ID")	
	private int attributeId;
	@Column(name="POSTULATION_ID")
	private int postulationId;
	@Column(name="BOOL_VALUE")	
	private int boolValue;
	@Column(name="DATE_VALUE")	
	private Date dateValue;
	@Column(name="DECIMAL_VALUE")	
	private double decimalValue;
	@Column(name="INT_VALUE")	
	private int intValue;	
	@Column(name="STRING_VALUE")	
	private int stringValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAttributeId() {
		return attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}
	public int getPostulationId() {
		return postulationId;
	}
	public void setPostulationId(int postulationId) {
		this.postulationId = postulationId;
	}
	public int getBoolValue() {
		return boolValue;
	}
	public void setBoolValue(int boolValue) {
		this.boolValue = boolValue;
	}
	public Date getDateValue() {
		return dateValue;
	}
	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}
	public double getDecimalValue() {
		return decimalValue;
	}
	public void setDecimalValue(double decimalValue) {
		this.decimalValue = decimalValue;
	}
	public int getIntValue() {
		return intValue;
	}
	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}
	public int getStringValue() {
		return stringValue;
	}
	public void setStringValue(int stringValue) {
		this.stringValue = stringValue;
	}	
	

}
