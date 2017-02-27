/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerLoan;
import com.ebanker.model.LoanModel;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public interface EbankerLoanService {

    public List<EbankerLoan> getListOfLoans();

    public LoanModel izabraniKredit(String name);

    public void unesiNoviKredit(LoanModel kreditiModel);

    public void obrisiKredit(String kreditZaBrisanje);

    List<EbankerLoan> getAll();
}
