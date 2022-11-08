package duplicatesPresentInArray_1;

public class Duplicates {
public static void main(String[] args) {
	
	
	//Creation of String
	String[]  arr = {"dhaval", "python", "patel", "mahendar","dhaval"};
	
	
	boolean flag = false;
	
	//Taking the first Element and Comparing each other with other element
	
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j = i+1;j<arr.length;j++) {   //Here j = i+1 so its pointing to the second element
			
			
			if(arr[i]==arr[j]) {  
				
				System.out.println("Hurray,We Found the Duplicate Element:" + arr[i]);
				flag = true;
			}
		}
	}
	
	
	if(flag== false) {
		System.out.println("Duplicate Elements was not found");
		
		
	}
}
}
