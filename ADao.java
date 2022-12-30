package com.anudip;

import org.springframework.jdbc.core.JdbcTemplate;

public class AgentDao
{
 JdbcTemplate jdbcTemplate;
 
 public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
 {
	 this.jdbcTemplate=jdbcTemplate;
 }

 public int saveAgent(Agent a)  // use public method for add agents
 {
	 String query="insert into agent_info values('"+a.getId()+"','"+a.getName()+"','"+a.getComission()+"')";
	return jdbcTemplate.update(query);
 }
 
 public int updateAgent(Agent a)  // use public method for update agents
 {
	 String query="update agent_info set comission='"+a.getComission()+"'where id='"+a.getId()+"'";
	return jdbcTemplate.update(query); 
 }
 
 public int deleteAgent(Agent a)   // use public method for delete agent
 {
	 String query="delete from agent_info where id='"+a.getId()+"'";
	return jdbcTemplate.update(query);
 }
}