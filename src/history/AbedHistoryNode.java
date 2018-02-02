
package history;

import java.util.ArrayList;

public class AbedHistoryNode 
{
	private String input;
	private String output;
	private ArrayList<String> xCoordinate;
	private ArrayList<String> yCoordinate;
	

	public AbedHistoryNode(String input,String output)
	{
		this.input = input;
		this.output = output;
	}
	public AbedHistoryNode(String input, ArrayList<String> xCoordinate,ArrayList<String> yCoordinate)
	{
		this.input = input;
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public String getInput()
	{
		return input;
	}
	
	public void setInput(String input) 
	{
		this.input = input;
	}
	
	public String getOutput() 
	{
		return output;
	}
	
	public void setOutput(String output)
	{
		this.output = output;
	}
	
}
