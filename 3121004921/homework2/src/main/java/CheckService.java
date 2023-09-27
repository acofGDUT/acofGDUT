package main.java;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CheckService {

	/*
	 * 用来检查用户结果的正确性.
	 */
	public static Map<String,String> Check(String checked,String answer) throws IOException{
		Map<String,String> m = new HashMap<String,String>();
		String e = "";
		String c = "";
		int en = 0;
		int cn = 0;
		
		String str1 = "";
		String str2 = "";
		
//		checked = "1.txt";
//		answer = "2.txt";
		File checkedfile=new File(checked);
		FileInputStream input1=new FileInputStream(checkedfile);
		BufferedReader reader1=new BufferedReader(new InputStreamReader(input1));
		
		File answerfile=new File(answer);
		FileInputStream input2=new FileInputStream(answerfile);
		BufferedReader reader2=new BufferedReader(new InputStreamReader(input2));
		
		
		while((str1=reader1.readLine())!=null&&(str2=reader2.readLine())!=null){
			if(!str1.trim().equals(str2.trim())){
//				System.out.println(str1);
				String[] str = str1.split("\\.");
				e = e + str[0]+ ",";
				en ++ ;
			}else {
//				System.out.println(str1);
				String[] str = str1.split("\\.");
				c = c + str[0] + ",";
				cn ++;
			}
			
		}
		
		if(e.equals("")){
			e = "Wrong: " + en + "";
		}else {
			e = "Wrong: " + en + "(" + e.substring(0,e.length()-1) + ")";
		}
		if(c.equals("")){
			c = "Correct: " + cn + "";
		}else {
			c = "Correct: " + cn + "("+c.substring(0, c.length()-1)+")";
		}
//		System.out.println(e);
//		System.out.println(c);
		m.put("wrong", e);
		m.put("c", c);
		return m;
		}
	
}
