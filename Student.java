public class Student {
    protected String name;
    protected static final int NUM_OF_TESTS = 3;
    protected int[] test = new int[NUM_OF_TESTS];
    protected String courseGrade;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name, int[] test) {
        this.name = name;
        this.test = test;
    }

    public Student(Student target) {
        if (target != null) {
            this.name = target.name;
            this.courseGrade = target.courseGrade;
            if (target.test != null) {
                this.test = target.test.clone();
            }
        }
    }

    public Student clone() {
        return new Student(this);
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 
    }
    public int getTestScore(int i) { 
        return test[i]; 
    }
    public void setTestScore(int i, int score) { 
        test[i] = score; 
    }

    public String computeCourseGrade() {
        return "Course Grade";
    }
}