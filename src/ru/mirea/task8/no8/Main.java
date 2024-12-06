package ru.mirea.task8.no8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();

        if(isPalindrome(string)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }

    public static boolean isPalindrome(String string){
        if(string.length() <= 1){
            return true;
        }

        if (string.charAt(0) != string.charAt(string.length() - 1)){
            return false;
        }

        return isPalindrome(string.substring(1, string.length() - 1));
    }
}
