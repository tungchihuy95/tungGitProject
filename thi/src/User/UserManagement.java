package User;

import model.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManagement implements IUser<User> {

   static List<User> users;
   static User user;

   static {
       users = new ArrayList<>();

       users.add(new User("0135892774", "A", "Nguyen Van A", "Male", "Hanoi", "1995", "anh@gmail.com" ));
       users.add(new User("0782847348", "C", "Nguyen Van Hung", "Male", "Hungyen", "1991", "hung@gmail.com" ));
       users.add(new User("0847262843", "B", "Tran Thi Cuc", "Female", "Bacgiang", "1997", "cuc@gmail.com" ));
       users.add(new User("0986277681", "B", "Nguyen Manh Hoang", "Male", "Quangninh", "1993", "hoang@gmail.com" ));
       users.add(new User("0136272774", "A", "Phan Cong Tri", "Male", "Hanoi", "1996", "tri@gmail.com" ));
   }

    @Override
    public void add(User object) {
        boolean flag = true;
        for (int i = 0; i < users.size(); i ++) {
            if (object.getPhoneNumber() == users.get(i).getPhoneNumber()) {
                flag = false;
                break;
            }
        }
        if (flag)
            users.add(object);
    }

    @Override
    public void fix(String phone, User newObject) {
        for (int i = 0; i < users.size(); i++) {
            if (phone == users.get(i).getPhoneNumber()) {
                users.set(Integer.parseInt(phone), newObject);
            }
        }
    }

    @Override
    public void delete(String phone) {
        for (int i = 0; i < users.size(); i++) {
            if (phone == users.get(i).getPhoneNumber()) {
                users.remove(i);
            }
        }
    }



    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        Iterator<User> iterator = users.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }

    @Override
    public User findByPhone(String phone) {
        for (int i = 0; i < users.size(); i++) {
            if (phone == users.get(i).getPhoneNumber()) {
                return users.get(i);
            }
        }
        return null;
    }


}
