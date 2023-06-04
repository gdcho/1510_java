package comp1510tut;

public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alex" , "A102" , "faculty", 35, 90000); //constructor overloading, requires new parameters
        System.out.println(e1); //will print the reference
        System.out.println(e2);
        System.out.println(e1.toString()); //will print the string
        //String value default is null and integers is 0
        Employee e3 = e2; // (references to e2)
        e2.setAge(38);
        System.out.println(e2);
    }
}


// accessor_getter 
// public String getName(){
//      return name;
// }

// mutator_setter
// public void setName(string newName){
//      name = newName;
// }