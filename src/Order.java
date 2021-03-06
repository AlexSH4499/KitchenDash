

public class Order
{
	private int time_to_process;
	private double cost;
	private boolean done;
	
	public Order(int time,  double cost)
	{
		this.time_to_process = time;
		this.cost = cost;
		this.done = false;
		
	}
	
	/**
	 * 
	 * @return time remaining for the order to finish
	 */
	public int timeRemaining()
	{
		return this.time_to_process;
	}
	
	/**
	 * 
	 * @return the cost of the order
	 */
	public double cost()
	{
		return this.cost;
	}
	
	/**
	 * 
	 * @return the state of the  order
	 */
	public boolean state()
	{
		return this.done;
	}
	
	/**
	 * toggles the order's state
	 */
	public void  processedOrder()
	{
		this.done = true;
	}
	
	/**
	 *  modifies the time remaining by -1
	 *  for each call that is made
	 */
	public void decrementTime()
	{
		if(timeRemaining()> 0 )
			this.time_to_process--;
		else{
			System.out.println("Already passed time remaining!");
		}
	}

}
