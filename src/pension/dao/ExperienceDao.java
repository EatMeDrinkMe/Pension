package pension.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import pension.dao.ExperienceDao;
import pension.domain.Experience;

public class ExperienceDao
{
	public List<Experience> getAllCoefficients() {
		return null;
	}

	public void add(Experience exp) {
	}

	public void update(Experience exp) {
	}

	public void setJdbcTemplate(
		JdbcTemplate jdbcTemplate
	)
	{
		this.jdbcTemplate = jdbcTemplate;
	}

	protected JdbcTemplate jdbcTemplate;
}
