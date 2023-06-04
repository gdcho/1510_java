/**
 * 
 */
package comp1510tut;

/**
 * @author David
 *
 */
public class Employee {
    private String name;
    private String id;
    private String jobTitle;
    private int age;
    private int salary;
    
    public Employee() { //default constructor; no argument constructor
        name = "John Doe";
        id = "A0101";
        jobTitle = "Java Developer";
        age = 20;
        salary = 100000;
    }
    
    public Employee(String newName, String newId, String job, int newAge, int sal) {
        name = newName;
        id = newId;
        jobTitle = job;
        age = newAge;
        salary = sal;
    }
    
    //
    public String getname() {
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int newAge) {
        age = newAge;
    }
    //
    
    public String toString() {
        return name + " " + id + " " + jobTitle + " " + age + " " + salary;
    }
}
