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
public class Pago implements Pagos{

    @Override
    public void realizarCobro(double monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*public void realizarCobro(double monto){
        //carga monto al metodo de pago
    }*/
    //se creo una interfaz para realizar los cobros
    
    /*public void calcularImpuestosFactura(){
        //calcula impuestos asociados a la compra
    }
    
    public void generarFactura(){
        //genera nueva factura
    }*/
    
   //La clase pago solo debe cumplir una funcion, asi cumpliendo el SRP. 
    //Se crearon 2 clases que desempeñan los metodos comentados.

}
