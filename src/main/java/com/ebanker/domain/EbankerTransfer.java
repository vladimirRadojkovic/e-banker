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
@Table(name = "ebanker_transfer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EbankerTransfer.findAll", query = "SELECT e FROM EbankerTransfer e")
    , @NamedQuery(name = "EbankerTransfer.findByTransferId", query = "SELECT e FROM EbankerTransfer e WHERE e.transferId = :transferId")
    , @NamedQuery(name = "EbankerTransfer.findByTransferDate", query = "SELECT e FROM EbankerTransfer e WHERE e.transferDate = :transferDate")
    , @NamedQuery(name = "EbankerTransfer.findByTransferAmount", query = "SELECT e FROM EbankerTransfer e WHERE e.transferAmount = :transferAmount")
    , @NamedQuery(name = "EbankerTransfer.findByTransferRecipientAccount", query = "SELECT e FROM EbankerTransfer e WHERE e.transferRecipientAccount = :transferRecipientAccount")
    , @NamedQuery(name = "EbankerTransfer.findByTransferPayerAccount", query = "SELECT e FROM EbankerTransfer e WHERE e.transferPayerAccount = :transferPayerAccount")})
public class EbankerTransfer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "transfer_id")
    private Integer transferId;
    @Size(max = 255)
    @Column(name = "transfer_date")
    private String transferDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "transfer_amount")
    private int transferAmount;
    @Size(max = 255)
    @Column(name = "transfer_recipient_account")
    private String transferRecipientAccount;
    @Size(max = 255)
    @Column(name = "transfer_payer_account")
    private String transferPayerAccount;
    @JoinColumn(name = "transfer_card_id", referencedColumnName = "card_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private EbankerCard transferCardId;

    public EbankerTransfer() {
    }

    public EbankerTransfer(Integer transferId) {
        this.transferId = transferId;
    }

    public EbankerTransfer(Integer transferId, int transferAmount) {
        this.transferId = transferId;
        this.transferAmount = transferAmount;
    }

    public Integer getTransferId() {
        return transferId;
    }

    public void setTransferId(Integer transferId) {
        this.transferId = transferId;
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate;
    }

    public int getTransferAmount() {
        return transferAmount;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }

    public String getTransferRecipientAccount() {
        return transferRecipientAccount;
    }

    public void setTransferRecipientAccount(String transferRecipientAccount) {
        this.transferRecipientAccount = transferRecipientAccount;
    }

    public String getTransferPayerAccount() {
        return transferPayerAccount;
    }

    public void setTransferPayerAccount(String transferPayerAccount) {
        this.transferPayerAccount = transferPayerAccount;
    }

    public EbankerCard getTransferCardId() {
        return transferCardId;
    }

    public void setTransferCardId(EbankerCard transferCardId) {
        this.transferCardId = transferCardId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transferId != null ? transferId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EbankerTransfer)) {
            return false;
        }
        EbankerTransfer other = (EbankerTransfer) object;
        if ((this.transferId == null && other.transferId != null) || (this.transferId != null && !this.transferId.equals(other.transferId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ebanker.domain.EbankerTransfer[ transferId=" + transferId + " ]";
    }
    
}
