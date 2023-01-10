public class EscapeOperators{

    EscapeOperators(){

        System.out.println("\r - CARRIAGE RETURN      \b - BACK SPACE        \t - TAB        \065 - OCTAL       \u0397 - UNICODE VALUE 16 BIT       \u00001000 - UNICODE VALUE 32 BIT        \n - NEW LINE        \f - FORM FEED        \" - DOUBLE QUOTE        \' - SINGLE QUOTE        \\ - BACK SLASH        NULL - \0 ");
    }       
    public static void main(String []args){

        /*
        
(NOT FOR JAVA) \a - ALERT
        \b - BACK SPACE
        \t - TAB
(NOT FOR JAVA) \v - VERTICAL TAB
        \n - NEW LINE
        \f - FORM FEED
        \r - CARRIAGE RETURN
        \" - DOUBLE QUOTE
        \' - SINGLE QUOTE
(NOT FOR JAVA) \? - PRINT QUIZ MARK
        \\ - BACK SLASH
        \0 - NULL
        \ooo - OCTAL
(NOT FOR JAVA) \xhh - HEX DECIMAL
        \Uxxxx - UNICODE VALUE IN 16 BIT
        \Uxxxxxxxx - UNICODE VALUE IN 32 BIT

    */

        EscapeOperators key = new EscapeOperators();    
        
    }
}