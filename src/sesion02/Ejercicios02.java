package sesion02;

import java.util.Scanner;

public class Ejercicios02 {
    public static void main(String[] args) {

    }

    public static void Ej03(){
        //Scanner sc = new Scanner(System.in);
        int num1 = 12;
        int num2 = 4;

        int suma = num1+num2;
        int resta= num1-num2;
        int multiplicacion = num1*num2;
        double division = num1/num2;
        double resto = num1%num2;

        System.out.println("Siendo los numeros: "+num1+ " y " +num2);

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("la multiplicacion es: "+ multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("El resto es: "+ resto);

    }

    public static void Ej04() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Digite un número entero: ");
        n= sc.nextInt();
        System.out.println("Expresion aritmetica: ((n+1)* n+2)* n+3");
        System.out.println("el resultado de la expresión aritmetica usando el número digitado es: "+((n + 1) * n + 2 ) * n + 3);

    }

    public static void Ej05(){
        int n = 2; //ardillas
        int k = 13;//nueces

        System.out.println("Si " + n + " ardillas encuentran " + k + " nueces");
        System.out.println("Le tocará a cada ardilla " + k/n + " nueces" );
        System.out.println("Y tras el reparto sobrarán: "+ k%n);
    }

    public static void Ej06(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la hora según ");
        System.out.println("Digite la hora inicial:");
        int h = sc.nextInt();
        System.out.println("Digite los minutos iniciales:");
        int m = sc.nextInt();
        System.out.println("Digite los segundos iniciales:");
        int s = sc.nextInt();

        System.out.println("Digite la hora final:");
        int h1 = sc.nextInt();
        System.out.println("Digite los minutos finales:");
        int m1 = sc.nextInt();
        System.out.println("Digite los segundos finales:");
        int s1= sc.nextInt();
        System.out.println("Si el momento inicial es: "+h+":"+m+":"+s+"s");
        System.out.println("Y el momento final es: "+h1+":"+m1+":"+s1+"s");

        System.out.println("Entonces el tiempo transcurrido entre esas horas será: ");
        System.out.println((h1-h)+ ":" +(m1 - m)+":"+(s1-s)+ " segundos");
    }
    public static void Ej07(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = sc.nextInt();
        System.out.println("Digite un número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite un número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite un número");
        int num3 = sc.nextInt();

        System.out.println("estos son los números decrementados: ");
        System.out.println(--num+" "+--num1+" "+--num2+" "+--num3);
    }

    public static void Ejemplo(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num = sc.nextInt();
        System.out.println("Digite otro número: ");
        int num1 = sc.nextInt();

        int suma = num+num1;

        System.out.println("La suma de "+num+" y "+num1+" es: "+ suma);



    }

    public static void Calcul(){
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
                System.out.println("Digite la opcion que quiere realizar");
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

    public static void Condicional(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite su edad: ");
        int edad = sc.nextInt();
        if (edad<18){
            System.out.println("Menor de edad");
        }else if (edad<65){
            System.out.println("Work in progress");
        }else if (edad<67){
            System.out.println("Jubilable");
        }else if (edad<=120){
            System.out.println("Jubilado");
        }else {
            System.out.println("Estas muert@");
        }


    }

}
