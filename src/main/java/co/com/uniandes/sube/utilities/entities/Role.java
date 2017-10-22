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
@Table(name="ROLE")

@NamedQueries({
	@NamedQuery(name = "Role.findAll", 
			query = "select rol FROM Role rol order by id"),
	@NamedQuery(name = "Role.findById", //Devuelve el rol por id específico
	query = "select rol FROM Role rol where id = :id"),
	@NamedQuery(name = "Role.findByName", //Devuelve el rol por nombre
	query = "select rol FROM Role rol where name = :name"),
	@NamedQuery(name = "Role.findByIsActive", //Devuelve los roles que se encuentren en el estado indicado
	query = "select rol FROM Role rol where isActive = :isActive"),
	@NamedQuery(name = "Offeror.findByDescriptionPart", //Devuelve las descripciones que cuenten con un segmento de texto específico; no es case sensitive
	query = "select rol FROM Role rol where UPPER(description) like  UPPER(:description)") //llamar así: query.setParamter("description", "%" + description + "%") para cadenas parciales
	
})

public class Role {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_RoleSequence")
	@SequenceGenerator(name = "id_RoleSequence", sequenceName = "ROLE_SEQ")
	private int id;
	@Column(name="NAME")	
	private String name;
	@Column(name="DESCRIPTION")	
	private String description;
	@Column(name="IS_ACTIVE")	
	private int isActive;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
}
