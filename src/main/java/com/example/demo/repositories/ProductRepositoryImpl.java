package com.example.demo.repositories;

import com.example.demo.models.Product;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRepositoryImpl implements ProductRepository {
    private JdbcTemplate jdbcTemplate;
    public ProductRepositoryImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final String GET_ALL_PRODUCT = "SELECT * FROM product";
    private static final String GET_PRODUCT_BY_CATEGORY_ID = "SELECT * FROM product WHERE category_id = ?";
    // ?? private static final String GET_PRODUCT_BY_CATEGORY_ID = "SELECT * FROM product WHERE category_id = ?";

    private RowMapper rowMapperForAllProduct = new RowMapper() {
        public Product mapRow(ResultSet rs, int i) throws SQLException {
            return Product.builder()
                    .id(rs.getLong("id"))
                    .productName(rs.getString("product_name"))
                    .price(rs.getInt("price"))
                    .categoryId(rs.getInt("category_id"))
                    .supplierId(rs.getInt("supplier_id"))
                    .build();
        }
    };


    public List<Product> getAllProduct() {
        return jdbcTemplate.query(GET_ALL_PRODUCT, rowMapperForAllProduct);
    }

    public Product getProductByCategoryId(int categoryId) {
        //return jdbcTemplate.query(GET_PRODUCT_BY_CATEGORY_ID, rowMapperForAllProduct);
        return null;
    }
}
