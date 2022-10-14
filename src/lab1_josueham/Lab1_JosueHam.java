package lab1_josueham;

import java.util.Scanner;
/**
 *
 * @author Josue Ham
 */
public class Lab1_JosueHam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("--Bienvenido al sistema de calculo de promedio--");
        System.out.print("Ingrese su nombre: "); //Se ingresa el nombre del usuario
        String nombre = leer.nextLine();  
        
        //Se ingresan las notas de las cuatro clases
        
        System.out.print("Ingrese la primera nota: ");
        double nota_1 = leer.nextDouble();
        
        System.out.print("Ingrese la segunda nota: ");
        double nota_2 = leer.nextDouble();
        
        System.out.print("Ingrese la tercera nota: ");
        double nota_3 = leer.nextDouble();
        
        System.out.print("Ingrese la cuarta nota: ");
        double nota_4 = leer.nextDouble();
        
        //Se calcula el promedio
        
        double sumaClase = nota_1 + nota_2 + nota_3 + nota_4;
        double promedio = sumaClase/4;
        
        //Se imprime la salida del promedio
        System.out.println("---- " + nombre + " el promedio de las cuatros clases es: " + promedio);
    }
    
}
