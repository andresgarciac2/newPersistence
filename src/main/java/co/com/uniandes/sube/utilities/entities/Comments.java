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
@Table(name="COMMENTS")

@NamedQueries({
	@NamedQuery(name = "Comments.findAll", 
			query = "select com FROM Comments com order by id"),
	@NamedQuery(name = "Comments.findById", //Devuelve todos los valores que hay en la tabla con el ID buscado
	query = "select com FROM Comments com where id = :id"),
	@NamedQuery(name = "Comments.findByConceptId", //Devuelve los valores por el ID de concepto
	query = "select com FROM Comments com where conceptId = :conceptId"),
	@NamedQuery(name = "Comments.findByObjectId", //Devuelve los valores asociados con un objeto
	query = "select com FROM Comments com where objectId = :objectId"),
	@NamedQuery(name = "Candidate.findByCreator", //Devuelve los comentarios encontrados que haya creado un usuario
	query = "select com FROM Comments com where createBy = :createBy"),
	@NamedQuery(name = "Candidate.findByBetweenCreationDate", //Devuelve los comentarios que se hayan hecho entre un periodo de fechas
	query = "select com FROM Comments com where creationDate between ?1 and ?2"),
	@NamedQuery(name = "Comments.findByTextPart", //Devuelve los comentarios que tengan un segmento de texto específico; no es case sensitive
	query = "select com FROM Comments com where UPPER(textValue) like  UPPER(:textValue)") //llamar así: query.setParamter("textValue", "%" + textValue + "%") para cadenas parciales
	
})

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
