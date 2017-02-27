/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.model.RemoveCardModel;
import com.ebanker.model.CardModel;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public interface CardService {

    public void insertCard(CardModel karticaModel);

    public List<CardModel> getCardByUserName(String name);

    public CardModel getCardByTr(String tr);

    public void updateCard(CardModel karticaModel);

    public void removeCard(RemoveCardModel brisanjeKarticeModel);
}
