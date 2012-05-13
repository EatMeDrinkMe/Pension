package pension.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import pension.dao.PensionerDao;
import pension.domain.Pensioner;
import pension.rowMapper.PensionerRowMapper;

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
		if(jdbcTemplate == null)
			System.out.println("NULL");
		return (Pensioner)((List<Pensioner>) jdbcTemplate.query("Select * from Pensioner where idPensioner = 2", new PensionerRowMapper())).get(0);
	}
	
	public void setJdbcTemplate(
		JdbcTemplate jdbcTemplate
	)
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void setSelectByIdStatment(
		String selectByIdStatment
	) 
	{
		this.selectByIdStatment = selectByIdStatment;
	}

	public void setInsertStatment(
		String insertStatment
	) 
	{
		this.insertStatment = insertStatment;
	}

	public void setUpdateStatment(
		String updateStatment
	)
	{
		this.updateStatment = updateStatment;
	}

	public void setSelectByNameStatment(
		String selectByNameStatment
	)
	{
		this.selectByNameStatment = selectByNameStatment;
	}

	protected JdbcTemplate jdbcTemplate        ;
	protected String       selectByIdStatment  ;
	protected String       insertStatment      ;
	protected String       updateStatment      ;
	protected String       selectByNameStatment;
}
