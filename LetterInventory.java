import java.lang.StringBuilder;


class LetterInventory{
     
     private String data;
     private String lowerData;
     private int letterIndex = 0;
     private char tempChar;
     private int totalCount = 0;
     private int[] alphaKey = new int[26];

     

     LetterInventory(String data){
        this.data = data;
        lowerData = data.toLowerCase();


            for(int i = 0; i < data.length(); i++){
                tempChar = lowerData.charAt(i);

                if(Character.isLetter(tempChar)){
                    alphaKey[lowerData.charAt(i) - 'a']++;
                    totalCount++;
                }
            }

     }


     public int get(char letter){
        if(!Character.isLetter(letter)){
            throw new IllegalArgumentException("Has to be a letter!");
        }

        return alphaKey[Character.toLowerCase(letter) - 'a'];


     }

     void set(char letter, int value){
        if(!Character.isLetter(letter)){
            throw new IllegalArgumentException("Has to be a letter!");
        }

        if(value < 0){
            throw new IllegalArgumentException("Has to be greater than 0");

        }

        /*
        if(totalCount > 0){
            totalCount = totalCount + (value - alphaKey[Character.toLowerCase(letter) - 'a']);
        }
        */
        totalCount = totalCount + (value - alphaKey[Character.toLowerCase(letter) - 'a']);


        alphaKey[Character.toLowerCase(letter) - 'a'] = value;

        
     }

     public int size(){
        
        if(totalCount == 0){
            for(int i = 0; i < 26; i++){
                totalCount = alphaKey[i] + totalCount;
            }

            return totalCount;
        }
        

        return totalCount;

     }

     public String toString(){
        StringBuilder toStringData = new StringBuilder("[");

         for(int i = 0; i < 26; i++){
            for(int j = 0; j < alphaKey[i]; j++){
                toStringData.append((char)('a' + i));
            }
         }
         
         toStringData.append("]");

         return toStringData.toString();
     }
  

    public Boolean isEmpty(){
       return this.size() == 0;
    }      

    LetterInventory add(LetterInventory other){

        LetterInventory sumInventory = new LetterInventory("");

        for(int i = 0; i < 26; i++){
            sumInventory.alphaKey[i] = this.alphaKey[i] + other.alphaKey[i];
        }

        return sumInventory;
    }

    /*
    LetterInventory subtract(LetterInventory other){
        LetterInventory sumDifference = new LetterInventory("");

        for(int i = 0; i < 26; i++){

            if(other.alphaKey[i] - this.alphaKey[i] < 0){
                 return null;    
             }
            
            sumDifference.alphaKey[i] = other.alphaKey[i] - this.alphaKey[i];
        }

        //sumDifference.totalCount = this.size() - other.size();

        return sumDifference;


    }
    */

   public LetterInventory subtract(LetterInventory other) {
    // Create a new LetterInventory to hold the result
    LetterInventory sumDifference = new LetterInventory("");

    // Loop through all letters ('a' to 'z')
    for (int i = 0; i < 26; i++) {
        // Check if subtracting would result in a negative count
        if (this.alphaKey[i] < other.alphaKey[i]) {
            return null;  // Return null if any count would be negative
        }

        // Subtract the counts from 'this' and 'other' for each letter
        sumDifference.alphaKey[i] = this.alphaKey[i] - other.alphaKey[i];
    }

    // Update totalCount for the new inventory
    //sumDifference.totalCount = this.size() - other.size();

    // Return the new inventory with subtracted counts
    return sumDifference;
}

}