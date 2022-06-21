
public class Person {
	private String name;
	private int age;
	public Person(){
		this("Anonymas",-1);
	}
	public  Person(String pname, int page) {
		name = pname;
		age = page;
	}
	public void print() {
		System.out.println("Name: "+ name +"\tAge: "+ age);
	}
	public static void main(String[] args) {
		Person p = new Person("polo", 21); // Object defination;
		//declaration  // instanation
		
		p.print();
		
		Person p2 = new Person();
		p2.print();
	}
}
