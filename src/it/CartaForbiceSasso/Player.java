package it.CartaForbiceSasso;

public class Player {
	
	public Player() {
		super();
	}
	
	private int countMatch;
	private int countWin;
	private int countLose;
	private int countTie;
	
	public int getCountMatch() {
		return countMatch;
	}
	public void addCountMatch() {
		this.countMatch = this.countMatch +1;
	}
	public int getCountWin() {
		return countWin;
	}
	public void addCountWin() {
		this.countWin = this.countWin +1;
	}
	public int getCountLose() {
		return countLose;
	}
	public void addCountLose() {
		this.countLose = this.countLose +1;
	}
	public int getCountTie() {
		return countTie;
	}
	public void addCountTie() {
		this.countTie = this.countTie +1;
	}
	
	
}
