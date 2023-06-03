public class ToCheckLeapYearAndToPrintLeapYearsForm1901To2100{

    int srtYear = 1901 ,endYear = 2100;

    ToCheckLeapYearAndToPrintLeapYearsForm1901To2100(){

        int currentYear = srtYear;
        do{

            if((currentYear%4)==0) System.out.println(" Leap Year : {%d}".formatted(currentYear));

            currentYear++;

        }while(currentYear<=2100);

    }
    
    static public void main(String[] args){

        ToCheckLeapYearAndToPrintLeapYearsForm1901To2100 key = new ToCheckLeapYearAndToPrintLeapYearsForm1901To2100();
    }
}