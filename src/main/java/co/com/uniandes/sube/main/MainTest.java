/**
 * Main de pruebas que permite validar funcionalidades; se pasara luego a un JUnit test suite.
 */
package co.com.uniandes.sube.main;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;

import com.sube.utilities.hibernate.HibernateUtility;

import java.util.List;
import co.com.uniandes.sube.utilities.entities.AcademicOffer;
import co.com.uniandes.sube.utilities.entities.Attribute;
import co.com.uniandes.sube.utilities.entities.Candidate;
import co.com.uniandes.sube.utilities.entities.Catalog;
import co.com.uniandes.sube.utilities.entities.Comments;
import co.com.uniandes.sube.utilities.entities.Concept;
import co.com.uniandes.sube.utilities.entities.OfferStep;
import co.com.uniandes.sube.utilities.entities.OfferStepConfiguration;
import co.com.uniandes.sube.utilities.entities.Offeror;
import co.com.uniandes.sube.utilities.entities.Postulation;
import co.com.uniandes.sube.utilities.entities.Role;
import co.com.uniandes.sube.utilities.entities.RoleAccess;
import co.com.uniandes.sube.utilities.entities.UserAuthentication;
import co.com.uniandes.sube.utilities.entities.UserSessionToken;
import co.com.uniandes.sube.utilities.entities.Users;
import oracle.sql.TIMESTAMP;

/**
 * @author Ciro Diaz
 *
 */
public class MainTest {

	public static void main(String[] args) {

		/*Date fechaTest = new Date();
		Role role = new Role();
		role.setDescription("Prueba");
		role.setId(2);
		role.setName("Rol2");
		role.setIsActive(1);

		Session session = HibernateUtility.getSessionFactory().openSession();
		
		session.beginTransaction();
		session.save(role);
		session.getTransaction().commit();
		session.close();
		
		
		
		AcademicOffer ao = new AcademicOffer();
		
		ao.setCreateBy(1);
		ao.setCreationDate(fechaTest);
		ao.setStartDate(fechaTest);
		ao.setEndDate(fechaTest);
		ao.setName("oferta prueba");
		ao.setDescription("descripcion prueba");
		ao.setType(1);
		ao.setState(1);
		
		
		
		Attribute att = new Attribute();
		att.setId(1);
		att.setName("prueba");
		
		Candidate can = new Candidate();
		
		can.setBirthDate(fechaTest);
		System.out.println(can.getBirthDate().toString());
		can.setCity(1);
		can.setDepartment(1);
		can.setLevelOfSchooling(1);
		can.setStratum(1);
		can.setUserId(1); 
		
		Catalog cat = new Catalog();
		
		cat.setId(1);
		cat.setName("prueba");
		cat.setConceptId(1);
		cat.setParentId(1);
		
		Comments com = new Comments();
		
		com.setId(1);
		com.setConceptId(1);
		com.setObjectId(1);
		com.setCreateBy(1);
		com.setCreationDate(fechaTest);
		com.setTextValue("prueba");
		
		Concept con = new Concept();
		
		con.setId(1);
		con.setName("prueba");
		
		OfferStep oStp = new OfferStep();
		
		oStp.setId(1);
		oStp.setConfigurationId(1);
		oStp.setOfferId(1);
		oStp.setName("prueba");
		
		OfferStepConfiguration osc = new OfferStepConfiguration();
		
		osc.setId(1);
		osc.setOfferId(1);
		osc.setSerializeSettings("prueba");
		
		Offeror offr = new Offeror();
		
		offr.setUserId(1);
		offr.setCompanyName("prueba");
		offr.setState(1);
		
		Postulation pst = new Postulation();
		
		pst.setId(1);
		pst.setOfferId(1);
		pst.setUserId(1);
		pst.setCreationDate(fechaTest);
		pst.setState(1);
		
		
		RoleAccess ra = new RoleAccess();
		
		ra.setId(1);
		ra.setRoleId(1);
		ra.setUserId(1);
		
		UserAuthentication ua = new UserAuthentication();
		
		ua.setUserId(1);
		ua.setIsBlocked(0);
		ua.setPassWord("123");
		ua.setPassSalt("123");
		
		UserSessionToken ust = new UserSessionToken();
		
		ust.setUserId(1);
		ust.setExpirationDate(fechaTest);
		ust.setToken("prueba");
		
		Users user = new Users();
		
		user.setAddress("prueba");
		user.setCountry(1);
		user.setDni(1);
		user.setDniType(1);
		user.seteMail("prueba");
		user.setFirstName("prueba");
		user.setId(1);
		user.setLastName("prueba");
		user.setPhone("prueba");
		
		Role role = new Role();
		role.setId(1);
		role.setName("prueba");
		role.setDescription("prueba");
		role.setIsActive(1);
		
		*/Session session = HibernateUtility.getSessionFactory().openSession();
		/*session.beginTransaction();		
		session.save(ao);
		session.getTransaction().commit();
		Integer id = (Integer)session.getIdentifier(ao);
		System.out.println("el id es: "+id);*/
		Query consulta = session.getNamedQuery("AcademicOffer.findById");
		consulta.setParameter("id", 1);
		
		List<AcademicOffer> resultado =  consulta.list();
		
		AcademicOffer oferta =  resultado.get(0);
		
		int i = 1;
		for(AcademicOffer ofertaActual: resultado){
			
			System.out.println("resultado numero: " + i);
			System.out.println(oferta.getId());			
			System.out.println(oferta.getName());
			
			i++;
		}
		
		
		
		session.close();
		
		
		
		

	}

}
