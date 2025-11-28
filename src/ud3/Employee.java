package ud3;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle){
        this.name = name;
        this.jobTitle = jobTitle;
        this.computeSalary();
    }

    public String getName(){
        return this.name;
    }

    public String getJobTitle(){
        return this.jobTitle;
    }
    
    public double getSalary(){
        return this.salary;
    }

    public void setJobTitle(String newJobTitle){
        this.jobTitle = newJobTitle;
    }

    public void setSalary(double newSalary){
        this.salary = newSalary;
    }

    public double computeSalary(){
        // double newSalary = 
        //     switch (this.getJobTitle()){
        //          case "agricultor" -> 10000;
        //           case "obrero" -> 10000;
        //           case "carpintero" -> 13000;
        //           case "pintor" -> 30000;
        //           default -> 0;
        //     };
        double newSalary = 0;
        switch (this.jobTitle) {
            case "agricultor":
                newSalary = 10000;
                break;
            case "obrero":
                newSalary = 10000;
                break;
            case "carpintero":
                newSalary = 13000;
                break;
            case "pintor":
                newSalary = 30000;
                break;
            default:
                newSalary = 0;
                break;
        }

        this.salary = newSalary;
        return this.salary;
    }

    public double computeSalary(String newJobTitle){
        this.setJobTitle(newJobTitle);
        return this.computeSalary();
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Paco", "carpintero");
        System.out.println(emp.name + " " + emp.jobTitle + " " + emp.salary);
        emp.computeSalary();
        System.out.println(emp.name + " " + emp.jobTitle + " " + emp.salary);
        emp.computeSalary("pintor");
        System.out.println(emp.name + " " + emp.jobTitle + " " + emp.salary);
    }


}
