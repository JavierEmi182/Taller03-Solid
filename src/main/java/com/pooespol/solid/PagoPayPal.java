/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.solid;

/**
 *
 * @author Javier
 */
public class PagoPayPal extends Pago {
    private boolean loggedIn;
    
    @Override
    public void realizarCobro(double monto){
        if(!loggedIn){
            return;
        }
        //cargar el monto al metodo de pago
    }
}
