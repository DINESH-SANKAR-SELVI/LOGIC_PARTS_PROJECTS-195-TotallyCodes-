import java.util.Scanner;

class NetSalaryOfAnEmployee{
        int[] net = new int[8];
        int result;
        Scanner io = new Scanner(System.in);

        int process(){
            for(int i=0;i<8;i++){

                switch(i)
                {
                case 0 :
                    System.out.print("ENTER THE BASIC SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 1 :
                    System.out.print("ENTER THE HRA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 2 :
                    System.out.print("ENTER THE PF :-");
                    net[i]=io.nextInt();
                    break;
                case 3 :
                    System.out.print("ENTER THE INSURENCE :-");
                    net[i]=io.nextInt();
                    break;
                case 4 :
                    System.out.print("ENTER THE BOUNS :-");
                    net[i]=io.nextInt();
                    break;
                case 5 :
                    System.out.print("ENTER THE TA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 6 :
                    System.out.print("ENTER THE FBPA SALARY :-");
                    net[i]=io.nextInt();
                    break;
                case 7 :
                    System.out.print("ENTER THE INCOMETAX SALARY :-");
                    net[i]=io.nextInt();
                    break;
                default:
                    System.out.print("OUT OF RANGE....!");
                    break;
                }
            }
            return (net[0]+net[1]+net[4]+net[5]+net[6])-(net[2]+net[3]+net[7]);
        }
    public static void main(String []args){

        NetSalaryOfAnEmployee key = new NetSalaryOfAnEmployee();

        Scanner io = new Scanner(System.in);
        
        String work = "y";

        do{
            NetSalaryOfAnEmployee obj = new NetSalaryOfAnEmployee();
            System.out.println("\nNET SALARY : "+obj.process());

            System.out.print("\nDO YOU MAKE OPERATION AGAIN : ");
            work = io.nextLine();

        }while(work.equalsIgnoreCase("y"));

    }

    }
