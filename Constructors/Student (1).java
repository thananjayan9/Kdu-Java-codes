class Student {
    private String name;
    private int age;
    private char grade;

    // Default constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 'N';
    }

    // Parameterized constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Constructor with default grade 'N'
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}