package pension.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import pension.dao.PensionerDao;
import pension.domain.Pensioner;

public class PensionerDao
{
	public void save(Pensioner pensioner) {
	}

	public void update(Pensioner pensioner) {
	}

	public List<Pensioner> getAllPensioners() {
		return null;
	}

	public Pensioner getById(Long id) {
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
