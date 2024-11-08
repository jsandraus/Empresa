/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author Juanse Andraus
 */
public abstract class Empleado {

    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double CalcularSalario();
}
