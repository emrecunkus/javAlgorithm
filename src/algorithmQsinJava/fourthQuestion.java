package algorithmQsinJava;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import java.util.Scanner;
 
public class fourthQuestion{
 
    public static void main(String[] args) {
        /*
       Write a Java Program to reverse a number by recursion
        */  
       Scanner scan = new Scanner(System.in);
       int x = scan.nextInt();
       reverseNumber(123456);
       
    }
    public static void reverseNumber(int number){
        if(number<10){
           System.out.println(number);
           return;
        }
        else {
            int temp = number%10;
            System.out.print(temp);
            number = number/10;
            reverseNumber(number);
        }

    }
}