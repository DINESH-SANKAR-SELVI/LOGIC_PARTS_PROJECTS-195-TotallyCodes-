import java.util.Scanner;

class ToFindOutBiggestNumberOutOfThreeNumbers{

    Scanner io = new Scanner(System.in);

    int a,b,c;
    
    ToFindOutBiggestNumberOutOfThreeNumbers(){
        System.out.println("THIS IS A BIGGEST VALUE IN GIVEN : "+check());

    }
    int check(){

        System.out.print("ENTER THE FIRST VALUE    :");
        this.a=io.nextInt();
        System.out.print("ENTER THE SECOND VALUE   :");
        this.b=io.nextInt();
        System.out.print("ENTER THE THIRD VALUE    :");
        this.c=io.nextInt();

        if((a>b)&&(a>c)){
            return a;
        }
        else if((b>=a)&&(b>=c)){
            return b;
        }
        else{
            return c;
        }
    }
    
    
    public static void main(String []argu){
        ToFindOutBiggestNumberOutOfThreeNumbers key = new ToFindOutBiggestNumberOutOfThreeNumbers();
    }

}