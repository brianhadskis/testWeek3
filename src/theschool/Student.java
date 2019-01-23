package theschool;

public class Student {
    
    private String name;
    private int number;
    
    public Student(int number) {
        this.name = "John";
        this.number = number;
    }
    
    public Student(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return this.number;
    }
    
}
