import java.rmi.server.RemoteRef;
import java.util.Scanner;

import javax.swing.UIDefaults.ActiveValue;

class AverageOfOddNumbersBelowARange{

    int value = 0,count = 0;


    AverageOfOddNumbersBelowARange(int limt){

        int result=this.process(limt);

        System.out.println("THE VALUE IS "+result);
    }
    int process(int l){

        for(int i=0;i<=l;i++){
            if((i%2)!=0){
                
                this.value+=i;
                this.count+=1;
            }

        }
        return this.value/this.count;
    }
    public static void main(String []args){

        Scanner io = new Scanner(System.in);

        System.out.print("ENTER THE LIMT TO FIND AVG ODD :");
        int limt= io.nextInt();

        AverageOfOddNumbersBelowARange key = new AverageOfOddNumbersBelowARange(limt);
    }
}