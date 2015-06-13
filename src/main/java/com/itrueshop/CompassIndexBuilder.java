package com.itrueshop;

import org.compass.gps.CompassGps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * 通过quartz调度定时重建索引或自动随Spring ApplicationContext启动而重建索引
 * 
 */

public class CompassIndexBuilder implements InitializingBean {
	Logger log =LoggerFactory.getLogger(this.getClass());

	private int lazyTime = 30;// 索引操作线程延时，单位:秒
	private CompassGps compassGps;

	private Thread indexThread = new Thread() {
		@Override
		public void run() {
			try {
				Thread.sleep(lazyTime * 1000);
				log.info("Begin build compass index.");
				compassGps.index();
				log.info("End build compass index.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	};

	public void afterPropertiesSet() throws Exception {
		indexThread.setDaemon(true);
		indexThread.setName("Compass Indexer");
		indexThread.start();
	}

	public void index() {
		compassGps.index();
	}

	public void setLazyTime(int lazyTime) {
		this.lazyTime = lazyTime;
	}

	public void setCompassGps(CompassGps compassGps) {
		this.compassGps = compassGps;
	}
}