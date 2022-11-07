package day02forloop01;

import java.util.Scanner;

public class ForLoopUcgenIciUnlemler {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisi giriniz...");
        int st = input.nextInt();


        for( int i =1 ; i<=st ; i++ ){

            for(int k = st; k>=i ; k--){
                System.out.print(" ");
            }

            for(int m=1; m<=i ; m++){

                if(m==1 || m==i){
                    System.out.print("* ");
                }else if(i==st){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
            }
            System.out.println();

        }




    }

}
