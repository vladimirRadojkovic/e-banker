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
@Table(name = "transferi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Transferi.findAll", query = "SELECT t FROM Transferi t")
    , @NamedQuery(name = "Transferi.findById", query = "SELECT t FROM Transferi t WHERE t.id = :id")
    , @NamedQuery(name = "Transferi.findByDatum", query = "SELECT t FROM Transferi t WHERE t.datum = :datum")
    , @NamedQuery(name = "Transferi.findByIznos", query = "SELECT t FROM Transferi t WHERE t.iznos = :iznos")
    , @NamedQuery(name = "Transferi.findByRacunPrimaoca", query = "SELECT t FROM Transferi t WHERE t.racunPrimaoca = :racunPrimaoca")
    , @NamedQuery(name = "Transferi.findByRacunUplatioca", query = "SELECT t FROM Transferi t WHERE t.racunUplatioca = :racunUplatioca")})
public class Transferi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "datum")
    private String datum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "iznos")
    private int iznos;
    @Size(max = 255)
    @Column(name = "racunPrimaoca")
    private String racunPrimaoca;
    @Size(max = 255)
    @Column(name = "racunUplatioca")
    private String racunUplatioca;
    @JoinColumn(name = "idKartice_id", referencedColumnName = "id")
    @ManyToOne
    private Kartica idKarticeid;

    public Transferi() {
    }

    public Transferi(Integer id) {
        this.id = id;
    }

    public Transferi(Integer id, int iznos) {
        this.id = id;
        this.iznos = iznos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Kartica getIdKarticeid() {
        return idKarticeid;
    }

    public void setIdKarticeid(Kartica idKarticeid) {
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
        if (!(object instanceof Transferi)) {
            return false;
        }
        Transferi other = (Transferi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Transferi[ id=" + id + " ]";
    }
    
}
