package dal;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import entity.FresherCandidate;
import unti.ConnectDB;

public class FresherDAL implements InterfaceDAL<FresherCandidate>{
    ConnectDB cnn = (ConnectDB) ConnectDB.connect();
  
    @Override
    public List<FresherCandidate> getList(String sql) {
        List<FresherCandidate> list = new ArrayList<FresherCandidate>();
        try {
            Statement stm = cnn.createStatement();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void show(List<FresherCandidate> object) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int insert(FresherCandidate object) {
        // TODO Auto-generated method stub
        return 0;
    }

}
