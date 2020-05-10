package com.cognizant.mediator;

public class BasicUser implements IUser {

	

	
	public BasicUser(String name, ChatMediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}

	protected String name;
	protected ChatMediator mediator;
	
	@Override
	public void SendMessage(String msg) {
		// TODO Auto-generated method stub
		mediator.SendMessage(msg);

	}

	@Override
	public void ReceiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+getName()+" "+ msg);
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
