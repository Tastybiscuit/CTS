package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.readers.ReaderAngajat;;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati;
		try {
			listaAngajati = ReaderAngajat.readAngajati("angajati.txt");
			for(Angajat angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			//  sds TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
