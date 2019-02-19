/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.DonarModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Medul
 */
public class DBConnect {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public DBConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
          
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bloodbank", "root", "");
            
            // pst =  (PreparedStatement) conn.createStatement();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    //Insert Into Donar
    public void InsertIntodonar(DonarModel d) {
        // ItemModel i = new ItemModel();
        try {
            String query = "Insert into donor values (?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(query);
            pst.setInt(1, d.getId());
            pst.setString(2, d.getName());
            pst.setString(3, d.getEmail());
            pst.setString(4, d.getAddress());
            pst.setString(5, d.getPhn());
            pst.setString(6, d.getDateOfBirth());
            pst.setString(7, d.getAge());
            pst.setString(8, d.getSex());
            pst.setString(9, d.getBloodGroup());
            pst.setString(10, d.getLastDonate());
            pst.setString(11, d.getStatus());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Added");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<DonarModel> getAll_donar() throws SQLException {
        ArrayList<DonarModel> donarmodel = new ArrayList<>();

        String query = "Select * from donor";
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            DonarModel dm = new DonarModel();
            dm.setId(rs.getInt(1));
            dm.setName(rs.getString(2));
            dm.setEmail(rs.getString(3));
            dm.setAddress(rs.getString(4));
            dm.setPhn(rs.getString(5));
            dm.setDateOfBirth(rs.getString(6));
            dm.setAge(rs.getString(7));
            dm.setSex(rs.getString(8));
            dm.setBloodGroup(rs.getString(9));
            dm.setLastDonate(rs.getString(10));
            dm.setStatus(rs.getString(11));
            donarmodel.add(dm);

        }
        return donarmodel;
    }

    //Update Table
    private void Update_Table() {
        try {
            String query = "select * from donor";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void updateIntoDonar(DonarModel model, String value) {
        try {
            int ID = model.getId();
            String Name = model.getName();
            String Email = model.getEmail();
            String Address = model.getAddress();
            String Phone = model.getPhn();
            String DateOfBirth = model.getDateOfBirth();
            String Age = model.getAge();
            String Sex = model.getSex();
            String BloodGroup = model.getBloodGroup();
            String LastDonate = model.getLastDonate();
            String Status = model.getStatus();

            String sql = "update donor set ID='" + ID + "',Name='" + Name + "',Email='" + Email + "',Address='" + Address + "',Phone='" + Phone + "',DateOfBirth='" + DateOfBirth
                    + "',Age='" + Age + "',Sex='" + Sex + "',BloodGroup ='" + BloodGroup + "',LastDonate='" + LastDonate + "',Status='" + Status + "'where ID='" + ID + "'";
            pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Updated");

        } catch (Exception me) {
            JOptionPane.showMessageDialog(null, me);
        }

    }

    public void deleteFromDonar(String ID) {

        String sql = "delete from donor where ID=?";
        int value = Integer.parseInt(ID);
        try {

            pst = conn.prepareStatement(sql);
            pst.setInt(1, value);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Delete");

        } catch (Exception me) {
            JOptionPane.showMessageDialog(null, me);
        } finally {
            try {
                rs.close();
                pst.close();
            } catch (Exception me) {

            }
        }

    }

//    public void updateIntoDonar(String value) {
////                try {
////            int ID = model.getId();
////            String Name = model.getName();
////            String Email = model.getEmail();
////            String Address = model.getAddress();
////            String Phone = model.getPhn();
////            String DateOfBirth = model.getDateOfBirth();
////            String Age = model.getAge();
////            String Sex = model.getSex();
////            String BloodGroup = model.getBloodGroup();
////            String LastDonate = model.getLastDonate();
////            String Status = model.getStatus();
////
////            String sql = "update Item set ID='" + ID + "',Name='" + Name + "',Email='" + Email + "',Address='" + Address + "',Phone='" + Phone + "',DateOfBirth='" + DateOfBirth
////                    + "',Age='" + Age + "',Sex='" + Sex + "',BloodGroup ='" + BloodGroup + "',LastDonate='" + LastDonate + "',Status='" + Status + "'where ID='" + ID + "'";
////            pst = conn.prepareStatement(sql);
////            pst.execute();
////            JOptionPane.showMessageDialog(null, "Updated");
////
////        } catch (Exception me) {
////            JOptionPane.showMessageDialog(null, me);
////        }
//    }

}
