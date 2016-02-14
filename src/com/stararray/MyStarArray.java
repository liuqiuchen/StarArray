package com.stararray;
/**
 * 星星阵系统
 * Java循环语句中多重循环
 * 
 * =====================请在Java环境中Console控制台运行查看结果========================
 * */
public class MyStarArray {
	public static void main(String[] arg){	//程序的入口
		
		System.out.println("打印直角三角形");
        
		for(int i = 1;i <= 5;i++){	//规定有5行
			for(int j = 1;j <= i;j++){	//控制每行的个数
				System.out.print("*");
			}
			
			//每打印完一行后进行换行
			System.out.println();
		}
		
	}
}
/**
 * System.out.println()与System.out.print()的区别：
 * System.out.println()输出信息后会换行，
 * System.out.print()输出信息后不会换行
 */
