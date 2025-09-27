/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacturacionProcesadores;
import java.util.*;
public class Controlador {

    // Crear cliente
    public static void crearCliente(Cliente c) {
        ArchivoUtil.guardarLinea(c.toArchivo());
        System.out.println("Cliente guardado correctamente.");
    }

    // Crear procesador
    public static void crearProcesador(Producto p) {
        ArchivoUtil.guardarLinea(p.toArchivo());
        System.out.println("Procesador guardado correctamente.");
    }

    // Leer todos los clientes
public static void leerClientes() {
    List<String> lineas = ArchivoUtil.leerLineas();
    for (String linea : lineas) {
        String[] datos = linea.split(";");
        if (datos[0].equals("CLIENTE")) {
            Cliente c = new Cliente(
                    Integer.parseInt(datos[1]),
                    datos[2],
                    datos[3],
                    datos[4],
                    Integer.parseInt(datos[5])
            );
            System.out.println(c.getDescripcion());
        }
    }
}

    // Leer todos los procesadores
    public static void leerProcesadores() {
        List<String> lineas = ArchivoUtil.leerLineas();
        for (String linea : lineas) {
            if (linea.startsWith("PROCESADOR;")) {
                String[] datos = linea.split(";");
                Producto p = new Producto(
                        Integer.parseInt(datos[1]),
                        datos[2],
                        datos[3],
                        Double.parseDouble(datos[4])
                );
                System.out.println(p.getDescripcion());
            }
        }
    }

    // Eliminar cliente y procesador asociado
public static void eliminarCliente(int id) {
    List<String> lineas = ArchivoUtil.leerLineas();
    List<String> nuevas = new ArrayList<>();

    for (String linea : lineas) {
        String[] partes = linea.split(";");
        if ( (partes[0].equals("CLIENTE") && Integer.parseInt(partes[1]) == id) ||
             (partes[0].equals("PROCESADOR") && Integer.parseInt(partes[1]) == id) ) {
            // se omite
        } else {
            nuevas.add(linea);
        }
    }

    ArchivoUtil.guardarLineas(nuevas);
    System.out.println("Cliente y procesador eliminados correctamente.");
}
    public static void modificarCliente(int id, String nuevoNombre, String nuevoCorreo, String nuevoDpi, int nuevaEdad) {
    List<String> lineas = ArchivoUtil.leerLineas();
    List<String> nuevas = new ArrayList<>();

    for (String linea : lineas) {
        if (linea.startsWith("CLIENTE;" + id + ";")) {
            Cliente c = new Cliente(id, nuevoNombre, nuevoCorreo, nuevoDpi, nuevaEdad);
            nuevas.add(c.toArchivo());
        } else {
            nuevas.add(linea);
        }
    }

    ArchivoUtil.guardarLineas(nuevas);
    System.out.println("Cliente modificado correctamente.");
}

// Modificar procesador
public static void modificarProcesador(int id, String nuevaMarca, String nuevoModelo, double nuevaVelocidad) {
    List<String> lineas = ArchivoUtil.leerLineas();
    List<String> nuevas = new ArrayList<>();

    for (String linea : lineas) {
        if (linea.startsWith("PROCESADOR;" + id + ";")) {
            Producto p = new Producto(id, nuevaMarca, nuevoModelo, nuevaVelocidad);
            nuevas.add(p.toArchivo());
        } else {
            nuevas.add(linea);
        }
    }

    ArchivoUtil.guardarLineas(nuevas);
    System.out.println("Procesador modificado correctamente.");
}
}
