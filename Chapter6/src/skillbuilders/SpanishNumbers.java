package skillbuilders;



public class SpanishNumbers 
{

    /**
     * Displays the Spanish word for the number passed as a parameter.
     * * @param number The integer (1 through 10) to translate.
     */
    public static void displaySpanishWord(int number) {
        String spanishWord = "";

        switch (number) {
            case 1:
                spanishWord = "uno";
                break;
            case 2:
                spanishWord = "dos";
                break;
            case 3:
                spanishWord = "tres";
                break;
            case 4:
                spanishWord = "cuatro";
                break;
            case 5:
                spanishWord = "cinco";
                break;
            case 6:
                spanishWord = "seis";
                break;
            case 7:
                spanishWord = "siete";
                break;
            case 8:
                spanishWord = "ocho";
                break;
            case 9:
                spanishWord = "nueve";
                break;
            case 10:
                spanishWord = "diez";
                break;
            default:
                spanishWord = "Error: Number not in range 1-10";
        }

        System.out.println(number + " - " + spanishWord);
    }

    public static void main(String[] args) {
        
        System.out.println("--- Spanish Numbers 1 through 10 ---");
        
        // Use a for loop to call the method ten times, passing numbers 1 through 10.
        for (int i = 1; i <= 10; i++) {
            displaySpanishWord(i);
        }
        
        System.out.println("------------------------------------");
    }
}
//--- Spanish Numbers 1 through 10 ---
//1 - uno
//2 - dos
//3 - tres
//4 - cuatro
//5 - cinco
//6 - seis
//7 - siete
//8 - ocho
//9 - nueve
//10 - diez
//------------------------------------
