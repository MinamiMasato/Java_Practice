package controller;

import service.SearchProductListService;
import web.Display;

/**
 * システムのコントロールクラス
 * 
 * @author minami
 */
public class SearchProductListController {

	/**
	 * システムの処理開始
	 */
	public void process(String[] options) {

		Display display = new Display();

		if (options == null || options.length >= 3) {
			System.out.println("引数エラーです。");
			return;
		}
		SearchProductListService searchProductListService = new SearchProductListService();

		try {
			display.dispProduact(searchProductListService.getList(options[1]));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
