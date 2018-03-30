package MyCode;
class syncEx
{

public synchronized static void display(String arr[])
{
for(int i=0; i<arr.length; i++)
{
try
{
Thread.sleep(400);

}
catch(Exception e)
{
e.printStackTrace();
}
Thread t = Thread.currentThread();
System.out.println(t.getName()+":"+ arr[i]);
}
}
}


public class SyncDemo extends Thread {
		String val[]={"enter pin","enter name","enter amount","collect cash","exit"};
		public void run()
		{
		syncEx.display(val);
		}


	public static void main(String[] args) {
		SyncDemo d1 = new SyncDemo();
		SyncDemo d2 = new SyncDemo();

		d1.setName("Prabhat");
		d2.setName("Jothi");
		d1.start();
		d2.start();


	}

}
