
public class Book {
	protected String title;
	
	protected static boolean sta=false;

	public Book() {

	}

	public Book(String title) {

		this.title = title;
	}

	public void status() {
		System.out.println("Book Title\t:"+title);
		if(sta==false)
			System.out.println(title+"is available");
		
	}
	public void issued() {
		sta=true;
		System.out.println(title+"is issued");
	}
	public void returned() {
		sta=false;
		System.out.println(title+" is returned");
	}
}
