package sorting;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("please enter first number: ");
        int n1 = scan.nextInt();
        System.out.print("please enter second number: ");
        int n2 = scan.nextInt();
        System.out.print("please enter third number: ");
        int n3 = scan.nextInt();

        if (n1 > n2 && n1 > n3) {

            if (n2 > n3) {
                System.out.println(n1 + " > " + n2 + " > " + n3);
            } else {
                System.out.println(n1 + " > " + n3 + " > " + n2);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println(n2 + " > " + n1 + " > " + n3);
            } else {
                System.out.println(n2 + " > " + n3 + " > " + n1);
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println(n3 + " > " + n1 + " > " + n2);
            } else {
            }
            System.out.println(n3 + " > " + n2 + " > " + n1);
        }

    }

}
