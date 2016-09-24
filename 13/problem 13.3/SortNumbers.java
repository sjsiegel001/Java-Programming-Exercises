package prob133;

import java.util.*;

public abstract class SortNumbers {
	
	public static void main(String[] args) {		
		ArrayList<Number> arrayList = new ArrayList<Number>();
		arrayList.add(39);
		arrayList.add(20);
		arrayList.add(61);
		arrayList.add(59);
		arrayList.add(22);
		arrayList.add(55);
		arrayList.add(8);
		arrayList.add(82);
		arrayList.add(92);
		arrayList.add(43);
		arrayList.add(37);
		arrayList.add(73);
		arrayList.add(98);
		arrayList.add(51);
		arrayList.add(26);
		arrayList.add(28);
		arrayList.add(80);
		arrayList.add(100);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(25);
		arrayList.add(44);
		arrayList.add(97);
		arrayList.add(31);
		arrayList.add(79);
		
		sort(arrayList);

            
    }
	
	public static void sort(ArrayList<Number> list) {
		int size = list.size();
		int i = 0;
		
		NumberSort[] numbs = new NumberSort[size];
		
		for (Number object: list) {
			numbs[i] = new NumberSort(object);
			i++;
		}
		
        List<NumberSort> mynumbers = Arrays.asList(numbs);
        Collections.sort(mynumbers);
        System.out.println(mynumbers);
	}
	
}
