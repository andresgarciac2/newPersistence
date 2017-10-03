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
@Table(name="CATALOG")
public class Comments {

	
	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_CommentsSequence")
	@SequenceGenerator(name = "id_CommentsSequence", sequenceName = "COMMENTS_SEQ")
	private int id;	
	@Column(name="CONCEPT_ID")	
	private int conceptId;
	@Column(name="OBJECT_ID")	
	private int objectId;
	@Column(name="CREATE_BY")	
	private int createBy;
	@Column(name="CREATION_DATE")	
	private Date creationDate;
	@Column(name="TEXT_VALUE")	
	private String textValue;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConceptId() {
		return conceptId;
	}
	public void setConceptId(int conceptId) {
		this.conceptId = conceptId;
	}
	public int getObjectId() {
		return objectId;
	}
	public void setObjectId(int objectId) {
		this.objectId = objectId;
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
	public String getTextValue() {
		return textValue;
	}
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}	
}
