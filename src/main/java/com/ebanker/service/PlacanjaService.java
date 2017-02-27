/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ebanker.service;

import com.ebanker.domain.EbankerPayment;
import com.ebanker.model.PaymentModel;

/**
 *
 * @author Vladimir
 */
public interface PlacanjaService {

    public boolean sendSlipData(String nazivPlatioca, String adresaPlatioca, String mestoPlatioca, String datumIzvrsenja, PaymentModel uplatnicaModel);

    public EbankerPayment getPlacanjeById(String redBr);

}
