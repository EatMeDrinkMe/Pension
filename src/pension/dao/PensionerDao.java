package pension.dao;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import pension.dao.PensionerDao;
import pension.domain.Pensioner;

public class PensionerDao
{
	public void save(
		Pensioner p
	)
	{
		jdbcTemplate.update(
			insertStatment		        
			,new Object[]{
			p.getFirstName()
			,p.getSecondName()
			,p.getThirdName()
			,p.getBirthday()
			,p.getINN()
			,p.getSex()
			,p.getExpKoef()
			,p.getSalKoef()
			,p.getAdress()
			,p.getPensionType()
			,p.getId()
			}
			,new int   []{
			java.sql.Types.VARCHAR
			,java.sql.Types.VARCHAR
			,java.sql.Types.VARCHAR
			,java.sql.Types.VARCHAR
			,java.sql.Types.INTEGER
			,java.sql.Types.VARCHAR
			,java.sql.Types.DOUBLE
			,java.sql.Types.DOUBLE
			,java.sql.Types.VARCHAR
			,java.sql.Types.INTEGER
			,java.sql.Types.INTEGER
			});
	}

	public void update(Pensioner pensioner) {
	}

	public Pensioner getById(int id) {
		return (Pensioner)((List<Pensioner>) jdbcTemplate.query
					(selectByIdStatment
					,new Object[]{
						id
					}
					, pensionerRowMapper)).get(0);
	}
	
	public List<Pensioner> getByName(
			String name
	)
	{
		return jdbcTemplate.query
		(selectByNameStatment
		,new Object[]{
			name
		}
		, pensionerRowMapper);
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

	public void setPensionerRowMapper(
		RowMapper pensionerRowMapper
	) 
	{
		this.pensionerRowMapper = pensionerRowMapper;
	}

	protected RowMapper    pensionerRowMapper  ;
	protected JdbcTemplate jdbcTemplate        ;
	protected String       selectByIdStatment  ;
	protected String       insertStatment      ;
	protected String       updateStatment      ;
	protected String       selectByNameStatment;
}
