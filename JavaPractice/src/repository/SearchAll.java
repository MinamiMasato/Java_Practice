package repository;

import java.util.List;

import entity.Product;

/**
 * 検索機能
 * 
 * @author minami
 */
public interface SearchAll {

	/**
	 * 商品リストを返却
	 * @return AllProductList
	 */
	public List<Product> getAll() throws Exception;

	/**
	 * 指定商品リストを返却
	 * @return SerchProductList
	 */
	public List<Product> SerchByKbn(String kbn) throws Exception;

}
