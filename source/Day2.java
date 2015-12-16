package source;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Day2 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("/home/local/ZOHOCORP/srijitha-2260/Jitha/AdventOfCode/day2/input.txt")));
		String input;
		int total = 0;
		while((input = br.readLine()) != null){
			String[] nums = input.split("x");
			int[] n = {0,0,0};
			for(int i=0;i<nums.length;i++){
				n[i] = Integer.parseInt(nums[i]);
			}
			int[] side = {0,0,0};
			int k = 1;
			int min=0;
			for(int i=0;i<n.length;i++){
				
				if(i == n.length-1){
					side[i]=n[i]*n[0];
				}else{
				side[i]=n[i]*n[i+1];
				}
				
				if((i == 0) || (min > side[i]))
					min = side[i];
			}
			
			total+= min;
			for(int i=0;i<n.length;i++){
				total += 2*side[i];
			}
		}
		
		System.out.println(total);
	}

}