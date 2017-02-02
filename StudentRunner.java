public class StudentRunner {

    public static void main(String[] args) {
        
        Student a = new Student("Lindsey", 17); 
        System.out.println(a);

        System.out.println("After birthday:");
        a.haveBirthday();

        System.out.println(a);
    }
}