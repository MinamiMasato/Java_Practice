package main;

import controller.SearchProductListController;

/**
 * メインクラス
 */
public class Main {

	public static void main(String[] args) {
		SearchProductListController controll = new SearchProductListController();
		controll.process(args);
	}

}
