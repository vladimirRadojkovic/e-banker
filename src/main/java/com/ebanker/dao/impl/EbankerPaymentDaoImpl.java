/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao.impl;

import com.ebanker.domain.EbankerPayment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ebanker.dao.EbankerPaymentDao;

/**
 *
 * @author Vladimir
 */
@Repository
public class EbankerPaymentDaoImpl implements EbankerPaymentDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public void pay(EbankerPayment payment) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //insert logic
        session.save(payment);
        transaction.commit();
    }

    @Override
    public EbankerPayment getPaymentById(int id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerPayment payment = (EbankerPayment) session
                .getNamedQuery("Placanja.findById")
                .setParameter("id", id)
                .uniqueResult();
        transaction.commit();
        return payment;
    }

    /**
     * @return the sessionFactory
     */
    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

}
