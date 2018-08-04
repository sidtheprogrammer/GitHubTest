package main;

public class WorkItOut {
    int anInt;
    int bnInt;

    public WorkItOut(int anInt, int bnInt){
        this.anInt=anInt;
        this.bnInt=bnInt;
    }

    public static int addTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    public static double multiplyTwoNumbers(int firstNumber, int secondNumber){
        return  firstNumber * secondNumber;
    }
}
