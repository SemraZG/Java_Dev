package methodCreation;

public class MethodCreation01 {

        /**
         * Javada method nasıl oluşturulur?
             1-main methodun dışında ama class ın içinde oluşturulur.
             2-Access Modifier + return type + method ismi + () + {method body}

         *Oluşturulan methodlar nasıl kullanılır?
            Kullanılmak istenen method main methodun içinde çağrılarak kullanılır.

         ** main method static olduğu için, main methodun içinden çağıracağımız method da static olmalıdır.

         method name + parametreler = method signature

         */

        public static void main(String[] args) {
            sum(3,2);
            int result= sum(3,2);
            System.out.println(result);
            System.out.println(sum(2,6));//bu şekilde de yazabiliriz.

            long result2=multiply(5,12);
            System.out.println(result2);

            System.out.println(firstTwoMultiplyThirdAdd(2,3,4));

            System.out.println(dortgenAlanı(3,10));
            System.out.println(dortgenCevresi(3,10));
            System.out.println(getCube(3.2));
        }

        //Example 1--> 2 sayıyı toplayan bir method oluşturun.
            public static int sum(int a, int b ){//methodda işlenmesini istediğimiz dataları deklare ediyoruz
            return a+b;
    }

        //Example 2--> 2 sayıyı çarpan bir method oluşturun
            protected static long multiply(int a, int b){
            return a*b;}

        //Example 3--> verilen 3 sayıdan ilk ikisini çarpan ve sonucu 3. sayı ile toplayan bir method oluşturun.
            private static int firstTwoMultiplyThirdAdd(int a, int b, int c){
            return a*b+c;}

            //Bir dörtgenin alanını hesaplayan method oluşturun.
                static double dortgenAlanı(int a, int b){
                return a*b;
                }

            //Bir dörtgenin çevresini hesaplayan method oluşturun.
                public static int dortgenCevresi(int a, int b){
                return 2*(a+b);
                }

            //Verilen bir ondalık sayının kupunu hesaplayan bir method oluşturun.
                static double getCube(double a){
                return a*a*a;
                }
    }

