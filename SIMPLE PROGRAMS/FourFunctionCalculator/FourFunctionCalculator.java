class FourFunctionCalculator extends CalcFunction{

    public static void main(String[] args){

        CalcFunction process = new FourFunctionCalculator();

        process.add.additon(1,2);
        System.out.println(String.format("Addtion : %f",process.add.getAnswer()));

        process.sub.subraction(1,5);
        System.out.println(String.format("Subraction : %f",process.sub.getAnswer()));

        process.mul.multiplication(1,5,6);
        System.out.println(String.format("Multiplication : %f",process.mul.getAnswer()));
        
        process.div.division(5,20);
        System.out.println(String.format("division : %f",process.div.getAnswer()));
    }
}

abstract class CalcFunction{

    add add;
    sub sub;
    mul mul;
    div div;

    CalcFunction(){
        this.add = new add();
        this.sub = new sub();
        this.mul = new mul();
        this.div = new div();
    }

    public class add{
        private long answer=0;

        public void additon(int...data){
             for(int a : data) {answer += a;}
        }
        public double getAnswer() {
            return answer;
        }
    }

        public class sub{
        private long answer=0;

        public void subraction(int...data){
             for(int a : data) {answer = a - answer;}
        }
        public double getAnswer() {
            return answer;
        }
    }

    public class mul{
        private long answer=1;

        public void multiplication(int...data){
             for(int a : data) {answer *= a;}
        }
        public double getAnswer() {
            return answer;
        }
    }
    public class div{
        private long answer=1;

        public void division(int...data){
             for(int a : data) {answer = a / answer;}
        }
        public double getAnswer() {
            return answer;
        }
    }
}