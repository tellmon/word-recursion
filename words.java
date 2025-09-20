import java.util.Scanner;

public class words {

    public static void main(String[] args) {

        boolean works = true;
        
        Scanner words = new Scanner(System.in);  // Create a Scanner object

        System.out.println("first word: ");

        String word1 = words.nextLine();  // Read user input
    
        words.nextLine();

        System.out.println("second word: ");
        String word2 = words.nextLine(); 

        if(word1.length() <= word2.length()){
            
            char[] word1array = word1.toCharArray();

            char[] word2array = word2.toCharArray();
            
            for(int i = 0; i < word1.length(); i++){
                for(int x = 0; x < word2.length(); x++){
                    if(word1array[i] == word2array[x]){
                        word1array[i] = ' ';
                        word2array[x] = '#';
                    }
                }
            }

            for(int z = 0; z < word1.length(); z++){
                if (word1array[z] == ' ' && works){
                    works = true;
                }

                else{
                    works = false;
                }
            }

            if(works){
                System.out.println(word1 + " can be made with " + word2);
            }

            else{
                System.out.println(word1 + " can not be made with " + word2);
            }
        }

        else{
            System.out.println(word1 + " can not be made with " + word2);
        }
    }
}