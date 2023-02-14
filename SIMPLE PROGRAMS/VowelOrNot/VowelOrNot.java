import java.util.Scanner;

class VowelOrNot {

    char input;

    public boolean vowelVerify(char input){
        this.input = input;
        
        switch (this.input) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }

    }

    public static void main(String[] args) {

        Scanner io = new Scanner(System.in);
        String input = "";
        System.out.print("ENTER THE SEQUENCE : ");
        input = io.nextLine();
        
        VowelOrNot key = new VowelOrNot();
        
        for (int i = 0; i < input.length(); i++) {

            if(key.vowelVerify(input.charAt(i))) System.out.println(" \' %c \'  VOWEL".formatted(key.input));
            else System.out.println(" \' %c \' CONSONANT".formatted(key.input));
        }
    }
}