import config.LiquibaseDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.ResultSet;

/**
 * Created by Craig Walker on 15/01/2019.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { LiquibaseDataSource.class })
public class DBTest {

    @Inject
    private DataSource dataSource;


    @Test
    public void doTest(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        jdbcTemplate.query("Select * from department", this::mapResult);
    }

    private String mapResult(ResultSet rs, int rowNum){

        return "";
    }

}
