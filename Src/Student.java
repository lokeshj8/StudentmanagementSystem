public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private String register;

    public Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.register=register;
    }
    

    // Getters and Setters
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCourse() { return course; }
    public String getRegister(){return register;}
}
