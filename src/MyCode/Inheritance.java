package MyCode;

	class Parent
	{
	    String name;
	    public void details()
	    {
	      name = "DummyParent";
	        System.out.println(name);
	    }
	}
	public class Inheritance extends Parent {
	    String name;
	    public void details()
	    {
	        super.details();	//calling Parent class details() method
	        name = "DummyChild";
	        System.out.println(name);
	    }
	public static void main(String[] args) {
	
		Inheritance cobj = new Inheritance();
        cobj.details();
	}

}
