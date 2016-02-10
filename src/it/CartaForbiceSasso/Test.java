package it.CartaForbiceSasso;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Computer computer = new Computer();
		Player player = new Player();
		boolean condition = false;
		
		System.out.println("Benveuto al gioco di carta, forbice, sasso:");
		do{
			System.out.println("**************************");
			System.out.println("Scegli la tua mossa");
			String playerChoice = sc.next();
			sc.close();
			player.addCountMatch();
			switch (playerChoice) {
			case "carta":
				if( computer.getChoiceComputer().equals("sasso")){
					System.out.println("Hai vinto contro "+ computer.getChoiceComputer());
					player.addCountWin();
				}else{
					if(computer.getChoiceComputer().equals("forbice")){
						System.out.println("Hai perso contro "+ computer.getChoiceComputer());
						player.addCountLose();
					} else{
						System.out.println("E' patta!");
						player.addCountTie();
					}
				}
				break;
			
			case "forbice":
				if( computer.getChoiceComputer().equals("carta")){
					System.out.println("Hai vinto contro "+ computer.getChoiceComputer());
					player.addCountWin();
				}else{
					if(computer.getChoiceComputer().equals("sasso")){
						System.out.println("Hai perso contro "+ computer.getChoiceComputer());
						player.addCountLose();
					} else{
						System.out.println("E' patta!");
						player.addCountTie();
					}
				}
				break;
			
			case "sasso":
				if( computer.getChoiceComputer().equals("forbice")){
					System.out.println("Hai vinto contro "+ computer.getChoiceComputer());
					player.addCountWin();
				}else{
					if(computer.getChoiceComputer().equals("carta")){
						System.out.println("Hai perso contro "+ computer.getChoiceComputer());
						player.addCountLose();
					} else{
						System.out.println("E' patta!");
						player.addCountTie();
					}
				}
				break;
			}
			System.out.println("**************************");
			System.out.println("Vuoi continuare a giocare?");
			String continueGame = sc.next();
			sc.close();
			if (continueGame.equalsIgnoreCase("no")) {
				condition = true;
				break;
			}
			System.out.println("**************************");
		}while(!condition);
		
		System.out.println("Ricapitolando.");
		System.out.println("Signorina Carta: bellissima, intelligentissima, la mia amante e arrapante");
		System.out.println("Hai giocato:"+player.getCountMatch()+" partite");
		System.out.println("Hai vinto:"+player.getCountWin()+" partite");
		System.out.println("Hai perso:"+player.getCountLose()+" partite");
		System.out.println("Hai pareggiato:"+player.getCountTie()+" partite");
	}

}
