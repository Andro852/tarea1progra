/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1progra;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jonatan
 */
public class ArchivoTexto {

    public static void guardarTexto(String texto, String nombreArchivo) {
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(texto);
            pw.println("------------------------------------------");

            pw.close();
            fw.close();

        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }
}
