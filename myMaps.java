import java.util.HashMap;
import java.util.Map;

public class myMaps {
	static Map<Integer, Character> hexadecimalMap_FromINT = new HashMap<>();
	static Map<Character, Integer> hexadecimalMap_FromCHAR = new HashMap<>();
	
	static void fillMap() {
	
		myMaps.hexadecimalMap_FromINT.put(10, 'A');
		myMaps.hexadecimalMap_FromINT.put(11, 'B');
		myMaps.hexadecimalMap_FromINT.put(12, 'C');
		myMaps.hexadecimalMap_FromINT.put(13, 'D');
		myMaps.hexadecimalMap_FromINT.put(14, 'E');
		myMaps.hexadecimalMap_FromINT.put(15, 'F');
		
		myMaps.hexadecimalMap_FromCHAR.put('A', 10);
		myMaps.hexadecimalMap_FromCHAR.put('B', 11);
		myMaps.hexadecimalMap_FromCHAR.put('C', 12);
		myMaps.hexadecimalMap_FromCHAR.put('D', 13);
		myMaps.hexadecimalMap_FromCHAR.put('E', 14);
		myMaps.hexadecimalMap_FromCHAR.put('F', 15);
		
	}
}