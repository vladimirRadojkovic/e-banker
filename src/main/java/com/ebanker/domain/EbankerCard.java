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
    @NamedQuery(name = "EbankerCard.findAll", query = "SELECT e FROM EbankerCard e")
    , @NamedQuery(name = "EbankerCard.findByCardId", query = "SELECT e FROM EbankerCard e WHERE e.cardId = :cardId")
    , @NamedQuery(name = "EbankerCard.findByCardName", query = "SELECT e FROM EbankerCard e WHERE e.cardName = :cardName")
    , @NamedQuery(name = "EbankerCard.findByCardLimit", query = "SELECT e FROM EbankerCard e WHERE e.cardLimit = :cardLimit")
    , @NamedQuery(name = "EbankerCard.findByCardDescription", query = "SELECT e FROM EbankerCard e WHERE e.cardDescription = :cardDescription")
    , @NamedQuery(name = "EbankerCard.findByCardExpDate", query = "SELECT e FROM EbankerCard e WHERE e.cardExpDate = :cardExpDate")
    , @NamedQuery(name = "EbankerCard.findByCardBalance", query = "SELECT e FROM EbankerCard e WHERE e.cardBalance = :cardBalance")
    , @NamedQuery(name = "EbankerCard.findByCardAccount", query = "SELECT e FROM EbankerCard e WHERE e.cardAccount = :cardAccount")})
public class EbankerCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "card_id")
    private Integer cardId;
    @Size(max = 255)
    @Column(name = "card_name")
    private String cardName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "card_limit")
    private int cardLimit;
    @Size(max = 255)
    @Column(name = "card_description")
    private String cardDescription;
    @Size(max = 255)
    @Column(name = "card_exp_date")
    private String cardExpDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "card_balance")
    private int cardBalance;
    @Size(max = 255)
    @Column(name = "card_account")
    private String cardAccount;
    @JoinColumn(name = "card_username", referencedColumnName = "user_username")
    @ManyToOne(fetch = FetchType.LAZY)
    private EbankerUser cardUsername;
    @OneToMany(mappedBy = "transferCardId", fetch = FetchType.LAZY)
    private Set<EbankerTransfer> ebankerTransferSet;
    @OneToMany(mappedBy = "paymentCardId", fetch = FetchType.LAZY)
    private Set<EbankerPayment> ebankerPaymentSet;

    public EbankerCard() {
    }

    public EbankerCard(Integer cardId) {
        this.cardId = cardId;
    }

    public EbankerCard(Integer cardId, int cardLimit, int cardBalance) {
        this.cardId = cardId;
        this.cardLimit = cardLimit;
        this.cardBalance = cardBalance;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardLimit() {
        return cardLimit;
    }

    public void setCardLimit(int cardLimit) {
        this.cardLimit = cardLimit;
    }

    public String getCardDescription() {
        return cardDescription;
    }

    public void setCardDescription(String cardDescription) {
        this.cardDescription = cardDescription;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    public int getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(int cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardAccount() {
        return cardAccount;
    }

    public void setCardAccount(String cardAccount) {
        this.cardAccount = cardAccount;
    }

    public EbankerUser getCardUsername() {
        return cardUsername;
    }

    public void setCardUsername(EbankerUser cardUsername) {
        this.cardUsername = cardUsername;
    }

    @XmlTransient
    public Set<EbankerTransfer> getEbankerTransferSet() {
        return ebankerTransferSet;
    }

    public void setEbankerTransferSet(Set<EbankerTransfer> ebankerTransferSet) {
        this.ebankerTransferSet = ebankerTransferSet;
    }

    @XmlTransient
    public Set<EbankerPayment> getEbankerPaymentSet() {
        return ebankerPaymentSet;
    }

    public void setEbankerPaymentSet(Set<EbankerPayment> ebankerPaymentSet) {
        this.ebankerPaymentSet = ebankerPaymentSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardId != null ? cardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerCard)) {
            return false;
        }
        EbankerCard other = (EbankerCard) object;
        if ((this.cardId == null && other.cardId != null) || (this.cardId != null && !this.cardId.equals(other.cardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerCard[ cardId=" + cardId + " ]";
    }
    
}
