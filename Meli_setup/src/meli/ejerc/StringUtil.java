package meli.ejerc;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String resultado = "";

		for(int i = 0; i < n; i++ )
		{
			resultado = resultado + c;
		}

		return resultado;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String resultado = s;

		String mask = replicate('0',n - s.length());

		return mask + resultado;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] resultado = new String[arr.length];

		for(int i=0; i < arr.length; i++)
		{
			resultado[i] = Integer.toString(arr[i]);
		}

		return resultado;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] resultado = new int[arr.length];

		for(int i=0; i < arr.length; i++)
		{
			resultado[i] = Integer.parseInt(arr[i]);
		}

		return resultado;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int cantidadCaracteres = 0;

		for(int i=0; i < arr.length; i++)
		{
			if(cantidadCaracteres < arr[i].length())
			{
				cantidadCaracteres = arr[i].length();
			}
		}

		return cantidadCaracteres;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int longitudMayor =  maxLength(arr);

		for(int i=0; i < arr.length; i++)
		{
			arr[i] = lpad(arr[i], longitudMayor , c);
		}
	}

	/**
	 * Metodo que se encarga de crear un nuevo hashMap
	 * */
	public static HashMap<String, ArrayList<String>> crearHashMap()
	{
		HashMap<String,  ArrayList<String>> hashMap = new HashMap<>();

		hashMap.put("L0",null);
		hashMap.put("L1",null);
		hashMap.put("L2",null);
		hashMap.put("L3",null);
		hashMap.put("L4",null);
		hashMap.put("L5",null);
		hashMap.put("L6",null);
		hashMap.put("L7",null);
		hashMap.put("L8",null);
		hashMap.put("L9",null);

		return hashMap;
	}


	/*
	*Metodo que se encarga de agregar un valor al hashmap.
	* Lo hace inteligentemente fijandose la posicion que se envia por parametro por ejemplo
	* numero = 002, posicion 1
	* sabe que lo va a insertar al hashmap en la key L0
	* */
	public static HashMap <String,  ArrayList<String>> agregarAlHashMap(HashMap <String,  ArrayList<String>> hashMap, String numero, int posicion)
	{
		String key = "L" + numero.charAt(posicion);

		ArrayList<String> sList = hashMap.get(key);

		if(hashMap.get(key) == null )
		{
			hashMap.put(key, new ArrayList<String>());
		}

		hashMap.get(key).add(numero);

		return hashMap;
	}

	/*
	*Se encarga de limpiar el hashMap
	* */
	public static HashMap <String,  ArrayList<String>> limpiarHashMap(HashMap <String,  ArrayList<String>> hashMap)
	{
		for(HashMap.Entry<String,ArrayList<String>> item:hashMap.entrySet())
		{
			item.setValue(null);
		}

		return hashMap;
	}

	/*
	*Se encarga de cargar el arrayList con el nuevo orden que esta en el HashMap
	* */
	public static String[] cargarArrayListConNuevoOrden(HashMap <String,  ArrayList<String>> hashMap, String[] lista, int iteracion)
	{
		lista = new String[lista.length];

		String numerosDeLaIteracion = "";

		int position = 0;

		for(HashMap.Entry<String,ArrayList<String>> item:hashMap.entrySet())
		{
			if(item.getValue() != null)
			{
				for(String numero:item.getValue())
				{
					lista[position] = numero;
					position++;
					numerosDeLaIteracion = numerosDeLaIteracion + " " + numero + ", ";
				}
			}
		}

		System.out.println("Iteracion de ordenamiento numero: " + iteracion + ", numeros ordenados en esta iteracion:" + numerosDeLaIteracion);
		return lista;
	}
}
