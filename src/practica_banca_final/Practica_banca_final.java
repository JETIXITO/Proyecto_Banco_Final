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
    static ArrayList<DatosCliente> Cuentas = new ArrayList<DatosCliente>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
           Cuentas.add(new DatosCliente("Peter", "Panda", "C/ de mi casa", 1, 654987697, 19, 2, 0));
        Cuentas.add(new DatosCliente("Juan", "Perez", "C/ de mi patio", 2, 673564521, 23, 2, 200));

        int NumCuenta;
        int Operaciones;
        int CantidadIngresos;
        int CantidadPagosRetiradas;

        do {
            System.out.println("¿Las operaciones que vas a realizar son físicas o digitales?");

            Operaciones = EleccionOperaciones();
            switch (Operaciones) {
                case 1:
                    int opcion = Menu();

                    switch (opcion) {

                        case 0:
                            System.out.println("Saliendo del programa...");
                            break;

                        case 1:
                            MostrarCuentas();
                            System.out.println("Introduzca el número de la cuenta que desea utilizar.");
                            NumCuenta = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduzca la cantidad que desea ingresar.");
                            CantidadIngresos = sc.nextInt();
                            sc.nextLine();

                            Cuentas.get(NumCuenta).ingresar(CantidadIngresos);
                            break;

                        case 2:
                            MostrarCuentas();
                            System.out.println("Introduzca el número de la cuenta que desea utilizar.");
                            NumCuenta = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduzca la cantidad que desea retirar.");
                            CantidadPagosRetiradas = sc.nextInt();
                            sc.nextLine();
                            Cuentas.get(NumCuenta).retirar(CantidadPagosRetiradas);

                            break;

                        case 3:
                            System.out.println("Siga las indicaciones que se le especificarán a contiuación.");
                            CrearPerfil();
                            break;
                        case 4:
                            //La ID asignada a los gestores es la clave 101
                            ModificarlaCuenta();
                            break;
                        case 5:
                            InformacionCuenta();
                            break;

                        default:
                            System.out.println("El número introducido no corresponde a ninguna opción.");
                            break;

                    }
                    break;
                case 2:
                    int Opcion = MenuInternet();
                    switch (Opcion) {
                        case 0:
                            System.out.println("Saliendo del programa...");
                            break;
                        case 1:
                            MostrarCuentas();
                            System.out.println("Introduzca el número de la cuenta que desea utilizar.");
                            NumCuenta = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Introduzca el importe del pago que va a realizar.");
                            CantidadPagosRetiradas = sc.nextInt();
                            sc.nextLine();
                            Cuentas.get(NumCuenta).retirar(CantidadPagosRetiradas);

                            break;

                        case 2:
                            InformacionCuenta();
                            break;

                        default:
                            System.out.println("El número introducido no corresponde a ninguna opción.");
                            break;
                    }
                    break;
            }
        } while (Operaciones != 0);
        
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

    public static void CrearPerfil() {
        System.out.println("Introduzca su nombre.");
        String nombre = sc.nextLine();
        System.out.println("Introduzca su/s apellido/s.");
        String apellido = sc.nextLine();
        System.out.println("Introduzca su dirección.");
        String direccion = sc.nextLine();
        System.out.println("Introduzca su NIF.");
        int nif = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca su número de teléfono.");
        int telefono = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca su edad.");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca la cantidad de cuentas que posee. Si no posee ninguna introduzca un 1.");
        int cantidad_cuentas = sc.nextInt();
        sc.nextLine();

        Cuentas.add(new DatosCliente(nombre, apellido, direccion, nif, telefono, edad, cantidad_cuentas, 0));
    }

    public static void MostrarCuentas() {
        for (int i = 0; i < Cuentas.size(); i++) {
            System.out.println(i + " = " + Cuentas.get(i).getNombre() + Cuentas.get(i).getApellido());
        }
    }

    public static void ModificarlaCuenta() {
        int Id;
        int Comprobacion;
        int NumCuenta;
        int Decision;
        String Nombre;
        String Apellido;
        String Direccion;
        int NIF;
        int Telefono;
        int Edad;
        System.out.println("Para realizar esta acción debe ser un gestor del banco. Confirme su identidad introduciendo su ID de gestor.");
        Id = sc.nextInt();
        sc.nextLine();
        if (Id == 101) {

            MostrarCuentas();
            System.out.println("Elige el número de la cuenta que quieres modificar.");
            NumCuenta = sc.nextInt();
            sc.nextLine();
            System.out.println("Introduzca el NIF de la cuenta seleccionada.");
            Comprobacion = sc.nextInt();
            sc.nextLine();
            if (Comprobacion == Cuentas.get(NumCuenta).getNif()) {

                System.out.println("¿Qué deseas modificar de la cuenta?");
                Decision = sc.nextInt();
                sc.nextLine();
                int opcion = MenuModificar();

                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca el nuevo nombre.");
                        Nombre = sc.nextLine();
                        Cuentas.get(NumCuenta).setNombre(Nombre);
                        break;

                    case 2:
                        System.out.println("Introduzca el nuevo nombre.");
                        Apellido = sc.nextLine();
                        Cuentas.get(NumCuenta).setApellido(Apellido);
                        break;

                    case 3:
                        System.out.println("Introduzca su nueva dirección.");
                        Direccion = sc.nextLine();
                        Cuentas.get(NumCuenta).setDireccion(Direccion);
                        break;

                    case 4:
                        System.out.println("Introduzca su nuevo número de teléfono.");
                        Telefono = sc.nextInt();
                        sc.nextLine();
                        Cuentas.get(NumCuenta).setTelefono(Telefono);
                        break;

                    case 5:
                        System.out.println("Introduzca su edad actual.");
                        Edad = sc.nextInt();
                        sc.nextLine();
                        Cuentas.get(NumCuenta).setEdad(Edad);
                        break;

                }
            } else {
                System.out.println("Fallo en la identificación del usuario de la cuenta. Compruebe que ha introducido correctamente el NIF del usuario de la cuenta.");
            }
        } else {
            System.out.println("No eres un gestor del banco por lo que la acción ha sido denegada.");
        }
    }

    public static void InformacionCuenta() {
        int NumCuenta;
        int NIF;
        MostrarCuentas();
        System.out.println("Elige el numero de tu cuenta.");
        NumCuenta = sc.nextInt();
        sc.nextLine();
        System.out.println("Introduzca su NIF para asegurarnos de que es usted.");
        NIF = sc.nextInt();
        sc.nextLine();
        if (NIF == Cuentas.get(NumCuenta).getNif()) {
            System.out.println(Cuentas.get(NumCuenta).toString());
                SaldoMedio(NumCuenta);

        } else {
            System.out.println("Fallo en la identificación de su identidad.");
        }
    }

    public static void SaldoMedio(int NumCuenta) {

        int TotalPagosRetiradas = (Cuentas.get(NumCuenta).ContadorPagosRetiradas * Cuentas.get(NumCuenta).CantidadPagosRetiradas) / 12;
        int TotalIngresos = (Cuentas.get(NumCuenta).ContadorIngresos * Cuentas.get(NumCuenta).CantidadIngresos) / 12;
        System.out.println("La media de Pagos y de Retiradas es de: " + TotalPagosRetiradas + " y la media de Ingresos es de: " + TotalIngresos);

    }
    
}
