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
public class Notificacion {
    private int tipoNotificacion;
    
    public void notificar(Pago pago){
        if (tipoNotificacion==1){
            //enviar email
        }
        else{
            //enviar SMS
        }
    }
}
