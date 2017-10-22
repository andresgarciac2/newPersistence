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
@Table(name="CONCEPT")

@NamedQueries({
	@NamedQuery(name = "Concept.findAll", 
			query = "select con FROM Concept con order by id"),
	@NamedQuery(name = "Concept.findById", //Devuelve todos los conceptos que hay en la tabla con el ID buscado
	query = "select con FROM Concept con where id = :id"),
	@NamedQuery(name = "Concept.findByName", //Devuelve un concepto por el ID de concepto
	query = "select con FROM Concept con where name = :name"),
	@NamedQuery(name = "Concept.findBetweenId", //Devuelve los valores entre un rango de id
	query = "select con FROM Concept con where id between ?1 and ?2"),
	@NamedQuery(name = "Concept.findByNamePart", //Devuelve los comentarios que tengan un segmento de texto específico; no es case sensitive
	query = "select con FROM Concept con where UPPER(name) like  UPPER(:name)") //llamar así: query.setParamter("textValue", "%" + textValue + "%") para cadenas parciales
	
})

public class Concept {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_ConceptSequence")
	@SequenceGenerator(name = "id_ConceptSequence", sequenceName = "CONCEPT_SEQ")
	private int id;	
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
	
	
}
