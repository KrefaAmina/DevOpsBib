package Factory;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class document {
	public static FileReader fileReader;
	public static FileWriter fileWriterParties, fileWriterCoups;
	
	
	public static List<String> directoryFiles(String path) {
		List<String> listFile = new ArrayList<>();
		File f = new File(path);
		if (f.exists()) {
			if (f.isDirectory()) {
				File[] files = f.listFiles();
				for (int i = 0; i < files.length; i++) {
					if (files[i].isFile()){
						listFile.add(files[i].getName());
					}
				}
			}
		}
		return listFile;
		
	}

}
