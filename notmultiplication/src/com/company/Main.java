package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Check nums = new Check();
        nums.displayCheck();
    }
    public static class Check{
        int num1;
        int num2;

        public int displayCheck(){
            Scanner scan =  new Scanner(System.in);
            try {
                System.out.println("Введите 1 число: ");
                this.num1 = scan.nextInt();
                System.out.println("Введите 2 число: ");
                this.num2 = scan.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Вы ввели не цифру!");
                return 0;
            }
            int sum = 0;
            if (this.num2 < 0){
                this.num2 =  Math.abs(this.num2);
                while (this.num2 > 0) {
                    this.num2--;
                    sum += this.num1;
                }
                System.out.println("Результат: " + -sum);
            }else {

                while (this.num2 > 0) {
                    this.num2--;
                    sum += this.num1;
                }
                System.out.println("Результат: " + sum);
            }


            return 0;
        }
    }



}



