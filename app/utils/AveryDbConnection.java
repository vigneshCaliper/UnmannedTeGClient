package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;

import com.mongodb.client.MongoDatabase;
import com.typesafe.config.Config;
import play.Logger;
public class AveryDbConnection {
	private final Config config;
	private static Connection connection;
	@Inject
	public AveryDbConnection(Config config) {
		this.config = config;
		String user = config.getString("amazon.averydb.test.username");
		String database = config.getString("amazon.averydb.test.database");
		String password = config.getString("amazon.averydb.test.password");
		String connectionurl =  config.getString("amazon.averydb.test.connectionurl");
		String port = config.getString("amazon.averydb.test.port");
		try {
			 this.connection = DriverManager.getConnection(connectionurl, user, password);
			 Logger.info("Sql Database Connection::" + this.connection);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Connection getSqlConnectionDB() {
		return AveryDbConnection.connection;
	}
}
