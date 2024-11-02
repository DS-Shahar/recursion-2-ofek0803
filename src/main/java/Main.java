package recartion2;

public class ofek {
	
	public static int q14(int []arr,int x) {
		if (x==0)
			return arr[x];
		return q14(arr,x-1)+arr[x];
	}
	
	public static int q15(int [] arr,int x) {
		if (x==0) {
			if (arr[x]>0)
				return 1;
			return 0;
		}
		if (arr[x]<=0) 
			return q15(arr,x-1)+0;
		return q15(arr,x-1)+1;
	}
	
	public static int q16(int [] arr,int x,int z) {
	if (z<0)
		return -1;
	if (arr[z]==x)
		return z;
	return q16(arr,x,z-1);
	}
	
	public static boolean q17(int [] arr,int x) {
		if (x==0)
			return true;
		if (arr[x]>arr[x-1])
			return q17(arr,x-1);
		return false;
	}
	
	public static boolean q18(int [] arr,int x) {
		if (arr.length==x)
			return true;
		if (!prime(arr[x],arr[x-1]))
			return false;
		return q18(arr,x+1);
	}
	
	public static boolean prime(int a,int b) {
		if(b<=1)
			return true;
		if (a%b==0)
			return false;
		return prime(a,b-1);
		
	}
	
	public static int q19(int [][] arr,int x,int y,int z) {
		if (y<0)
			return 0;
		if (z>arr[y].length-1)
			return q19(arr,x,y-1,0);
		if (arr[y][z]==x)
			return 1+q19(arr,x,y-1,0);
		return 1+q19(arr,x,y,z+1);
	}
	
	public static boolean q20(int [] arr,int x,int y) {
		if (x>=y)
			return true;
		if (arr[x]==arr[y])
			return q20(arr,x+1,y-1);
		return false;
	}
	
}
