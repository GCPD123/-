package com.car;
import java.util.*;

public class main {

	public static void main(String[]  args) {
		// TODO Auto-generated method stub
		Car[] carList = {new zairenCar(0,40,"401",500),new zaihuoCar(50,0,"����",1200),new zairenhehuoCar(5,300,"Ƥ��",800)};
		System.out.println("��ӭʹ�ô���⳵ϵͳ");
		System.out.println("����ϵͳ������1���˳�ϵͳ������2");
		Scanner input = new Scanner(System.in);
		int in1 = input.nextInt();
		if (in1 == 1) {
			System.out.println("�����³��͹���ѡ��");
			System.out.println("���\t������\t�ػ���\t����\t���\t");
			for(int i=0;i<carList.length;i++) {
				System.out.println(i+1+"\t"+carList[i].peopleCapacity+"\t"+carList[i].cargoCapacity+"\t"+carList[i].name+"\t"+carList[i].rent);
				
			}
		}else {System.out.println("�˳�ϵͳ");
			System.exit(0);
		}
	System.out.println("���������Ҫѡ�ĳ���");
	Scanner input1 = new Scanner(System.in);
	int  in = input.nextInt();
	System.out.println("��ѡ�ĳ�Ϊ:"+carList[in].name+"\t�ػ���Ϊ:"+carList[in].cargoCapacity+"\t������Ϊ:"+carList[in].peopleCapacity+"\t���Ϊ:"+carList[in].rent);
	System.out.println("ллʹ�ô���⳵ϵͳ");
	System.exit(0);
	}
	
}