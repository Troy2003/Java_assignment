/*
Q 9 :WAP to find factorial of number using for statement.
*/

public class Factorial {
    public static void main(String[] args) {
        int var = 5;
        int fac = 1;

        for(int i=1;i<=var;i++){  
            fac = fac * i;
        }  
        System.out.println("Factorial of " + var + " is " + fac );  
    }
}