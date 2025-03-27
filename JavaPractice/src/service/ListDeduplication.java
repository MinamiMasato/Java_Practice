package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entity.Product;

/**
 * リストの重複削除クラス
 * 
 * @author minami
 */
public class ListDeduplication {

	// 重複削除リスト
	private List<String> removeList = new ArrayList<>();

	/**
	 * リストの重複を無くしたリストを返却
	 * @param products
	 * @return　removeList
	 */
	public List<String> remove(List<Product> products) {

		// 商品名のリストが空ではない場合
		if (!products.isEmpty()) {
			for (Product product : products) {
				removeList.add(product.getName());
			}
			return removeList.stream().distinct().collect(Collectors.toList());

		// 空の場合
		} else {
			return removeList;
		}
	}

}
