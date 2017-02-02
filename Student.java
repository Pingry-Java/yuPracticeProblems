public class Student { 

    private String name; 
    private int age; 
    private static int oldestStudent; 

    //constructor 

    public Student() {
        this.name = "Lindsey";
        this.age = 17;
        oldestStudent = 20; }
    
    public Student(String name) {
        this.name = name; 
        this.age = 17; 
        oldestStudent = 20; }

    public Student(String name, int age) {
        this.name = name; 
        this.age = age; 
        oldestStudent = 20;
    }

    public Student(int age) {
        this.name = "Lindsey";
        this.age = age; 
        oldestStudent = 20;
    }


    //accessor  
    public String getName() {
        return name; }

    public int getAge() {
        return age; }

    public void haveBirthday() {
        this.age ++; 

    }

    public String toString() {
        return ("Name: " + name + " Age: " + age); 
    }

}