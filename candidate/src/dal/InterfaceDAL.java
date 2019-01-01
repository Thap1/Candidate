package dal;

import java.util.List;

public interface InterfaceDAL<T> {
    public List<T> getList (String sql);
    void show (List<T> object);
    boolean insert (T object);
}
