package com.mobitel.MobitelBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mobitel.MobitelBackend.dao.SupplierDAO;
import com.mobitel.MobitelBackend.model.Supplier;


public class SupplierTestCase {

	
	public static void main(String arg[])
	{
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		
		context.scan("com.mobitel.MobitelBackend");
		
		context.refresh();
		
		// Inserting a Supplier Object.
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		
		//Insertion TestCase
		
		Supplier supplier=new Supplier();
		
		supplier.setSupname("WIFIMobile");
		supplier.setSupdesc("This Mobile is WIFI Enabled. You can Enjoy Internet");

		supplierDAO.insertUpdateSupplier(supplier);		
		System.out.println("Supplier Inserted");
		
		//Retrieval TestCase`
		
		/*Supplier supplier=supplierDAO.getSupplier(2);
		System.out.println("Supplier Name:"+supplier.getCatname());
		System.out.println("Supplier Description:"+supplier.getCatdesc());*/
		
		//Deletion TestCase
		/*Supplier supplier=supplierDAO.getSupplier(2);
		supplierDAO.deleteSupplier(supplier);
		System.out.println("The Supplier Deleted");*/
		
		//Retrieving the Data
		
		/*List<Supplier> list=supplierDAO.getSupplierDetails();
		
		for(Supplier supplier:list)
		{
			System.out.println(supplier.getCatid()+":"+supplier.getCatname()+":"+supplier.getCatdesc());
		}*/
		
		//Update the Supplier
		//Supplier supplier=supplierDAO.getSupplier(3);
		//supplier.setCatname("WifiEnMobile");
		//supplierDAO.insertUpdateSupplier(supplier);
		//System.out.println("The Supplier Updated");
	}

}