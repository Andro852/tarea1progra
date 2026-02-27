/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1progra;

/**
 *
 * @author Jonatan
 */
class Medicamento {
    Integer codigo;
    String nombreMedicamento;
    String usoMedicamento;
    Integer stock;

    public Medicamento(Integer codigo, String nombreMedicamento, String usoMedicamento, Integer stock) {
        this.codigo = codigo;
        this.nombreMedicamento = nombreMedicamento;
        this.usoMedicamento = usoMedicamento;
        this.stock = stock;
    }

    public Medicamento() {
    }
    
    
}
