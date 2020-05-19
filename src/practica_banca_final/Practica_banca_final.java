/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_banca_final;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Denis Marian Manta
 */
public class Practica_banca_final {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Datos_Cliente> Cuentas = new ArrayList<Datos_Cliente>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int EleccionOperaciones() {
        int opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Fisico                    *");
        System.out.println("*********************************");
        System.out.println("*   2-Digital                   *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
        return opcion;
    }

    public static int Menu() {
        int Opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Ingresar                  *");
        System.out.println("*********************************");
        System.out.println("*   2-Retirar                   *");
        System.out.println("*********************************");
        System.out.println("*   3-Crear una cuenta          *");
        System.out.println("*********************************");
        System.out.println("*   4-Modificar la cuenta       *");
        System.out.println("*********************************");
        System.out.println("*   5-Información de tu cuenta  *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        Opcion = sc.nextInt();
        sc.nextLine();
        return Opcion;

    }

        public static int MenuInternet() {
        int Opcion;
        System.out.println("*********************************");
        System.out.println("*           Menu                *");
        System.out.println("*********************************");
        System.out.println("*   1-Realizar Pago             *");
        System.out.println("*********************************");
        System.out.println("*   2-Información de tu cuenta  *");
        System.out.println("*********************************");
        System.out.println("*   0-Salir                     *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        Opcion = sc.nextInt();
        sc.nextLine();
        return Opcion;
    }
    
    public static int MenuModificar() {
        int opcion;
        System.out.println("*********************************");
        System.out.println("*       Menu Modificar          *");
        System.out.println("*********************************");
        System.out.println("*   1-Nombre                    *");
        System.out.println("*********************************");
        System.out.println("*   2-Apellido                  *");
        System.out.println("*********************************");
        System.out.println("*   3-Dirección                 *");
        System.out.println("*********************************");
        System.out.println("*   4-Telefono                  *");
        System.out.println("*********************************");
        System.out.println("*   5-Edad                      *");
        System.out.println("*********************************");
        System.out.println("Elige una opcion");
        opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    
}
