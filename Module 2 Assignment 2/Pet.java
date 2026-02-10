public class Pet {
    private String name;

    public Pet() {
        setName("Pet Name");
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // toString
    public String toString() {
        String result = "Pet information:\n";
        result += "Name: " + name;
        return result;
    }

    // Main Section
    public static void main(String[] args) {
        Pet pet = new Pet();
        System.out.println(pet.toString());
        System.out.println();

        // Pet 2
        Pet pet2 = new Pet();
        pet2.setName("Tez");
        System.out.println(pet2.toString());
    }
}