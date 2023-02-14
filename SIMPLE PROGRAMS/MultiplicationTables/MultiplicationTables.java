import java.util.Scanner;

class MultiplicationTables{

    MultiplicationTables(int which,int l,int t){

        for(int i=which;i<=which+t;i++){
            for(int j=1;j<=l;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
            System.out.println("\n");
        }
    }

    public static void main(String []args){
    
        Scanner io = new Scanner(System.in);

        int[] meta = new int[3];

        System.out.print("ENTER THE FIRST TABLE     : ");
        meta[0] = io.nextInt();

        System.out.print("ENTER THE LENGTH TABLE    : ");
        meta[1] = io.nextInt();
        
        System.out.print("ENTER THE NUMBER OF TABLE : ");
        meta[2] = io.nextInt();

        MultiplicationTables key = new MultiplicationTables(meta[0],meta[1],meta[2]);

    }
}