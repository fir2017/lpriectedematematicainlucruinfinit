import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Random;

public class FacturaDB {
	public void createTable() {
		Connection conn = DBUtil.getConnection();

		boolean tableExists = false;
		try {
			DatabaseMetaData dbmd = conn.getMetaData();

			ResultSet rs = dbmd.getTables(null, null, null,
					new String[] { "TABLE" });
			if (rs.next()) {
				if (rs.getString(3).equals("FACTURA")) {
					tableExists = true;
				}
				System.out.println("Table " + rs.getString(3) + " exists");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if (!tableExists) {
			try {
				Statement s = conn.createStatement();
				s.execute("CREATE TABLE factura  (ID  INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 0, INCREMENT BY 1),"
						+ " nrFactura INTEGER, client VARCHAR(20), furnizor VARCHAR(20), suma DOUBLE, data DATE, CONSTRAINT primary_key_2 PRIMARY KEY (ID))");

				conn.commit();

			} catch (SQLException ex) {

				DBUtil.dispaySQLExceptions(ex);

			}
		}
	}

	public void insertFactura(Factura f) {
		Connection conn = DBUtil.getConnection();
		
	}

	public void updateFactura(int nrfactura) {
		// get by id
		// update
	}

	public void displayAll() {
		
	}

	public void displayInTimePeriod() {
		
	}

	public static void main(String args[]) {
		FacturaDB test = new FacturaDB();
		Random r = new Random();
		test.createTable();
		test.insertFactura(Factura.getFactura(r.nextInt(3)));
		test.displayAll();
		test.displayInTimePeriod();
	}

	
}
