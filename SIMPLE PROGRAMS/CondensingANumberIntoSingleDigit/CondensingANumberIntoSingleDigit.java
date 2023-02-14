import java.util.Scanner;

public class CondensingANumberIntoSingleDigit{

    int value=0;
    int input =0;
    public int CondensingNumber(int input){
        this.input = input;
        while(this.input>9){
            value = value+(this.input%10);
            this.input = this.input/10;
        }
        value +=this.input;
        int a = value;

        if(value>9) this.CondensingNumber(a);

        return value;
    }
    public static void main(String[] args){

        Scanner io = new Scanner(System.in);
        System.out.print("ENTER THE NUMBER TO CONDENSING : ");
        Integer input = Integer.valueOf(io.nextInt());

        CondensingANumberIntoSingleDigit key = new CondensingANumberIntoSingleDigit();

        System.out.println("THE RESULT OF CONDENSING VALUE IS %d ".formatted(key.CondensingNumber(input)));
    }
}