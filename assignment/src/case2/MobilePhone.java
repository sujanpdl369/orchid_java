package case2;

import java.io.*;

public class MobilePhone {
	public static void main(String [] args) throws IOException {
//		This program creates Class named phone such that user can
//		call to another user and send message to another user.
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);
		Phone john = new Phone(br);
		Phone charlie = new Phone(br);
		john.dial(charlie);
		charlie.messageSend(br, john);
	}

}

class Phone{
	String user_name;
	String phone_num;
	String recentMessage;
	
	Phone(BufferedReader b) throws IOException{
		System.out.println("Enter your name:");
		this.user_name = b.readLine();
		System.out.println("\nEnter your number:");
		this.phone_num = b.readLine();
		System.out.println("\n\n");
	}
	
	public String getNum() {
		return this.phone_num;
	}
	public String getUserName() {
		return this.user_name;
	}
	
	public void dial(Phone receiver) {
		System.out.println("Calling to user:"+receiver.getUserName()+"\n phone number:"+receiver.getNum()+"\n\n");
		receiver.receive(this);
	}
	
	public void receive(Phone sender) {
		System.out.println("Phone call from user:"+sender.getUserName()+"\n Phone number:"+sender.getNum()+"\n\n");
	}
	public void messageSend(BufferedReader b, Phone receiver) throws IOException{
		System.out.println("Sender Name:"+this.user_name+"\t\t"+"Sender Number:"+this.phone_num+"\n\n");
		System.out.println("Receiver Name:"+receiver.getUserName()+"\t\t"+"Receiver Number"+receiver.getNum()+"\n\n");
		System.out.println("Enter the message to be sent :");
		this.recentMessage = b.readLine();
		System.out.println("\n\n");
		messageReceive(this,recentMessage);
	}
	public void messageReceive(Phone sender,String message) {
		System.out.println("Sender Name:"+sender.getNum()+"\t\t"+"Sender Number:"+sender.getUserName()+"\n\n");
		System.out.println("Reciever Name:"+this.phone_num+"\t\t"+"Sender Number:"+this.user_name+"\n\n");
		System.out.println("Message :"+message);
	}
}
