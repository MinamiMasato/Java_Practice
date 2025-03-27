package main;

import factory.ControllerRegistry;
import model.Controller;

/**
 * メインクラス
 */
public class Main {

	public static void main(String[] args) {
		ControllerRegistry controllerRegistry = ControllerRegistry.getInstance();
		Controller controll = controllerRegistry.getControerller(args[0]);
		controll.process(args);
	}
}
