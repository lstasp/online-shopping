package net.luiss.shoppingbackend.dao;

import java.util.List;

import net.luiss.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	
}
