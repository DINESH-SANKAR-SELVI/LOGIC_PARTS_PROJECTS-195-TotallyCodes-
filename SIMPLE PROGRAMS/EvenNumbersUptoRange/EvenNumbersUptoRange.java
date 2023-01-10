import java.beans.EventHandler;
import java.util.Scanner;

class EvenNumbersUptoRange{

    EvenNumbersUptoRange(int limt){
        int count=1;
        for(int i=0;i<=limt;i++){
            if((i%2)==0){

                System.out.println(count+") "+i);
                ++count;
            }
        }
    }
    public static void main(String[] args){

        Scanner io = new Scanner(System.in);
        System.out.print("ENTER THE LIMIT TO FIND EVEN :");

        int limt = io.nextInt();
        EvenNumbersUptoRange key = new EvenNumbersUptoRange(limt);
        
    }
}