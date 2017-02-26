/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerUser;
import com.ebanker.model.BrisanjeKorisnikaModel;
import com.ebanker.model.UnosKorisnikaModel;
import java.util.List;
import org.springframework.security.core.userdetails.User;

/**
 *
 * @author Vladimir
 */
public interface UserService {

    public UnosKorisnikaModel getKorisnikByUsername(String userName);

    public EbankerUser getKorisnik(User user);

    public List<EbankerUser> getKorisnikList();

    public void registerKorisnik(UnosKorisnikaModel korisnikModel);

    public void removeKorisnik(BrisanjeKorisnikaModel brisanjeKorisnikaModel);

    public void izmeniKorisnika(UnosKorisnikaModel unosKorisnikaModel);

    public EbankerUser getKorisnikByLetter(String key);

    public boolean aktivateUser(String aktivacijaUsername, String aktivirajPassword, String repeatPassword);

    public void uploadUserPicture(String username, String photo);
}
