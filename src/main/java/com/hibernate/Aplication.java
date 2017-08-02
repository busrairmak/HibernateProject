package com.hibernate;


import com.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Arrays;

/**
 * Created by Mebitech on 14.07.2017.
 */
public class Aplication {


    public static void main(String[] args) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();

        // PARENT

        Parent parent = new Parent(
                1,
                "büşra",
                "irmak",
                20,
                Arrays.asList(
                        new Child(
                               1,
                               "barbaros",
                               "susuz",
                               26
                        ),
                        new Child(
                                2,
                                "adile",
                                "gundogdu",
                                20
                        )
                )
                );





        session.save(parent);

        session.getTransaction().commit();
        System.out.println("child name" + parent.getChild());
        session.close();




    }


}
