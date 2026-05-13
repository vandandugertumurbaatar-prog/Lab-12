public class Main2 {
    public static void main(String[] args) {
        
        Pet p1 = PetFactory.createPet("Dog");
        Pet p2 = PetFactory.createPet("Cat");
        Pet p3 = PetFactory.createPet("Bird");

        System.out.println("p1 is a " + p1.getClass().getSimpleName() + ": " + p1.speak());
        System.out.println("p2 is a " + p2.getClass().getSimpleName() + ": " + p2.speak());
        System.out.println("p3 is a " + p3.getClass().getSimpleName() + ": " + p3.speak());
    }
}
