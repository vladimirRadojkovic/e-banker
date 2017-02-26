package com.ebanker.dao.impl;

import com.ebanker.domain.EbankerCard;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.ebanker.dao.EbankerCardDao;

/**
 *
 * @author Vladimir
 */
@Repository
public class EbankerCardDaoImpl implements EbankerCardDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

    @Override
    public void insertCard(EbankerCard card) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //insert card logic
        session.save(card);
        transaction.commit();
    }

    @Override
    public EbankerCard findCardByAccount(String account) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerCard card = (EbankerCard) session.getNamedQuery("Kartica.findByTekuciRacun")
                .setParameter("tekuciRacun", account)
                .uniqueResult();
        transaction.commit();
        return card;
    }

    @Override
    public void updateCard(EbankerCard card) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(card);
        transaction.commit();
    }

    @Override
    public boolean updateBalance(String account, int amount) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerCard card = (EbankerCard) session.getNamedQuery("Kartica.findByTekuciRacun")
                .setParameter("tekuciRacun", account)
                .uniqueResult();

        if (card.getCardBalance() < 0) {
            transaction.rollback();
            return false;
        }
        if ((card.getCardBalance() - amount) < 0) {
            transaction.rollback();
            return false;
        }
        try {
            card.setCardBalance(card.getCardBalance() - amount);
            session.update(card);
        } catch (Exception e) {
            transaction.rollback();
            return false;
        }
        transaction.commit();
        return true;
    }

    @Override
    public void removeCard(EbankerCard card) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(card);
        transaction.commit();
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
