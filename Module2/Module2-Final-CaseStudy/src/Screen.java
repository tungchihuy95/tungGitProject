import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;
import static java.nio.file.Files.delete;

public class Screen<Employees> extends JFrame {

    private JPanel panelMain;
    private JTabbedPane tabbedPane1;
    private JPanel fix;

    private JPanel namefield;
    private JPanel yearfield;
    private JPanel genderfield;
    private JPanel fromfield;
    private JPanel phonefield;
    private JPanel emailfield;
    private JPanel edufield;
    private JPanel deptfield;
    private JPanel wagefield;

    private JLabel HRname;
    private JLabel HRyear;
    private JLabel HRgender;
    private JLabel HRfrom;
    private JLabel HRphone;
    private JLabel HRemail;
    private JLabel HRedu;
    private JLabel HRdept;
    private JLabel HRwage;

    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textName;
    private JTextField textID;
    private JTextField textYear;
    private JTextField textGender;
    private JTextField textFrom;
    private JTextField textPhone;
    private JTextField textEmail;
    private JTextField textEdu;
    private JTextField textDept;
    private JTextField textWage;

    private JButton ADDNEW1;
    private JButton SAVEEXIST1;


    private JButton searchButton;

    private JButton DELETEButton;
    private JButton DELETEButton1;
    private JButton DELETEButton2;
    private JButton DELETEButton3;
    private JButton DELETEButton4;
    private JButton DELETEButton5;

    private JLabel MNname;
    private JLabel MNyear;
    private JLabel MNgender;
    private JLabel MNfrom;
    private JLabel MNphone;
    private JLabel MNemail;
    private JLabel MNedu;
    private JLabel MNdept;
    private JLabel MNwage;

    private JTable table1;
    private JButton ADDNEW;
    private JButton SAVEEXIST;


    private JList<String> mainList;
    private JList MNlist;
    private JList saleList;
    private JList mktList;
    private JList accList;
    private JList itList;
    private JButton ADDNEW6;
    private JButton SAVEEXIST6;
    private JButton DELETEButton6;
    private JButton ADDNEW2;
    private JButton SAVEEXIST2;
    private JButton ADDNEW3;
    private JButton SAVEEXIST3;
    private JButton ADDNEW4;
    private JButton SAVEEXIST4;
    private JButton ADDNEW5;
    private JButton SAVEEXIST5;
    private JList HRList;


    private ArrayList<Person> people;

    private List<Person> personList;

    private DefaultListModel listPeopleModel;
    private ArrayList<Person> employees;


    Screen() {
        super("Employee Management");
        this.setContentPane(this.panelMain);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        people = new ArrayList<Person>();
        listPeopleModel = new DefaultListModel();
        mainList.setModel(listPeopleModel);
        SAVEEXIST6.setEnabled(false);

//        EXITButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                AfterSaveEmployee storage = new AfterSaveEmployee();
//                storage.write(people);
//            }
//        });

        ADDNEW6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newAdd(e);
                AfterSaveEmployee storage = new AfterSaveEmployee();
                storage.write(people);
            }
        });

        SAVEEXIST6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                existSave(e);
                AfterSaveEmployee storage = new AfterSaveEmployee();
                storage.write(people);
            }
        });
        DELETEButton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//               delete(e);
//                AfterSaveEmployee storage = new AfterSaveEmployee();
//                storage.write(people);
            }
        });

        mainList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                mainListSelection(e);
            }
        });

    }
