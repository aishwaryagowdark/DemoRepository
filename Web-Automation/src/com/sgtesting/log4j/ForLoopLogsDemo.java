package com.sgtesting.log4j;

import java.util.logging.Logger;

public class ForLoopLogsDemo {

	public static void main(String[] args) {
		getLogs();

	}
	private static Logger Log=Logger.getLogger("Loop Output");
	private static void getLogs()
	{
		Log.info("For Loop Execution started here..");
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				Log.info("Even Number :"+i);
			}
		}
		Log.info("For Loop Execution ended here...");
	}
	
   
}
