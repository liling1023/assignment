package java3;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputMaxWeight {
	public static String maxWeight(StringBuffer buffer) {
		
		 Pattern expression = Pattern.compile("[a-zA-Z]+");// 定义正则表达式匹配单词
	        String string = buffer.toString();
	        Matcher matcher = expression.matcher(string);//
	        Map<String, Integer> map = new TreeMap<String, Integer>();
	        String word = "";
	        int times = 0;
	        while (matcher.find()) {
	            word = matcher.group();
	            if (map.containsKey(word)) {
	                times = map.get(word);
	                map.put(word, times + 1);
	            } else {
	                map.put(word, 1);
	            }
	        }
	        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
	                map.entrySet());
	        Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> left,
	                    Map.Entry<String, Integer> right) {
	                return (left.getValue()).compareTo(right.getValue());
	            }
	        };
	        Collections.sort(list, comparator);
	        int last = list.size() - 1;
	        for (int i = last; i > last - 10; i--) {
	            String key = list.get(i).getKey();
	            Integer value = list.get(i).getValue();
	            System.out.println(key + " :" + value);
	        }
			return word;
	}

	public static void main(String[] args) throws IOException {
		String fileName1 = "C:\\Users\\TEMP.114-20150325VTZ.006\\Desktop\\src.txt";
		FileReader fr = new FileReader(fileName1);
		BufferedReader reader = new BufferedReader(fr);
		 StringBuffer buffer = new StringBuffer();
		String line = null;
		while ((line = reader.readLine()) != null) {
			 buffer.append(line);
		}
		reader.close();
		System.out.println(maxWeight(buffer));
	}
}
