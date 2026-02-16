import java.util.Scanner;

 // Main
class Runner {
    public static void main(String[] args) {
       // Pet Temp
        Pet pet = new Pet();
        System.out.println(pet.toString());
        System.out.println();

        // Pet 2
        Pet pet2 = new Pet("Tez", "Dog", 3);
        System.out.println(pet2.toString());

        // User Inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal type:");
        String AnimalType = input.nextLine();

        System.out.println("Enter animal name:");
        String AnimalName = input.nextLine();

        System.out.println("Enter animal age:");
        int AnimalAge = input.nextInt();

        // Custom Pet
        Pet pet3 = new Pet(AnimalName, AnimalType, AnimalAge);
        System.out.println(pet3.toString());
        input.close();

    }
}