package addition;

public class arraydeme {

	public static void main(String[] args) {
	int[] a= {8,15,13};
     int i;
	int l=0,sl=0;
	for(i=0;i<a.length;i++){
		if(a[i]>l){
			sl=l;
			l=a[i];
		} 
		else if(a[i]>sl && a[i]!=l)
			sl=a[i];
	}
	System.out.println("Second Largest Number is"+sl);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
