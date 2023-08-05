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

    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
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
