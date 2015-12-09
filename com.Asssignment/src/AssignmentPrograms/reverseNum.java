package AssignmentPrograms;

public class reverseNum {
	
	public int numRev(int num){
		int rev=0;
		
		while(num!=0){
			rev=(rev*10)+(num%10);
			num=num/10;
		}return rev;
	}
	
	public static void main(String[] args){
		reverseNum n=new reverseNum();
		System.out.println("result:"+n.numRev(1234));
	}
}
