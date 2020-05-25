package solid;

import java.util.ArrayList;
import java.util.List;

class EmployeesList {

	public List<String> names = new ArrayList<>();

	private int index = 1;

	public void addEmployee(String name) {
		names.add(index + "." + name);
		index++;
	}

	public void removeEmployee(int index) {
		names.remove(index);
	}
}

class PrintData {
	public void print(List data) {
		data.forEach(System.out::println);
	}
}

public class SingleResponsibility {

	public static void main(String[] args) {

		System.out.println("Single responsibilty principle");

		System.out.println("Employee class wont do anything other then adding or removing employee");
		EmployeesList employeesList = new EmployeesList();
		employeesList.addEmployee("one");
		employeesList.addEmployee("two");
		employeesList.addEmployee("three");

		System.out.println("Print data can be in employee, but its not its concern, so its movd to new class");
		PrintData printData = new PrintData();
		printData.print(employeesList.names);

	}

}
