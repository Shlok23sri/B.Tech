import java.util.*;

class Vowels{
    String str;
    String strnew;
    int Vcount;
    int Ccount;

    // Method to take input
    void input(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        str = sc.next();

        strnew = str;
    }

    // Method to count vowels/consonants and replace vowels
    void compute(){
        Vcount = 0;
        Ccount = 0;

        String result = "";

        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u'){
                Vcount++;

                // Replace vowel with next vowel
                if (ch == 'a')
                    result += 'e';
                else if (ch == 'e')
                    result += 'i';
                else if (ch == 'i')
                    result += 'o';
                else if (ch == 'o')
                    result += 'u';
                else if (ch == 'u')
                    result += 'a';
            }
            else{
                Ccount++;
                result += ch;
            }
        }

        strnew = result;
    }

    // Method to display result
    void printing(){
        System.out.println("Original Word      : " + str);
        System.out.println("Number of Vowels   : " + Vcount);
        System.out.println("Number of Consonants: " + Ccount);
        System.out.println("Updated Word       : " + strnew);
    }

    public static void main(String args[]){
        Vowels obj = new Vowels();

        obj.input();
        obj.compute();
        obj.printing();
    }
}