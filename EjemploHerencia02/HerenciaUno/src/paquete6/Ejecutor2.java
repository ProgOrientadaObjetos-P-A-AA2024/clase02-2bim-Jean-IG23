/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        // Ingresar estudiante de tipo presencial por teclado.
        // El usuario decide cuando terminar
        // No utilizar super.toString en EstudiantePresencial
        // Debe existir 1 sola impresión de todos los estudiantes presenciales
        // No usar arreglos

        // Trabajo clases 13 junio 2024
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        String cadena = "";

        while (bandera) {
            System.out.println("Ingrese el nombre");
            String nombre = entrada.nextLine();
            System.out.println("Ingrese el apellido");
            String apellido = entrada.nextLine();
            System.out.println("Ingrese la cedula");
            String cedula = entrada.nextLine();
            System.out.println("Ingrese la edad");
            int edad = entrada.nextInt();
            System.out.println("Costo de cada credito");
            double costo = entrada.nextDouble();
            System.out.println("Cantidad de creditos");
            int credito = entrada.nextInt();

            EstudiantePresencial presencial = new EstudiantePresencial(nombre,
                    apellido, cedula, edad, costo, credito);
            presencial.calcularMatriculaPresencial();
            
            System.out.println("Desea salir escriba (Si)");
            entrada.nextLine();
            String opcion = entrada.nextLine();
            cadena = String.format("%s%s\n", cadena, presencial);
            if (opcion.toLowerCase().equals("si")) {
                bandera = false;
            }
        }
        System.out.printf("%s\n", cadena);
    }
}
