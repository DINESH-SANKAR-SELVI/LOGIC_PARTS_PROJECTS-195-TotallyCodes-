import java.util.Scanner;

class AreaAndPerimeterOfASquareAndRectangle{

    AreaAndPerimeterOfASquareAndRectangle(int a1,int b1){

            System.out.println("THE VALUE OF AREA IS "+(a1*b1)+" AND PERIMETER OF RECTANGLE IS "+(2*(a1*b1)));

    }

    public static void main(String []args){

        int a,b;

        Scanner io = new Scanner(System.in);

        System.out.println("ENTER THE LENGTH VALUE OF RECTANGLE :- ");
        a=io.nextInt();
        System.out.println("ENTER THE WIDETH VALUE OF RECTANGLE :-");
        b=io.nextInt();

        AreaAndPerimeterOfASquareAndRectangle key = new AreaAndPerimeterOfASquareAndRectangle(a,b);

    }
}