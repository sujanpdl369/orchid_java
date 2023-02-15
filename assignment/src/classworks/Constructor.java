package classworks;

public class Constructor {
	public static void main(String [] args) {
		Student s1 = new Student();
		Student s2 = new Student(2,"Ram","CS");
		s1.display();
		s2.display();
	}

}


class Student{
	int reg_no;
	String name, stream;
	
	Student(){
		reg_no = 0;
		name = "";
		stream = "";
	}
	Student(int reg_no, String name, String stream){
		this.reg_no = reg_no;
		this.name = name;
		this.stream = stream;
	}
	
	void display() {
		System.out.println("Regsitration number :"+this.reg_no);
		System.out.println("Name :"+this.name);
		System.out.println("Stream :"+this.stream);
	}
}
