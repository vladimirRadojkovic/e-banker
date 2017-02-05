/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladi
 */
@Entity
@Table(name = "korisnikpodaci")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnikpodaci.findAll", query = "SELECT k FROM Korisnikpodaci k")
    , @NamedQuery(name = "Korisnikpodaci.findByKorisnickoIme", query = "SELECT k FROM Korisnikpodaci k WHERE k.korisnickoIme = :korisnickoIme")
    , @NamedQuery(name = "Korisnikpodaci.findByAdresa", query = "SELECT k FROM Korisnikpodaci k WHERE k.adresa = :adresa")
    , @NamedQuery(name = "Korisnikpodaci.findByBrojTelefona", query = "SELECT k FROM Korisnikpodaci k WHERE k.brojTelefona = :brojTelefona")
    , @NamedQuery(name = "Korisnikpodaci.findByEmail", query = "SELECT k FROM Korisnikpodaci k WHERE k.email = :email")
    , @NamedQuery(name = "Korisnikpodaci.findByIme", query = "SELECT k FROM Korisnikpodaci k WHERE k.ime = :ime")
    , @NamedQuery(name = "Korisnikpodaci.findByJmbg", query = "SELECT k FROM Korisnikpodaci k WHERE k.jmbg = :jmbg")
    , @NamedQuery(name = "Korisnikpodaci.findByMesto", query = "SELECT k FROM Korisnikpodaci k WHERE k.mesto = :mesto")
    , @NamedQuery(name = "Korisnikpodaci.findByOperater", query = "SELECT k FROM Korisnikpodaci k WHERE k.operater = :operater")
    , @NamedQuery(name = "Korisnikpodaci.findByPrezime", query = "SELECT k FROM Korisnikpodaci k WHERE k.prezime = :prezime")
    , @NamedQuery(name = "Korisnikpodaci.findBySlika", query = "SELECT k FROM Korisnikpodaci k WHERE k.slika = :slika")})
public class Ebanker_userdetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "korisnickoIme")
    private String korisnickoIme;
    @Size(max = 255)
    @Column(name = "adresa")
    private String adresa;
    @Size(max = 255)
    @Column(name = "brojTelefona")
    private String brojTelefona;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Size(max = 255)
    @Column(name = "ime")
    private String ime;
    @Size(max = 255)
    @Column(name = "jmbg")
    private String jmbg;
    @Size(max = 255)
    @Column(name = "mesto")
    private String mesto;
    @Size(max = 255)
    @Column(name = "operater")
    private String operater;
    @Size(max = 255)
    @Column(name = "prezime")
    private String prezime;
    @Size(max = 255)
    @Column(name = "slika")
    private String slika;

    public Ebanker_userdetails() {
    }

    public Ebanker_userdetails(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getSlika() {
        return slika;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (korisnickoIme != null ? korisnickoIme.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ebanker_userdetails)) {
            return false;
        }
        Ebanker_userdetails other = (Ebanker_userdetails) object;
        if ((this.korisnickoIme == null && other.korisnickoIme != null) || (this.korisnickoIme != null && !this.korisnickoIme.equals(other.korisnickoIme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Korisnikpodaci[ korisnickoIme=" + korisnickoIme + " ]";
    }
    
}
