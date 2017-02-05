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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladi
 */
@Entity
@Table(name = "korisnikroles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnikroles.findAll", query = "SELECT k FROM Korisnikroles k")
    , @NamedQuery(name = "Korisnikroles.findById", query = "SELECT k FROM Korisnikroles k WHERE k.id = :id")
    , @NamedQuery(name = "Korisnikroles.findByRola", query = "SELECT k FROM Korisnikroles k WHERE k.rola = :rola")})
public class Ebanker_userroles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "rola")
    private String rola;
    @JoinColumn(name = "korisnickoIme_korisnickoIme", referencedColumnName = "korisnickoIme")
    @ManyToOne
    private Ebanker_user korisnickoImekorisnickoIme;

    public Ebanker_userroles() {
    }

    public Ebanker_userroles(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRola() {
        return rola;
    }

    public void setRola(String rola) {
        this.rola = rola;
    }

    public Ebanker_user getKorisnickoImekorisnickoIme() {
        return korisnickoImekorisnickoIme;
    }

    public void setKorisnickoImekorisnickoIme(Ebanker_user korisnickoImekorisnickoIme) {
        this.korisnickoImekorisnickoIme = korisnickoImekorisnickoIme;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ebanker_userroles)) {
            return false;
        }
        Ebanker_userroles other = (Ebanker_userroles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Korisnikroles[ id=" + id + " ]";
    }
    
}
