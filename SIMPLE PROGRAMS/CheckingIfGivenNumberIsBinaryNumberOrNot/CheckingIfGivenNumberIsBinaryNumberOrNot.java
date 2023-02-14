import java.lang.*;
import java.util.Scanner;
public class CheckingIfGivenNumberIsBinaryNumberOrNot{
    public boolean Validation(int input){
        boolean result = true;
        int a = 0;
        int b = 0;

        while(input>0){
            a = input%10;
            input = input/10;
            if((a==0) || (a==1)) continue;

            else{
                result = false;
                break;
            }
        }
        return result;
    }
    public static void main(String[] args) throws java.io.IOException{

        System.out.print("ENTER THE NUMBER TO VALIDATE : ");
        Scanner io = new Scanner(System.in);
        int input = io.nextInt();

        CheckingIfGivenNumberIsBinaryNumberOrNot key = new CheckingIfGivenNumberIsBinaryNumberOrNot();

        if(key.Validation(input)) System.out.println("YOU'RE GIVEN VALUE IS %d THAT IS BINARY".formatted(input));
        else System.out.println("YOU'RE GIVEN NUMBER IS %d THAT IS NOT A BINARY VALUE ..!".formatted(input));



    }
}