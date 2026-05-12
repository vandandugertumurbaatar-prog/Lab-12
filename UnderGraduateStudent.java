class UnderGraduateStudent extends Student {
    public UnderGraduateStudent(String name, int[] test) {
        super(name, test);
    }

    public UnderGraduateStudent(UnderGraduateStudent target) {
        super(target);
    }

    @Override
    public Student clone() {
        return new UnderGraduateStudent(this);
    }

    @Override
    public String computeCourseGrade() {
        int s = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            s += getTestScore(i);
        }
        if (s / NUM_OF_TESTS >= 70) {
            courseGrade = "Passed";
        } else {
            courseGrade = "Failed";
        }
        return courseGrade;
    }
}