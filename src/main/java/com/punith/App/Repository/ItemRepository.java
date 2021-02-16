package com.punith.App.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.punith.App.Domain.ListOfItems;

@Repository
public interface ItemRepository extends JpaRepository<ListOfItems, Integer> {

	//@Query("Select * from LIST_OF_ITEMS")
	//List<ListOfItems> getItems();

}
