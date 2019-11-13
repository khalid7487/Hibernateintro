/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KHALID
 */
public class Main {

    public static void main(String[] args) {
//        Emp_Info emp = new Emp_Info();
//        //      emp.setEmp_id(2);
//        emp.setEmp_name("admin");
//        emp.setBirthdate(new Date());
//        Emp_Info emp2 = new Emp_Info();
//        emp2.setEmp_id(2);
//        emp2.setEmp_name("admin");
//        emp.setBirthdate(new Date());
        SessionFactory sessionFact = HibernateUtil.getSessionFactory();
        Session session = sessionFact.openSession();
        session.beginTransaction();
        
        //this would save the Emp_info object into database
//        session.save(emp);
//        session.save(emp);
        Emp_Info empinfo=(Emp_Info)session.get(Emp_Info.class, 1);
        System.out.println(empinfo.getEmp_name());
        session.getTransaction().commit();
        session.close();
        sessionFact.close();
    }
}
