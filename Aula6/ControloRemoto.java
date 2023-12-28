package Aula6;

public class ControloRemoto implements Controlador {
	
	private int volume;
	private boolean on;
	private boolean playing;
	
	//CONSTRUCT METHOD
	
	public ControloRemoto() {
		this.setVolume(50);
		this.setOn(false);
		this.setPlaying(false);
		
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean isOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	private boolean isPlaying() {
		return playing;
	}

	private void setPlaying(boolean playing) {
		this.playing = playing;
	}

	@Override
	public void on() {
		this.setOn(true);
		this.setPlaying(true);
		System.out.println("The TV is on!");
	}

	@Override
	public void off() {
		this.setOn(false);
		this.setPlaying(false);
		System.out.println("The TV is off!");
	}

	@Override
	public void openMenu() {
		if (this.isOn()) {
			System.out.println("The volume is: " + getVolume() + ".");
			for (int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("|");
			}		
		}
	}

	@Override
	public void closeMenu() {
		System.out.println("Closing the menu...");
		
		
	}

	@Override
	public void moreVolume() {
		if (this.isOn() && this.isPlaying() == true) {
			
			this.setVolume(this.getVolume() + 10);
			System.out.println("The volume is " + this.getVolume() + ".");
			for (int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("|");
			}	
		}
		
		
	}

	@Override
	public void lessVolume() {
		if (this.isOn() && this.isPlaying() == true) {
			
			this.setVolume(this.getVolume() - 5);
			System.out.println("The volume is " + this.getVolume() + ".");
		}
		
		
	}

	@Override
	public void onSilent() {
		if (this.isOn() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void offSilent() {
		if (this.isOn() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
		
	}

	@Override
	public void play() {
		if (this.isOn() && !(this.isPlaying())) {
			this.setPlaying(true);
		}
		
		
	}

	@Override
	public void pause() {
		if (this.isOn() && this.isPlaying()) {
			this.setPlaying(false);
		}
		
		
		
	}
	
}



