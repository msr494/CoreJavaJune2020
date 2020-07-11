package hw5Q3Constructor02;

public class TestStudent {

	public static void main(String[] args) {
		System.out.println("\n..................................................................................\n");
		Student student1 = new Student();
		System.out.println("\n..................................................................................\n");
		Student student2 = new Student("Tofael", 483, 'M', false, 3.8954f);
		System.out.println("\n..................................................................................\n");
		Student student3 = new Student();
		student3.student("Kabir", 518, 'M', true, 3.8954f);
		System.out.println("\n..................................................................................\n");

	}

}