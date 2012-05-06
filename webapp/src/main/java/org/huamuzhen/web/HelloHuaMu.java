package org.huamuzhen.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloHuaMu {
	
	public static Logger logger= LoggerFactory.getLogger(HelloHuaMu.class); 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("this is a log in debug");
		logger.info("this is a log");
	}

}
