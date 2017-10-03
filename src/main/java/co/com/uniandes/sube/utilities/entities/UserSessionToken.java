/**
 * 
 */
package co.com.uniandes.sube.utilities.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ciro Diaz
 *
 */
@Entity
@Table(name="USER_SESSION_TOKEN")
public class UserSessionToken {

	@Column(name="USER_ID")	
	@Id
	private int userId;
	@Column(name="EXPIRATION_DATE")	
	private Date expirationDate;
	@Column(name="TOKEN")	
	private String token;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}	
}
