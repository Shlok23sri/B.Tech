import java.util.*;

class Toggle{
    String str, str1;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        str = sc.nextLine();
    }

    void word(){
        str1 = "";
        for(int i=0; i < str.length(); i++){
            if(i%2 == 0){
                str1 += str.charAt(i);
            } else {
                if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                    str1 = str1 + (char)(str.charAt(i) - 32);
                }
            }
        }
    }

    void show(){
        System.out.println("Input word: " + str);
        System.out.println("Output word: " + str1);
    }
}


public class Ques {
    public static void main(String args[]){

        Toggle t = new Toggle();
        t.input();
        t.word();
        t.show();


    }
}