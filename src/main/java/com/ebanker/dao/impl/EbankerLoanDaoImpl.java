/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao.impl;

import com.ebanker.domain.EbankerLoan;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ebanker.dao.EbankerLoanDao;

/**
 *
 * @author Vladimir
 */
@Repository
public class EbankerLoanDaoImpl implements EbankerLoanDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public EbankerLoan findLoanByName(String name) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerLoan loan = (EbankerLoan) session
                .getNamedQuery("Krediti.findByVrstaKredita")
                .setParameter("vrstaKredita", name)
                .uniqueResult();
        transaction.commit();

        return loan;
    }

    @Override
    public void insertLoan(EbankerLoan loan) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(loan);
        transaction.commit();
    }

    @Override
    public void removeLoan(String name) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerLoan loan = (EbankerLoan) session
                .getNamedQuery("Krediti.findByVrstaKredita")
                .setParameter("vrstaKredita", name)
                .uniqueResult();
        session.delete(loan);
        transaction.commit();
    }

    @Override
    public List<EbankerLoan> getListOfLoans() {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<EbankerLoan> loans = session.getNamedQuery("Krediti.findAll").list();
        transaction.commit();
        return loans;
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
