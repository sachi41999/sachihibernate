package hiber.sachiHibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "program started!" );
        Configuration con=new Configuration();
        con.configure("hiberConfig.xml");
        SessionFactory factory=con.buildSessionFactory();
//        
//        System.out.println(factory);
//        
//        //this is for checking factory is closed or not
//        System.out.println(factory.isClosed());
        
        Student st=new Student();
        st.setId(103);
        st.setName("supriya balmukhi");
        st.setAge(22);
        st.setEmploybility_Status("student");
        System.out.println(st.toString());
        
        Address ad=new Address();
        ad.setCity("heydrabad");
        ad.setStreet("near rajarahat");
        ad.setState("westbengal");
        ad.setPin(700123);
        ad.setAdded(new Date());
        ad.setRoadnumber(10);
        
        FileInputStream fis=new FileInputStream("src/main/java/IMG-20200514-WA0017.jpg");
        byte[] imge=new byte[fis.available()];
        fis.read(imge);
        ad.setImage(imge);
        
        Session ss=factory.openSession();
        Transaction tt=ss.beginTransaction();
        ss.save(st);
        ss.save(ad);
        tt.commit();
        
        
        ss.close();
    }
}
