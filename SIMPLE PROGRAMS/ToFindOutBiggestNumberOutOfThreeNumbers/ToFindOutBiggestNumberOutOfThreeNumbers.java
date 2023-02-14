import java.util.Scanner;

class ToFindOutBiggestNumberOutOfThreeNumbers{

    public int validate(int...input){
    
        int value =input[0];
        for(int i=0;i<input.length;i++) if(value <= input[i]) value = input[i];

        return value;
    }    
    public static void main(String []arg){

        ToFindOutBiggestNumberOutOfThreeNumbers key = new ToFindOutBiggestNumberOutOfThreeNumbers();

        System.out.println("THE BEGGEST NUMBER IS : "+key.validate(11,451,516,1902));

    }

}