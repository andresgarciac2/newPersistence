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
@Table(name="CATALOG")

@NamedQueries({
	@NamedQuery(name = "Catalog.findAll", 
			query = "select cat FROM Catalog cat order by id"),
	@NamedQuery(name = "Catalog.findById", //Devuelve todos los valores que hay en la tabla con el ID buscado
	query = "select cat FROM Catalog cat where id = :id"),
	@NamedQuery(name = "Catalog.findByName", //Devuelve los valores encontrados que tengan el nombre especificado
	query = "select cat FROM Catalog cat where name = :name"),
	@NamedQuery(name = "Catalog.findByConceptId", //Devuelve los valores por el ID de concepto
	query = "select cat FROM Catalog cat where conceptId = :conceptId"),
	@NamedQuery(name = "Catalog.findByParentId", //Devuelve los valores asociados con un catálogo
	query = "select cat FROM Catalog cat where parentId = :parentId"),
	@NamedQuery(name = "Catalog.findSpecificConcept", //Devuelve un valor específico; asume que la relación entre parent y concepto es 1 a 1
	query = "select cat FROM Catalog cat where parentId = :parentId and conceptId = :conceptId")
	
})

public class Catalog {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_CatalogSequence")
	@SequenceGenerator(name = "id_CatalogSequence", sequenceName = "CATALOG_SEQ")
	private int id;	
	@Column(name="NAME")	
	private String name;
	@Column(name="CONCEPT_ID")	
	private int conceptId;
	@Column(name="PARENT_ID")	
	private int parentId;
	
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
	public int getConceptId() {
		return conceptId;
	}
	public void setConceptId(int conceptId) {
		this.conceptId = conceptId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}	
	
}
