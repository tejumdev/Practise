package Sample.DemoMaven;

import java.io.StringWriter;
import java.util.stream.StreamSupport;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONPointer;


public class JsonTest {
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
	System.out.println("hello world");
	JSONObject obj = new JSONObject();
	obj.put("a",3);
	obj.put("b",4);
	JSONArray arr = new JSONArray();
	arr.put(new Employee(1,"A",100.2));
	arr.put(new Employee(2,"A",200.2));
	arr.put(new Employee(2,"B",300.2));
	obj.put("c",arr);

	
	String JOSNString = obj.toString();
	
	System.out.println(JOSNString);
	
	/* converting json to string */
	obj= new JSONObject(JOSNString);
	arr = obj.getJSONArray("c");
	StreamSupport.stream(arr.spliterator(), false)
	  .forEach(System.out::println);
//	System.out.println(arr);
}
}
