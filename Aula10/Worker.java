package Aula10;

public class Worker extends Pessoa {
	private String area;
	private boolean work;
	
	
	public void changeJob() {
		this.work =! this.work;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public boolean isWork() {
		return work;
	}


	public void setWork(boolean work) {
		this.work = work;
	}

	
	
	
	
}
