package com.demo1;

import java.util.ArrayList;
import java.util.List;

//主题类(被观察者基类)
public class Subject {
	
	//观察者列表
	private List<Observer> observerlist;
	
	public Subject(){
		observerlist = new ArrayList<Observer>();
	}
	//增加观察者
	public void Attach(Observer ob){
		observerlist.add(ob);
	}
	
	//删除观察者
	public void Dettach(Observer ob){
		observerlist.remove(ob);
	}
	
	public void notifyObservers(){
		for(Observer ob:observerlist){
			ob.update(this);
		}
	}
}
