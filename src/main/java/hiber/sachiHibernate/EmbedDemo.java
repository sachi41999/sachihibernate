package hiber.sachiHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hiberConfig.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student st=new Student();
		st.setName("sabyasachi");
		st.setAge(24);
		st.setId(108);
		st.setEmploybility_Status("student");
		
		Certificate cert=new Certificate();
		cert.setCourseName("Webdevelopment");
		cert.setDuration("1 month");
		st.setCerti(cert);
		
		Student st1=new Student();
		st1.setName("sabya ghosh");
		st1.setAge(43);
		st1.setId(111);
		st1.setEmploybility_Status("java developer");
		
		Certificate cert1=new Certificate();
		cert1.setCourseName("advance java");
		cert1.setDuration("3 month");
		st1.setCerti(cert1);
		
		Session ss=factory.openSession();
		Transaction tt=ss.beginTransaction();
		ss.save(st);
		ss.save(st1);
		
		tt.commit();
		ss.close();
		factory.close();

	}

}
