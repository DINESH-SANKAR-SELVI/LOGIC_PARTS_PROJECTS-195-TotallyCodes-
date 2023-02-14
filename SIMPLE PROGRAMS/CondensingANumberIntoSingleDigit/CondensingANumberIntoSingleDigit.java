import java.util.Scanner;

public class CondensingANumberIntoSingleDigit{

    int value;
    int input =0;
    public int CondensingNumber(int input){
        this.input = input;
        while(this.input>9){
            value =0;
            while (this.input>0) {
                value = value + (this.input % 10);
                this.input = this.input / 10;
            }
            input =this.value;
        }
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