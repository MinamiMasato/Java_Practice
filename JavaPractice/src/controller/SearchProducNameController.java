package controller;

import Exception.ApplicationException;
import dto.SearchResultProduct;
import model.Controller;
import service.SearchProductNameService;
import web.ErrorMessageDisplay;
import web.SearchResultDisplay;

/**
 * システムのコントロールクラス
 * 
 * @author minami
 */
public class SearchProducNameController implements Controller {

	/**
	 * システムの処理開始
	 */
	@Override
	public void process(String[] options) {

		SearchResultDisplay display = new SearchResultDisplay();

		// 商品の検索結果
		SearchResultProduct result = new SearchResultProduct();

		SearchProductNameService searchProductNameService = new SearchProductNameService();

		try {
			if (options.length >= 3 || options[1].isBlank()) {
				throw new ApplicationException("引数が違います");
			}
			result = searchProductNameService.getSerachResult(options[1]);
		} catch (Exception e) {
			ErrorMessageDisplay errordisp = new ErrorMessageDisplay();
			errordisp.dispMessage(e.getMessage());
			e.printStackTrace();
			return;
		}
		display.dispSearchResult(result);
	}

}
