import java.sql.*;
class Launch5 {

    public static void main(String[] args) throws SQLException{
        Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root"                                                                                       );
        Statement statement=connection.createStatement();

        String query1="create table Student(sId int,sName varchar(50), age int(3))";
        statement.executeUpdate(query1);
        System.out.println("Table created :");

        String query2="insert into Student values(000 , 'Abhishek , 18)";
        String query3="insert into Student values(0001 , 'Mayank' , 19)";
        String query4="insert into Student  values(0002 , 'Vikas' , 20)";

        statement.execute(query1);
        statement.executeUpdate(query3);
        statement.executeUpdate(query4);
        System.out.println("inserted a row");


        String query5="select * from Student";
        ResultSet resultset=statement.executeQuery(query5);
        System.out.println("sILd"+"\t"+"sName"+"\t"+"age");
        while(resultset.next()) {
            System.out.print(resultset.getInt(1)+"\t"+resultset.getString(2)+"\t"+resultset.getInt(3));
            System.out.println();
        }
    }

}

