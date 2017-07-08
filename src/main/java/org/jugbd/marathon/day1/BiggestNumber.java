package org.jugbd.marathon.day1;


public class BiggestNumber {
    public static long findTheNextBiggerNumber(int n) {
        //write your awesome code here
        if(n<=10){
			return -1;
		}
    
		int quotient=0, i=0, maxChk=0;
		int mod[] = new int[20];
    
		quotient = n/10;
		mod[i++] = n%10;
		maxChk = mod[i-1];
    
		while(quotient != 0){
			mod[i++] = quotient%10;
			if(maxChk > mod[i-1]){
				break;
			}
			else{
				maxChk = mod[i-1];
			}
			quotient = quotient/10;
			//i++;
		}

		for(int j=0 ; j<i ; j++){
			//System.out.println("  " + mod[j]);
		}
		//System.out.println("quotient :  " + quotient);
		int j = 0;
		int m=quotient%10, nm = 2144783000, nmf=0;
		for(j=0 ; j<i ; j++){
			if(mod[j]>m && mod[j]<nm){
				nm = mod[j];
				nmf = j;
			}
		}
		
		//System.out.println("nm :  " + nm+ "  "+nmf);
		
		if(quotient == 0){
			return -1;
		}
		
		mod[nmf] = 20;
		quotient = quotient/10;
		quotient = quotient*10+nm;
		//System.out.println("quotient :  " + quotient);
		nm = 2144783000;
		mod[i]=m;
		int lChk=0;
		j=0;
		//System.out.println("i :  " + i);
		while(j != i){
			int k=0;
			for(k=0 ; k<i ; k++){
				if(mod[k]==20){
					lChk++;
					continue;
				}
				if(mod[k]<nm){
					nm = mod[k];
					nmf = k;
				}
			}
			if(lChk==i){
				break;
			}else{
				lChk=0;
				quotient = quotient*10+nm;
				mod[nmf] = 20;
			}
			
			
			
			nm = 2144783000;
			//System.out.println("i :  " + i+" j : "+j+" mod : "+mod[j]);
			j++;
			
		}
		
		//System.out.println("quotient :  " + quotient);
        return quotient;
    }
}
