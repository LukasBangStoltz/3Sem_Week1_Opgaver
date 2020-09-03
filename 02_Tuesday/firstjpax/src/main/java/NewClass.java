

import Entity.NewEntity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class NewClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        
            
       try{
           NewEntity c1 = new NewEntity ("Denmark", "Germany");
           NewEntity c2 = new NewEntity ("Iceland", "");
           NewEntity c3 = new NewEntity ("Malta", "");
           
           em.getTransaction().begin();
           em.persist(c1);
           em.persist(c2);
           em.persist(c3);
           em.getTransaction().commit();
       } finally {
           em.close();
       }
    
}
}
