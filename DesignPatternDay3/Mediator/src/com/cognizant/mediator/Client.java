package com.cognizant.mediator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChatMediator chat=new ChatMediator();
		
		IUser user1=new BasicUser("Dustin",chat);
		IUser user2=new PremiumUser(chat,"Robbin Buckley");
		IUser user3=new BasicUser("Max",chat);
		IUser user4=new PremiumUser(chat,"Steve Harrington ");
		
		chat.AddUser(user1);
		chat.AddUser(user2);
		chat.AddUser(user3);
		
		user4.SendMessage("Turn Around,Look at what you see.In your eyes,the mirror of your dreams");
		
	}

}
