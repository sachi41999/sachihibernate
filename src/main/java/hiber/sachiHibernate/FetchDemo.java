package hiber.sachiHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hiberConfig.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session ss=factory.openSession();
		Student s1=(Student)ss.get(Student.class, 102);
		System.out.println(s1);
		ss.close();
		factory.close();
	}
}
