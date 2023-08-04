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
