package controller;
import java.io.IOException;


public interface IArquivoController {
	
	public void readDir(String path) throws IOException;
	public void createFile(String path, String arquivo) throws IOException;
	public void readFile(String path, String arquivo) throws IOException;
	public void openFile(String path, String arquivo) throws IOException;


		
}
