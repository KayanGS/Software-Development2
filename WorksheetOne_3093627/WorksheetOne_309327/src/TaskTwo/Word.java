package TaskTwo;

public class Word {

    //Declaring the letters array
    private char[] letters;

    /**
     * @param letters
     * @throws IllegalArgumentException if the letters array is null
     * Constructor that creates a Word object composed of the chars in the array
     */
    public Word(char[] letters){
        //If array is null, throw an exception
        if (letters == null){
            throw new IllegalArgumentException("Letters array can't be null");
        }
        this.letters = letters;
    }

    /**
     * @param symbol
     * @return true if the symbol is in the letters array, false otherwise
     */
    public boolean contains (char symbol){

        //Iterate through the letters array
        for (char letter : letters){
            //If the letter is equal to the symbol, return true
            if (letter == symbol){
                return true; //################## RETURN ####################
            }
        }
        return false; //################## RETURN ####################
    }

    /**
     * @return the length of the letters array
     */
    public int length(){
        return letters.length;
    }

    /**
     * @return the letters array
     */
    public char[] getLetters() {
        return letters;
    }
}
