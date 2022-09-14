package TestStrings;

/*How to calculate the two angles with respect to 12:00? 
The minute hand moves 360 degrees in 60 minute(or 6 degrees in one minute) 
and hour hand moves 360 degrees in 12 hours(or 0.5 degrees in 1 minute). 
In h hours and m minutes, the minute hand would move (h*60 + m)*6 
and hour hand would move (h*60 + m)*0.5. 
*/

public class AngleFromClock {
	
    // Function to calculate the angle
    static double calcAngle(String arg)
    {
    	double angle;

    	int hr = Integer.valueOf(arg.split(":")[0]);
    	int mint = Integer.valueOf(arg.split(":")[1]);
    	    
    	if (hr <0 || hr>12 && mint < 0 || mint > 60)
    	  return -1;
    	            
    	if (hr == 12)
    	  hr = 0;
    	if (mint == 60){
    	  mint = 0;
    	  hr += 1;
    	  if(hr>12)
    	    hr = hr-12;
    	}
    	 
    	double hour_angle = (double)(0.5 * (hr*60 + mint));
    	double minute_angle = (double)(6*mint);

    	angle = Math.abs(hour_angle - minute_angle);
    	 
    	angle = Math.min(360-angle, angle);

    	return Math.abs(angle);
    }
     
    // Driver Code
    public static void main (String[] args)
    {
        System.out.println(calcAngle("9:60")+" degree");
        System.out.println(calcAngle("3:30")+" degree");
    }
}

