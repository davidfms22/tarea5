import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import dm.uniandes.ASE.FileFinder;
import dm.uniandes.ASE.Statistics;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

/***********************************************************************************/
/*                                                                                 */
/* Nombre:         David Francisco Martinez Salcedo                                */
/* Fecha:          28/03/2016                                                      */
/* Descripción:    Programa para integrar numericamente una funcion                */
/*                 utilizando la regla de Simpson                                  */
/*                                                                                 */
/***********************************************************************************/

/**
 * Esta clase es la principal o raiz del programa, y desde esta se reliza toda
 * la logica en general por medio de las demas clases
 * 
 * @author David Martinez
 *
 */

public class Main {

	// Metodos

	/**
	 * Metodo principal del programa.
	 * 
	 * @param args:
	 *            lista de argumentos.
	 */
	public static void main(String[] args) {

		port(Integer.valueOf(System.getenv("PORT")));
		staticFileLocation("/public");

		ArrayList<Double> data1 = new ArrayList<Double>();
		try {
			data1 = (ArrayList<Double>) FileFinder.getData("test1.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<Double> log1 = (ArrayList<Double>) Statistics.logaritList(data1);
		Double avg1 = Statistics.mean(log1);
		Double var1 = Statistics.variance(data1);
		Double dev1 = Math.sqrt(var1);
		ArrayList<Double> result1 = new ArrayList<Double>();
		result1.add(avg1 - (2 * dev1));
		result1.add(avg1 - dev1);
		result1.add(avg1);
		result1.add(avg1 + dev1);
		result1.add(avg1 + (2 * dev1));
		result1 = (ArrayList<Double>) Statistics.antiLogaritList(result1);
		result1 = (ArrayList<Double>) Statistics.roundDown(result1, 4);

		String a1 = "TEST1";
		String a2 = "TEST2";
		String a3 = "TEST3";

		get("/", (request, response) -> {
			Map<String, Object> attributes = new HashMap<>();
			attributes.put("A1", a1);
			attributes.put("A2", a2);
			attributes.put("A3", a3);

			return new ModelAndView(attributes, "index.ftl");
		}, new FreeMarkerEngine());

	}

}
