package sesion01;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

    }

    public static void Ej01(){
        System.out.println("Hello, Bryan!");
    }

    public static void Ej02(){
        System.out.println("Hola");
    }

    public static void Ej03(){
        System.out.println("primera");
        System.out.println("segunda");
        System.out.println("tercera");

    }

    public static void Ej04(){
        System.out.println("********");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("      **");
        System.out.println("**    **");
        System.out.println("**    **");
        System.out.println(" *******");


    }

    public static void Ej05(){
        System.out.println(0);
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);


    }

    public static void Ej06(){
        System.out.println(9+" "+ 8 + " "+ 7 + " "+ 6 +" "+ 5 +" "+ 4 +" "+ 3 +" "+ 2 +" "+ 1);

    }

    public static void Ej07(){
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");
        System.out.println(" ***");
        System.out.println("  *");

    }

    public static void Ej08(){
        int a = 3;
        int b = 5;
        int c = 4;
        System.out.println(a + " " + b + " " + c);

    }

    public static void Ej09(){
        int a = 123456;
        System.out.println(a);
    }

    public static void Ej10(){
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 4;

        System.out.println(one+ " " + two + " " + three + " " + four);

    }

    public static void Ej11(){
        System.out.println("¡Compila!"); //Imprime "¡Compila!"
    }

    public static void Ej12(){
        System.out.println("Otra aplicación más simple de Java");
    //System.out.println("No imprimas esta línea.");
    }

    public static void Ej13(){
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);*/
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        //System.out.println(8);
    }

    public static void Ej14(){
        System.out.print("¡Tres! ");
        System.out.print("¡Dos! ");
        System.out.println("¡Uno!");
        System.out.println("¡Adelante!");

        //System.out.println("¡Adelante!");
    }

    public static void Ej15(){

    }

    public static void Ej16(){
        Scanner sc = new Scanner(System.in);
        String name;
        String nivel;
        String cocina;
        int edad,experiencia;

        System.out.println("¿Cual es su nombre?");
        name = sc.next();

        System.out.println("¿Cual es su edad?");
        edad = sc.nextInt();

        System.out.println("¿Cual es su nivel de educacion?");
        nivel = sc.next();

        System.out.println("¿Cuantos años de experiencia tiene?");
        experiencia = sc.nextInt();

        System.out.println("¿Que tipo de cocina le gusta?");
        cocina = sc.nextLine();

        System.out.println();

        System.out.println("El formulario para " +name+ " está completo Nos comunicaremos con usted si necesitamos un chef que conozca de cocina: " + cocina );

    }

}
