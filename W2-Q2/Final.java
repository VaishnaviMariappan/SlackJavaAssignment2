public class Final
{
    public static void main(String[] args)
    {
        System.out.println("Employee Details: ");
        employee emp = new employee();
        emp.name="Avery";
        emp.age=18;
        emp.mobileno="9987652341";
        emp.address="6th Street,chennai";
        emp.printSalary(70000);
        emp.specialization("Front end");
        System.out.println("Name: "+emp.name+"\nAge: "+emp.age+"\nPhone number: "+emp.mobileno+"\nAddress: "+emp.address);

        manager man=new manager();
        System.out.println("\nManager Details: ");
        man.name="Jameson";
        man.age=19;
        man.mobileno="987653210";
        man.address="13th Street,chennai";
        man.specialization("Backend");
        man.Department("Software");
        man.printSalary(60000);

        System.out.println("Name: "+man.name+"\nAge: "+man.age+"\nPhone number: "+man.mobileno+"\nAddress: "+man.address);
    }
}
