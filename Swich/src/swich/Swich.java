/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swich;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class Swich {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, b = 0, m = 0;
        String p = "Even", q = "Odd";
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter n");
        n = input.nextInt();
        
        System.out.println(n==0?b:m);
        System.out.println((n%2==0?p:q));
        
        String s1 = "Bahamas";
        String s2 = "BAHAMAS";
        
        if(s1.toUpperCase() == s2)
        System.out.println("1");
        
        if(s1.toUpperCase().equals(s2))
        System.out.println("2");
        
    }
    }
    

