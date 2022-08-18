package hiberante_one_to_one;

import hiberante_one_to_one.entity.Detail;
import hiberante_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Denys", "Dudnik", "IT", 500);
//            Detail detail = new Detail("Baku", "651651", "denisfors@gmail.com");
//            session.beginTransaction();
//            employee.setEmpDetail(detail);
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 700);
//            Detail detail = new Detail("Kyiv", "6512342351", "isfadfhadfhrs@gmail.com");
//            session.beginTransaction();
//            employee.setEmpDetail(detail);
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 10);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}