package Aula7;

import java.util.Random;

public class Competition {
	//atribtues
	//lutador e' um tipo abstracto de dados (ie nao e' uma string ou boolean, pe)
	private Lutador challenged;
	private Lutador challenger;
	private int rounds;
	private boolean approved;
	
	//methods
	public void markFight(Lutador l1, Lutador l2) {
		//equals e' usado ao inves de ==
		if (l1.getCategory().equals(l2.getCategory()) && l1 != l2) {
			this.approved=true;
			this.challenger = l1;
			this.challenged = l2;
			System.out.println("The fight is scheduled.");
		} else {
			System.out.println("This is not approved.");
			this.approved=false;
			this.challenger = null;
			this.challenged = null;
		}
	}
	
	public void fight() {
		if (this.approved) {
			System.out.println("### CHALLENGED FIGHTER ###");
			this.challenged.show();
			System.out.println("### CHALLENGER FIGHTER ###");
			this.challenger.show();
			System.out.println("### WINNER ###");
			Random win_random = new Random();
			int winner = win_random.nextInt(3);
			switch(winner) {
			case 0: //tied
				System.out.println("Tied!");
				this.challenged.tied();
				this.challenger.tied();
				break;
			case 1: //Challenged is winner
				System.out.println(this.challenged.getName() + " IS WINNER ###");
				this.challenged.win();
				this.challenger.lose();
				break;
			case 2: //Challenger is winner
				System.out.println(this.challenger.getName() + " IS WINNER ###");
				this.challenged.lose();
				this.challenger.win();
				break; 
				
			}
		
			
			
		} else {
			System.out.println("This fight can't happen.");
		}
	}

	public Lutador getChallenged() {
		return challenged;
	}

	public void setChallenged(Lutador challenged) {
		this.challenged = challenged;
	}

	public Lutador getChallenger() {
		return challenger;
	}

	public void setChallenger(Lutador challenger) {
		this.challenger = challenger;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isApproved() {
		return approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}




}
