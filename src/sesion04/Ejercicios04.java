package sesion04;

import java.util.Scanner;

public class Ejercicios04 {
    public static void main(String[] args) {
    Ej06();
    }

    public static void Ej01(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int num = sc.nextInt();

        if (num%2 == 0){
            System.out.println("El numero "+ num + " es par");
        }else{
            System.out.println("El numero "+ num + " es impar");
        }

    }

    public static void Ej02(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el sueldo anual");
        int sueldo = sc.nextInt();
        if (sueldo>9000){
            System.out.println("Debe abonar impuestos");
        }else{
            System.out.println("No debe abonar impuestos");
        }
    }

    public static void Ej03(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 7");
        int dia = sc.nextInt();
        if (dia==1){
            System.out.println("Lunes");
        }else if (dia==2){
            System.out.println("Martes");
        }else if (dia==3){
            System.out.println("Miercoles");
        }else if (dia==4){
            System.out.println("Jueves");
        }else if (dia==5){
            System.out.println("Viernes");
        }else if (dia==6){
            System.out.println("Sabado");
        }else if (dia==7){
            System.out.println("Domingo");
        }else {
            System.out.println("Del 1 al 7, por favor");
        }
    }

    public static void Ej04(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número de unidades para decirle a que categoría pertenece: ");
        int unidades = sc.nextInt();
        if (unidades < 1){
            System.out.println("Sin ejercito");
        }else if (unidades>0 && unidades<20){
            System.out.println("Pack");
        }else if (unidades>19 && unidades<250){
            System.out.println("Throng");
        }else if (unidades>249 && unidades<1000){
            System.out.println("Zounds");
        }else{
            System.out.println("Legión");
        }

    }

    public static void Ej05(){

        System.out.println("Dado tres números: ");
        int a =3 , b= 4 , c=6;
        System.out.println("Valores de los lados: ");
        System.out.println("Lado 1 : "+a);
        System.out.println("Lado 2 : "+b);
        System.out.println("Lado 3 : "+c);

        System.out.println("¿El triangulo existe?");

        if ((a+b) > c){
            System.out.println("Sí");
        }else if ((a+c) > b){
            System.out.println("Sí");
        }else if ((b+c) > a){
            System.out.println("Sí");
        }else{
            System.out.println("No");
        }

    }

    public static void Ej06(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número de tazas que hay:");
        int tazas = sc.nextInt();
        System.out.println("¿Es fin de semana?-Responda true o false");
        boolean finde =sc.hasNextBoolean();

        if (finde = true){
            if (tazas>=15 && tazas<=25){
                System.out.println(true);
            }else if (tazas<15 ){
                System.out.println("muy pocas tazas");
            }else{
                System.out.println("Van a enfermar");
            }
        }else if (finde = false){
            if (tazas>=10 && tazas<=20){
                System.out.println(true);
            }else if (tazas<10 ){
                System.out.println("muy pocas tazas");
            }else{
                System.out.println("Van a enfermar");
            }
        }else{
            System.out.println("*");
        }

    }

    public static void PerimetroC(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el valor del lado de un cuadrado: ");
        int lado = sc.nextInt();
        int perimetro = lado*4;

        System.out.println("El perímetro del cuadrado es: "+perimetro);
    }
    public static void Operaciones(){
        //Escribir un programa en el cual se acepten cuatro números, calcular e imprimir la
        //suma de los dos primeros y el producto del tercero y el cuarto.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = sc.nextInt();
        System.out.println("Digite un número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite un número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite un número: ");
        int num3 = sc.nextInt();

        int suma= num +num1;
        int producto = num2*num3;
        System.out.println("La suma de los 2 primeros numeros introducidos es: "+suma);
        System.out.println("El producto de los 2 ultimos numeros introducidos es: "+producto);
    }

    public static void Media(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número: ");
        int num = sc.nextInt();
        System.out.println("Digite un número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite un número: ");
        int num2 = sc.nextInt();
        System.out.println("Digite un número: ");
        int num3 = sc.nextInt();

        int suma= num +num1+ num2 + num3;
        int media = suma/4;

        System.out.println("La suma de los numeros introducidos es: "+suma);
        System.out.println("La media de los cuatro es: "+media);

    }

    public static void Articulo(){
        //Se debe desarrollar un programa que pida el precio de un artículo y la cantidad de
        //artículos que compra el cliente. Mostrar lo que debe abonar el comprador.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenidos a su tienda");
        System.out.println("Digite el precio del articulo:");
        double arti = sc.nextDouble();
        System.out.println("Digite la cantidad de articulos:");
        int cantidad = sc.nextInt();

        double total = cantidad*arti;

        System.out.println("Cantidad a abonar: "+ total);


    }

    public static void tao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite los centígrados: ");
        double centigrados = sc.nextDouble();
        System.out.println("Conversión de centígrados a diferentes escalas:");
        double reamur = centigrados*0.8;
        double fahenheit = (centigrados * 9/5)+32;
        double Kelvin = centigrados + 273;

    }

    public static void Evaluacion(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite su nota de las prácticas:");
        double num = sc.nextDouble();
        System.out.println();
    }




}
