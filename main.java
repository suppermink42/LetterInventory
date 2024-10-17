class main{

    public static void bytes(){
        int[] array = new int[10];
        int bytes1 = array.length * Integer.BYTES; 

        System.out.println(bytes1);

        for(int i = 0; i < array.length; i++){
            array[i] = i++;
        }

        bytes1 = array.length * Integer.BYTES;
        System.out.println(bytes1);


    }

    public static void getChar(){

        String exm = "hello";

        for(int i = 0; i < exm.length(); i++){
            System.out.println(exm.charAt(i));
        }

    }

    public static void main(String args[]){
        LetterInventory x;

        bytes();

        
    }
}