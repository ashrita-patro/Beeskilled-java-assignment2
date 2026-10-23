class Student {

    private int rollNumber;
    private String name;
    private String course;

    // Constructor
    Student(int rollNumber, String name, String course) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
    }

    // Method to display student information
    void displayInfo() {
        System.out.println("----- Student Information -----");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student student = new Student(
            101,
            "Ashrita",
            "Java Programming"
        );

        student.displayInfo();
    }
}