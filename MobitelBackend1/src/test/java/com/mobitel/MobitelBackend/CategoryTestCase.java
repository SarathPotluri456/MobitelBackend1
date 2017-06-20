package com.mobitel.MobitelBackend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.CategoryDAO;
import com.mobitel.MobitelBackend.model.Category;

public class CategoryTestCase 
{
	public static void main(String arg[])
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Category Object.
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		//Insertion TestCase
		
		Category category=new Category();
		
		/*category.setCatname("Touch Cam Mobile");
		category.setCatdesc("This Mobile is Touch Screen Enabled. You can Enjoy Touch Feel ");

		categoryDAO.insertUpdateCategory(category);		
		System.out.println("Category Inserted");*/
		
		//Retrieval TestCase
		
		/*Category category1=categoryDAO.getCategory(2);
		System.out.println("Category Name:"+category1.getCatname());
		System.out.println("Category Description:"+category1.getCatdesc());*/
		
		//Deletion TestCase
		/*Category category2=categoryDAO.getCategory(3);
		categoryDAO.deleteCategory(category);
		System.out.println("The Category Deleted");*/
		
		//Retrieving the Data
		
		List<Category> list=categoryDAO.getCategoryDetails();
		
		for(Category category1:list)
		{
			System.out.println(category1.getCatid()+":"+category1.getCatname()+":"+category1.getCatdesc());
		}
		
		//Update the Category
		Category category3=categoryDAO.getCategory(3);
		category3.setCatname("EnMobile");
		categoryDAO.insertUpdateCategory(category3);
		System.out.println("The Category Updated");
		
	}
}