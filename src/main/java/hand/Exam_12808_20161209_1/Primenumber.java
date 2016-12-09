package hand.Exam_12808_20161209_1;

import java.util.ArrayList;
import java.util.List;

public class Primenumber<E> {

	
	public void putNum(){
		List<Integer> list = new ArrayList<Integer>();
		int count = 0;
		int count1 = 0;
		first:for (int i = 101; i <= 200; i++) {
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					//重点：跳过最外层的本次循环。
					continue first;
				}
			}
			count++;
			list.add(i);
		}
		System.out.print("101-200间总共有"+count+"个素数，分别是:");
		//为了遍历集合，判断当输出最后一个数时不打印逗号",".
		for (int i = 0; i < list.size(); i++) {
			count1++;
			if(count1==list.size()){
				System.out.print(list.get(i));
			}else{
				System.out.print(list.get(i)+",");
			}
		}
	}

	public static void main(String[] args) {
		new Primenumber().putNum();
		
	}
	
}
