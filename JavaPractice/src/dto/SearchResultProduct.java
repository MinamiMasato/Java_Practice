package dto;

/**
 * 検索結果の商品
 * 
 * @author minami
 */
public class SearchResultProduct {

	// 商品名
	private String name;

	// 在庫数
	private int inventoryCount;

	/** getter&settet **/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getInventoryCount() {
		return inventoryCount;
	}

	public void setInventoryCount(int inventoryCount) {
		this.inventoryCount = inventoryCount;
	}

}
