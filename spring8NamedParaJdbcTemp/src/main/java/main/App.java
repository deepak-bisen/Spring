package main;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * NamedParameterJdbcTemplate
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        
        NamedParameterJdbcTemplate npJdbcTemplate  = context.getBean(NamedParameterJdbcTemplate.class);
        
        Map<String , Object> map = new HashMap<String, Object>();
        
        map.put("key_sno", 3);
        map.put("key_name", "kartik");
        map.put("key_mobile",456982);
        
        String insert_query = "INSERT INTO deepak VALUES(:key_sno,:key_name,:key_mobile)";
        
        int count  = npJdbcTemplate.update(insert_query, map);
        
        if(count> 0) {
        	System.out.println("insertion successfull.");
        }else
        	System.out.println("insertion Unsuccessfull.");
    }
}
