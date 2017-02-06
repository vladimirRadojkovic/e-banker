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
import javax.persistence.FetchType;
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
@Table(name = "ebanker_user_roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerUserRoles.findAll", query = "SELECT e FROM EbankerUserRoles e")
    , @NamedQuery(name = "EbankerUserRoles.findByUserRolesId", query = "SELECT e FROM EbankerUserRoles e WHERE e.userRolesId = :userRolesId")
    , @NamedQuery(name = "EbankerUserRoles.findByUserRolesRoleName", query = "SELECT e FROM EbankerUserRoles e WHERE e.userRolesRoleName = :userRolesRoleName")})
public class EbankerUserRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "user_roles_id")
    private Integer userRolesId;
    @Size(max = 255)
    @Column(name = "user_roles_role_name")
    private String userRolesRoleName;
    @JoinColumn(name = "user_roles_username", referencedColumnName = "user_username")
    @ManyToOne(fetch = FetchType.LAZY)
    private EbankerUser userRolesUsername;

    public EbankerUserRoles() {
    }

    public EbankerUserRoles(Integer userRolesId) {
        this.userRolesId = userRolesId;
    }

    public Integer getUserRolesId() {
        return userRolesId;
    }

    public void setUserRolesId(Integer userRolesId) {
        this.userRolesId = userRolesId;
    }

    public String getUserRolesRoleName() {
        return userRolesRoleName;
    }

    public void setUserRolesRoleName(String userRolesRoleName) {
        this.userRolesRoleName = userRolesRoleName;
    }

    public EbankerUser getUserRolesUsername() {
        return userRolesUsername;
    }

    public void setUserRolesUsername(EbankerUser userRolesUsername) {
        this.userRolesUsername = userRolesUsername;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userRolesId != null ? userRolesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerUserRoles)) {
            return false;
        }
        EbankerUserRoles other = (EbankerUserRoles) object;
        if ((this.userRolesId == null && other.userRolesId != null) || (this.userRolesId != null && !this.userRolesId.equals(other.userRolesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerUserRoles[ userRolesId=" + userRolesId + " ]";
    }
    
}
