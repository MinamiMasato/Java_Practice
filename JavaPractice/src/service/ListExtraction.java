package service;

import java.util.ArrayList;
import java.util.List;

import entity.Product;

public class ListExtraction {

	private List<String> productName = new ArrayList<>();
	
	/**
	 * 商品名だけのリストを返却
	 * @return
	 */
	public List<String> remove(List<Product> products) {
		// 商品名のリストが空ではない場合
		if (!products.isEmpty()) {
			for (Product product : products) {
				productName.add(product.getName());
			}
			return productName;

			// 空の場合
		} else {
			return productName;
		}
	}
}
