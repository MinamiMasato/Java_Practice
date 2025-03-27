package repository;

import java.util.List;

import entity.Product;

/**
 * 検索機能
 * 
 * @author minami
 */
public interface SearchProduct {

	/**
	 * 商品リストを返却
	 * @return AllProductList
	 */
	public List<Product> searchAll() throws Exception;

	/**
	 * 指定商品リストを返却
	 * @return SerchProductList
	 */
	public List<Product> searchByKbn(String kbn) throws Exception;

	/**
	 * 商品名の検索結果を返却
	 * @return SerchProductList
	 */
	public int searchByName(String productName) throws Exception;

}
