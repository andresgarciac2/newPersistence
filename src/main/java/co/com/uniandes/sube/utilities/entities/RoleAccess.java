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
@Table(name="ROLE_ACCESS")
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
