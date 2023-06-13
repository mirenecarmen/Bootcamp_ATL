package Clase07;

public class ejercicio2Arraya {
        public static void main(String[] args) {
            int[] intArray;
            intArray = new int[5];
            intArray[0] = 100;
            intArray[1] = 230;
            intArray[2] = 250;
            intArray[3] = 160;
            intArray[4] = 370;

            System.out.println("Elemento en el índice 0: " + intArray[0]);
            System.out.println("Elemento en el índice 1: " + intArray[1]);
            System.out.println("Elemento en el índice 2: " + intArray[2]);
            System.out.println("Elemento en el índice 3: " + intArray[3]);
            System.out.println("Elemento en el índice 4: " + intArray[4]);

            int min = intArray[0];
            int max = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < min) {
                    min = intArray[i];
                }

                if (intArray[i] > max) {
                    max = intArray[i];
                }
            }

            System.out.println("El número menor es: " + min);
            System.out.println("El número mayor es: " + max);
        }
    }

