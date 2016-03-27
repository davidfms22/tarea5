package dm.uniandes.ASE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Esta clase es la encargada de leer datos o pares de datos
 * desde archivos .txt
 * 
 * @author David Martinez
 *
 */
public final class FileFinder {

	// Constantes
	/**
	 * Ruta principal o adsoluta del proyectos
	 */
	private static String mainPath = new File(".").getAbsolutePath().toString();

	// Metodos
	/**
	 * Este metodo busca un archivo por una ruta dada, y lo recorre, linea a
	 * linea para obtener todos los numeros dobles.
	 * 
	 * @param pFilePath: la ruta del arrchivo que contiene los datos.
	 * @return data: lista con todos los datos recuperados en el archivo.
	 * @exception IOException
	 * @exception FileNotFoundException
	 */
	public static List<Double> getData(String pFilePath) throws FileNotFoundException, IOException {
		String num;
		FileReader file = new FileReader(mainPath.replace(".", pFilePath));
		BufferedReader linesFile = new BufferedReader(file);
		List<Double> data = new ArrayList<Double>();

		while ((num = linesFile.readLine()) != null) {
			if (!num.equals("")) {
				data.add(Double.parseDouble(num));
			}

		}
		linesFile.close();
		return data;
	}

	/**
	 * Este metodo busca un archivo por una ruta dada, y lo recorre, linea a
	 * linea para obtener las parejas de numeros dobles.
	 * 
	 * @param pFilePath: la ruta del arrchivo que contiene los datos.
	 * @return pairData: lista con todas las parejas de datos recuperados en el
	 *         archivo.
	 * @exception IOException
	 * @exception FileNotFoundException
	 */
	public static HashMap<String, List<Double>> getPairData(String pFilePath) throws FileNotFoundException, IOException {
		FileReader file = new FileReader(mainPath.replace(".", pFilePath));
		BufferedReader linesFile = new BufferedReader(file);
		String line;
		List<Double> x = new ArrayList<Double>();
		List<Double> y = new ArrayList<Double>();

		while ((line = linesFile.readLine()) != null) {
			if (!line.equals("")) {
				String nums[] = line.split("-");
				x.add(Double.parseDouble(nums[0]));
				y.add(Double.parseDouble(nums[1]));
			}

		}
		linesFile.close();

		HashMap<String, List<Double>> pairData = new HashMap<String, List<Double>>();
		pairData.put("x", x);
		pairData.put("y", y);

		return pairData;
	}

}
