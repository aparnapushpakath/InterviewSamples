/////// test for dev


public class Permutation {
public static void main(String args[]){
	String name="abcde";
	perm(name);
	//System.out.println(":"+name);
	
}
private static void perm(String name){
	for(int i=name.length()-1;i>=0;i--){
		
		if(name.substring(0,i).length()==2){
	swap(name.substring(0,i));
		}else{
			perm(name.substring(0,i));
		}
	}
	/*
	for(int i=2,j=3;i<=name.length();j--,i++){
		
		String last=name.substring(name.length()-i);
		System.out.println(":"+last);
		String front=name.substring(0, j);
		System.out.println(":"+front);
	if(last.length()==2){
		String newname=front+swap(last);
		System.out.println("new:"+newname);
		}else{
			
			swap(last.substring(0,2));
		
		}}*/
		
}
private static String swap(String last) {
	
	char[] characters=last.toCharArray();
	char temp=characters[0];
	characters[0]=characters[1];
	characters[1]=temp;
	System.out.println(":in:"+String.valueOf(characters));
	return String.valueOf(characters);
	
}
}
