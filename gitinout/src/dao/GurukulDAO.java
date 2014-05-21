/**
*
*/
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;
import centre.Centre;

/**
* @author anoop
*
*/
public class GurukulDAO {

public void saveCentre(String name, String address, String comments){
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction txn = session.beginTransaction();

Centre centre = new Centre();
centre.setName(name);
centre.setAddress(address);
centre.setComments(comments);

session.save(centre);
txn.commit();
session.close();

}

/*public void saveCentreByEM(String name, String address, String comments){
EntityManager em = HibernateUtil.getEm();
EntityTransaction txn = em.getTransaction();
txn.begin();

Centre centre = new Centre();
centre.setName(name);
centre.setAddress(address);
centre.setComments(comments);

em.persist(centre);
txn.commit();
em.close();
}*/

}