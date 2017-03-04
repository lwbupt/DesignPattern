package com.demo1;

import java.util.Observable;

//利用java自定义实现
public class SubjectFromJava extends Observable {
	
	private String message = "";

	public String getMessage() {
		return message;
	}
	
	public void notifyObservers(String msg){
		this.message = msg;
		//注意通知前要调用setChanged方法
		this.setChanged();
		//拉模型
		this.notifyObservers();
		//推模型
		//this.notifyObservers(msg);
	}
	
}
