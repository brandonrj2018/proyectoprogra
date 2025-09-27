/*
Chimaltenango, 26 de Septiembre de 2025
Programador: Brandon Daniel Ramírez Jiménez
descripción: Clase Producto
 */
package FacturacionProcesadores;

/**
 *
 * @author brand
 */
public class Producto {
    private int id;
    private String marca;
    private String modelo;
    private double velocidad;

    public Producto(int id, String marca, String modelo, double velocidad) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public double getVelocidad() { return velocidad; }
    public void setVelocidad(double velocidad) { this.velocidad = velocidad; }

    // Para mostrar en consola
    public String getDescripcion() {
        return "Procesador: " + marca + " " + modelo + " - " + velocidad + "GHz";
    }

    // Para guardar en archivo
    public String toArchivo() {
        return "PROCESADOR: " + id + " - " + marca + " - " + modelo + " - " + velocidad;
    }
}
