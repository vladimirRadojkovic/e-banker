/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao.impl;

import com.ebanker.domain.EbankerTransfer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ebanker.dao.EbankerTransferDao;

/**
 *
 * @author Vladimir
 */
@Repository
public class EbankerTransferDaoImpl implements EbankerTransferDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public void saveTransfer(EbankerTransfer transferi) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //insert logic
        session.save(transferi);
        transaction.commit();
    }

    @Override
    public EbankerTransfer getTransferById(String id) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerTransfer transfer = (EbankerTransfer) session
                .getNamedQuery("Transferi.findById")
                .setParameter("id", Integer.parseInt(id))
                .uniqueResult();
        transaction.commit();
        return transfer;
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
