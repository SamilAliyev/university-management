package model;

public class Department {
    private String name;
    private String headOfDepartment;
    private int totalEmployees;
    private String location;

    public Department(String name, String headOfDepartment, int totalEmployees, String location) {
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.totalEmployees = totalEmployees;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public String getLocation() {
        return location;
    }

    
    public void addEmployee(int count) {
        if (count > 0) {
            totalEmployees += count;
        }
    }

    
    public String toString() {
        return "Department: " + name +
               "\nHead of Department: " + headOfDepartment +
               "\nTotal Employees: " + totalEmployees +
               "\nLocation: " + location + "\n";
    }

   
    public static void main(String[] args) {
       
        Department itDepartment = new Department("IT", "Dr. Smith", 50, "Building A");
        Department marketingDepartment = new Department("Marketing", "Ms. Johnson", 30, "Building B");

        
        System.out.println(itDepartment);
        System.out.println(marketingDepartment);

       
        itDepartment.addEmployee(5);
        System.out.println("After adding employees:");
        System.out.println(itDepartment);
    }
}
