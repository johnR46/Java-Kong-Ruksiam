 class Employee {
    // Attribute
    private String id;
    private String name;
    private double salary;

    // Default Constructor
    public Employee() {
        System.out.println(" I am Employee ");
    }

    public Employee(String name, Double salary) {

        this.name = name;
        this.salary = salary;
        displayEmployee();
    }

    // Method
    public void setId(String id) {
        this.id = id; // this ดึง private String id มาใช้

    }

    public void setName(String name) {
        this.name = name; // this ดึง private String name มาใช้
    }

    public void setSalary(Double salary) {
        this.salary = salary; // this ดึง private String name มาใช้
    }

    public void displayEmployee() {
      //  System.out.println("ID = " + this.id);
        System.out.println("Name = " + this.name);
        System.out.println("Salary = " + this.salary);

    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }
}