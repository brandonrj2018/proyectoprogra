/*
Chimaltenango, 26 de Septiembre de 2025
Programador: Brandon Daniel Ramírez Jiménez
descripción: Clase de productos derivados
 */
package FacturacionProcesadores;

/**
 *
 * @author brand
 */
public class ProductoDerivado extends Producto {
    private String generacion;
    private int nucleos;
    private double frecuenciaGHz;

    public ProductoDerivado(int id, String marca, String modelo, double precio, 
                            String generacion, int nucleos, double frecuenciaGHz) {
        super(id, marca, modelo, precio);
        this.generacion = generacion;
        this.nucleos = nucleos;
        this.frecuenciaGHz = frecuenciaGHz;
    }

    public String getGeneracion() { return generacion; }
    public void setGeneracion(String generacion) { this.generacion = generacion; }

    public int getNucleos() { return nucleos; }
    public void setNucleos(int nucleos) { this.nucleos = nucleos; }

    public double getFrecuenciaGHz() { return frecuenciaGHz; }
    public void setFrecuenciaGHz(double frecuenciaGHz) { this.frecuenciaGHz = frecuenciaGHz; }

    @Override
    public String getDescripcion() {
        return "Procesador Derivado: " + getMarca() + " " + getModelo() +
               " (" + generacion + ", " + nucleos + " núcleos, " +
               frecuenciaGHz + "GHz)";
    }
}