package com.anudip;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting project" );
        ApplicationContext ap=new ClassPathXmlApplicationContext("Config.xml");
        AgentDao Dao=(AgentDao)ap.getBean("e2");
        //add agent
         System.out.println(Dao.saveAgent(new Agent(6,"Mrunal",42000)));
        //  update agent comission    
        System.out.println(Dao.updateAgent(new Agent(1,45000)));
        // delete agent
        System.out.println(Dao.deleteAgent(new Agent(6)));
    }
}