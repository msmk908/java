package ch08.sec11.exam02;

public class AnimalCryExample {

	public static void main(String[] args) {
		CryAnimal cr = new CryAnimal();
		
		Dock dock = new Dock();
		Cow cow = new Cow();
		Dak dak = new Dak();
		
		cr.CryAnimal(dock);
		cr.CryAnimal(cow);
		cr.CryAnimal(dak);

	}

}
