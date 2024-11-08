/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author Juanse Andraus
 */
public class Empresa {

    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[]{
            new EmpleadoPorHora("Juan", 120, 15.5), // 120 horas a 15.5 la hora
            new EmpleadoFijo("Ana", 3000), // Salario fijo de 3000 al mes
            new EmpleadoPorHora("Carlos", 160, 120), // 160 horas a 120 la hora
            new EmpleadoFijo("Maria", 2500) // Salario fijo de 2500 al mes
        };

        for (Empleado emp : empleados) {
            System.out.println("Empleado: " + emp.nombre + ", Salario: " + emp.CalcularSalario());
        }
    }
}
