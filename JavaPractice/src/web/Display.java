package web;

import java.util.List;

import entity.Product;
import repository.SearchAll;
import repository.SearchAllInProgram;
import service.InventoryManage;
import service.ListDeduplication;

/**
 * 商品の表示機能
 * 
 * @author minami
 */
public class Display {

	private SearchAll sarchAll;
	private InventoryManage inventoryManage;
	private ListDeduplication listDeduplication;


	// 商品リスト
	private List<Product> prodauts;
	// 商品名リスト
	private List<String> prodautsName;

	public Display() {
		sarchAll = (SearchAll) new SearchAllInProgram();
		inventoryManage = new InventoryManage();
		listDeduplication = new ListDeduplication();
	}
	
	/**
	 * 商品名と在庫数の一覧を表示する
	 * @throws Exception 
	 */
	public void dispAllProduct() throws Exception {
		
		// 商品リスト取得
		prodauts = sarchAll.getAll();
		// 商品名の重複を省いたリストを取得
		prodautsName = listDeduplication.remove(prodauts);
		
		// 商品名の数だけ表示
		for(String prodautsName : prodautsName) {
			System.out.println("商品名：" + prodautsName + ". 在庫数：" + inventoryManage.getInventory(prodauts, prodautsName));
		}
	}

	/**
	 * 商品名と在庫数を表示する
	 * @throws Exception 
	 */
	public void dispSarcheProduct(String kbn) throws Exception {
		
		// 商品リスト取得
		prodauts = sarchAll.SerchByKbn(kbn);
		// 商品名の重複を省いたリストを取得
		prodautsName = listDeduplication.remove(prodauts);
		
		// 商品名の数だけ表示
		for(String prodautsName : prodautsName) {
			System.out.println("商品名：" + prodautsName + ". 在庫数：" + inventoryManage.getInventory(prodauts, prodautsName));
		}
	}

}
