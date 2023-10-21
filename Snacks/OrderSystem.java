package Snacks;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        // System.out.println("Welcome to the snacks shop");
        // Scanner sc = new Scanner(System.in);
        // System.out.print("To choose Fruit snack enter '1', enter '2' for salty snack: ");
        // int snackChoice
        Snacks s1 = new FruitSnacks(1, 'S', 1, 0);
        s1.display();
        Snacks s2 = new SaltySnacks(2, 'L', 2, 2);
        s2.display();

    }
}