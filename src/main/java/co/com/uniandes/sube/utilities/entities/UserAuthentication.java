/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="USER_AUTHENTICATION")
public class UserAuthentication {

	@Column(name="USER_ID")	
	@Id
	private int userId;
	@Column(name="IS_BLOCKED")	
	private int isBlocked;
	@Column(name="PASSWORD")	
	private String passWord;
	@Column(name="PASSWORD_SALT")	
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
