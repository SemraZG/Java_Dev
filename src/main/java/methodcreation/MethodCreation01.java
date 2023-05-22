package methodcreation;

public class MethodCreation01 {

        /**
         * Javada method nasıl oluşturulur?
             1-main methodun dışında ama class ın içinde oluşturulur.
             2-Access Modifier + return type + method ismi + () + {method body}

         *Oluşturulan methodlar nasıl kullanılır?
            Kullanılmak istenen method main methodun içinde çağrılarak kullanılır.
         */

        public static void main(String[] args) {
            sum(3,2);
            int result= sum(3,2);
            System.out.println(result);

            System.out.println(sum(2,6));//bu şekilde de yazabiliriz.
        }

        //Example 1--> toplama işlemi yapan bir method oluşturun.
            public static int sum(int a, int b ){//methodda işlenmesini istediğimiz dataları deklare ediyoruz
            return a+b;
    }
}
