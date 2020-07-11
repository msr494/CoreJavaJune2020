package hw5Q5Encapsulation01;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Tofael");
		employee.setAge(44);
		employee.setSex('M');
		employee.setUsCitizen(false);
		
		System.out.println(employee.getName()+" "+employee.getAge()+" "+employee.getSex()+" "+employee.isUsCitizen());

	}

}