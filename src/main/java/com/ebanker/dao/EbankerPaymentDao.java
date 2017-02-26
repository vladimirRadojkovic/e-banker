/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao;

import com.ebanker.domain.EbankerPayment;

/**
 *
 * @author Vladimir
 */
public interface EbankerPaymentDao {

    public void pay(EbankerPayment payment);

    public EbankerPayment getPaymentById(int id);
}
