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
public class Moto extends PRINCIPAL {
    
    private double vel;
    private double peso;
    private double cons;
    private String placa;

    public double getVel() {
        return vel;
    }

    public void setVel(double vel) {
        this.vel = vel;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCons() {
        return cons;
    }

    public void setCons(double cons) {
        this.cons = cons;
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
    

    public Moto(double vel, double peso, double cons, String placa, String tipo, String marca, String modelo, String color, Date fecha) {
        super(tipo, marca, modelo, color, fecha);
        this.vel = vel;
        this.peso = peso;
        this.cons = cons;
        this.placa = placa;
    }
    
    
    @Override
    public String toString() {
        return "Motos{" + "Velocidad maxima = " + vel + ", Peso = " + peso + ", Consumo de combustible = " + cons +", Placa = " + placa + ", Tipo = "+ tipo +
                ", Marca = "+ marca +", Modelo = "+ modelo +
                ", Color = "+ color + ", Fecha = "+ fecha +'}';
    }
    
    
}
