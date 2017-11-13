/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="USER_AUTHENTICATION")

@NamedQueries({
	@NamedQuery(name = "UserAuthentication.findAll", 
			query = "select uauth FROM UserAuthentication uauth order by userId"),
	@NamedQuery(name = "UserAuthentication.findByUserId", //Devuelve un usuario específico
	query = "select uauth FROM UserAuthentication uauth where userId = :userId"),
	@NamedQuery(name = "UserAuthentication.findByIsBlocked", //Devuelve los usuarios que estén en el estado indicado
	query = "select uauth FROM UserAuthentication uauth where isBlocked = :isBlocked")
	
})

public class UserAuthentication {

	@Column(name="USER_ID")	
	@Id
	private int userId;
	@Column(name="IS_BLOCKED")	
	private int isBlocked;
	@Column(name="PASSWORD", columnDefinition="BLOB")	
	private String passWord;
	@Column(name="PASSWORD_SALT", columnDefinition="BLOB")	
	private String passSalt;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIsBlocked() {
		return isBlocked;
	}
	public void setIsBlocked(int isBlocked) {
		this.isBlocked = isBlocked;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPassSalt() {
		return passSalt;
	}
	public void setPassSalt(String passSalt) {
		this.passSalt = passSalt;
	}
	
}
