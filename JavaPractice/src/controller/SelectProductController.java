package controller;

import model.Controller;
import service.SearchProductListService;
import web.ListDisplay;

public class SelectProductController implements Controller{

	/**
	 * システムの処理開始
	 */
	@Override
	public void process(String[] options) {

		ListDisplay display = new ListDisplay();

		if (options.length >= 3) {
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
