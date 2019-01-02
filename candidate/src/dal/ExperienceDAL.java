package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import entity.ExperienceCandidate;
import unti.ConnectDB;

public class ExperienceDAL implements InterfaceDAL<ExperienceCandidate> {


    @Override
    public List<ExperienceCandidate> getList(String sql) {
        List<ExperienceCandidate> list = new ArrayList<ExperienceCandidate>();
        Connection cnn = ConnectDB.connect();
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                ExperienceCandidate ex = new ExperienceCandidate();
                ex.setCandidateID(rs.getInt("candidateID"));
                ex.setFirstName(rs.getString("firstName"));
                ex.setLastName(rs.getString("lastName"));
                ex.setBirtDate(rs.getInt("birtDate"));
                ex.setAddress(rs.getString("address"));
                ex.setPhone(rs.getInt("phone"));
                ex.setEmail(rs.getString("email"));
                ex.setCandidateType(rs.getString("candidateType"));
                ex.setExpInYear(rs.getString("expInYear"));
                ex.setProSkill(rs.getString("proSkill"));
                list.add(ex);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void show(List<ExperienceCandidate> object) {
        for (ExperienceCandidate experienceCandidate : object) {
            System.out.println(experienceCandidate);
        }
    }


    @Override
    public boolean insert(ExperienceCandidate object) {
        Connection cnn = ConnectDB.connect();
        String sql = "INSERT INTO `nhansu`.`candidate` (`candidateID`, `firstName`, `lastName`, `birtDate`, `address`, `phone`, `email`, `candidateType`, `expInYear`, `proSkill`) VALUES (?, ?, ?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement prs = cnn.prepareStatement(sql);
            prs.setInt(1, object.getCandidateID());
            prs.setString(2, object.getFirstName());
            prs.setString(3, object.getLastName());
            prs.setInt(4, object.getBirtDate());
            prs.setString(5, object.getAddress());
            prs.setInt(6, object.getPhone());
            prs.setString(7, object.getEmail());
            prs.setString(8, object.getCandidateType());
            prs.setString(9, object.getExpInYear());
            prs.setString(10, object.getProSkill());
            
            prs.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally {
            try {
                cnn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return true;
    }

}
