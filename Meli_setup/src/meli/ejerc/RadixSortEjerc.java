package meli.ejerc;

import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static int[] radixSort(int []arr)
	{
		// PROGRAMAR AQUI
		String[] sArray = StringUtil.toStringArray(arr);

		//Limpio el arrayList
		arr = null;

		StringUtil.lNormalize(sArray,'0');

		HashMap<String,  ArrayList<String>> hashMap = StringUtil.crearHashMap();

		int largoDelNumero = sArray[0].length();

		int iteracion = 0;

		while(largoDelNumero > 0)
		{
			largoDelNumero = largoDelNumero -1;

			for(String item:sArray)
			{
				hashMap = StringUtil.agregarAlHashMap(hashMap,item,largoDelNumero);
			}

			iteracion = iteracion +1;
			//Vuelvo a cargar el arrayList con el nuevo orden
			sArray = StringUtil.cargarArrayListConNuevoOrden(hashMap,sArray,iteracion);

			hashMap = StringUtil.limpiarHashMap(hashMap);
		}

		return StringUtil.toIntArray(sArray);
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		arr = radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
