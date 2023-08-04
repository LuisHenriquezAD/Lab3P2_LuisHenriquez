
package lab2p2_luishenriquez;

import java.util.Date;


public class Automovil extends PRINCIPAL{
    
    
  
    private String combu;
    private int puertas;
    private String trans;
    private int asientos;
    private String placa;

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
