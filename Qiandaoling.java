package 前导零;
//先10进制转32进制，再前导的零

import java.util.Scanner;

public class Qiandaoling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ans=0,cnt=0;
		//小于0，前导0
		if(n<0)
		{
			ans=0;
		}
		//大于0用循环判断
		else {
			while(n>0) {
				cnt++;
				n/=2;
			}
			ans=32-cnt;
		}
		System.out.println(ans);
		in.close();
	}
}
