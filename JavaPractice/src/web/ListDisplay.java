package web;

import java.util.List;

import dto.SearchResultProduct;

/**
 * 商品の表示機能
 * 
 * @author minami
 */
public class ListDisplay {

	/**
	 * 商品名と在庫数を表示する
	 * @throws Exception 
	 */
	public void dispProduact(List<SearchResultProduct> searchResultProduct) {

		// 商品名の数だけ表示
		for (SearchResultProduct product : searchResultProduct) {
			System.out.println("商品名：" + product.getName() + ". 在庫数：" + product.getInventoryCount());
		}
	}

}
