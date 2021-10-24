
/*
17. WAP to print all numbers from 1 to 20.
18. WAP to print all numbers from 100 to 1. Which are divisible by 2.
*/


public class Numbers {
 public static void main(String[] args) {

    for (int i = 0; i <= 20; i++) {
        System.out.println(i);
    }

    for (int i = 100; i >=1; i--) {
        if(i%2==0){
            System.out.println(i);
        }
    }
     
 }
}
