package wikidocs;

import java.util.ArrayList;


class Calculator {
    int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }


	int avg(int[] average) {
		int total = 0;
		for(int num : average) {
			total += num;
		}
		return total / average.length;
	}
	
	int avg(ArrayList<Integer> data) {
		int total = 0;
		for (int num: data) {
			total += num;
		}
return total/data.size();
}
		
		
}

	public class Sample {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(10);
        System.out.println(cal.getValue());  // 10 출력
    }
}

		

    

