package view;

import java.io.IOException;

import controller.ArquivoController;
import controller.IArquivoController;

public class Principal {

	public static void main(String[] args) {
		IArquivoController arqCont = new ArquivoController();
		//String DIR = "c:\\Windows";
		String path="c:\\TEMP";
		String mari = "generic_food.csv";		
		try {
			//arqCont.readDir(path);
			//arqCont.openFile(path, mari);
			arqCont.readFile(path, mari);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
