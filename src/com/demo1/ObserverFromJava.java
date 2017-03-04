package com.demo1;

import java.util.Observable;
import java.util.Observer;

public class ObserverFromJava implements Observer {

	//参数o对应拉模型，arg对应推模型
	@Override
	public void update(Observable o, Object arg) {
		//拉模型
		System.out.println("获取到消息(拉模式)："+((SubjectFromJava)o).getMessage());
		//推模型
		//System.out.println("获取到消息(推模式)："+(String)arg);
	}

}
