/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pooespol.solid;

import java.util.List;

/**
 *
 * @author Javier
 */
public class Compra {
    
    private Pago pago;
    private PagoPayPal pagoPayPal;
    private List articulos;
    
    public Compra(Pago pago){
        //inicializaciones
    }
    
    public Compra(PagoPayPal pagoPayPal){
        //inicializaciones
    }
    
    public void agregarArticulo(Articulo articulo){
        
    }
    
    public void removerArticulo(Articulo articulo){
        
    }
}
