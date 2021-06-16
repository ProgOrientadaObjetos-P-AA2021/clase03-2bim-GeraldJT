/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        String nombre;
        String apellido;
        int edad;

        System.out.println("Seleccione la acción que desea realizar:\n"
                + "1) Ingresar estudiante\n"
                + "2) Ingresar docente\n"
                + "3) Ingrese policia\n");
        opcion = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        switch (opcion) {
            case 1:
                double matr;
                System.out.println("Ingrese la matrícula");
                matr = entrada.nextDouble();
                Estudiante e = new Estudiante(nombre, apellido, edad, matr);
                System.out.println(e);
                break;
            case 2:
                double suel;
                System.out.println("Ingrese el sueldo del docente");
                suel = entrada.nextDouble();
                Docente d = new Docente(nombre, apellido, edad, suel);
                System.out.println(d);
                break;
            case 3:
                String rango;
                entrada.nextLine();
                System.out.println("Ingrese el rango del policia");
                rango = entrada.nextLine();
                Policia p = new Policia(nombre, apellido, edad, rango);
                System.out.println(p);

                break;
            default:
                System.out.println("Error opcion incorrecta");

        }

    }

}
