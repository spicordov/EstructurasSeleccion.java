package sesion03;

import java.util.Scanner;

public class Ejercicios03 {

    public static void main(String[] args) {

    }

    public static void ej01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un número: ");
        int num = sc.nextInt();

        boolean x = (num<10);
        System.out.println(x);

    }

    public static void ej02(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int num = sc.nextInt();
        boolean x = (num>0)&&(num<10);
        System.out.println("numero: "+num);
        System.out.println(x);


    }

    public static void ej03(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = sc.nextInt();
        System.out.println("Digite un número: ");
        int num1 =sc.nextInt();
        System.out.println("Digite un número: ");
        int num2 =  sc.nextInt();

        boolean x = (num>num1)&&(num2>num1);
        System.out.println(x);


    }

    public static void ej04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = sc.nextInt();
        System.out.println("Digite un número: ");
        int num1 =sc.nextInt();
        System.out.println("Digite un número: ");
        int num2 =  sc.nextInt();

        boolean x = (num != num1) && (num1 != num2) && (num2 != num);
        System.out.println(x);

    }

    public static void ej05(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número a: ");
        int num = sc.nextInt();
        System.out.println("Digite un número b: ");
        int num1 =sc.nextInt();
        System.out.println("Digite un número c: ");
        int num2 =  sc.nextInt();

        boolean x = (num+num1 ==10) || (num1 + num2 ==10) || (num2+ num== 10);
        System.out.println(x);

    }

    public static void ej06(){
        int n = 10;
        System.out.println(n++);
        System.out.println(n);
        System.out.println(n--);
        System.out.println(n);
        System.out.println(++n);
        System.out.println(--n);
    }
}
