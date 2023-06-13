package Clase07;

import java.util.Scanner;

public class Ejercicio3Array {
    public static void main (String[] args){
        int[] intArray = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 5 numeros:");
        for (int i = 0; i < intArray.length; i++){
            System.out.println("ingrese un numero"+(i+1)+": ");
            intArray[i] = scanner.nextInt();
        }
        scanner.close();
        int sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        double promedio = (double) sum / intArray.length;

        System.out.println("El promedio de los valores ingresados es: " + promedio);
        }
    }

