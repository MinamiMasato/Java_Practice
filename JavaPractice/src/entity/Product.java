package entity;

/**
 * 商品
 * 
 * @author minami
 */
public class Product {

	// ID
	private String id;
	// 区分
	private String kbn;
	// 名前
	private String name;

	public Product(String id, String kbn, String name) {
		this.id = id;
		this.kbn = kbn;
		this.name = name;
		
	}

	/**
	 * IDの設定
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 区分の設定
	 * @param id
	 */
	public void setKbn(String kbn) {
		this.kbn = kbn;
	}

	/**
	 * 名前の設定
	 * @param id
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * IDの返却
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * 区分の返0却
	 * @return kbn
	 */
	public String getKbn() {
		return kbn;
	}

	/**
	 * 名前の返0却
	 * @return name
	 */
	public String getName() {
		return name;
	}
}
