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
import javax.persistence.FetchType;
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
@Table(name = "ebanker_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerUser.findAll", query = "SELECT e FROM EbankerUser e")
    , @NamedQuery(name = "EbankerUser.findByUserUsername", query = "SELECT e FROM EbankerUser e WHERE e.userUsername = :userUsername")
    , @NamedQuery(name = "EbankerUser.findByUserActive", query = "SELECT e FROM EbankerUser e WHERE e.userActive = :userActive")
    , @NamedQuery(name = "EbankerUser.findByUserPassword", query = "SELECT e FROM EbankerUser e WHERE e.userPassword = :userPassword")})
public class EbankerUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "user_username")
    private String userUsername;
    @Column(name = "user_active")
    private Boolean userActive;
    @Size(max = 255)
    @Column(name = "user_password")
    private String userPassword;
    @OneToMany(mappedBy = "cardUsername", fetch = FetchType.LAZY)
    private Set<EbankerCard> ebankerCardSet;
    @OneToMany(mappedBy = "userRolesUsername", fetch = FetchType.LAZY)
    private Set<EbankerUserRoles> ebankerUserRolesSet;

    public EbankerUser() {
    }

    public EbankerUser(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public Boolean getUserActive() {
        return userActive;
    }

    public void setUserActive(Boolean userActive) {
        this.userActive = userActive;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @XmlTransient
    public Set<EbankerCard> getEbankerCardSet() {
        return ebankerCardSet;
    }

    public void setEbankerCardSet(Set<EbankerCard> ebankerCardSet) {
        this.ebankerCardSet = ebankerCardSet;
    }

    @XmlTransient
    public Set<EbankerUserRoles> getEbankerUserRolesSet() {
        return ebankerUserRolesSet;
    }

    public void setEbankerUserRolesSet(Set<EbankerUserRoles> ebankerUserRolesSet) {
        this.ebankerUserRolesSet = ebankerUserRolesSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userUsername != null ? userUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerUser)) {
            return false;
        }
        EbankerUser other = (EbankerUser) object;
        if ((this.userUsername == null && other.userUsername != null) || (this.userUsername != null && !this.userUsername.equals(other.userUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerUser[ userUsername=" + userUsername + " ]";
    }
    
}
