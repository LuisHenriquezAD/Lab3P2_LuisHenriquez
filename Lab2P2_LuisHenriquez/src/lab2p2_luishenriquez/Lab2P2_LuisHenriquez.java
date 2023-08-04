package lab2p2_luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Date;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.GregorianCalendar;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab2P2_LuisHenriquez {

    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in);
        ArrayList<Object> Vehiculo = new ArrayList();
        SimpleDateFormat fechas = new SimpleDateFormat("yyyy-MM-dd");

        int conta = 0;
        int opc = 0;
        int entrar = 0;
        String placaH = "H";
        String placaM = "B";
        String original = "";
        while (entrar != 2) {
            System.out.println("1.Agregar Vehiculo");
            System.out.println("2.Salir");
            entrar = leer.nextInt();
            if (entrar == 1) {

                System.out.println("Ingresa 2 caracteres para la placa");
                String placa1 = leer.nextLine();
                leer.next();

                if (placa1.length() > 2) {
                    System.out.println("Ingreso mas letras de las solicitadas");
                    System.out.println("Ingresa 2 letras para la placa");
                    placa1 = leer.nextLine();
                    leer.next();

                }

                System.out.println("Ingresar 4 numeros para la placa");
                String numero = leer.nextLine();
                leer.next();

                if (numero.length() > 4) {
                    System.out.println("Ingreso mas numeros de los solicitados");
                    System.out.println("Ingresar 4 numeros para la placa");
                    numero = leer.nextLine();
                    leer.next();

                }
                placaH += placa1;
                placaH += numero;
                placaM += placa1;
                placaM += numero;
                original = placaM;

                while (original != placaM && conta != 1) {
                    System.out.println("ESA PLACA YA EXISTE");
                    System.out.println("Ingresa 2 caracteres para la placa");
                    placa1 = leer.nextLine();
                    leer.next();

                    if (placa1.length() > 2) {
                        System.out.println("Ingreso mas letras de las solicitadas");
                        System.out.println("Ingresa 2 letras para la placa");
                        placa1 = leer.nextLine();
                        leer.next();

                    }

                    System.out.println("Ingresar 4 numeros para la placa");
                    numero = leer.nextLine();
                    leer.next();

                    if (numero.length() > 4) {
                        System.out.println("Ingreso mas numeros de los solicitados");
                        System.out.println("Ingresar 4 numeros para la placa");
                        numero = leer.nextLine();
                        leer.next();

                    }
                    placaH += placa1;
                    placaH += numero;
                    placaM += placa1;
                    placaM += numero;

                }
                original = placaM;
                conta++;

                System.out.println("Ingrese la marca del vehiculo");
                String marca = leer.nextLine();
                leer.next();

                System.out.println("Escriba si es Automatico o Mecanico");
                String tipo = leer.nextLine();
                leer.next();

                System.out.println("Ingrese que color es");
                String color = leer.nextLine();
                leer.next();

                System.out.println("Ingrese el modelo");
                String modelo = leer.nextLine();
                leer.next();

                System.out.println("Ingrese la fecha con el formato YYYY-MM-dd");
                String texto = leer.next();
                String ffff = texto;
                
                Date fecha = fechas.parse(ffff);

                Vehiculo.add(new PRINCIPAL(tipo, marca, modelo, color, fecha));

                opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n"
                        + "1-Agregar Auto\n"
                        + "2-Agregar moto\n"
                        + "3-Agregar autobus\n"
                        + "4-Modificar\n"
                        + "5-Eliminar\n"
                        + "6-Generar boleta\n"));

                if (opc == 1) {

                    System.out.println("Ingrese el tipo de combustible");
                    String combus = leer.nextLine();
                    leer.next();

                    System.out.println("Ingrese la cantidad de puertas");
                    int puertas = leer.nextInt();

                    System.out.println("Ingrese si es manual o automatico");
                    String trans = leer.nextLine();
                    leer.next();

                    System.out.println("Ingrese la cantidad de asientos");
                    int asientos = leer.nextInt();
                   

                    Vehiculo.add(new Automovil(combus, puertas, trans, asientos, placaH, tipo, marca, modelo, color, fecha));

                }

                if (opc == 2) {//AGREGAR MOTO
                    System.out.println("Ingrese la velocidad maxima");
                    double vel = leer.nextDouble();
                 

                    System.out.println("Ingrese el peso de la moto");
                    double peso = leer.nextDouble();
                    

                    System.out.println("Ingrese el consumo de gasolina por Km");
                    double cons = leer.nextDouble();
              

                    Vehiculo.add(new Moto(vel, peso, cons, placaM, tipo, marca, modelo, color, fecha));

                }

                if (opc == 3) {//AGG BUS
                    System.out.println("Ingresar el numero de pasajeros");
                    int pas = leer.nextInt();
                    leer.next();

                    System.out.println("Ingrese el numero de ejes");
                    int llantas = leer.nextInt();
                    leer.next();

                    System.out.println("Ingrese la longitud en metros");
                    double longi = leer.nextDouble();
                    leer.next();

                    Vehiculo.add(new Bus(pas, llantas, longi, placaH, tipo, marca, modelo, color, fecha));

                }

                if (opc == 4) {//MODIFICAR

                }

                if (opc == 5) {//ELIMINAR
                    System.out.println("Ingrese el tipo de vehiculo que desea eliminar:");
                    System.out.println("1- Autos");
                    System.out.println("2- Buses");
                    System.out.println("3- Motos");
                    int esco = leer.nextInt();
                    leer.nextLine();

                    switch (esco) {
                        case 1:
                            String auto = LISTARAUTO(Vehiculo);
                            System.out.println("AUTOMOVILES");
                            System.out.println(auto);
                            break;
                        case 2:
                            String bus = LISTARBUS(Vehiculo);
                            System.out.println("Buses");
                            System.out.println(bus);
                            break;
                        case 3:
                            String moto = LISTARMOTO(Vehiculo);
                            System.out.println("Motos");
                            System.out.println(moto);

                            break;

                        default:
                            System.out.println("Opción inválida");
                            return;
                    }

                    System.out.println("Ingrese cual desea eliminar:");
                    int borrar = leer.nextInt();
                    leer.nextLine();

                    if (borrar < 0 || borrar >= Vehiculo.size()) {
                        System.out.println("El que ingreso no funciona  ");
                        return;
                    } else {
                        Vehiculo.remove(borrar);
                    }
                }

                if (opc == 6) {//BOLETA

                }

            }
        }

    }

    static String LISTARAUTO(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Automovil) {
                salida += cosas.indexOf(cosa) + " - " + cosa + "\n";
            }

        }
        return salida;
    }

    static String LISTARBUS(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Bus) {
                salida += cosas.indexOf(cosa) + " - " + cosa + "\n";
            }

        }
        return salida;
    }

    static String LISTARMOTO(ArrayList cosas) {
        String salida = "";
        for (Object cosa : cosas) {
            if (cosa instanceof Moto) {
                salida += cosas.indexOf(cosa) + " - " + cosa + "\n";
            }

        }
        return salida;
    }

}
