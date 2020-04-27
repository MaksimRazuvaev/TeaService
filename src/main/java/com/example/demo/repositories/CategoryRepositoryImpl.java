package com.example.demo.repositories;

import com.example.demo.models.Category;
//Before import we have to declare "dependency" in the "xml" file (google dependency)
//All "IMPORTS" should be declared in "XML FILE" as "DEPENDENCY"
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
// Same dependency declaration before importing
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


//Connect with db through "springFrameWork".
public class CategoryRepositoryImpl implements CategoryRepository {
    private JdbcTemplate jdbcTemplate;
    //JdbcTemplate connect any java class with db
    //JdbcTemplate some kind of the driver


//DataSourse java class should be created in the "resources" package
//DataSourse contain all credentials
    public CategoryRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

//Create constants with "sql" queries
    private static final String GET_ALL_CATEGORIES = "SELECT * from category";
    private static final String ADD_CATEGORIES = "INSERT INTO category (id, category_name) VALUE (?, ?)";
    private static final String DELETE_CATEGORIES = "DELETE FROM category WHERE category_name = ?";

//RowMapper convert "sql table" to the "java object"
    private RowMapper rowMapperForAllCat = new RowMapper() {
        public Category mapRow(ResultSet rs, int i) throws SQLException {
            return Category.builder()
                    .id(rs.getLong("id"))
                    .categoryName(rs.getString("category_name"))
                    .build();
        }
    };

//getAllCategories is implemented method from "CategoryRepository file"
//Method accept sql query constant and convert data with RowMapper to the java object "List<>"
    public List<Category> getAllCategories() {
        return jdbcTemplate.query(GET_ALL_CATEGORIES, rowMapperForAllCat);
    }


    public void add(Category category) {
        // ? jdbcTemplate.update(ADD_CATEGORIES, new Long[]{category.getId()}, category.getCategoryName());
    }

    public void delete(Category name) {
       // ? jdbcTemplate.execute(DELETE_CATEGORIES, name);
    }

}
