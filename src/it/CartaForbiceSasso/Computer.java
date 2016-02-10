package it.CartaForbiceSasso;

import java.util.Random;

public class Computer {
	
	String choiceComputer[] = {"carta", "forbice", "sasso"};
	Random rnd = new Random();
	int indexRandom = rnd.nextInt(3);
	
	public String getChoiceComputer() {
		return choiceComputer[indexRandom];
	}
	
	
	
}
