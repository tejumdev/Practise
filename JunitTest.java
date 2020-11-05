package Sample.DemoMaven;

import static org.junit.Assert.assertTrue;

import org.json.JSONArray;
import org.junit.Assert;
import org.junit.Test;

import Sample.DemoMaven.JsonTest.Employee;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
//        assertTrue( true );
    	JsonTest jstest = new JsonTest();
    	JSONArray arr = new JSONArray();
    	arr.put(new Employee(1,"A",100.2));
    	arr.put(new Employee(2,"A",200.2));
    	arr.put(new Employee(2,"B",300.2));
    	Assert.assertEquals(jstest.numberOfItems(arr), arr.length());

    }
}
