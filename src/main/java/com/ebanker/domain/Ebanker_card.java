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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ebanker_card")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ebanker_card.findAll", query = "SELECT k FROM Ebanker_card k")
    , @NamedQuery(name = "Ebanker_card.findById", query = "SELECT k FROM Ebanker_card k WHERE k.id = :id")
    , @NamedQuery(name = "Ebanker_card.findByNaziv", query = "SELECT k FROM Ebanker_card k WHERE k.naziv = :naziv")
    , @NamedQuery(name = "Ebanker_card.findByOgranicenje", query = "SELECT k FROM Ebanker_card k WHERE k.ogranicenje = :ogranicenje")
    , @NamedQuery(name = "Ebanker_card.findByOpis", query = "SELECT k FROM Ebanker_card k WHERE k.opis = :opis")
    , @NamedQuery(name = "Ebanker_card.findByRokVazenja", query = "SELECT k FROM Ebanker_card k WHERE k.rokVazenja = :rokVazenja")
    , @NamedQuery(name = "Ebanker_card.findBySaldo", query = "SELECT k FROM Ebanker_card k WHERE k.saldo = :saldo")
    , @NamedQuery(name = "Ebanker_card.findByTekuciRacun", query = "SELECT k FROM Ebanker_card k WHERE k.tekuciRacun = :tekuciRacun")})
public class Ebanker_card implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ogranicenje")
    private int ogranicenje;
    @Size(max = 255)
    @Column(name = "opis")
    private String opis;
    @Size(max = 255)
    @Column(name = "rokVazenja")
    private String rokVazenja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "saldo")
    private int saldo;
    @Size(max = 255)
    @Column(name = "tekuciRacun")
    private String tekuciRacun;
    @OneToMany(mappedBy = "idKarticeid")
    private Set<Ebanker_transfers> transferiSet;
    @JoinColumn(name = "korisnickoIme_korisnickoIme", referencedColumnName = "korisnickoIme")
    @ManyToOne
    private Ebanker_user korisnickoImekorisnickoIme;
    @OneToMany(mappedBy = "idKarticeid")
    private Set<Ebanker_payment> placanjaSet;

    public Ebanker_card() {
    }

    public Ebanker_card(Integer id) {
        this.id = id;
    }

    public Ebanker_card(Integer id, int ogranicenje, int saldo) {
        this.id = id;
        this.ogranicenje = ogranicenje;
        this.saldo = saldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getOgranicenje() {
        return ogranicenje;
    }

    public void setOgranicenje(int ogranicenje) {
        this.ogranicenje = ogranicenje;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getRokVazenja() {
        return rokVazenja;
    }

    public void setRokVazenja(String rokVazenja) {
        this.rokVazenja = rokVazenja;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    @XmlTransient
    public Set<Ebanker_transfers> getTransferiSet() {
        return transferiSet;
    }

    public void setTransferiSet(Set<Ebanker_transfers> transferiSet) {
        this.transferiSet = transferiSet;
    }

    public Ebanker_user getKorisnickoImekorisnickoIme() {
        return korisnickoImekorisnickoIme;
    }

    public void setKorisnickoImekorisnickoIme(Ebanker_user korisnickoImekorisnickoIme) {
        this.korisnickoImekorisnickoIme = korisnickoImekorisnickoIme;
    }

    @XmlTransient
    public Set<Ebanker_payment> getPlacanjaSet() {
        return placanjaSet;
    }

    public void setPlacanjaSet(Set<Ebanker_payment> placanjaSet) {
        this.placanjaSet = placanjaSet;
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
        if (!(object instanceof Ebanker_card)) {
            return false;
        }
        Ebanker_card other = (Ebanker_card) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Kartica[ id=" + id + " ]";
    }
    
}
