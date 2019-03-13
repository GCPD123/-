package com.car;
import java.util.*;

public class main {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Car[] carList = {new zairenCar(0,40,"401",500),new zaihuoCar(50,0,"货车",1200),new zairenhehuoCar(5,300,"皮卡",800)};
		System.out.println("欢迎使用达达租车系统");
		System.out.println("进入系统请输入1，退出系统请输入2");
		Scanner input = new Scanner(System.in);
		int in1 = input.nextInt();
		if (in1 == 1) {
			System.out.println("有如下车型供您选择");
			System.out.println("序号\t载人量\t载货量\t名称\t租金\t");
			for(int i=0;i<carList.length;i++) {
				System.out.println(i+1+"\t"+carList[i].peopleCapacity+"\t"+carList[i].cargoCapacity+"\t"+carList[i].name+"\t"+carList[i].rent);
				
			}
		}else {System.out.println("退出系统");
			System.exit(0);
		}
	System.out.println("请输出你想要选的车车");
	Scanner input1 = new Scanner(System.in);
	int  in = input.nextInt();
	System.out.println("您选的车为:"+carList[in].name+"\t载货量为:"+carList[in].cargoCapacity+"\t载人量为:"+carList[in].peopleCapacity+"\t租金为:"+carList[in].rent);
	System.out.println("谢谢使用达达租车系统");
	System.exit(0);
	}
	
}