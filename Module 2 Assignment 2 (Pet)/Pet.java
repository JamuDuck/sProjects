public class Pet {
    private String name;
    private String type;
    private int age;

    // DC
    public Pet() {
        setName("Pet Name");
        setType("Type");
        setAge(1);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    // CC
public Pet(String newName, String newType, int newAge) {
    setName(newName);
    setType(newType);
    setAge(newAge);
        }

        // Pet Noise
        public String speak() {
        if(type.equalsIgnoreCase("Dog")) {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("Cat")) {
            return "Meow";
        }
        else {
            return "Yowl";
        }
    }

    // toString
    public String toString() {
        String result = "Pet information:\n";
        result += "Type: " + type + "\n";
        result += "Name: " + name + "\n";
        result += "Sound: " + speak() + "\n";
        result += "Age: " + age;
        return result;
    }
}