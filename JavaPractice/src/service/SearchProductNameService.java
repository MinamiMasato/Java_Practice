package service;

import dto.SearchResultProduct;
import repository.SearchAllInProgram;
import repository.SearchProduct;

/**
 * 
 */
public class SearchProductNameService {

	public SearchResultProduct getSerachResult(String productName) throws Exception {

		// 商品の検索結果
		SearchResultProduct result = new SearchResultProduct();

		// 商品検索機能
		SearchProduct sarchproduct = new SearchAllInProgram();

		result.setName(productName);

		// 指定された商品名の商品リスト取得
		result.setInventoryCount(sarchproduct.searchByName(productName));

		return result;

	}

}
