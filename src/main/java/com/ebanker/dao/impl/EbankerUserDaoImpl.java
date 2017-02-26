package com.ebanker.dao.impl;

import com.ebanker.domain.EbankerUser;
import com.ebanker.domain.EbankerUserDetails;
import com.ebanker.domain.EbankerUserRoles;
import java.util.List;
import java.util.Set;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.ebanker.dao.EbankerUserDao;

@Repository
public class EbankerUserDaoImpl implements EbankerUserDao {

    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    @Transactional
    public EbankerUser findUserByUsername(String username) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerUser user = (EbankerUser) session
                .getNamedQuery("Korisnik.findByKorisnickoIme")
                .setParameter("korisnickoIme", username)
                .uniqueResult();
        transaction.commit();
        return (user != null) ? user : null;
    }

    @Override
    public void registerUser(EbankerUser user, EbankerUserDetails userDetails, Set<EbankerUserRoles> userRoles) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //register logic
        session.save(user);
        session.save(userDetails);
        for (EbankerUserRoles roles : userRoles) {
            session.save(roles);
        }
        //register logic
        transaction.commit();
    }

    @Override
    public List<EbankerUser> getListOfUsers() {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<EbankerUser> ebankerUsers = session
                .getNamedQuery("Korisnik.findAll")
                .list();
        transaction.commit();
        return ebankerUsers;
    }

    @Override
    public void removeUser(EbankerUser user) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.delete(user);
        transaction.commit();
    }

    @Override
    public EbankerUserDetails getUserDetails(String username) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        EbankerUserDetails userDetails = (EbankerUserDetails) session
                .getNamedQuery("KorisnikPodaci.findByKorisnickoIme")
                .setParameter("korisnickoIme", username)
                .uniqueResult();
        transaction.commit();
        return userDetails;
    }

    @Override
    public void updateUser(EbankerUser user, EbankerUserDetails userDetails) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        session.update(userDetails);
        transaction.commit();
    }

    @Override
    public void updateUserRoles(EbankerUserRoles userRoles) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(userRoles);
        transaction.commit();
    }

    @Override
    public void removeUserRole(EbankerUser user) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        for (EbankerUserRoles userRoles : user.getEbankerUserRolesSet()) {
            session.delete(userRoles);
        }
        transaction.commit();
    }

    @Override
    public void registerUser(EbankerUser user) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
    }

    @Override
    public void updateUserDetails(String username, String photo) {
        Session session = getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = session
                .createQuery("UPDATE KorisnikPodaci AS k SET k.slika = :photo WHERE k.korisnickoIme = :username")
                .setParameter("photo", photo)
                .setParameter("username", username);
        int result = query.executeUpdate();
        transaction.commit();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
