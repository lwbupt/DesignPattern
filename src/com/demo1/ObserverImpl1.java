package com.demo1;

public class ObserverImpl1 implements Observer {

	private String name;
	
	public ObserverImpl1(){
		name = "后勤部";
	}
	
	@Override
	public void update(Subject subject) {
		
		System.out.println(name+"收到消息:"+((SubjectImpl)subject).getMessage());
	}

}
