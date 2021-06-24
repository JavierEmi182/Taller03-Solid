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
public class Compra implements ItemsManagement {
    
    //private Pago pago;
    //private PagoPayPal pagoPayPal;
    private Pagos Pago;
    private List articulos;

    public Compra(Pagos pago){
        //inicializacion      
    }
    //El constructor acepta cualquier tipo de pago
    
    /*public void agregarArticulo(Articulo articulo){
        
    }
    
    public void removerArticulo(Articulo articulo){
        
    }*/

    @Override
    public void agregarArticulo() {
        //agrega un articulo
    }

    @Override
    public void removerArticulo() {
        //remueve un articulo
    }
    
    //Se creo un interface ItemsManagement para despues implementarlo en la clase, cumpliendo el ISP
    
}
