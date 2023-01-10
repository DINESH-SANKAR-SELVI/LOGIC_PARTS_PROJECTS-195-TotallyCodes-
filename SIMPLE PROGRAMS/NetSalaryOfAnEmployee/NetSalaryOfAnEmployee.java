import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class NetSalaryOfAnEmployee{

        int[] net = new int[8];

        int result;

        Scanner io = new Scanner(System.in);

    NetSalaryOfAnEmployee(){

        String work = "y";

        this.doing(work);
    }
    void doing(String s){
        do{
            String S = s;        
            
            System.out.println("DO YOU MAKE OPERATION AGAIN : ");
            S = io.nextLine();
        
            process key1 = new process();
            
        }while(s!="n");

    }
    class process{

        process(){
            for(int i=0;i<8;i++){

                switch(i)
                {
                case 0 :
                    System.out.println("ENTER THE BASIC SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 1 :
                    System.out.println("ENTER THE HRA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 2 :
                    System.out.println("ENTER THE PF :-");
                    net[i]=io.nextInt();
                    break;
                case 3 :
                    System.out.println("ENTER THE INSURENCE :-");
                    net[i]=io.nextInt();
                    break;
                case 4 :
                    System.out.println("ENTER THE BOUNS :-");
                    net[i]=io.nextInt();
                    break;
                case 5 :
                    System.out.println("ENTER THE TA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 6 :
                    System.out.println("ENTER THE FBPA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 7 :
                    System.out.println("ENTER THE INCOMETAX SALARY :-");
                    net[i]=io.nextInt();
                    break;
                default:
                    System.out.println("OUT OF RANGE....!");
                    break;
                }
            }
            int result=answer();
            System.out.println("RESULT IS :- "+result);
        }   
        private int answer(){

            return ((net[0]+net[1]+net[4]+net[5]+net[6])-(net[2]+net[3]+net[7]));
        }
    }

    public static void main(String []args){


        NetSalaryOfAnEmployee key = new NetSalaryOfAnEmployee();

    }
}