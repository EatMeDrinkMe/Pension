package pension.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pension.domain.Pensioner;

public class PensionerRowMapper 
	implements RowMapper 
{
	public Object mapRow(
		ResultSet rs
		,int index
	) throws SQLException 
	{
		return new Pensioner(
				rs.getInt   ("idPensioner")
				,rs.getString("firstName")
				,rs.getString("secondName")
				,rs.getString("thirdName")
				,rs.getString("birthday")
				,rs.getInt("INN")
				,rs.getString("sex")
				,rs.getDouble("expKoef")
				,rs.getDouble("salKoef")
				,rs.getString("adress")
				,rs.getInt("pensionType")
			);
	}

}
