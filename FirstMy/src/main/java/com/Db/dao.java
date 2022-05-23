package com.Db;

import com.form.insertform;
import com.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class dao {
  static String cname="";


    public static Connection getconnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username="GnQnTQruNF";
            String password="a15OgD7jen";
           return DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/GnQnTQruNF",username,password);



        }
        catch (Exception e)
        {
            e.printStackTrace();


        }
        return null;

    }

    public int insertdata(String firstname,String lname)
    {
        try {

            String query="insert into first (firstname,lname) values(?,?)";
            PreparedStatement preparedStatement = getconnection().prepareStatement(query);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lname);


            int update = preparedStatement.executeUpdate();


            return update;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  0;

    }


    ArrayList<insertform> list=new ArrayList<insertform>();

    public ArrayList<insertform> execute(){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/GnQnTQruNF","GnQnTQruNF","a15OgD7jen");

            PreparedStatement ps=con.prepareStatement("select * from first");
            ResultSet rs=ps.executeQuery();

            while(rs.next()){
                insertform user=new insertform();
                user.setFirstName(rs.getString(1));
                user.setLastName(rs.getString(2));

                list.add(user);
            }

            con.close();
        }catch(Exception e){e.printStackTrace();}

        return list;
    }


    public int deletedata(String firstname)
    {
        try {

            String query="DELETE FROM first WHERE firstname=?";

            PreparedStatement preparedStatement = getconnection().prepareStatement(query);
            preparedStatement.setString(1, firstname);



            int update = preparedStatement.executeUpdate();


            return update;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  0;

    }
    insertform user2=new insertform();

    public insertform updatedata(String name) {

        try {
             cname=name;
            System.out.println(cname);
            System.out.println(name);


            String query="select firstname,lname from first where firstname="+"\""+name+"\"";

            PreparedStatement ps=getconnection().prepareStatement(query);
            ResultSet rs=ps.executeQuery();

                  rs.next();

                user2.setFirstName(rs.getString(1));
                user2.setLastName(rs.getString(2));

                return user2;



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  null;




    }

    public int update(String fname,String lname) {
        try {
            System.out.println(cname);
            String query="update first set firstname="+"\""+fname+"\",lname="+"\""+lname+"\" where firstname="+"\""+cname+"\"";
            System.out.println(query);

            PreparedStatement preparedStatement = getconnection().prepareStatement(query);



            int update = preparedStatement.executeUpdate();


            return update;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return  0;





    }
}
