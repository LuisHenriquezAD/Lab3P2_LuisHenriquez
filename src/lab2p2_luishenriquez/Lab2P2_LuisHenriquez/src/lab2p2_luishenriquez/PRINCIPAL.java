package lab2p2_luishenriquez;

import java.util.Date;


public class PRINCIPAL {
    

    public String tipo;
    public String marca;
    public String modelo;
    public String color;
    public Date fecha;
    
  

    

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

    public PRINCIPAL(String tipo, String marca, String modelo, String color, Date fecha) {

        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.fecha = fecha;
    }
    
    
}
