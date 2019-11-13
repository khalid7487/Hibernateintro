/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author KHALID
 */
public class Main {
    public static void main(String[] args) {
        Emp_Info emp=new Emp_Info();
        emp.setEmp_id(1);
        emp.setEmp_name("khalid");
        SessionFactory sessionFact=HibernateUtil.getSessionFactory();
        Session session=sessionFact.openSession();
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        sessionFact.close();
    }
}
