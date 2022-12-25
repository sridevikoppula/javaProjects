package reversenum;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               int x = 343;
               int tem = x;
               int sum = 0;
               while(x>0) {
               int r = x%10;
               sum = (sum*10)+r;
               x = x/10;
               }
               if(sum==tem) {
            	   System.out.println("yes");
               }
               else {
            	   System.out.println("noooo");
               }
	}

}
