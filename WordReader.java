package lap7.num7;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class WordReader {
	public static  List<String> wordReader() throws IOException {
		 List<String> listWord=new ArrayList<>();
		File file=new File("inputWord.text");
		FileReader input=new FileReader(file);
		BufferedReader reader=new BufferedReader(input);
		listWord.add(reader.readLine());
		listWord.add(reader.readLine());
		listWord.add(reader.readLine());
	
		return listWord;
	 }
	public static void listOfWords(List<String> word) {
		for(String str:word) {
			System.out.print(str+" ");
		}
		String shortWord=word.get(0);
		String longWord=word.get(0);
		for(String str:word) {
			if(str.length()<shortWord.length())
				shortWord=str;
			if(str.length()>shortWord.length())
				longWord=str;
		}
		System.out.println("the shortest word is :"+shortWord);
		System.out.println("the longest word is :"+longWord);
		
	}
	public static void main(String[] args) throws IOException {
		List<String> result=new ArrayList<>();
		result=wordReader();
		listOfWords(result);
	}

}