//    public void delete(ActionEvent e) {
//       int employeeID = mainList.();
//    }


    public void newAdd(ActionEvent e) {
        Person person = new Person(
                textName.getText(),
                textID.getText(),
                textYear.getText(),
                textGender.getText(),
                textFrom.getText(),
                textPhone.getText(),
                textEmail.getText(),
                textEdu.getText(),
                textDept.getText(),
                textWage.getText()

        );
        people.add(person);

        refreshPeopleList();
    }

    public void existSave(ActionEvent e) {
        int employeeID = mainList.getSelectedIndex();
        if (employeeID >= 0) {
            Person person = people.get(employeeID);
            person.setName(textName.getText());
            person.setID((textID.getText()));
            person.setYear(textYear.getText());
            person.setGender(textGender.getText());
            person.setFrom(textFrom.getText());
            person.setPhone(textPhone.getText());
            person.setEmail(textEmail.getText());
            person.setEdu(textEdu.getText());
            person.setDept(textDept.getText());
            person.setWage(textWage.getText());
            refreshPeopleList();
        }
    }

    public void delete(ActionEvent e) {
//        String profile = (String) mainList.getSelectedValue();
//        String id = profile.substring(0,3);
//        System.out.println(id);
//
//        System.out.println(people);
//        Person p = new Person();
//        for (Person person : people) {
//            if (person.getId().equals(id)) {
//                p = person;
//            }
//        }
//        people.remove(p);
//        System.out.println(people);
//
//        refreshPeopleList();

//        people.remove()
//        Person person =null;
//        int size=employees.size();
//        for (int i=0;i<size;i++) {
//        }
//        if (person!=null) {
//            employees.remove(person);
//            EmployeeManager.write(employees);
//            System.out.println("Delete completed!");
//        } else {
//            System.out.println("This employee's ID: "+ e +" is not existed in List.");
//        }
    }

    public void mainListSelection(ListSelectionEvent e) {
        int employeeID = mainList.getSelectedIndex();
        if (employeeID >= 0) {
            Person person = people.get(employeeID);
            textName.setText(person.getName());
            textID.setText(person.getId());
            textYear.setText(person.getYear().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            textGender.setText(person.getGender());
            textFrom.setText(person.getFrom());
            textPhone.setText(person.getPhone());
            textEmail.setText(person.getEmail());
            textEdu.setText(person.getEdu());
            textDept.setText(person.getDept());
            textWage.setText(person.getWage());
            SAVEEXIST6.setEnabled(true);
        } else {
            SAVEEXIST6.setEnabled(false);
        }
    }


    public void refreshPeopleList() {
        listPeopleModel.removeAllElements();
        System.out.println("Remove all people from list");
        for (Person person : people) {
            System.out.println("Adding Employee to list:" + " " + person.getId() + person.getName() + " " + "-----" + person.getDept() );
            listPeopleModel.addElement(person.getId() + " " + person.getName() + " " + "-----" + person.getDept());

        }
    }


    public static void main(String[] args) {
        Screen sr;
        sr = new Screen();
        sr.setVisible(true);

        Color color = new Color(80, 10, 5);

        sr.getContentPane().setBackground(Color.pink);

//        Person Tung = new Person("NGUYEN QUOC TUNG","001", "19/02/1995", "Male", "Hung yen", "0985671295", "tunghaha@gmail.com", "University", "MN", "100,000,000");
//        Person Quan = new Person("LE HONG QUAN", "002", "20/06/1995", "Male", "Hoa binh", "0992771295", "quankun@gmail.com", "University", "HR", "100,000,000");
//        Person Huy = new Person("TRINH VAN HUY","003", "04/05/1995", "Male", "Nghe an", "0985671295", "hitachi@gmail.com", "College", "Sale", "100,000,000");
//        Person Thuy = new Person("LE THI THUY","004", "25/11/1988", "Female", "Thanh hoa", "0985671295", "thuythuy@gmail.com", "University", "MKT", "100,000,000");
//        Person Trang = new Person("PHAM THUY TRANG","005", "31/12/1993", "Female", "Quang ninh", "0985671295", "trangtrong@gmail.com", "Master", "ACC", "100,000,000");
//        Person Binh = new Person("PHAM THANH BINH","006", "11/06/1994", "Male", "Hung yen", "0985671295", "tunghaha@gmail.com", "University", "MN", "100,000,000");
//        Person Dung = new Person("NGUYEN HANH DUNG", "007", "24/04/1997", "Male", "Hoa binh", "0992771295", "quankun@gmail.com", "University", "HR", "100,000,000");
//        Person Tuyen = new Person("PHAM DANG TUYEN","008", "12/11/1995", "Male", "Nghe an", "0985671295", "hitachi@gmail.com", "College", "Sale", "100,000,000");
//        Person Vinh = new Person("NGUYEN QUANG VINH","009", "09/10/1999", "Female", "Thanh hoa", "0985671295", "thuythuy@gmail.com", "University", "MKT", "100,000,000");
//        Person Phuong = new Person("TRINH MAI PHUONG","010", "31/12/1993", "Female", "Quang ninh", "0985671295", "trangtrong@gmail.com", "Master", "ACC", "100,000,000");
//        Person Hai = new Person("DAO NGOC HAI","011", "19/02/1995", "Male", "Hung yen", "0985671295", "tunghaha@gmail.com", "University", "MN", "100,000,000");
//        Person Tuan = new Person("TIEU MINH TUAN", "012", "20/06/1995", "Male", "Hoa binh", "0992771295", "quankun@gmail.com", "University", "HR", "100,000,000");
//        Person Quang = new Person("CHU VAN QUANG","013", "04/05/1995", "Male", "Nghe an", "0985671295", "hitachi@gmail.com", "College", "Sale", "100,000,000");
//        Person Khue = new Person("NGUYEN MINH NGOC KHUE","014", "25/11/1988", "Female", "Thanh hoa", "0985671295", "thuythuy@gmail.com", "University", "MKT", "100,000,000");
//        Person Hieu = new Person("NGUYEN TRUNG HIEU","015", "31/12/1993", "Female", "Quang ninh", "0985671295", "trangtrong@gmail.com", "Master", "ACC", "100,000,000");
//        Person Trung = new Person("HOANG VAN TRUNG","016", "19/02/1995", "Male", "Hung yen", "0985671295", "tunghaha@gmail.com", "University", "MN", "100,000,000");
//        Person Nam = new Person("NGUYEN DONG NAM", "017", "20/06/1995", "Male", "Hoa binh", "0992771295", "quankun@gmail.com", "University", "HR", "100,000,000");
//        Person Anh = new Person("TRAN HUY ANH","018", "04/05/1995", "Male", "Nghe an", "0985671295", "hitachi@gmail.com", "College", "Sale", "100,000,000");
//        Person Nguyen = new Person("VU KHAC NGUYEN","019", "25/11/1988", "Female", "Thanh hoa", "0985671295", "thuythuy@gmail.com", "University", "MKT", "100,000,000");
//        Person Hoa = new Person("LUONG THI HOA","020", "31/12/1993", "Female", "Quang ninh", "0985671295", "trangtrong@gmail.com", "Master", "ACC", "100,000,000");
//
//
//
//        sr.addPerson(Tung);
//        sr.addPerson(Quan);
//        sr.addPerson(Huy);
//        sr.addPerson(Thuy);
//        sr.addPerson(Trang);
//        sr.addPerson(Binh);
//        sr.addPerson(Dung);
//        sr.addPerson(Tuyen);
//        sr.addPerson(Vinh);
//        sr.addPerson(Phuong);
//        sr.addPerson(Hai);
//        sr.addPerson(Tuan);
//        sr.addPerson(Quang);
//        sr.addPerson(Khue);
//        sr.addPerson(Hieu);
//        sr.addPerson(Trung);
//        sr.addPerson(Nam);
//        sr.addPerson(Anh);
//        sr.addPerson(Nguyen);
//        sr.addPerson(Hoa);

        // Read data from employee.txthe

        AfterSaveEmployee storage = new AfterSaveEmployee();
        sr.people = (ArrayList<Person>) storage.read();
        sr.refreshPeopleList();
    }
}




