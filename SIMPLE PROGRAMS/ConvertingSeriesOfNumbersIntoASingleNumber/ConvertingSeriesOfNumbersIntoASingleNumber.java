import java.util.Scanner;

class ConvertingSeriesOfNumbersIntoASingleNumber{

    public static long conSerNum(int[] input){
        long result=0;
        int pow = input.length;

        for(int i : input){
            --pow;
            result = result+(i * (int)Math.pow(10,pow));
        }
        return result;
    }
    
    public static void main(String[] args){
        Scanner io = new Scanner(System.in);

        System.out.print("Number Of Element ? : ");
        int[] data = new int[io.nextInt()];

        int index =0;

        System.out.println("ENTER VALUES");
        while(data.length != index && index<=data.length){
            try{
                 System.out.print(String.format("   Values %d :",index+1));
                 data[index]= io.nextInt();
                 ++index;
            }catch(Exception error){break;}
        }
        System.out.println("THANK YOU...!");

        System.out.println(String.format("Result Is : %d",conSerNum(data)));
    }
}