/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2p2_luishenriquez;

import java.util.Date;

/**
 *
 * @author LUIS HENRIQUEZ
 */
public class Bus extends PRINCIPAL{
    private int  pas;
    private int llantas;
    private double longi;
    private String placa;
    
    public Bus(int pas, int llantas, double longi,String placa, String tipo, String marca, String modelo, String color, Date fecha) {
        super(tipo, marca, modelo, color, fecha);
        this.pas = pas;
        this.llantas = llantas;
        this.longi = longi;
        this.placa = placa;
    }
    
    @Override
    public String toString() {
        return "Buses{" + "Pasajeros = " + pas + ", Llantas = " + llantas + ", Longitud = " + longi +", Placa = " + placa + ", Tipo = "+ tipo +
                ", Marca = "+ marca +", Modelo = "+ modelo +
                ", Color = "+ color + ", Fecha = "+ fecha +'}';
    }
    
    
    
}
