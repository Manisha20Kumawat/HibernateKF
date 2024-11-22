
package hibernatefk;

import hib.dto.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateFK 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        Student st=new Student(10,"Abc",112111,"abcde","sadfhkngvhb");
        session.save(st);
        tx.commit();
        session.close();
        System.out.println("record inserted!!!");
    }
    
}
