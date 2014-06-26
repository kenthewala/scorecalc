/**
*
*/
package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
* @author anoop
*
*/
public class HibernateUtil {
private static final SessionFactory sessionFactory;
//private static final EntityManager em;

static {
try {
sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();

/*EntityManagerFactory emf = Persistence.createEntityManagerFactory("gurukul");
em = emf.createEntityManager();
*/
} catch (Throwable ex) {
System.err.println("Initial SessionFactory creation failed." + ex);
throw new ExceptionInInitializerError(ex);
}
}

public static SessionFactory getSessionFactory() {
return sessionFactory;
}

/**
* @return the em
*/
/*public static EntityManager getEm() {
return em;
}*/

}