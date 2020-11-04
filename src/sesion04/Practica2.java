package sesion04;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num , num1,suma,resta,multiplicacion;
        double division;

        System.out.println("Calculadora");
        System.out.println("1.Suma (+)");
        System.out.println("2.Resta (-)");
        System.out.println("3.Multiplicación (*)");
        System.out.println("4.División (/)");

        System.out.println("Digite un numero");
        num= sc.nextDouble();

        if (num > 0 ) {
            System.out.println("Digite otro numero");
            num1= sc.nextDouble();
            if (num1 > 0){
                System.out.println("Digite la opcion que quiere realizar por medio del signo de la operación" +
                        " o por el número de las opciones de la lista:");
                char x = sc.next().charAt(0);
                switch (x) {
                    case '1', '+' -> {
                        suma = num + num1;
                        System.out.println("La suma es : " + suma);
                    }
                    case '2', '-' -> {
                        resta = num - num1;
                        System.out.println("La resta es: " + resta);
                    }
                    case '3', '*' -> {
                        multiplicacion = num * num1;
                        System.out.println("La multiplicación es: " + multiplicacion);
                    }
                    case '4', '/' -> {
                        division = num / num1;
                        System.out.println("La division es: " + division);
                    }
                    default -> System.out.println("Error, digite la opcion correcta segun la operación");
                }
            }else{
                System.out.println("ERROR");
                System.out.println("Digite un valor entero, vuelva a intentarlo");
            }


        }else{
            System.out.println("ERROR");
            System.out.println("Digite un valor entero, vuelva a intentarlo");
        }
    }
}
