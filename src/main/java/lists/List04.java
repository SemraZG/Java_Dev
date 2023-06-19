package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List04 {
    public static void main(String[] args) {
        //kullanıcının girdiği harf listte var ise o harfi "buldum" a cevirin, yoksa o harfi liste ekleyin
        List<String> words=new ArrayList<>();
        words.add("S");
        words.add("a");
        words.add("T");
        words.add("A");
        words.add("k");
        words.add("s");

        Scanner input=new Scanner(System.in);

        int counter=0;
        int live=3;
        do{
            if (counter==live){
                System.out.println("Game over!");
                break;
            }
            System.out.println("Enter a letter");
            String userLetter=input.next().substring(0,1);

            if (words.contains(userLetter)){
                words.set(words.indexOf(userLetter), "buldum");
            }else{
                words.add(userLetter);
            }
            System.out.println(words);
            counter++;
        }while (counter<3);

    }
}
