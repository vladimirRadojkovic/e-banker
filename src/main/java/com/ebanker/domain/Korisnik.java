/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.domain;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vladi
 */
@Entity
@Table(name = "korisnik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k")
    , @NamedQuery(name = "Korisnik.findByKorisnickoIme", query = "SELECT k FROM Korisnik k WHERE k.korisnickoIme = :korisnickoIme")
    , @NamedQuery(name = "Korisnik.findByAktivan", query = "SELECT k FROM Korisnik k WHERE k.aktivan = :aktivan")
    , @NamedQuery(name = "Korisnik.findByLozinka", query = "SELECT k FROM Korisnik k WHERE k.lozinka = :lozinka")})
public class Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "korisnickoIme")
    private String korisnickoIme;
    @Column(name = "aktivan")
    private Short aktivan;
    @Size(max = 255)
    @Column(name = "lozinka")
    private String lozinka;
    @OneToMany(mappedBy = "korisnickoImekorisnickoIme")
    private Set<Kartica> karticaSet;
    @OneToMany(mappedBy = "korisnickoImekorisnickoIme")
    private Set<Korisnikroles> korisnikrolesSet;

    public Korisnik() {
    }

    public Korisnik(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public Short getAktivan() {
        return aktivan;
    }

    public void setAktivan(Short aktivan) {
        this.aktivan = aktivan;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @XmlTransient
    public Set<Kartica> getKarticaSet() {
        return karticaSet;
    }

    public void setKarticaSet(Set<Kartica> karticaSet) {
        this.karticaSet = karticaSet;
    }

    @XmlTransient
    public Set<Korisnikroles> getKorisnikrolesSet() {
        return korisnikrolesSet;
    }

    public void setKorisnikrolesSet(Set<Korisnikroles> korisnikrolesSet) {
        this.korisnikrolesSet = korisnikrolesSet;
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
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.korisnickoIme == null && other.korisnickoIme != null) || (this.korisnickoIme != null && !this.korisnickoIme.equals(other.korisnickoIme))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Korisnik[ korisnickoIme=" + korisnickoIme + " ]";
    }
    
}
