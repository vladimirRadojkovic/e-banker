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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vladi
 */
@Entity
@Table(name = "ebanker_payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerPayment.findAll", query = "SELECT e FROM EbankerPayment e")
    , @NamedQuery(name = "EbankerPayment.findByPaymentId", query = "SELECT e FROM EbankerPayment e WHERE e.paymentId = :paymentId")
    , @NamedQuery(name = "EbankerPayment.findByPaymentRecipientAddress", query = "SELECT e FROM EbankerPayment e WHERE e.paymentRecipientAddress = :paymentRecipientAddress")
    , @NamedQuery(name = "EbankerPayment.findByPaymentPayerAddress", query = "SELECT e FROM EbankerPayment e WHERE e.paymentPayerAddress = :paymentPayerAddress")
    , @NamedQuery(name = "EbankerPayment.findByPaymentTransactionDate", query = "SELECT e FROM EbankerPayment e WHERE e.paymentTransactionDate = :paymentTransactionDate")
    , @NamedQuery(name = "EbankerPayment.findByPaymentTransactionAmount", query = "SELECT e FROM EbankerPayment e WHERE e.paymentTransactionAmount = :paymentTransactionAmount")
    , @NamedQuery(name = "EbankerPayment.findByPaymentRecipientResidence", query = "SELECT e FROM EbankerPayment e WHERE e.paymentRecipientResidence = :paymentRecipientResidence")
    , @NamedQuery(name = "EbankerPayment.findByPaymentPayerResidence", query = "SELECT e FROM EbankerPayment e WHERE e.paymentPayerResidence = :paymentPayerResidence")
    , @NamedQuery(name = "EbankerPayment.findByPaymentModel", query = "SELECT e FROM EbankerPayment e WHERE e.paymentModel = :paymentModel")
    , @NamedQuery(name = "EbankerPayment.findByPaymentRecipientName", query = "SELECT e FROM EbankerPayment e WHERE e.paymentRecipientName = :paymentRecipientName")
    , @NamedQuery(name = "EbankerPayment.findByPaymentPayerName", query = "SELECT e FROM EbankerPayment e WHERE e.paymentPayerName = :paymentPayerName")
    , @NamedQuery(name = "EbankerPayment.findByPaymentReferenceNumber", query = "SELECT e FROM EbankerPayment e WHERE e.paymentReferenceNumber = :paymentReferenceNumber")
    , @NamedQuery(name = "EbankerPayment.findByPaymentRecipientAccount", query = "SELECT e FROM EbankerPayment e WHERE e.paymentRecipientAccount = :paymentRecipientAccount")
    , @NamedQuery(name = "EbankerPayment.findByPaymentPayerAccount", query = "SELECT e FROM EbankerPayment e WHERE e.paymentPayerAccount = :paymentPayerAccount")
    , @NamedQuery(name = "EbankerPayment.findByPaymentCode", query = "SELECT e FROM EbankerPayment e WHERE e.paymentCode = :paymentCode")
    , @NamedQuery(name = "EbankerPayment.findByPaymentPurposeOfPayment", query = "SELECT e FROM EbankerPayment e WHERE e.paymentPurposeOfPayment = :paymentPurposeOfPayment")})
