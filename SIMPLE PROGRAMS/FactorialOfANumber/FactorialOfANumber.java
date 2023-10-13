import java.util.Scanner;

class FactorialOfANumber{

    public static long fact(int input){
        if(input>1) return input * fact(input-1);
        else return 1;
    }
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);

        System.out.print("Enter The Fact Number : ");
        System.out.print(String.format("Factorial Is %d",fact(io.nextInt())));
    }
}