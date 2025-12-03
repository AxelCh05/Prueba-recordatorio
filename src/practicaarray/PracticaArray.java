
package practicaarray;

import java.util.Scanner;


public class PracticaArray {

   
    public static void main(String[] args) {
        /*
        Scanner teclado = new Scanner(System.in);
        int[] temperatura = new int[7];
        int promedio;
        int acumulador = 0;
        
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Ingrese temperatura");
            temperatura[i] = teclado.nextInt();
            acumulador += temperatura[i];
        }
        
        for (int item : temperatura) {
            System.out.print(item + " ");
        }
        
        int minimo = temperatura[0];
        int maximo = temperatura[0];
        
        for (int i = 0; i < temperatura.length; i++) {

            if(temperatura[i] > maximo){
                maximo = temperatura[i];
            }
            if(temperatura[i] < minimo){
                minimo = temperatura[i];
            }
        }
        promedio = acumulador / temperatura.length;
        System.out.println("Promedio: " + promedio);
        System.out.println("Maximo: " + maximo);
        System.out.println("Minimo: " + minimo);
        */
        
        // Ejercicio 2 de la Clase Arrays
        
        /*
        double[] notasAlumnos = new double[5];
        double acumulador = 0;
        double promedio;
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < notasAlumnos.length; i++) {
            
            System.out.println("Ingrese las notas");
            notasAlumnos[i] = teclado.nextDouble();
            
        }
        
        for (double item : notasAlumnos) {
            if(item >= 6){
                System.out.println("Aprobo con nota: " + item);
            }
            else{
                if(item < 6){
                    System.out.println("Desaprobo con nota: " + item);
                }
            }
            acumulador += item;
        }
        
        promedio = acumulador/ notasAlumnos.length;
        
        System.out.println("Promedio: " + promedio);
        
        */
        
        //Ejercicio 3  Arrays
        /*
        int[] numeros = new int[10];
        Scanner teclado = new Scanner(System.in);
        
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
        }
        
        for (int item : numeros) {
            System.out.print(item + " ");
        }
        System.out.println();
        
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        */
        
        // Ejercicio 4 Arrays
        /*
        int[] numeros = new int[8];
        int buscador;
        String mensaje = "No existe";
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
        }
        
        System.out.println("Ingrese un numero para buscar: ");
        buscador = teclado2.nextInt();
        
        for (int i = 0; i < numeros.length; i++) {    
            
            if(numeros[i] == buscador){
                
                mensaje = "El numero esta en la posicion " + (i+1);
            }

        }
        System.out.println(mensaje);
        */
        
        //Ejercicio 5 Clase Arrays
        
        double[][] notas = {{2,7,9,4},
                            {4,5,1,2},
                            {6,7,3,8}};
        double acumulador = 0;
        double promedio;
        
        
        for(int i = 0; i < notas.length; i++) {         
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < notas.length; i++) {         
            for (int j = 0; j < notas[i].length; j++) {
                acumulador += notas[i][j];
            }
            
        }
        
        promedio = acumulador/(notas[1].length * 3);
        System.out.println(promedio);
    }
        
        
        
        
        
        
        
}
