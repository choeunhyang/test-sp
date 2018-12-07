package com.test.sp;

public class Test {
	
	/*public static boolean sum(String[] str) {
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str.length;j++) {
				if(i!=j && str[j].indexOf(str[i])==0){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String[] st = {"123","234","345"};
		System.out.println(sum(st));
	}*/
	
	public static String[] sli(String[] str1, String[] str2) {
		for(int i=0;i<str1.length;i++) {
			for(int j=0;j<str2.length;j++) {
				if(str1[i]==str2[j]) {
					str1[i].split(str2[j]);
				}
			}
		}
		return str1;
	}
	
	public static void main(String[] args) {
		/*String[][] st1 = {
				{"a","b","c","c"},
				{"a","c"} // -->"b","c"
			};
		String[][] st2 = {
				{"abc","tt","tt"},
				{"tt","tt"} // -->"abc"
			};
		*/
		
		String[] str1 = {"a","b","c","c"};
		String[] str2 = {"a","c"};
		System.out.println(sli(str1,str2));
	}
}

/*class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int i=0;
        int cnt = 0;
        for(int j = 0;j<completion.length;j++){
            if(participant[i]==completion[j]){
                cnt += 1;   
            }else{
                cnt += 0;
            }
            if(cnt==0){
                answer = participant[i];
            }
            cnt = 0;
            i++;
        }
        return answer;
    }
}*/