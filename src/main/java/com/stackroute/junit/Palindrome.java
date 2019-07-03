package main.java.com.stackroute.junit;
/*
program to check whether the given string is a palindrome or not
 */
public class Palindrome {

        public String checkWhethertheInputIspalindrome(String input) {
            if(input.equals(""))
                return "Enter some data";
            else
            {
                String reverse = ""; // Objects of String class

                int length = input.length();

                for (int i = length - 1; i >= 0; i--)//generating the reverse of a string
                    reverse = reverse + input.charAt(i);

                if (input.equals(reverse))//comparing the two strings
                    return "The string is a palindrome.";
                else
                    return "The string isn't a palindrome.";
            }

        }



    }

