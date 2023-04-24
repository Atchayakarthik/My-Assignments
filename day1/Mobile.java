package week1.day1;

public class Mobile {
     public void SendSms()
     {
    	 System.out.println("Hi Darling");
     }
     public void AllowVoiceCall()
     {
    	 System.out.println("voice call");
     }
     public void TakeVideo()
     {
    	 System.out.println("Take Video");
     }
     public static void main(String[] args) {
		Mobile obj=new Mobile();
		obj.SendSms();
		obj.AllowVoiceCall();
		obj.TakeVideo();
	}
}

