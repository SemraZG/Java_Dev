package lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class List03 {
    public static void main(String[] args) {
        //kısa yoldan list olusturma--->List.of() methodu
       List<Integer> initials= List.of(1,2,3);
       List<String> initialsString=List.of("1", "2", "3");
       List<Character> initialsChare=List.of('1', '2', '3');

        /**
         * List.of() methodu ile olusturduğumuz listte ekleme cıkarma yapamayız o yuzden çok kullanıslı değil
         */


        //bir listteki uniqe elemanları bulun
        List<Double> nums=List.of(2.5, 1.2, 2.5, 4.0, 2.2, 4.0);
        List<Double> uniqueNums=new ArrayList<>();
        for (Double w: nums){
            if (nums.indexOf(w)==nums.lastIndexOf(w)){
                uniqueNums.add(w);
            }
        }
        System.out.println(uniqueNums);//[1.2, 2.2]

        //bir listin unique elemanlardan olusup olusmadığını bulun
        List<Integer> heights=List.of(1,9,44,55,66);
        int counter=0;
        for (int w: heights){
            if (heights.indexOf(w)!=heights.lastIndexOf(w)){
                counter++;
            }
        }
        if (counter==0){
            System.out.println("All elements are unique in the list.");
        }else{
            System.out.println("At least one element is not unique in the list.");
        }



        //Integer listteki en yakın iki tamsayıyı bulun
        List<Integer> digits=new ArrayList<>();
        digits.add(12);
        digits.add(23);
        digits.add(10);
        digits.add(19);
        Collections.sort(digits);

        System.out.println(digits);//[10, 12, 19, 23]
        int minDig=digits.get(1)-digits.get(0);
        for (int i=1; i<digits.size(); i++){
           minDig= Math.min(minDig, digits.get(i)-digits.get(i-1));
        }
        System.out.println(minDig);//2
        for (int i=1; i<digits.size(); i++){
            if (digits.get(i)-digits.get(i-1)==minDig){
                System.out.println(digits.get(i)+" and "+digits.get(i-1));//12 and 10
            }
        }
    }
}
