class GraduateStudent extends Student {
    public GraduateStudent(String name, int[] test) {
        super(name, test);
    }

    public GraduateStudent(GraduateStudent target) {
        super(target);
    }

    @Override
    public Student clone() {
        return new GraduateStudent(this);
    }

    @Override
    public String computeCourseGrade() {
        int s = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            s += getTestScore(i);
        }
        if (s / NUM_OF_TESTS >= 80) {
            courseGrade = "Passed";
        } 
        else {
            courseGrade = "Failed";
        }
        return courseGrade;
    }
}