package dao;

import entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 517
 * @date 2021-03-04 - 20:26
 */

@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book){
        String sql = "insert into t_book values (?,?,?)";
        String[] entityMsg = {book.getUserID(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql, entityMsg);
        System.out.println(update);
    }



}
