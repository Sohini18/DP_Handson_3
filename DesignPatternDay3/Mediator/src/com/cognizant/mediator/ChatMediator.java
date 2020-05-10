package com.cognizant.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private List<IUser> users=new ArrayList<IUser>();
	
	@Override
	public void SendMessage(String msg) {
		
		for(IUser user :users)
		{
			
				user.ReceiveMessage(msg);
			
		}
		
	}

	@Override
	public void AddUser(IUser user) {
		this.users.add(user);
		
	}

}
