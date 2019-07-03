package main.java.com.stackroute.junit;
/*
program to check fif the number is a poer of four or not
 */
public class CheckPowerForFour {
    public String checkPower(int num)
    {
        int sum=1;
        for(int i=0;i<num;i++)//multiplying  numbers by four
        {
            sum=sum*4;
            if(sum==num)//comparing with the given number
            {

                return "it is power of 4";
            }
        }
        return "it is not a power of 4";
    }

}
