package com.company;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
	// write your code here
        LocalDate birth = LocalDate.of(1366,5,27);
        Pet gecko = new Pet("Spotted", "Lizard Man",birth);
        System.out.println(gecko.getDateOfBirth());
        System.out.println(gecko.getName() + " is a " + gecko.getBreed() + " gecko");
        System.out.println(gecko.getAge() + " years old");
        System.out.println(gecko.NeedsRestraint());

        Pet chicken = new Pet(Pet.typeOfAnimal.CHICKEN);
        chicken.setBreed("Silver Laced Barnevelder");
        chicken.setName("Boba Fett");
        System.out.println(chicken.getName() + " is a " + chicken.getBreed() + " chicken");
        
    }
}
