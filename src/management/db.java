package management;


import oracle.jdbc.pool.OracleDataSource;
import java.sql.Connection;

public class DBConnection {
    private Connection connection;

    public Connection getConnection() {
        try {
            OracleDataSource ods=new OracleDataSource();
            ods.setDriverType("thin");
            ods.setServerName("localhost");
            ods.setPortNumber(1521);
            ods.setUser("*");
            ods.setServiceName("*");
            ods.setPassword("*");
            this.connection= ods.getConnection();
        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
