package ve.yestris;

import java.util.Scanner;

public class U0301 {

    public static void main(String[] args) {
        //ejemplo1();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad;

        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad ");
        } else {
            System.out.println("Eres menor de edad ");
        }

    }

    static void ejemplo1() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num = scanner.nextInt();

        if (num == 5) {
            System.out.println("Acertaste el numero");
        }

    }

}
