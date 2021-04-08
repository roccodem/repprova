import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class GenericsOne {

	public static void addElem(List<? super Integer> list ) {
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

	}

	// TODO modificare metodo
	public static double sumOfList(List<? extends Number> list ) {
		double d=0;
		// commento branch
		for (Number n : list) {
			d += n.doubleValue();
		}
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bottiglia<Persona> b = new Bottiglia<Persona>(new Persona(1, "de marco","rocco","cmr....")); 	
//		Bottiglia<Double> d = new Bottiglia<Double>(10.2); 	
//
//		BraccioAutomatico ba = new BraccioAutomatico();
//		ba.prendiBottiglia(b);
//		ba.prendiBottiglia(d);
		//System.out.println(b.getContenuto());
		//System.out.println(d.getContenuto());
		
		List<Integer> l = Arrays.asList(1,2,3);
		System.out.println("Somma di Interi:"+ sumOfList(l));

		List<Double> dd = Arrays.asList(1.0,2.2,3.5);
		System.out.println("Somma di Double:"+ sumOfList(dd));

		List<Integer> ls = new ArrayList<>();
		addElem(ls);
		//List<Double> ld = new ArrayList<>();
		//addElem(ld);
	}

}
