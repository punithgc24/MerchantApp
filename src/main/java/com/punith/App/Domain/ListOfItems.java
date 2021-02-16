package com.punith.App.Domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name="LISTOFITEMS")
public class ListOfItems {
	
	@Id
	@Column(name="ITEMCODE")
	private int itemCode;
	
	@Column(name="ITEMNAME")
	private String itemName;
	
	@Column(name="SELLINGPRICE")
	private int sellingPrice;
	
	@Column(name="PURCHASEPRICE")
	private int purchasePrice;
	
	@Column(name="QUANTITYINHAND")
	private int quantityInHand;
	
	
}
