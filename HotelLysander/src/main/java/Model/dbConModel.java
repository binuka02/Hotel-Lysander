/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConModel {


    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Connection con = null;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotellysander", "root", "");
        Statement st = con.createStatement();
        System.out.println("connection established successfully...!!");
        return con;
    }

    public boolean checkLogin(String guest_Username, String guest_NIC) {
        boolean st = false;
        try {


            PreparedStatement ps = createConnection().prepareStatement("select * from guest where guest_Username=? and guest_NIC=?");
            ps.setString(1, guest_Username);
            ps.setString(2, guest_NIC);
            ResultSet rs = ps.executeQuery();
            st = rs.next();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return st;

    }

    public boolean regUser(String guest_FName, String guest_LName, String guest_Email, String guest_Country, String guest_NIC, String guest_Phone, String guest_Username) throws ClassNotFoundException, SQLException {
        PreparedStatement ps = createConnection().prepareStatement("insert into guest values(?,?,?,?,?,?,?)");

        ps.setString(1, guest_FName);
        ps.setString(2, guest_LName);
        ps.setString(3, guest_Email);
        ps.setString(4, guest_Country);
        ps.setString(5, guest_NIC);
        ps.setString(6, guest_Phone);
        ps.setString(7, guest_Username);
        int i = ps.executeUpdate();
        System.out.println("Insert: " + i);
        if (i > 0)
            return true;
        else
            return false;

    }

    public static int addBooking(bookInLysanderModel bookLysanderobj) {
        int status = 0;

        try {
            Connection con = dbConModel.createConnection();
            PreparedStatement ps = con.prepareStatement("insert into bookings values(?,?,?,?,?,?,?,?,?)");

            //bookingID has made into auto increment and we hope it will increase xd(:

            ps.setString(1, bookLysanderobj.getFname());
            ps.setString(2, bookLysanderobj.getRegion());
            ps.setString(3, bookLysanderobj.getCheckInDate());
            ps.setString(4, bookLysanderobj.getCheckOutDate());
            ps.setString(5, bookLysanderobj.getRoomType());
            ps.setString(6, bookLysanderobj.getAdultsCount());
            ps.setString(7, bookLysanderobj.getKidsCount());
            ps.setString(8, bookLysanderobj.getPackages());
            ps.setString(9, bookLysanderobj.getRoomCount());

            status = ps.executeUpdate();
            //con.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbConModel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbConModel.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }
    public int checkBooking(String cInDate,String cOutDate, String roomType) throws SQLException, ClassNotFoundException {
        int count=0;
        System.out.println("checkBooking started!!!");
        PreparedStatement ps = createConnection().prepareStatement("SELECT COUNT gFname FROM bookings where (cInDate=? AND cOutDate=?) AND (roomType=?)");
        ps.setString(1,cInDate);
        ps.setString(2,cOutDate);
        ps.setString(3,roomType);

        ResultSet rs =ps.executeQuery();
        if(rs.next()){
            count= rs.getInt("count");
            System.out.println(count+" amount");
        }else
        {
            System.out.println("no count");
        }

        //find a way to take the count in int
        return count;
    }
}
