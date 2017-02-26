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
@Table(name = "ebanker_loans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerLoan.findAll", query = "SELECT e FROM EbankerLoan e")
    , @NamedQuery(name = "EbankerLoan.findByLoansLoanType", query = "SELECT e FROM EbankerLoan e WHERE e.loansLoanType = :loansLoanType")
    , @NamedQuery(name = "EbankerLoan.findByLoanInterestRate", query = "SELECT e FROM EbankerLoan e WHERE e.loansInterestRate = :loansInterestRate")
    , @NamedQuery(name = "EbankerLoan.findByLoansLoanCurrency", query = "SELECT e FROM EbankerLoan e WHERE e.loansLoanCurrency = :loansLoanCurrency")})
public class EbankerLoan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "loans_loan_type")
    private String loansLoanType;
    @Size(max = 255)
    @Column(name = "loans_interest_rate")
    private String loansInterestRate;
    @Size(max = 255)
    @Column(name = "loans_loan_currency")
    private String loansLoanCurrency;

    public EbankerLoan() {
    }

    public EbankerLoan(String loansLoanType) {
        this.loansLoanType = loansLoanType;
    }

    public String getLoansLoanType() {
        return loansLoanType;
    }

    public void setLoansLoanType(String loansLoanType) {
        this.loansLoanType = loansLoanType;
    }

    public String getLoansInterestRate() {
        return loansInterestRate;
    }

    public void setLoansInterestRate(String loansInterestRate) {
        this.loansInterestRate = loansInterestRate;
    }

    public String getLoansLoanCurrency() {
        return loansLoanCurrency;
    }

    public void setLoansLoanCurrency(String loansLoanCurrency) {
        this.loansLoanCurrency = loansLoanCurrency;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loansLoanType != null ? loansLoanType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerLoan)) {
            return false;
        }
        EbankerLoan other = (EbankerLoan) object;
        if ((this.loansLoanType == null && other.loansLoanType != null) || (this.loansLoanType != null && !this.loansLoanType.equals(other.loansLoanType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerLoans[ loansLoanType=" + loansLoanType + " ]";
    }

}
