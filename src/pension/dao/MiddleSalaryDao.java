package pension.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import pension.dao.MiddleSalaryDao;
import pension.domain.MiddleSalary;

public class MiddleSalaryDao 
{
	public List<MiddleSalary> getAllMiddleSalaries() {
		return null;
	}
	public void setJdbcTemplate(
		JdbcTemplate jdbcTemplate
	)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	protected JdbcTemplate jdbcTemplate;
}
