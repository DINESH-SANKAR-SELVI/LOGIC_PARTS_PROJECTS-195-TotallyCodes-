import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

class MultiplicationTables{

    MultiplicationTables(int l,int t){

        for(int i=1;i<=t;i++){
            for(int j=1;j<=l;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println("\n");
        }
    }

    public static void main(String []args){
    
            Scanner io = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH AND TILLS :-");
        MultiplicationTables key = new MultiplicationTables((io.nextInt()),(io.nextInt()));

    }
}