package net.luiss.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.luiss.shoppingbackend.dao.CategoryDAO;
import net.luiss.shoppingbackend.dto.Category;

public class CategorytestCase {
	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	//Adding comment to test travisCI on github
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.luiss.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Television");
		category.setDescription("This is some description for television!...");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added category inside the table!", true, categoryDAO.add(category));
		
	}
	
}
