package main;

public class Alogrithms {

    public static int largestMultipleOfTwo(int usersNumber){

       if(usersNumber%2==0 && usersNumber>=0){
           return usersNumber;
       }else if(usersNumber != 0 && usersNumber>1){
           return usersNumber-1;
       }else{
           return 0;
       }
    }
}
