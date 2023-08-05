
package lab2p2_luishenriquez;

import java.util.Date;


public class Automovil extends PRINCIPAL{
    
    
  
    private String combu;
    private int puertas;
    private String trans;
    private int asientos;
    private String placa;

    public String getCombu() {
        return combu;
    }

    public void setCombu(String combu) {
        this.combu = combu;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
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

    
    public Automovil(String combu, int puertas, String trans, int asientos,String placa, String tipo, String marca, String modelo, String color, Date fecha) {
        super(tipo, marca, modelo, color, fecha);
        this.combu = combu;
        this.puertas = puertas;
        this.trans = trans;
        this.asientos = asientos;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Combustible = " + combu + ", Puertas = " + puertas + ", Transmision = " + trans + ", Asientos = "
                + asientos + ", Placa = " + placa + ", Tipo = "+ tipo +
                ", Marca = "+ marca +", Modelo = "+ modelo +
                ", Color = "+ color + ", Fecha = "+ fecha +'}';
    }
    
    

  
    
    
    
    
    
    
}
