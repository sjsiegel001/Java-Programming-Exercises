package prob133;

import java.math.*;


class NumberSort implements Comparable<NumberSort> {

	Number num1;
	
	public NumberSort() {
		
	}
	
	public NumberSort(Number num1) {
        if (num1 == null)
            throw new NullPointerException();
        this.num1 = num1;
    }
	
	
	public Number getNum1() {
		return num1;
	}

	public int compareTo(NumberSort n) {
		return compare(n.getNum1(), this.getNum1());
	}
	
    public int compare(Number a, Number b){
        return new BigDecimal(a.toString()).compareTo(new BigDecimal(b.toString()));
    }


	@Override
	public String toString() {
		return "[" + num1 + "]";
	}

}