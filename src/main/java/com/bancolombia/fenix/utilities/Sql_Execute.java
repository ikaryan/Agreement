package com.bancolombia.fenix.utilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bancolombia.fenix.utilities.DBManager;

public class Sql_Execute {
	DBManager manager = null;
	/** Creates a new instance of DAOResultSet */
	public Sql_Execute() {
	manager = DBManager.getInstance();
	}
	public ResultSet sql_Execute (String Query) throws SQLException {
	manager = DBManager.getInstance();
	Connection con = manager.getConeccion();
	PreparedStatement ps = con.prepareStatement(Query);
	ResultSet rs = ps.executeQuery();
	return rs;
	}
}
