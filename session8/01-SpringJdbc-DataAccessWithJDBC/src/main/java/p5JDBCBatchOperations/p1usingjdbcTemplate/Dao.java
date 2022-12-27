package p5JDBCBatchOperations.p1usingjdbcTemplate;



import p1UsingJDBCTemplate.Employee;

import java.util.List;

public interface Dao {
     int[] batchUpdate(final List<Employee> actors);
}
