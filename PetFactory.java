class PetFactory {
    public static Pet createPet(String type) {
        if ("Dog".equals(type)) {
            return new Dog();
        }
        if ("Cat".equals(type)) {
            return new Cat();
        }
        if ("Bird".equals(type)) {
            return new Bird();
        }
        throw new IllegalArgumentException("Unknown pet type");
    }
}
