
package practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class tryException {
	public static class Employee{
		

		int proj_id;
		String name;
		double salary;
		
		Employee(int id,String nm,double sal)
		{
			proj_id=id;name=nm;salary=sal;
		}
	
		@Override
		public String toString() {
			return "Employee [proj_id=" + proj_id + ", name=" + name + ", salary=" + salary + "]";
		}
		public int getProj_id() {
			return proj_id;
		}
		public void setProj_id(int proj_id) {
			this.proj_id = proj_id;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name ;
		}

		
		
	}
public static void main(String[] args)
{

	/* Remove duplicates from  List */
	List<Integer> arrl = new ArrayList<Integer>(Arrays.asList(1,2,2,4,3));
//	arrl = arrl.stream().distinct().collect(Collectors.toList());
	System.out.println(arrl);
	
	/* converting list to map with duplicate counts*/
	Map<Integer, Long> mp = new HashMap<Integer,Long>();
	mp = arrl.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(mp);
	
	/* convert list employees to map with employee corresponding projects */
	List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(1,"A",100.2),
			new Employee(2,"A",200.2),
			new Employee(1,"B",300.2),
			new Employee(2,"B",400.2),
			new Employee(3,"C",500.2)));
	empList.forEach(each -> System.out.println(each.getName()+" "+each.getProj_id() ));
	Map<String,List<Employee>> empMap = empList.stream().collect(Collectors.groupingBy(Employee::getName));
	System.out.println(empMap);
}
}
