/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1progra;

/**
 *
 * @author Jonatan
 */
public class Doctor {
    Integer codigo;
    String nombreDoctor;
    String telefonoDoctor;
    String especialidad;

    public Doctor(Integer codigo, String nombreDoctor, String telefonoDoctor, String especialidad) {
        this.codigo = codigo;
        this.nombreDoctor = nombreDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.especialidad = especialidad;
    }

    public Doctor() {
    }
    
}
