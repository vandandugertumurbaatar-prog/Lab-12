class PetFactory {
    public static Pet createPet(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        if ("Cat".equalsIgnoreCase(type)) {
            return new Cat();
        }
        if ("Bird".equalsIgnoreCase(type)) {
            return new Bird();
        }
        throw new IllegalArgumentException("Unknown pet type");
    }
}