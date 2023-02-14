import java.lang.*;
public class Calculator{
    public long additon(int...input){
        long answer=0 ;
        for(int a : input) answer += a;
        return answer;
    }
    public long subraction(int...input){
        long answer = 0 ;
        for(int a : input) answer = a-answer;
        return answer;
    }
    public long multiplication(int...input){
        long answer = 1;
        for(int a : input) answer *= a;
        return answer;
    }
    public long division(int...input){
        long answer=1;
        for(int a : input) answer= a/answer;
        return answer;
    }
    public static void main(String[] args){

        Calculator key = new Calculator();

        System.out.println("ADDITION        : "+key.additon(6,4,2));
        System.out.println("SUBRACTION      : "+key.subraction(100,60,2));
        System.out.println("MULTIPLICATION  : "+key.multiplication(2,25,2));
        System.out.println("DIVISON         : "+key.division(2,50));
    }
}