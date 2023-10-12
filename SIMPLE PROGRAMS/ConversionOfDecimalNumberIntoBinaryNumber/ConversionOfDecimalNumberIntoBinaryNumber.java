import java.util.Scanner;

class ConversionOfDecimalNumberIntoBinaryNumber{

    public static long decToBin(int input){ 
        byte base = 2;
        int result = 0;

        for(int i=0;input>0;i++){
            result = result + ((input % base) * (int)Math.pow(10,i));
            input = input/base;
        }
        return result;
    }
    public static void main(String[] args){

        Scanner io = new Scanner(System.in);
        System.out.print(" Enter the Decimal Value: ");
        System.out.println(decToBin(io.nextInt()));
    }
}