/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.model.BrisanjeKarticeModel;
import com.ebanker.model.KarticaModel;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public interface CardService {

    public void insertCard(KarticaModel karticaModel);

    public List<KarticaModel> getCardByUserName(String name);

    public KarticaModel getCardByTr(String tr);

    public void updateCard(KarticaModel karticaModel);

    public void removeCard(BrisanjeKarticeModel brisanjeKarticeModel);
}
