public class Main3 {
    public static void main(String[] args) {
        
        int[] scores = {90, 80, 70};
        UnderGraduateStudent s1 = new UnderGraduateStudent("Saruul", scores);
        
        UnderGraduateStudent s2 = (UnderGraduateStudent) s1.clone();
        s2.setName("Temuulen");

        System.out.println("Original Student Name: " + s1.getName());
        System.out.println("Cloned Student Name: " + s2.getName());
        
        if (s1 != s2) {
            System.out.println("Result: Success! Cloned object has a different memory address.");
        }
    }
}
