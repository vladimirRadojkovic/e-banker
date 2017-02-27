/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerUser;
import com.ebanker.model.RemoveUserModel;
import com.ebanker.model.InsertUserModel;
import java.util.List;
import org.springframework.security.core.userdetails.User;

/**
 *
 * @author Vladimir
 */
public interface EbankerUserService {

    public InsertUserModel getKorisnikByUsername(String userName);

    public EbankerUser getKorisnik(User user);

    public List<EbankerUser> getKorisnikList();

    public void registerKorisnik(InsertUserModel korisnikModel);

    public void removeKorisnik(RemoveUserModel brisanjeKorisnikaModel);

    public void izmeniKorisnika(InsertUserModel unosKorisnikaModel);

    public EbankerUser getKorisnikByLetter(String key);

    public boolean aktivateUser(String aktivacijaUsername, String aktivirajPassword, String repeatPassword);

    public void uploadUserPicture(String username, String photo);
}
