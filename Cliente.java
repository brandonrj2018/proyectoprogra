/*
Chimaltenango, 26 de Septiembre de 2025
Programador: Brandon Daniel Ramírez Jiménez
descripción: Clase Producto
 */
package FacturacionProcesadores;
import java.util.Scanner;
public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private String dpi;
    private int edad;

    public Cliente(int id, String nombre, String correo, String dpi, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.dpi = dpi;
        this.edad = edad;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getDpi() { return dpi; }
    public void setDpi(String dpi) { this.dpi = dpi; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    // Para mostrar en consola
    public String getDescripcion() {
        return "Cliente: " + nombre + " - Correo: " + correo +
               " - DPI: " + dpi + " - Edad: " + edad;
    }

    // Para guardar en archivo
    public String toArchivo() {
        return "CLIENTE: " + id + " - " + nombre + " - " + correo + " - " + dpi + " - " + edad;
    }
}