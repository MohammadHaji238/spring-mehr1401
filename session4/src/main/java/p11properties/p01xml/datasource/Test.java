package p11properties.p01xml.datasource;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        var context=new GenericXmlApplicationContext();
        context.load("file:C:\\Users\\titan\\IdeaProjects\\spring\\5\\session4\\session4\\src\\main\\java\\p11properties\\config.xml");
        context.refresh();
        final DataSource datasource = context.getBean("datasource", DataSource.class);
        final Connection connection = datasource.getConnection();
        final PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
        final ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
            System.out.println(resultSet.getString("name"));


    }
}
