public class SwappingOfTwoIntegers{

    SwappingOfTwoIntegers(int first ,int second){

        System.out.println(" Before Swap memory : {%d} To {%d}".formatted(first,second));

        first = first+ second;
        second = first-second;
        first=first-second;

        System.out.println(" Swaped memory : {%d} To {%d}".formatted(first,second));
    }

    public static void main(String[] args){

        SwappingOfTwoIntegers key = new SwappingOfTwoIntegers(12,24);
    }
}