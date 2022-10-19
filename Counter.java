package sing;
class Counter 
{	  
    static int count = 0;
    Counter()
    {
    	count++;
    }
    void Display()
    {
    	System.out.println("Counted Number:"+count);
    }
    public static void main(String args[])
    {
        Counter C1 = new Counter();
        Counter C2 = new Counter();
        Counter C3 = new Counter();
        Counter C4 = new Counter();
        Counter C5 = new Counter();
        C5.Display();
    }
}