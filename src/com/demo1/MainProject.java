package com.demo1;

public class MainProject {

	public static void main(String[] args) {
		//create observer
		ObserverImpl1 ob1 = new ObserverImpl1();
		ObserverImpl2 ob2 = new ObserverImpl2();
		
		//create subject
		SubjectImpl subject = new SubjectImpl();
		
		//register observers
		subject.Attach(ob1);
		subject.Attach(ob2);
		
		//send message
		subject.setMessage("今晚不加班！");
		subject.notifyObservers();
		
		subject.setMessage("下月不发钱");
		subject.notifyObservers();
		
		subject.Dettach(ob2);
		subject.setMessage("晚上加餐");
		subject.notifyObservers();
		
		
		//create sub/observer from java demo
		ObserverFromJava obFromJava = new ObserverFromJava();
		SubjectFromJava subFromJava = new SubjectFromJava();
		
		subFromJava.addObserver(obFromJava);
		
		subFromJava.notifyObservers("这是一个使用java自定义观察者的例子");
	}

}
