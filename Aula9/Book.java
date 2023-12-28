package Aula9;

public class Book implements Publish {
	private String title;
	private Person author; //a person is an author
	private int totPag;
	private int currentPag;
	private boolean open;
	private Person reader; //the person reads the book
	
	public Book(String ti, Person aut, int tot, Person read) {
		this.title = ti;
		this.author=aut;
		this.totPag=tot;
		this.reader=read;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;

	}
	public int getTotPag() {
		return totPag;
	}
	public void setTotPag(int totPag) {
		this.totPag = totPag;
	}
	public int getCurrentPag() {
		return currentPag;
	}
	public void setCurrentPag(int currentPag) {
		this.currentPag = currentPag;
	}
	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}
	public Person getReader() {
		
		return reader;
	}
	public void setReader(Person reader) {
		this.reader = reader;
	}
	
	public void details() {
		System.out.println(reader.getName() +  " is reading the book " + this.getTitle() + " that was written by " + author.getName() + ".");
		System.out.println("The book has " + this.getTotPag() + " and the person is on page number " + this.getCurrentPag() + ".");
		
	}
	@Override
	public void open() {
		this.open = true;
		System.out.println(reader.getName() + " started reading the book.");
		
	}
	@Override
	public void close() {
		this.open=false;
		System.out.println(reader.getName() + " finished reading.");
		
	}
	@Override
	public void forward() {
		this.setCurrentPag(this.getCurrentPag() + 1);
		System.out.println(reader.getName() + " is now at page " + this.getCurrentPag() + ".");
		
	}
	@Override
	public void back() {
		this.setCurrentPag(this.getCurrentPag() - 1);
		System.out.println(reader.getName() + " is now at page " + this.getCurrentPag() + ".");
		
		
	}
	@Override
	public void turnPage() {
		System.out.println(reader.getName() + " is just checking out book " + this.getTitle() + ".");
		
		
	}
	

}
