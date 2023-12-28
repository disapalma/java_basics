package Aula5a;

public class ContaBanco {
	public String numAccount;
	protected String type;
	private String owner;
	private float balance;
	private boolean status;
	
	//CONSTRUCTOR
	
	public ContaBanco() {
		this.setStatus(false);
		this.setBalance(0);
		
	}
	
	//METODOS ESPECIAIS

	public String getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	//METODOS
	
	public void openAcc(String numAccount, String type, String owner) {
		this.setNumAccount(numAccount);
		this.setType(type);
		this.setOwner(owner);
				
		if (this.type == "cc") {
			this.setBalance(50);
		} else if (this.type == "cp") {
			this.setBalance(20);
		} else {
			System.out.println("Error. Try again.");
		}
		this.status = true;
		System.out.println("Hello, " + this.getOwner() + ". The account is now opened.");
			
	}
	
	public void closeAcc() {
		if (this.getBalance() == 0) {
			this.status = false;
			System.out.println("We're sorry to see you leave, " + this.getOwner() + "! Your account is now closed.");
		} else {
			System.out.println("Sorry, we cannot go forward with your request. You must have your account's balance set to zero.");
			System.out.println("Currently, your account's balance is " + this.getBalance() + ".");
		}
	}
	
	public void deposit(float des) {
		if (this.status == true) {
			this.setBalance(this.getBalance() + des);
			System.out.println("Your status is now: " + this.getBalance());
		} else {
			System.out.println("The account is not open. Open an account to be able to do this action.");
		}
		
	}
	
	public void withdraw(float take) {
		if (status == true) {
			float total_balance = this.getBalance() - take;
			if (total_balance > 0) {
				float final_balance = this.getBalance() - take;
				this.setBalance(final_balance);
				System.out.println("Your final balance is: " + final_balance);
			} else {
				System.out.println("You are BROKE. You cannot take that ammount.");
			}
		} else {
			System.out.println("Account not opened.");
		}
	}
	
	public void payMonth() {
		//automatic payment
		if (status == true) {
			if (type == "cc") {
				this.withdraw(12);
				
			} else {
				this.withdraw(20);
			}
		} else {
			System.out.println("The account does not exist.");
		}
		
	}
	
	public void status() {
		if (status == true) {
			System.out.println("Welcome! " + this.getOwner());
			System.out.println("Your balance is: " + this.getBalance() + ".");
		} else {
			System.out.println("Your account does not exist.");
		}
		
	}
	
	
	
}


