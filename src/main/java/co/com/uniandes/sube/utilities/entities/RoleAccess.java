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
@Table(name="ROLE_ACCESS")

@NamedQueries({
	@NamedQuery(name = "RoleAccess.findAll", 
			query = "select rol FROM RoleAccess rol order by id"),
	@NamedQuery(name = "RoleAccess.findById", //Devuelve la relación rol/acceso por id específico
	query = "select rol FROM RoleAccess rol where id = :id"),
	@NamedQuery(name = "RoleAccess.findByUserId", //Devuelve las relaciones rol/acceso por nombre de usuario
	query = "select rol FROM RoleAccess rol where userId = :userId"),
	@NamedQuery(name = "RoleAccess.findByRoleId", //Devuelve las relaciones rol/acceso por rol
	query = "select rol FROM RoleAccess rol where roleId = :roleId")	
	
})

public class RoleAccess {

	@Id
	@Column(name = "ID", unique = true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_RoleAccessSequence")
	@SequenceGenerator(name = "id_RoleAccessSequence", sequenceName = "ROLE_ACCESS_SEQ")
	private int id;
	@Column(name="USER_ID")	
	private int userId;
	@Column(name="ROLE_ID")	
	private int roleId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}	
}
