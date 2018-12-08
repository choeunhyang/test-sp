package com.test.sp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	/*public static String[] sli(String[] str1, String[] str2) {
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
		String[][] st1 = {
				{"a","b","c","c"},
				{"a","c"} // -->"b","c"
			};
		String[][] st2 = {
				{"abc","tt","tt"},
				{"tt","tt"} // -->"abc"
			};
		
		
		String[] str1 = {"a","b","c","c"};
		String[] str2 = {"a","c"};
		System.out.println(sli(str1,str2));
	}
}*/

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
    }*/
	
	/*public static void test(String[] targets, String[] compares) {
		Map<String,Integer> cm = new HashMap<>();
		for(String compare:compares) {
			Integer i = cm.get(compare);
			cm.put(compare,(i==null?1:++i));
		}
		String answer ="";
		for(String target:targets) {
			Integer i = cm.get(target);
			if(i==null || i==0) {
				answer += target;
			}else {
				cm.put(target, --i);
			}
		}
		System.out.println(answer);
	}
	
	
	public static void main(String[] args) {
		
	}*/
	
	//[[신발, 블루],[신발, 레드],[티,블루],[티,레드]]
	
	private static Integer test4(String[][] compares) {
		Map<String[],Integer> cm = new HashMap<>();
		Integer result = 0;
		for(String[] compare:compares) {
			Integer i = cm.get(compare);
			cm.put(compare,(i==null?1:++i));
		}
		
		return result;
	}
	
	public static void main(String[] args) {
				/*{"신발","blue"},{"신발","red"},
				{"상의","blue"},{"상의","red"},{"상의","green"},
				{"바지","blue"},{"바지","red"}*/
		/*String[][] compares ={ 
					{"신발","blue","red"},
					{"상의","blue","red","green"},
					{"바지","blue","red"}
				};*/
		/*Map<String,List<String>> abc = new HashMap<>();
		abc.put({"신발",{"blue","red"}});
		System.out.println(test4(compares));*/
	}

}