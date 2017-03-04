package com.demo1;

public class ObserverImpl2 implements Observer {

	private String name;
	
	public ObserverImpl2(){
		name = "研发部";
	}
	
	@Override
	public void update(Subject subject) {
		
		System.out.println(name+"收到消息:"+((SubjectImpl)subject).getMessage());
	}

}
