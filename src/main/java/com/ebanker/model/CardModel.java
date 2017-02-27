/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.NumberFormat;

/**
 *
 * @author Vladimir
 */
public class CardModel {

    private String user;
    @Size(min = 3, max = 20)
    private String cardName;
    @NumberFormat
    @Size(min = 5, max = 10)
    private String cardLimit;
    @Size(min = 1, max = 20)
    private String opis;
    @Size(min = 3, max = 20)
    private String cardExpDate;
    @NumberFormat
    @Size(min = 2, max = 7)
    private String balance;
    @NumberFormat
    @Size(min = 6, max = 10)
    private String account;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the cardName
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * @param cardName the cardName to set
     */
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    /**
     * @return the cardLimit
     */
    public String getCardLimit() {
        return cardLimit;
    }

    /**
     * @param cardLimit the cardLimit to set
     */
    public void setCardLimit(String cardLimit) {
        this.cardLimit = cardLimit;
    }

    /**
     * @return the opis
     */
    public String getOpis() {
        return opis;
    }

    /**
     * @param opis the opis to set
     */
    public void setOpis(String opis) {
        this.opis = opis;
    }

    /**
     * @return the cardExpDate
     */
    public String getCardExpDate() {
        return cardExpDate;
    }

    /**
     * @param cardExpDate the cardExpDate to set
     */
    public void setCardExpDate(String cardExpDate) {
        this.cardExpDate = cardExpDate;
    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

}
