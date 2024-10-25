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
                }
            }

     }

     public int get(char letter){
        if(!Character.isLetter(letter)){
            throw new IllegalArgumentException("Has to be a letter!");
        }

        return alphaKey[Character.toLowerCase(letter) - 'a'];

        //return alphaKey[letterIndex];

     }

     void set(char letter, int value){
        if(!Character.isLetter(letter)){
            throw new IllegalArgumentException("Has to be a letter!");
        }

        if(value < 0){
            throw new IllegalArgumentException("Has to be greater than 0");

        }

        if(totalCount > 0){
            totalCount = totalCount + (value - alphaKey[Character.toLowerCase(letter) - 'a']);
        }
        
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

     
  

    public Boolean isEmpty(){
        if(data == null){
            return true;
        }
        
        return false;
    }      




}