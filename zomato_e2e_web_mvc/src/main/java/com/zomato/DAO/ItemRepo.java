package com.zomato.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zomato.entity.ItemsEntity;

@Repository
public class ItemRepo {
	@Autowired
	SessionFactory sf;
	public int saveOrder(ItemsEntity items) {
		System.out.println("Ordre DAO: Item Name: " + items.getItemName());
		Session session = sf.getCurrentSession();
		
		System.out.println("Save Order Starting....");
		Integer response = (Integer) session.save(items);
		
		System.out.println("Save Order : Completed " + response);
		return response;
		
	}
	public List<ItemsEntity> fetchData() {
		Session session=sf.getCurrentSession();
		return session.createQuery("from ItemsEntity",ItemsEntity.class).getResultList();
		
	}
	public ItemsEntity getById(int id) {
		Session session=sf.getCurrentSession();
		return session.get(ItemsEntity.class,id);
	}
	public void updateProduct(ItemsEntity items) {
		Session session=sf.getCurrentSession();
		session.update(items);
	}

}
