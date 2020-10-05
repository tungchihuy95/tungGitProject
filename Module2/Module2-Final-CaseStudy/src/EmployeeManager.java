import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class EmployeeManager {
    private ArrayList<Person> employees;

//    public ArrayList<Person> getEmployees() {
//        return employees;
//    }

    public ArrayList<Person> search(String keywords) {
        // duyet employees, filter by keywords
        // @todo ve code
        return employees;
    }

//    public void addNew(Person employees) {
//        this.employees.add(employees);
//    }



//    public void update(String id, Person employees) {
//        for (int i = 0; i < this.employees.size(); i++) {
//            if (employees.getId() == id) {
//                this.employees.set(i, employees);
//            }
//        }
//    }
//
//    public void delete(String id, Person employee) {
//        for (int i = 0; i <= ArrayList.size(); i++) {
//            if (ArrayList = id) {
//                this.employees.remove(i);
//            }
//        }
//    }
    // for arraylist employees
    //   if employee.getId() == id
    //      employees.remove(i)


    // Click tab nao thi tryen department cua tab do
    // Sau do goi ham show data len mainList cua cai tab do

    public void delete(ActionEvent e) {

    }
//        Person person =null;
//        int size=employees.size();
//        for (int i=0;i<size;i++) {
//            if (employees.get(i).getId().equals(e)) {
//                person = employees.get(i);
//                break;
//            }
//        }
//        if (person!=null) {
//            employees.remove(person);
//            EmployeeManager.write(employees);
//            System.out.println("Delete completed!");
//        } else {
//            System.out.println("This employee's ID: "+ e +" is not existed in List.");
//        }
//    }

    static void write(ArrayList<Person> employees) {
    }

    public ArrayList<Person> filterByDepartment(DepartmentEnum department) {
        ArrayList<Person> results = new ArrayList<Person>();
        for (Person employees : this.employees) {
            if (employees.getDepartment() == department) {
                results.add(employees);
            }
        }
        return results;
    }
}
