package Day5.Assignment2.Question1;

import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        int snack_choice;
        String size;
        int count;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to snack shop");
        System.out.println("Please enter '1' for Frutiy snack and '2' for salty snack: ");
        snack_choice=sc.nextInt();
        if(snack_choice==1){
            System.out.println("Enter the size you want 1)'S' 2)'M' 3)'L': ");
            size=sc.next();
            System.out.println("Do you want Citrus? Enter '0' and '1' respectively: ");
            int cit_choice=sc.nextInt();
            if(cit_choice==0){
                // without cit_choice
                FruitSnacks f1=new FruitSnacks(size,cit_choice); //accessing base class and creating it's object
                count=0;
                // f1.FruitSnacks_price(count);
                f1.displayFruitySnacks();
            }
            else{
                // with cit_choice
                System.out.println("Enter the number of citrus you want ");
                count=sc.nextInt();
                FruitSnacks f1=new FruitSnacks(size,cit_choice); //accessing base class and creating it's object
                f1.FruitSnacks_price(count);
                f1.displayFruitySnacks();
             }
        }
        sc.close(); 
        // FruitSnacks s1=new FruitSnacks("S",0);
        // s1.displayFruitySnacks(); 
    }
}
