/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerLoan;
import com.ebanker.model.KreditiModel;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public interface KreditiServis {

    public List<EbankerLoan> getListOfLoans();

    public KreditiModel izabraniKredit(String name);

    public void unesiNoviKredit(KreditiModel kreditiModel);

    public void obrisiKredit(String kreditZaBrisanje);

    List<EbankerLoan> getAll();
}
