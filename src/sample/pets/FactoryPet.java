package sample.pets;

public class FactoryPet {
    private static Pet pet;

    public static Pet createPet(String type) {
        if(type.equalsIgnoreCase("duck")) {
            pet = new Duck("Duck");
        } else if(type.equalsIgnoreCase("lion")) {
            pet = new Lion("Lion");
        } else if(type.equalsIgnoreCase("terminator")) {
            pet = new Terminator("Terminator");
        } else if(type.equalsIgnoreCase("homer")) {
            pet = new Homer("Homer");
        }
        return pet;
    }
}
