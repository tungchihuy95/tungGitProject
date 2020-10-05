


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AfterSaveEmployee {
    private static final String EMPLOYEE_FILE_NAME = "employee.txt";

    public void write(List<Person> employeeList) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File(EMPLOYEE_FILE_NAME));
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employeeList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fileOutputStream);
            closeStream(objectOutputStream);
        }
    }

    public List<Person> read() {
        List<Person> employeeList = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File(EMPLOYEE_FILE_NAME));
            objectInputStream = new ObjectInputStream(fileInputStream);
            employeeList = (List<Person>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            closeStream(fileInputStream);
            closeStream(objectInputStream);
        }
        return employeeList;
    }

    public void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}