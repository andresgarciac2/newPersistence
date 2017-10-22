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
@Table(name="ATTRIBUTE")

@NamedQueries({
	@NamedQuery(name = "Attribute.findAll", 
			query = "select att FROM Attribute att order by id"),
	@NamedQuery(name = "Attribute.findById", //Devuelve todos los atributos que hay en la tabla con el ID buscado
	query = "select att FROM Attribute att where id = :id"),
	@NamedQuery(name = "Attribute.findByName", //Devuelve los atributos encontrados con un nombre específico.
	query = "select att FROM Attribute att where name = :name"),
	@NamedQuery(name = "Attribute.findByType", //Devuelve los atributos encontrados de un tipo.
	query = "select att FROM Attribute att where type = :type"),
	@NamedQuery(name = "Attribute.findByNameAndType", //Devuelve los atributos encontrados que tengan un nombre y tipo determinados.
	query = "select att FROM Attribute att where name = :name and type = :type"),
	@NamedQuery(name = "Attribute.findByNameOrType", //Devuelve los atributos encontrados que cumplan con cualquier filtro de los dos.
	query = "select att FROM Attribute att where name = :name or type = :type")
	
})
public class Attribute {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_AttributeSequence")
	@SequenceGenerator(name = "id_AttributeSequence", sequenceName = "ATTRIBUTE_SEQ")
	private int id;	
	@Column(name="NAME")	
	private String name;
	@Column(name="TYPE")
	private String type;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
