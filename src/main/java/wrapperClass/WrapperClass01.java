package wrapperClass;

public class WrapperClass01 {
    public static void main(String[] args) {
        /**
         * primitive-->    char-boolean-byte-short-int-long-float-double
         * Wrapper Class-->Character-Boolean-Byte-Short-Integer-Long-Float-Double
         * Wrapper classlar non-primitividir bu yüzden memoryde çok yer kaplarlar
         * dolayısıyla şart değilse wrapper class kullanmayı tercih etmeyiz.
         * wrapper classlar non-primitive olduğu için aktif özellik yani method içerirler,
         * primitiveler method içermez.
         * */
        //short data type nın min ve max değerlerini bulun.
        short maxShort = Short.MAX_VALUE;
        System.out.println("maxShort = " + maxShort);
        short minShort = Short.MIN_VALUE;
        System.out.println("minShort = " + minShort);

        //int data type nın min değeri ile byte data type nın max değerleri toplamını bulun.
        int minInt = Integer.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        //primitive int i Wrapper Integer a çeviriniz--->AutoBoxing
        int num=19;
        Integer wrapperNum=num;

        //Wrapper Byte i primitive byte a çeviriniz--->UnBoxing
        Byte k=19;
        byte primitiveK=k;



    }
}
