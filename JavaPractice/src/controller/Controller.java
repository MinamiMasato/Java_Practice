package controller;

import web.Display;

/**
 * システムのコントロールクラス
 * 
 * @author minami
 */
public class Controller {

	/**
	 * システムの処理開始
	 */
	public void process(String[] args) {

		Display displaye = new Display();

		try {
			// 引数が有り
			if (args.length == 1) {
				displaye.dispSarcheProduct(args[0]);
				// 引数無し
			} else {
				displaye.dispAllProduct();
			}
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
