/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao;

import com.ebanker.domain.EbankerLoan;
import java.util.List;

/**
 *
 * @author Vladimir
 */
public interface EbankerLoanDao {

    public EbankerLoan findLoanByName(String name);

    public void insertLoan(EbankerLoan loan);

    public void removeLoan(String name);

    public List<EbankerLoan> getListOfLoans();
}
