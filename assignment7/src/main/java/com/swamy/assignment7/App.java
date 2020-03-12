package com.swamy.assignment7;

import AdapterPattern.DriverAdapter;
import BridgePattern.DriverBridge;
import CommandPattern.DriverCommand;
import PrototypePattern.DriverPrototype;
import SingletonPattern.DriverSingleton;
import TemplatePattern.TemplatePatternDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}