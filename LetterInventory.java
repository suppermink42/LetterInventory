class LetterInventory{
     
     private String data;
     private int[] alphaKey = new int[26];

     LetterInventory(String data){
        this.data = data;
     }

    public Boolean isEmpty(){
        if(data == null){
            return true;
        }
        
        return false;
    }      


}