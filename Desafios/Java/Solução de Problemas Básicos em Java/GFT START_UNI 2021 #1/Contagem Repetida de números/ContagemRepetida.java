import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class ContagemRepetida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int entrada =sc.nextInt();
		while(entrada --> 0)
			lista.add(sc.nextInt());
		
		SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
		lista.forEach(id -> contaQuant.compute(id, (key , val) -> (val == null ? 1 : val  + 1)));
		
		contaQuant.entrySet().forEach(entry->{
			System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());  
		});
		
		sc.close();
	}
}