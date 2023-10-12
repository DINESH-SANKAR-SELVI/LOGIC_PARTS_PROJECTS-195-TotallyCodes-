import java.util.Scanner;

class ConversionOfDecimalNumberIntoOctalNumber{

    public static long decToOct(int input){ 
        byte base = 8;
        int result = 0;

        for(int i=0;input>0;i++){
            result = result + ((input % base) * (int)Math.pow(10,i));
            input = input/base;
        }
        return result;
    }
    public static void main(String[] args){

        Scanner io = new Scanner(System.in);
        System.out.print(" Enter the Decimal Value (To octal): ");
        System.out.println(decToOct(io.nextInt()));
    }
}