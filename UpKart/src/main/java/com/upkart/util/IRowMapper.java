/**
 * 
 */
package com.upkart.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.upkart.model.Admin;
import com.upkart.model.User;

/**
 * @author AshishKumar
 *
 */
public interface IRowMapper {
	List<Admin> rowMap(ResultSet resultSet) throws SQLException;
	List<User> rowMapCart(ResultSet resultSet) throws SQLException;
}
