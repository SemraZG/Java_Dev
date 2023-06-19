package staticKeyword;

public class StudentRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdName);
        //Student classdaki stdName variable ı static olduğu için o classdan obje uretmeden (class ismi . variable ismi(Student.stdName)) ile runner classdan kullanmıs olduk.

        Student student=new Student();
        System.out.println(student.age);
        //Student classdaki age variable ı non-static olduğu için onu kullanabilmek için önce student classdan obje olusturduk, sonra o obje uzerinden non-static variableri kullanabilidik.

        Student.staticmethod();
        student.nonStaticmethod();


    }
}
