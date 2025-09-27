/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacturacionProcesadores;
import java.io.*;
import java.util.*;
public class ArchivoUtil {
    public static final String RUTA = "datos.txt";

    // Guardar UNA sola línea al final
    public static void guardarLinea(String linea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA, true))) {
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Sobrescribir con TODAS las líneas
    public static void guardarLineas(List<String> lineas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(RUTA))) {
            for (String linea : lineas) {
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Leer todas las líneas
    public static List<String> leerLineas() {
        List<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(RUTA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            // Si no existe, no pasa nada
        }
        return lineas;
    }
}

