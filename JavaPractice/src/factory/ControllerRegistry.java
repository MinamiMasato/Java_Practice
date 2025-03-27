package factory;

import java.util.HashMap;
import java.util.Map;

import controller.SearchProducNameController;
import controller.SearchProductListController;
import controller.SelectProductController;
import model.Controller;
import service.PropatieReader;

public class ControllerRegistry {
	
	private static ControllerRegistry instatnce;
	private Map<String, Controller> controllerMap;
	private PropatieReader propatieReader;
	
	private ControllerRegistry() {
		controllerMap = new HashMap<>();
		propatieReader = new PropatieReader();
		setControllers();
	}

	public Controller getControerller(String function) {
		return controllerMap.get(function);
	}

	/**
	 * コントローラー登録機能のインスタンスを生成する
	 * 
	 * @return instatnce
	 */
	public static ControllerRegistry getInstance() {
		if(instatnce == null) {
			instatnce = new ControllerRegistry();
		}
		return instatnce;
	}
	
	public void setControllers() {
		controllerMap.put(propatieReader.getServiceName("function.SearchProduct"), new SearchProductListController());
		controllerMap.put(propatieReader.getServiceName("function.SelectProduct"), new SelectProductController());
		controllerMap.put(propatieReader.getServiceName("function.SearchProductName"), new SearchProducNameController());
	}
}
