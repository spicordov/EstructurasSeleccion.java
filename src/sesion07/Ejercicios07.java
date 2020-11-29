package sesion07;

import java.util.Scanner;

public class Ejercicios07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ej07();

    }

    public static void Ej01() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("DIgite un numero entre el 1 y 100");
        num = sc.nextInt();
        while (num < 1 || num > 100) {
            System.out.println("Numero fuera de rango. \nIntroduzca un numero entre el 1 y 100");
            num = sc.nextInt();
        }
        System.out.println("El numero es: " + num);

    }

    public static void Ej02() {
        int num;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero (0 para finalizar) ");
        num = sc.nextInt();
        while (num != 0) {
            System.out.println("Digite un numero (0 para finalizar) ");
            num = sc.nextInt();
            contador++;

        }

        System.out.println("Has introducido " + contador + " numeros");

    }

    public static void Ej03() {
        int num;
        int mayor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero (0 para finalizar) ");
        num = sc.nextInt();
        while (num != 0) {
            System.out.println("Digite un numero (0 para finalizar) ");
            num = sc.nextInt();
            if (num > mayor) {
                mayor = num;
            }

        }
        System.out.println("El número mayor es: " + mayor);

    }

    public static void Ej04() {
        int contador = 0;
        int num = 1;

        while (contador < 20) {
            if (num % 5 == 0) {
                System.out.println(num);
                contador++;
            }

            num += 1;


        }
    }

    public static void Ej05() {
        int contador = 0;
        int num = 1;

        while (contador < 50) {
            if (num % 5 == 0) {
                System.out.print(num + "\t");
                contador++;
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
            num += 1;

        }
    }

    public static void Ej06() {
        int i = 1;
        int suma = 0;
        while (suma <= 125) {
            suma = suma + i;
            i++;
            System.out.println(i);
        }


    }

    public static void Ej07() {
        Scanner sc = new Scanner(System.in);
        boolean encontrado = false;
        boolean seguir = true;
        int numInt;
        int numAl = (int) (Math.random() * 100 + 1);
        System.out.println("Vamos a encontrar un número elegido al azar entre 1 y 100 \nSi en algún momento deseas rendirte, teclea 0 ");
        while (encontrado == false && seguir == true) {
            System.out.println("introduce un numero entre el 1 y el 100:");
            numInt = sc.nextInt();
            if (numInt == 0) {
                seguir = false;
                System.out.println("te has rendido, el número era: " + numAl);
            } else if (numInt < 1 || numInt > 100) {
                System.out.println("El número " + numInt + " esta fuera de rango");

            } else if (numInt < numAl) {
                System.out.println("El numero es mayor que " + numInt);
            } else if (numInt > numAl) {
                System.out.println("El numero es menor que " + numInt);
            } else if (numAl == numInt) {
                System.out.println("felicidades, has encontrado el numero");
                encontrado = true;

            }

        }


        /*
        mientras encontrado = false y seguir = true
        casos a comprobar con numintroducido
        si me rindo
            te has rendido y seguir = false
         si estoy fuera del rango y seguir preguntando
            fuera de rango y seguir preguntando
          si el numero es menor que el aletaorio
            menor y seguir preguntando
          si el numero es mayor que el aleatorio
            mayor y seguir preguntando
           si son iguales
            has acertado y encontrado= true
         */
    }


}
