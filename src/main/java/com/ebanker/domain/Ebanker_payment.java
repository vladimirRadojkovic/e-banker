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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladi
 */
@Entity
@Table(name = "placanja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Placanja.findAll", query = "SELECT p FROM Placanja p")
    , @NamedQuery(name = "Placanja.findById", query = "SELECT p FROM Placanja p WHERE p.id = :id")
    , @NamedQuery(name = "Placanja.findByAdresaPrimaoca", query = "SELECT p FROM Placanja p WHERE p.adresaPrimaoca = :adresaPrimaoca")
    , @NamedQuery(name = "Placanja.findByAdresaUplatioca", query = "SELECT p FROM Placanja p WHERE p.adresaUplatioca = :adresaUplatioca")
    , @NamedQuery(name = "Placanja.findByDatum", query = "SELECT p FROM Placanja p WHERE p.datum = :datum")
    , @NamedQuery(name = "Placanja.findByIznos", query = "SELECT p FROM Placanja p WHERE p.iznos = :iznos")
    , @NamedQuery(name = "Placanja.findByMestoPrimaoca", query = "SELECT p FROM Placanja p WHERE p.mestoPrimaoca = :mestoPrimaoca")
    , @NamedQuery(name = "Placanja.findByMestoUplatioca", query = "SELECT p FROM Placanja p WHERE p.mestoUplatioca = :mestoUplatioca")
    , @NamedQuery(name = "Placanja.findByModel", query = "SELECT p FROM Placanja p WHERE p.model = :model")
    , @NamedQuery(name = "Placanja.findByNazivPrimaoca", query = "SELECT p FROM Placanja p WHERE p.nazivPrimaoca = :nazivPrimaoca")
    , @NamedQuery(name = "Placanja.findByNazivUplatioca", query = "SELECT p FROM Placanja p WHERE p.nazivUplatioca = :nazivUplatioca")
    , @NamedQuery(name = "Placanja.findByPozivNaBroj", query = "SELECT p FROM Placanja p WHERE p.pozivNaBroj = :pozivNaBroj")
    , @NamedQuery(name = "Placanja.findByRacunPrimaoca", query = "SELECT p FROM Placanja p WHERE p.racunPrimaoca = :racunPrimaoca")
    , @NamedQuery(name = "Placanja.findByRacunUplatioca", query = "SELECT p FROM Placanja p WHERE p.racunUplatioca = :racunUplatioca")
    , @NamedQuery(name = "Placanja.findBySifraPlacanja", query = "SELECT p FROM Placanja p WHERE p.sifraPlacanja = :sifraPlacanja")
    , @NamedQuery(name = "Placanja.findBySvrhaPlacanja", query = "SELECT p FROM Placanja p WHERE p.svrhaPlacanja = :svrhaPlacanja")})
public class Ebanker_payment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "adresaPrimaoca")
    private String adresaPrimaoca;
    @Size(max = 255)
    @Column(name = "adresaUplatioca")
    private String adresaUplatioca;
    @Size(max = 255)
    @Column(name = "datum")
    private String datum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iznos")
    private int iznos;
    @Size(max = 255)
    @Column(name = "mestoPrimaoca")
    private String mestoPrimaoca;
    @Size(max = 255)
    @Column(name = "mestoUplatioca")
    private String mestoUplatioca;
    @Size(max = 255)
    @Column(name = "model")
    private String model;
    @Size(max = 255)
    @Column(name = "nazivPrimaoca")
    private String nazivPrimaoca;
    @Size(max = 255)
    @Column(name = "nazivUplatioca")
    private String nazivUplatioca;
    @Size(max = 255)
    @Column(name = "pozivNaBroj")
    private String pozivNaBroj;
    @Size(max = 255)
    @Column(name = "racunPrimaoca")
    private String racunPrimaoca;
    @Size(max = 255)
    @Column(name = "racunUplatioca")
    private String racunUplatioca;
    @Size(max = 255)
    @Column(name = "sifraPlacanja")
    private String sifraPlacanja;
    @Size(max = 255)
    @Column(name = "svrhaPlacanja")
    private String svrhaPlacanja;
    @JoinColumn(name = "idKartice_id", referencedColumnName = "id")
    @ManyToOne
    private Ebanker_card idKarticeid;

    public Ebanker_payment() {
    }

    public Ebanker_payment(Integer id) {
        this.id = id;
    }

    public Ebanker_payment(Integer id, int iznos) {
        this.id = id;
        this.iznos = iznos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresaPrimaoca() {
        return adresaPrimaoca;
    }

    public void setAdresaPrimaoca(String adresaPrimaoca) {
        this.adresaPrimaoca = adresaPrimaoca;
    }

    public String getAdresaUplatioca() {
        return adresaUplatioca;
    }

    public void setAdresaUplatioca(String adresaUplatioca) {
        this.adresaUplatioca = adresaUplatioca;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public int getIznos() {
        return iznos;
    }

    public void setIznos(int iznos) {
        this.iznos = iznos;
    }

    public String getMestoPrimaoca() {
        return mestoPrimaoca;
    }

    public void setMestoPrimaoca(String mestoPrimaoca) {
        this.mestoPrimaoca = mestoPrimaoca;
    }

    public String getMestoUplatioca() {
        return mestoUplatioca;
    }

    public void setMestoUplatioca(String mestoUplatioca) {
        this.mestoUplatioca = mestoUplatioca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNazivPrimaoca() {
        return nazivPrimaoca;
    }

    public void setNazivPrimaoca(String nazivPrimaoca) {
        this.nazivPrimaoca = nazivPrimaoca;
    }

    public String getNazivUplatioca() {
        return nazivUplatioca;
    }

    public void setNazivUplatioca(String nazivUplatioca) {
        this.nazivUplatioca = nazivUplatioca;
    }

    public String getPozivNaBroj() {
        return pozivNaBroj;
    }

    public void setPozivNaBroj(String pozivNaBroj) {
        this.pozivNaBroj = pozivNaBroj;
    }

    public String getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(String racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public String getRacunUplatioca() {
        return racunUplatioca;
    }

    public void setRacunUplatioca(String racunUplatioca) {
        this.racunUplatioca = racunUplatioca;
    }

    public String getSifraPlacanja() {
        return sifraPlacanja;
    }

    public void setSifraPlacanja(String sifraPlacanja) {
        this.sifraPlacanja = sifraPlacanja;
    }

    public String getSvrhaPlacanja() {
        return svrhaPlacanja;
    }

    public void setSvrhaPlacanja(String svrhaPlacanja) {
        this.svrhaPlacanja = svrhaPlacanja;
    }

    public Ebanker_card getIdKarticeid() {
        return idKarticeid;
    }

    public void setIdKarticeid(Ebanker_card idKarticeid) {
        this.idKarticeid = idKarticeid;
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
        if (!(object instanceof Ebanker_payment)) {
            return false;
        }
        Ebanker_payment other = (Ebanker_payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Placanja[ id=" + id + " ]";
    }
    
}
