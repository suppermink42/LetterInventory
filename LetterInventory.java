class LetterInventory{
 
     private String data;
     private String lowerData;
     private int letter = 0;
     private char tempChar;
     private int[] alphaKey = new int[26];

    LetterInventory(String data){
        this.data = data;
        lowerData = data.toLowerCase();

            for(int i = 0; i < data.length(); i++){
                letter = lowerData.at(i) - 'a'; 
                
                alphaKey[l]++;

            }

    }


}