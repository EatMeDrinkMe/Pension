package pension.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import pension.dao.CoefficientDao;
import pension.domain.Coefficient;

public class CoefficientDao
{
	public List<Coefficient> getAllCoefficients() {
		return null;
	}

	public void add(Coefficient coef) {
	}

	public Coefficient getById(Long id) {
		return null;
	}
	
	public void update(Coefficient coef) {
	}
	
	public void setJdbcTemplate(
		JdbcTemplate jdbcTemplate
	)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	protected JdbcTemplate jdbcTemplate;
}