public class EbankerPayment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "payment_id")
    private Integer paymentId;
    @Size(max = 255)
    @Column(name = "payment_recipient_address")
    private String paymentRecipientAddress;
    @Size(max = 255)
    @Column(name = "payment_payer_address")
    private String paymentPayerAddress;
    @Size(max = 255)
    @Column(name = "payment_transaction_date")
    private String paymentTransactionDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "payment_transaction_amount")
    private int paymentTransactionAmount;
    @Size(max = 255)
    @Column(name = "payment_recipient_residence")
    private String paymentRecipientResidence;
    @Size(max = 255)
    @Column(name = "payment_payer_residence")
    private String paymentPayerResidence;
    @Size(max = 255)
    @Column(name = "payment_model")
    private String paymentModel;
    @Size(max = 255)
    @Column(name = "payment_recipient_name")
    private String paymentRecipientName;
    @Size(max = 255)
    @Column(name = "payment_payer_name")
    private String paymentPayerName;
    @Size(max = 255)
    @Column(name = "payment_reference_number")
    private String paymentReferenceNumber;
    @Size(max = 255)
    @Column(name = "payment_recipient_account")
    private String paymentRecipientAccount;
    @Size(max = 255)
    @Column(name = "payment_payer_account")
    private String paymentPayerAccount;
    @Size(max = 255)
    @Column(name = "payment_code")
    private String paymentCode;
    @Size(max = 255)
    @Column(name = "payment_purpose_of_payment")
    private String paymentPurposeOfPayment;
    @JoinColumn(name = "payment_card_id", referencedColumnName = "card_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EbankerCard paymentCardId;

    public EbankerPayment() {
    }

    public EbankerPayment(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public EbankerPayment(Integer paymentId, int paymentTransactionAmount) {
        this.paymentId = paymentId;
        this.paymentTransactionAmount = paymentTransactionAmount;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public String getPaymentRecipientAddress() {
        return paymentRecipientAddress;
    }

    public void setPaymentRecipientAddress(String paymentRecipientAddress) {
        this.paymentRecipientAddress = paymentRecipientAddress;
    }

    public String getPaymentPayerAddress() {
        return paymentPayerAddress;
    }

    public void setPaymentPayerAddress(String paymentPayerAddress) {
        this.paymentPayerAddress = paymentPayerAddress;
    }

    public String getPaymentTransactionDate() {
        return paymentTransactionDate;
    }

    public void setPaymentTransactionDate(String paymentTransactionDate) {
        this.paymentTransactionDate = paymentTransactionDate;
    }

    public int getPaymentTransactionAmount() {
        return paymentTransactionAmount;
    }

    public void setPaymentTransactionAmount(int paymentTransactionAmount) {
        this.paymentTransactionAmount = paymentTransactionAmount;
    }

    public String getPaymentRecipientResidence() {
        return paymentRecipientResidence;
    }

    public void setPaymentRecipientResidence(String paymentRecipientResidence) {
        this.paymentRecipientResidence = paymentRecipientResidence;
    }

    public String getPaymentPayerResidence() {
        return paymentPayerResidence;
    }

    public void setPaymentPayerResidence(String paymentPayerResidence) {
        this.paymentPayerResidence = paymentPayerResidence;
    }

    public String getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(String paymentModel) {
        this.paymentModel = paymentModel;
    }

    public String getPaymentRecipientName() {
        return paymentRecipientName;
    }

    public void setPaymentRecipientName(String paymentRecipientName) {
        this.paymentRecipientName = paymentRecipientName;
    }

    public String getPaymentPayerName() {
        return paymentPayerName;
    }

    public void setPaymentPayerName(String paymentPayerName) {
        this.paymentPayerName = paymentPayerName;
    }

    public String getPaymentReferenceNumber() {
        return paymentReferenceNumber;
    }

    public void setPaymentReferenceNumber(String paymentReferenceNumber) {
        this.paymentReferenceNumber = paymentReferenceNumber;
    }

    public String getPaymentRecipientAccount() {
        return paymentRecipientAccount;
    }

    public void setPaymentRecipientAccount(String paymentRecipientAccount) {
        this.paymentRecipientAccount = paymentRecipientAccount;
    }

    public String getPaymentPayerAccount() {
        return paymentPayerAccount;
    }

    public void setPaymentPayerAccount(String paymentPayerAccount) {
        this.paymentPayerAccount = paymentPayerAccount;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentPurposeOfPayment() {
        return paymentPurposeOfPayment;
    }

    public void setPaymentPurposeOfPayment(String paymentPurposeOfPayment) {
        this.paymentPurposeOfPayment = paymentPurposeOfPayment;
    }

    public EbankerCard getPaymentCardId() {
        return paymentCardId;
    }

    public void setPaymentCardId(EbankerCard paymentCardId) {
        this.paymentCardId = paymentCardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (paymentId != null ? paymentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerPayment)) {
            return false;
        }
        EbankerPayment other = (EbankerPayment) object;
        if ((this.paymentId == null && other.paymentId != null) || (this.paymentId != null && !this.paymentId.equals(other.paymentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerPayment[ paymentId=" + paymentId + " ]";
    }
    
}
