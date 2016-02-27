package animal;

import java.util.ArrayList;

public class AnimalFacade {
	
	public void requestMyAnimalToCry(){
		ArrayList<Animal> myAnimals = new ArrayList<Animal>();
		Animal cat1 = new Cat();
		Animal cat2 = new Cat();
		Animal cat3 = new Cat();
		Animal cat4 = new Cat();
		Animal dog1 = new Dog();
		Animal dog2 = new Dog();
		
		myAnimals.add(cat1);
		myAnimals.add(cat2);
		myAnimals.add(dog1);
		myAnimals.add(cat3);
		myAnimals.add(dog2);
		myAnimals.add(cat4);
		
		for(Animal animal : myAnimals){
			System.out.println(animal.cry());
		}
	}
}
