package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import dto.SearchResultProduct;
import entity.Product;
import repository.SearchAll;
import repository.SearchAllInProgram;

/**
 * 
 */
public class SearchProductListService {

	public List<SearchResultProduct> getList(String kbn) throws Exception {

		SearchAll sarchAll = new SearchAllInProgram();

		// 商品リスト
		List<Product> prodautsList;
		// 商品名リスト
		List<String> prodautsNameList;
		// 検索結果の商品リスト
		List<SearchResultProduct> searchResultProductList;

		// 区分指定が無い時
		if (kbn == null) {
			// 全商品リスト取得
			prodautsList = sarchAll.searchAll();
		} else {
			// 指定された区分の商品リスト取得
			prodautsList = sarchAll.searchByKbn(kbn);

		}
		// 商品名の重複を省いた商品名リストを取得
		prodautsNameList = prodautsList.stream().map(product -> product.getName()).distinct()
				.collect(Collectors.toList());

		// 検索結果商品リストを作成
		searchResultProductList = this.getSearchResultlist(prodautsList, prodautsNameList);

		return searchResultProductList;
	}
	
	/**
	 * 返却用りすと作成
	 * @param productList
	 * @param productNameList
	 * @return
	 */
	private List<SearchResultProduct> getSearchResultlist(List<Product> productList, List<String> productNameList) {
		
		List<SearchResultProduct> resultList = new ArrayList<>();
		
		for(String productName : productNameList) {
			SearchResultProduct result = new SearchResultProduct();
			result.setName(productName);
			result.setInventoryCount((int) productList.stream().filter(product -> product.getName().equals(productName)).count());
			
			resultList.add(result);
		}
		
		return resultList;
	}
}
