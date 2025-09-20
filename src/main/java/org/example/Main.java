package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println("-------------------------");
        System.out.println("Palindrome");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));




        System.out.println("-------------------------");
        System.out.println("Perfect Number");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("-------------------------");
        System.out.println("Numbers To Words");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));


    }



    public static boolean isPalindrome(int num){




            int originalNumber = Math.abs(num);
            int reversed = 0;
            int temp = originalNumber;

            while (temp != 0) {
                int digit = temp % 10;
                reversed = reversed * 10 + digit;
                temp /= 10;
            }

            return originalNumber == reversed;

    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) return false;

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        if (number == 0) {
            return "Zero";
        }

        String result = "";
        int reversedNumber = 0;
        int temp = number;


        while (temp != 0) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
            temp /= 10;
        }

        while (reversedNumber != 0) {
            int digit = reversedNumber % 10;
            switch (digit) {
                case 0: result += "Zero "; break;
                case 1: result += "One "; break;
                case 2: result += "Two "; break;
                case 3: result += "Three "; break;
                case 4: result += "Four "; break;
                case 5: result += "Five "; break;
                case 6: result += "Six "; break;
                case 7: result += "Seven "; break;
                case 8: result += "Eight "; break;
                case 9: result += "Nine "; break;
            }
            reversedNumber /= 10;
        }

        return result.trim();
    }













}
