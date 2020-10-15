package User;

import java.util.List;

public interface IUser<T> {
    void add(T object);
    void fix(String phone, T newObject);
    void delete(String phone);
    List<T> findAll();
    T findByPhone(String phone);

}
