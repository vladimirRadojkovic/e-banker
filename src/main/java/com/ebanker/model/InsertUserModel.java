package com.ebanker.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.NumberFormat;

public class InsertUserModel {

    @Size(min = 3, max = 20)
    private String name;
    @Size(min = 3, max = 20)
    private String surname;
    @Size(min = 3, max = 20)
    private String username;
    @Email
    private String email;
    @NumberFormat
    private String jmbg;
    @NumberFormat
    @Size(min = 3, max = 20)
    private String phoneNo;
    @Size(min = 3, max = 50)
    private String adress;
    @Size(min = 3, max = 20)
    private String residence;
    @Size(min = 3, max = 20)
    private String operater;
    private String role;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the korisniickoIme
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param korisniickoIme the korisniickoIme to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the jmbg
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * @param jmbg the jmbg to set
     */
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    /**
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the residence
     */
    public String getResidence() {
        return residence;
    }

    /**
     * @param residence the residence to set
     */
    public void setResidence(String residence) {
        this.residence = residence;
    }

    /**
     * @return the operater
     */
    public String getOperater() {
        return operater;
    }

    /**
     * @param operater the operater to set
     */
    public void setOperater(String operater) {
        this.operater = operater;
    }

    /**
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * @param role the role to set
     */
    public void setRole(String role) {
        this.role = role;
    }

}
