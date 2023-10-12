import java.util.Scanner;

class ConversionOfBinaryIntoDecimalNumber{
    public static long bin2Dec(long input) {
        long base = 2, result = 0, value = 0;        

        for(int i=0;input>0;i++){
            value = input % 10;
            result = result +(value * (int) Math.pow(base,i));
            input = input / 10;
        }
        return result;
    }
    public static void main(String[] args){

        try (Scanner io = new Scanner(System.in)) {
            System.out.print("ENTER THE BINARY VALUE : ");
            System.out.println(bin2Dec(io.nextLong()));
        }catch(Exception error){
            System.out.println(String.format("Scanner Class is Missing : %s",error));
        }
    }
}