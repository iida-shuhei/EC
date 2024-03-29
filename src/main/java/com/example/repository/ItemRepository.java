package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Item;

/**
 * 商品を操作するリポジトリ.
 * 
 * @author iidashuhei
 *
 */
@Repository
public class ItemRepository {
	
	@Autowired
	public NamedParameterJdbcTemplate template;

	public static final RowMapper<Item>ITEM_ROW_MAPPER = (rs,i) -> {
	
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setDescription(rs.getString("description"));
		item.setPriceM(rs.getInt("price_m"));
		item.setPriceL(rs.getInt("price_l"));
		item.setImagePath(rs.getString("image_path"));
		item.setDeleted(rs.getBoolean("deleted"));
		return item;
	};
	
	/**
	 * 商品全件検索.
	 * 
	 * @return 商品全件検索結果
	 */
	public List<Item> findAll() {
		String sql = "select id,name,description,price_m,price_l,image_path,deleted from items order by id";
		SqlParameterSource param = new MapSqlParameterSource();
		return template.query(sql, param, ITEM_ROW_MAPPER);
	}
	
	/**
	 * 曖昧検索.
	 * 
	 * @param name 名前
	 * @return 商品検索結果
	 */
	public List<Item> findByName(String name){
		String sql = "select id,name,description,price_m,price_l,image_path,deleted from items where name Ilike :name";
		SqlParameterSource param = new MapSqlParameterSource().addValue("name", '%' + name + '%');
		return template.query(sql, param, ITEM_ROW_MAPPER);
	}
	/**
	 * 商品詳細画面を表示する.
	 * 
	 * @param id id
	 * @return 商品詳細
	 */
	public Item load(Integer id) {
		String sql = "select id,name,description,price_m,price_l,image_path,deleted from items where id =:id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", id);
		return template.queryForObject(sql, param, ITEM_ROW_MAPPER);
	}
	
}
