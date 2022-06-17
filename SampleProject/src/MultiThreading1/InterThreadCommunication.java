package MultiThreading1;

public class InterThreadCommunication {
	int a;

	synchronized void set(int a1)
	{
		System.out.println("Setting data "+a);
		this.a=a1;
	}
	synchronized void get()
	{
		System.out.println("Getting data " +a);
	}
}
