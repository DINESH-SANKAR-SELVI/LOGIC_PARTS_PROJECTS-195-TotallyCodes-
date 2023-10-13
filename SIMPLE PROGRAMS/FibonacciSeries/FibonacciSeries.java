import java.util.LinkedList;

class FibonacciSeries{
    int length;

    FibonacciSeries(){ this.length=6; }
    public void setLength(int length){ this.length = length; }
    public LinkedList<Integer> GetFibonacciSeries(){
        LinkedList<Integer> series = new LinkedList<Integer>();

        int init=1,next=0, result=0;

        for (int i=1;i<=length;i++){
            series.addLast(result);

            result = init + next;
            init = next;
            next = result;
        }
        return series;
    }
    public static void main(String[] args){
        FibonacciSeries fibObj = new FibonacciSeries();
        
        fibObj.setLength(8);
        System.out.println(fibObj.GetFibonacciSeries());
    }
}