/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1progra;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonatan
 */
public class BusquedaCSV {
    public static String[] buscarDoctor(String codigoBuscado){
        try{
            BufferedReader br = new BufferedReader(new FileReader("doctores.csv"));
            String linea;

            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");

                if(datos[0].equals(codigoBuscado)){
                    br.close();
                    return datos;
                }
            }

            br.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al leer archivo");
        }

        return null;
    }
    
}
