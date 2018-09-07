package net.luiss.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.luiss.shoppingbackend.dao.CategoryDAO;
import net.luiss.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDAO {

	//Dummy data
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!...");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category = new Category();
		//adding second category
		category.setId(2);
		category.setName("mobile");
		category.setDescription("This is some description for mobile!...");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category = new Category();
		//adding thrid category
		category.setId(3);
		category.setName("laptop");
		category.setDescription("This is some description for laptop!...");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
			
		}
		
		// TODO Auto-generated method stub
		return null;
	}

}