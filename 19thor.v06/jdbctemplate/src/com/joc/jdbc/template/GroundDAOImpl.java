package com.joc.jdbc.template;

import org.springframework.jdbc.core.JdbcTemplate;

public class GroundDAOImpl implements GroundDAO{
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public int saveGround(Ground dto) {
		String quary="insert into ground_details value("+dto.getId()+",'"+dto.getName()+"',"+dto.getNoOfGate()+")";
		return jdbcTemplate.update(quary);
	}

}
