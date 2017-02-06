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
@Table(name = "ebanker_user_details")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerUserDetails.findAll", query = "SELECT e FROM EbankerUserDetails e")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsUsername", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsUsername = :userDetailsUsername")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsAddress", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsAddress = :userDetailsAddress")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsPhone", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsPhone = :userDetailsPhone")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsEmail", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsEmail = :userDetailsEmail")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsName", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsName = :userDetailsName")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsPersonalId", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsPersonalId = :userDetailsPersonalId")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsResidence", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsResidence = :userDetailsResidence")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsSurname", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsSurname = :userDetailsSurname")
    , @NamedQuery(name = "EbankerUserDetails.findByUserDetailsProfileImg", query = "SELECT e FROM EbankerUserDetails e WHERE e.userDetailsProfileImg = :userDetailsProfileImg")})
public class EbankerUserDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "user_details_username")
    private String userDetailsUsername;
    @Size(max = 255)
    @Column(name = "user_details_address")
    private String userDetailsAddress;
    @Size(max = 255)
    @Column(name = "user_details_phone")
    private String userDetailsPhone;
    @Size(max = 255)
    @Column(name = "user_details_email")
    private String userDetailsEmail;
    @Size(max = 255)
    @Column(name = "user_details_name")
    private String userDetailsName;
    @Size(max = 255)
    @Column(name = "user_details_personal_id")
    private String userDetailsPersonalId;
    @Size(max = 255)
    @Column(name = "user_details_residence")
    private String userDetailsResidence;
    @Size(max = 255)
    @Column(name = "user_details_surname")
    private String userDetailsSurname;
    @Size(max = 255)
    @Column(name = "user_details_profile_img")
    private String userDetailsProfileImg;

    public EbankerUserDetails() {
    }

    public EbankerUserDetails(String userDetailsUsername) {
        this.userDetailsUsername = userDetailsUsername;
    }

    public String getUserDetailsUsername() {
        return userDetailsUsername;
    }

    public void setUserDetailsUsername(String userDetailsUsername) {
        this.userDetailsUsername = userDetailsUsername;
    }

    public String getUserDetailsAddress() {
        return userDetailsAddress;
    }

    public void setUserDetailsAddress(String userDetailsAddress) {
        this.userDetailsAddress = userDetailsAddress;
    }

    public String getUserDetailsPhone() {
        return userDetailsPhone;
    }

    public void setUserDetailsPhone(String userDetailsPhone) {
        this.userDetailsPhone = userDetailsPhone;
    }

    public String getUserDetailsEmail() {
        return userDetailsEmail;
    }

    public void setUserDetailsEmail(String userDetailsEmail) {
        this.userDetailsEmail = userDetailsEmail;
    }

    public String getUserDetailsName() {
        return userDetailsName;
    }

    public void setUserDetailsName(String userDetailsName) {
        this.userDetailsName = userDetailsName;
    }

    public String getUserDetailsPersonalId() {
        return userDetailsPersonalId;
    }

    public void setUserDetailsPersonalId(String userDetailsPersonalId) {
        this.userDetailsPersonalId = userDetailsPersonalId;
    }

    public String getUserDetailsResidence() {
        return userDetailsResidence;
    }

    public void setUserDetailsResidence(String userDetailsResidence) {
        this.userDetailsResidence = userDetailsResidence;
    }

    public String getUserDetailsSurname() {
        return userDetailsSurname;
    }

    public void setUserDetailsSurname(String userDetailsSurname) {
        this.userDetailsSurname = userDetailsSurname;
    }

    public String getUserDetailsProfileImg() {
        return userDetailsProfileImg;
    }

    public void setUserDetailsProfileImg(String userDetailsProfileImg) {
        this.userDetailsProfileImg = userDetailsProfileImg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDetailsUsername != null ? userDetailsUsername.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerUserDetails)) {
            return false;
        }
        EbankerUserDetails other = (EbankerUserDetails) object;
        if ((this.userDetailsUsername == null && other.userDetailsUsername != null) || (this.userDetailsUsername != null && !this.userDetailsUsername.equals(other.userDetailsUsername))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerUserDetails[ userDetailsUsername=" + userDetailsUsername + " ]";
    }
    
}
