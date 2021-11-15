package bridgelabz;

public class HashTableUc2 {
	public int hashCode(){
	    String str = null;
		return (int) str.hashCode();
	  }
     public static void main(String[] args) {
    	 HashTableUC1 hm=new HashTableUC1();
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";  
        int[] freq = new int[str.length()];  
        int i, j;  
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++; 
                    string[j] = '0';  
                }  
            }  
        }  
          
        System.out.println("Characters and their corresponding frequencies");  
       
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);    
        }  
    }  

}
