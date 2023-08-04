package pro.sky.HWcollections;

public class EmployeeService {
    Employee[] employees = new Employee[]{
            new Employee("Жан", "Рено"),
            new Employee("Люк", "Бессон")
    };

    public String getEmployeer(Integer number) {
        final Employee employeer;
        employeer = employees[number];
        final String emplPrint = " " + employeer.getFirstName()
                + " " + employeer.getLastName();
        return emplPrint;
    }
}
