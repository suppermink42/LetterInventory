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

    public static void convy(){
        char ch = 'z';
        int numericValue = Character.getNumericValue(ch); 
        System.out.println(numericValue); 
    
    }

    public static void invent(String data, int alphaKey[]){

             String lowerData = data;
             int letter = 0;



            for(int i = 0; i < data.length(); i++){
 
                letter = lowerData.at(i) - 'a'; 
                
                alphaKey[l]++;

            }

            }

    }

    public static void main(String args[]){
        //LetterInventory x;

        //bytes();
        //convy();

        int main[] = new int[26];
        String mainy = "Hello";
        
        invent(mainy, main);


        //True posistion is one less
        for(int i = 0; i < 26; i++){
            System.out.println(main[i] + " " + i);
        }

        
    }
