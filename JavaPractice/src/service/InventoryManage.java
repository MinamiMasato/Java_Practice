package service;

import java.util.Collections;
import java.util.List;

import entity.Product;

/**
 * 在庫管理クラス
 * 
 * @author minami
 */
public class InventoryManage {
	
	ListExtraction listExtraction;

	// 在庫数
	private int inventory = 0;
	//
	List<String> productNameList;

	/**
	 * 商品の在庫数を返却
	 * 
	 * @return inventory
	 */
	public int getInventory(List<Product> products, String productName) {
		listExtraction = new ListExtraction();
		productNameList = listExtraction.remove(products);
		inventory = Collections.frequency(productNameList, productName);
		return inventory;
	}
}
