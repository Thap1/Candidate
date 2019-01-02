package bll;

import java.util.List;

public interface InterfaceBLL<T> {
    List<T> getList(String sql);
    void show (List<T> object);
    void insert (T object);
}
