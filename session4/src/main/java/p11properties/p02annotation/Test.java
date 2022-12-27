package p11properties.p02annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        var context=new AnnotationConfigApplicationContext(DataSourceConfig.class);
        final DataSource datasource = context.getBean("dataSource", DataSource.class);
        final Connection connection = datasource.getConnection();
        final PreparedStatement preparedStatement = connection.prepareStatement("select * from product");
        final ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
            System.out.println(resultSet.getString("name"));


    }
}
