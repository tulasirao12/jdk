
public class Member extends Book {
	private String name;

	public Member() {
	
	}

	public Member(String title,String name) {
		super(title);
		this.name=name;
		
	}

	@Override
	public void status() {
		super.status();
		if(sta==true)
			System.out.println(title+"is issued for "+name);
	}

	
}
