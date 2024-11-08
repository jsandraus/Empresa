/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author Juanse Andraus
 */
public class EmpleadoPorHora extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;

    public EmpleadoPorHora(String nombre, int horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    @Override
    public double CalcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}
