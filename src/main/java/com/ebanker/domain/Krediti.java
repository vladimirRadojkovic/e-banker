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
@Table(name = "krediti")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Krediti.findAll", query = "SELECT k FROM Krediti k")
    , @NamedQuery(name = "Krediti.findByVrstaKredita", query = "SELECT k FROM Krediti k WHERE k.vrstaKredita = :vrstaKredita")
    , @NamedQuery(name = "Krediti.findByNominalnaGodisnjaStopa", query = "SELECT k FROM Krediti k WHERE k.nominalnaGodisnjaStopa = :nominalnaGodisnjaStopa")
    , @NamedQuery(name = "Krediti.findByValuta", query = "SELECT k FROM Krediti k WHERE k.valuta = :valuta")})
public class Krediti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "vrstaKredita")
    private String vrstaKredita;
    @Size(max = 255)
    @Column(name = "nominalnaGodisnjaStopa")
    private String nominalnaGodisnjaStopa;
    @Size(max = 255)
    @Column(name = "valuta")
    private String valuta;

    public Krediti() {
    }

    public Krediti(String vrstaKredita) {
        this.vrstaKredita = vrstaKredita;
    }

    public String getVrstaKredita() {
        return vrstaKredita;
    }

    public void setVrstaKredita(String vrstaKredita) {
        this.vrstaKredita = vrstaKredita;
    }

    public String getNominalnaGodisnjaStopa() {
        return nominalnaGodisnjaStopa;
    }

    public void setNominalnaGodisnjaStopa(String nominalnaGodisnjaStopa) {
        this.nominalnaGodisnjaStopa = nominalnaGodisnjaStopa;
    }

    public String getValuta() {
        return valuta;
    }

    public void setValuta(String valuta) {
        this.valuta = valuta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vrstaKredita != null ? vrstaKredita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Krediti)) {
            return false;
        }
        Krediti other = (Krediti) object;
        if ((this.vrstaKredita == null && other.vrstaKredita != null) || (this.vrstaKredita != null && !this.vrstaKredita.equals(other.vrstaKredita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.Krediti[ vrstaKredita=" + vrstaKredita + " ]";
    }
    
}
