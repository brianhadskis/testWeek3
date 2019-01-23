package theschool;

public class TheSchool {

    public static void main(String[] args) {
        
        Student s1 = new Student(100);
        Student [] theMany = new Student[3];
        
        theMany[0] = s1;
        theMany[1] = new Student("Bob", 101);
        theMany[2] = new Student("Wilma", 102);
        
        s1.setName("Fred");
        
        System.out.println(s1.getName());
        
        for (int i = 0; i < theMany.length; i++) {
            System.out.println(theMany[i].getNumber() + ": " + theMany[i].getName());
        }
        
    }
    
}
