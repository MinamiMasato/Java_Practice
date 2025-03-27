package web;

import dto.SearchResultProduct;

/**
 * 商品の表示機能
 * 
 * @author minami
 */
public class SearchResultDisplay {

	/**
	 * 検索結果を表示する
	 * @throws Exception 
	 */
	public void dispSearchResult(SearchResultProduct result) {

		// 検索結果を表示する
		System.out.println("商品名 : " + result.getName() + " 在庫数 : " + result.getInventoryCount());
	}

}
