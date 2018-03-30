package MyCode;


class SyncTable
{
	public synchronized static void display(int num)
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println(num*i); 
		}
		
		try
		{
		Thread.sleep(4000);

		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
		/*Thread th = Thread.currentThread();
		System.out.println(th.getPriority());*/
		}
	}


	
class table5 extends Thread{
	SyncTable st;
	int num=5;
	 table5(SyncTable st){
		 this.st=st;
	 }
    public void run()
    {  
    SyncTable.display(num); 
    }
}

class table10 extends Thread{
	SyncTable st;
	 int num=10;
	 table10(SyncTable st){
		 this.st=st;
	 }
	 
    public void run()
    {  
    SyncTable.display(num); 
    }
}
public class ThreadSync {

	public static void main(String[] args) {
		SyncTable obj = new SyncTable();//only one object  
		table5 t1=new table5(obj);  
		table10 t2=new table10(obj);  
		
		//t1.setPriority();
		//t2.setPriotity();
		t1.start();  
		t2.start();  

	}

}
