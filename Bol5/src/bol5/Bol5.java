package bol5;

import java.util.Scanner;

/**
 *
 * @author Leila
 */
public class Bol5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        Cuenta Datos = new Cuenta();
        System.out.println("Introduzca cliente:");
        Datos.setCliente(ler.next());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Introduzca cuenta:");
        Datos.setCuenta(ler.next());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Cuenta= " + Datos.getCuenta());
        System.out.println("Introduzca saldo:");
        Datos.setSaldo(ler.nextDouble());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Cuenta= " + Datos.getCuenta());
        System.out.println("Saldo= " + Datos.getSaldo());
        System.out.println("Introduzca cantidad a transferir:");
        Datos.setIngresos(ler.nextDouble());
        System.out.println("Cliente= " + Datos.getCliente());
        System.out.println("Cuenta= " + Datos.getCuenta());
        System.out.println("Saldo= " + Datos.getSaldo());
        System.out.println("Introzduzca cantidad a retirar:");
        Datos.setReintegro(ler.nextDouble());
        Datos.datosCliente();
        
    }
    
}
