/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.dao;

import com.ebanker.domain.EbankerTransfer;

/**
 *
 * @author Vladimir
 */
public interface EbankerTransferDao {

    public void saveTransfer(EbankerTransfer transfer);

    public EbankerTransfer getTransferById(String id);
}
