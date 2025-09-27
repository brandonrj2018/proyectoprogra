/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacturacionProcesadores;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ ===");
            System.out.println("1. Crear Cliente y Procesador");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Listar Procesadores");
            System.out.println("4. Eliminar Cliente");
            System.out.println("5. Modificar Cliente");
            System.out.println("6. Modificar Procesador");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt(); sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    System.out.print("DPI: ");
                    String dpi = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt(); sc.nextLine();

                    Cliente c = new Cliente(id, nombre, correo, dpi, edad);
                    Controlador.crearCliente(c);

                    // Procesador asociado
                    System.out.println("\nSeleccione Marca (1-Intel, 2-AMD): ");
                    int m = sc.nextInt(); sc.nextLine();
                    String marca = (m == 1) ? "Intel" : "AMD";

                    System.out.println("Seleccione Modelo:");
                    if (marca.equals("Intel")) {
                        System.out.println("1. i3\n2. i5\n3. i7\n4. i9\n5. Pentium");
                    } else {
                        System.out.println("1. Athlon\n2. Ryzen 3\n3. Ryzen 5\n4. Ryzen 7\n5. Ryzen 9");
                    }
                    int modeloOp = sc.nextInt(); sc.nextLine();
                    String modelo = "Desconocido";

                    if (marca.equals("Intel")) {
                        switch (modeloOp) {
                            case 1: modelo = "i3"; break;
                            case 2: modelo = "i5"; break;
                            case 3: modelo = "i7"; break;
                            case 4: modelo = "i9"; break;
                            case 5: modelo = "Pentium"; break;
                        }
                    } else {
                        switch (modeloOp) {
                            case 1: modelo = "Athlon"; break;
                            case 2: modelo = "Ryzen 3"; break;
                            case 3: modelo = "Ryzen 5"; break;
                            case 4: modelo = "Ryzen 7"; break;
                            case 5: modelo = "Ryzen 9"; break;
                        }
                    }

                    System.out.print("Velocidad (GHz): ");
                    double velocidad = sc.nextDouble(); sc.nextLine();

                    Producto p = new Producto(id, marca, modelo, velocidad);
                    Controlador.crearProcesador(p);
                    break;

                case 2:
                    Controlador.leerClientes();
                    break;

                case 3:
                    Controlador.leerProcesadores();
                    break;

                case 4:
                    System.out.print("ID del cliente a eliminar: ");
                    int idEliminar = sc.nextInt(); sc.nextLine();
                    Controlador.eliminarCliente(idEliminar);
                    break;
                    case 5:
    System.out.print("ID del cliente a modificar: ");
    int idMod = sc.nextInt(); sc.nextLine();

    System.out.print("Nuevo nombre: ");
    String nuevoNombre = sc.nextLine();

    System.out.print("Nuevo correo: ");
    String nuevoCorreo = sc.nextLine();

    System.out.print("Nuevo DPI: ");
    String nuevoDpi = sc.nextLine();

    System.out.print("Nueva edad: ");
    int nuevaEdad = sc.nextInt(); sc.nextLine();

    Controlador.modificarCliente(idMod, nuevoNombre, nuevoCorreo, nuevoDpi, nuevaEdad);
    break;

case 6:
    System.out.print("ID del procesador a modificar: ");
    int idProcMod = sc.nextInt(); sc.nextLine();

    System.out.print("Nueva marca: ");
    String nuevaMarca = sc.nextLine();

    System.out.print("Nuevo modelo: ");
    String nuevoModelo = sc.nextLine();

    System.out.print("Nueva velocidad (GHz): ");
    double nuevaVelocidad = sc.nextDouble(); sc.nextLine();

    Controlador.modificarProcesador(idProcMod, nuevaMarca, nuevoModelo, nuevaVelocidad);
    break;

            }
        } while (opcion != 0);

        sc.close();
    }
}
