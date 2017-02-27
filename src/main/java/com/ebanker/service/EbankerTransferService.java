/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerTransfer;
import com.ebanker.model.TransferModel;

/**
 *
 * @author Vladimir
 */
public interface EbankerTransferService {

    public boolean startTransfer(TransferModel transferModel, String datum);

    public EbankerTransfer getTransferById(String redBr);
}
