package com.cognizant.mediator;

public class PremiumUser implements IUser {

	

	public PremiumUser(ChatMediator mediator1, String name) {
		super();
		this.mediator1 = mediator1;
		this.name = name;
	}

	private ChatMediator mediator1;
	private String name;
	
	
	
	@Override
	public void SendMessage(String msg) {
		
		// TODO Auto-generated method stub
		mediator1.SendMessage(msg);
		
	}

	@Override
	public void ReceiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("Hi "+getName()+" "+ msg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
