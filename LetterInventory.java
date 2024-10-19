class LetterInventory{
     
     private String data;
     private String lowerData;
     private int letter = 0;
     private char tempChar;
     private int[] alphaKey = new int[26];

     
     /*
     LetterInventory(String data){
        this.data = data;
        

            for(int i = 0; i < data.length(); i++){

                tempChar = data.charAt(i);
                tempInt = Character.getNumericValue(tempChar);
            
                //Correct Syntax
                alphaKey[tempInt - 10]++;

            }

     }
    */

     LetterInventory(String data){
        this.data = data;
        lowerData = data.lowerCase();

            for(int i = 0; i < data.length(); i++){
                letter = lowerData.at(i) - 'a'; 
                
                alphaKey[l]++;

            }

     }

     
  

    public Boolean isEmpty(){
        if(data == null){
            return true;
        }
        
        return false;
    }      




}