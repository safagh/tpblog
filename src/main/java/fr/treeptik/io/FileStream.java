package fr.treeptik.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	@SuppressWarnings("unused")
	private static void ecrire(String s) throws FileNotFoundException,
			IOException {
		FileOutputStream fout = new FileOutputStream("file_AOP.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		byte b[] = s.getBytes();// conversion du String en tableau de byte (d'octet)
		bout.write(b);// çaremplit

		bout.flush();// ça le vide
		bout.close();
		fout.close();
		System.out.println("succès");
		
	}
}
