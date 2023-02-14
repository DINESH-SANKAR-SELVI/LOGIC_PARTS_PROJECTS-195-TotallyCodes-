import java.util.Scanner;
import java.lang.*;

class AverageOfOddNumbersBelowARange{

    int value = 0,count = 0;
    int process(int limt){
        for(int i=1;i<=limt;i++){
            if((i%2)!=0){
                this.value+=i;
                this.count+=1;
            }
        }
        return this.value/this.count;
    }
    public static void main(String []args){
        Scanner io = new Scanner(System.in);
        System.out.print("ENTER THE LIMT TO FIND AVG ODD : ");
        int limt= io.nextInt();
        AverageOfOddNumbersBelowARange key = new AverageOfOddNumbersBelowARange();

        System.out.println("THE VALUE IS : "+key.process(limt));
    }
}