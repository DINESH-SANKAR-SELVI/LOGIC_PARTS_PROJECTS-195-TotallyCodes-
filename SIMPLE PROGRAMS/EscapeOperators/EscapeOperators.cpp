#include<iostream>

int main(){

    /*
        \a - ALERT
        \b - BACK SPACE
        \t - TAB
        \v - VERTICAL TAB
        \n - NEW LINE
        \f - FORM FEED
        \r - CARRIAGE RETURN
        \" - DOUBLE QUOTE
        \' - SINGLE QUOTE
        \? - PRINT QUIZ MARK
        \\ - BACK SLASH
        \0 - NULL
        \ooo - OCTAL
        \xhh - HEX DECIMAL
(NOT FOR C)   \uxxxx - UNICODE VALUE IN 16 BIT
(NOT FOR C)   \uxxxxxxxx - UNICODE VALUE IN 32 BIT
    */

    std::cout<<"\r - CARRIAGE RETURN        \a - ALERT      \b - BACK SPACE        \t - TAB        \v - VERTICAL TAB        \n - NEW LINE        \f - FORM FEED        \" - DOUBLE QUOTE        \' - SINGLE QUOTE       \? - PRINT QUIZ MARK        \\ - BACK SLASH        \065 - OCTAL        \x24 - HEX DECIMAL        NULL - \0 ";

return 0;
}
