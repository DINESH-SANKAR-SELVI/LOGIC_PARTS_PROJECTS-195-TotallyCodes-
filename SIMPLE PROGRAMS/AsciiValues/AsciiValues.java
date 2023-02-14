import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class AsciiValues{

    public int AsciiValue(char input1){
        return Integer.valueOf(input1);
    }
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        AsciiValues io  = new AsciiValues();

        char input =' ';
        System.out.print("ENTER THE SEQUENCE WORD (IF YOU NEED EXIT PRESS\'`\' : ");
        do{
            input = (char) b.read();
            System.out.println(io.AsciiValue(input));
        }while(!('`'==input));
    }
}