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
@Table(name="OFFEROR")

@NamedQueries({
	@NamedQuery(name = "Offeror.findAll", 
			query = "select off FROM Offeror off order by userId"),
	@NamedQuery(name = "Offeror.findByUserId", //Devuelve todos los oferentes que hay en la tabla con el ID buscado
	query = "select off FROM Offeror off where userId = :userId"),
	@NamedQuery(name = "Offeror.findByCompanyName", //Devuelve los oferentes encontrados de una compañía.
	query = "select off FROM Offeror off where companyName = :companyName"),
	@NamedQuery(name = "Offeror.findByState", //Devuelve los oferentes en el estado indicado.
	query = "select off FROM Offeror off where state = :state"),
	@NamedQuery(name = "Offeror.findByCompanyNamePart", //Devuelve las empresas que tengan un segmento de texto específico; no es case sensitive
	query = "select off FROM Offeror off where UPPER(companyName) like  UPPER(:companyName)") //llamar así: query.setParamter("companyName", "%" + companyName + "%") para cadenas parciales
	
})

public class Offeror {

	@Column(name="USER_ID")	
	@Id
	private int userId;
	@Column(name="COMPANY_NAME")	
	private String companyName;
	@Column(name="STATE")	
	private int state;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
