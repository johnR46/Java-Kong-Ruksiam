public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(); // Create Object

        e1.setId("1");
        e1.setName("John Nonphala");
        e1.setSalary(30000.32);
        
        System.out.println("ID = "+ e1.getId());

        System.out.println("NAME = "+ e1.getName());

        System.out.println("SALARY = "+ e1.getSalary());

       // e1.displayEmployee();

        Employee e2 = new Employee(); // Create Object

        e2.setId("2");
        e2.setName("Bancha Nonphala");
        e2.setSalary(40000.32);
       // e2.displayEmployee();

        // System.out.println("ID = "+ e1.id);

        // System.out.println("NAME = "+ e1.name);

        // System.out.println("SALARY = "+ e1.salary);

        System.out.println("ID = "+ e2.getId());

        System.out.println("NAME = "+ e2.getName());

        System.out.println("SALARY = "+ e2.getSalary());
    }
}