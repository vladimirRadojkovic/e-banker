/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao;

import com.ebanker.domain.EbankerCard;

/**
 *
 * @author Vladimir
 */
public interface EbankerCardDao {

    public void insertCard(EbankerCard card);

    public EbankerCard findCardByAccount(String account);

    public void updateCard(EbankerCard card);

    public boolean updateBalance(String account, int amount);

    public void removeCard(EbankerCard card);
}
