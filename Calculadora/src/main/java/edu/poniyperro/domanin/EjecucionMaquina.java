package java.edu.poniyperro.domanin;

import java.util.Scanner;

public class EjecucionMaquina {

    public static void main(String[] arg) {

        int opcion = 0;
        Scanner sc;
        sc = new Scanner(System.in);

        do {

            // Imprime los pasos de la calculadora
            // al usar println (hace un salto de liena al imprimir)
            System.out.println("\n"); // Imprime una línea en blanco
            System.out.println("Calculadora");
            System.out.println("1 Suma");
            System.out.println("2 Resta");
            System.out.println("3 Multiplica");
            System.out.println("4 Divide");
            System.out.println("5 Resto");
            System.out.println("0 Se sale del programa");
            System.out.print("Introduce una opción: "); // imprime en pantalla pero se queda en el cursor esperando una respuesta

        /*
        1. Recoger el valor escrito en el teclado
        2. Transformar la ccadena de caracteres en el valor entero
        */
            int opción = Integer.parseInt(sc.nextLine());

            // CONDICIONES:

            if (opcion < 0 || opcion > 5) {
                System.out.println("La opción dada no es válida, por favor vuelva a escoger");
            } else if (opcion != 0) { // Si la opción es diferente a 0, solicitar los dos comandos(los dos números)
                System.out.println("\n");

                float num1, num2;

                System.out.print("Introduzca el primer número");
                num1 = Float.parseFloat(sc.nextLine()); //Coge un valor por teclado y lo convierte a real

                System.out.print("Introduzca el segundo número");
                num2 = Float.parseFloat(sc.nextLine());

                System.out.println("\n");

                switch (opcion) {
                    //Sumar
                    case 1:
                        System.out.println("El resultado de la suma es " + (num1 + num2));
                        break;
                    // Restar
                    case 2:
                        System.out.println("El resultado de la resta es " + (num1 - num2));
                        break;
                    // Multiplicar
                    case 3:
                        System.out.println("El resultado de la multiplicacion es " + (num1 * num2));
                        break;
                    // Dividir
                    case 4:
                    System.out.println("El resultado de la dividión es " + (num1 / num2));
                    break;
                    // Resto
                    case 5:
                    System.out.println("El resultado del resto de dividir" + num1 + "entre" + num2 + "es " + (num1 % num2));
                    break;
                }
            }
            while (opcion != 0) {
                ; // Salimos del programa
                sc.close();
                System.out.println("Ha finalizado la ejecución de la calculadora");
            }
        }
    }
}

