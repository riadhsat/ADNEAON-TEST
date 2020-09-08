package fr.adneon.test.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Riath
 *
 */
public class Utility {

	/**
	 * partitionne la liste en parametre en une liste de sous liste avec taille max
	 * de sous liste inférieur ou égale au parametre taille
	 * 
	 * @param input
	 * @param taille
	 * @return
	 * @throws Exception
	 */
	public static List<List> partition(List<Integer> input, int taille) throws Exception {

		if (input == null) {
			throw new Exception("input parametre doit etre non nulle");
		}
		if (taille <= 0) {
			throw new Exception("taille parametre doit etre superieur à zero");
		}
		List result = new ArrayList<ArrayList<Integer>>();
		int index = 0;
		int nbTot = 0;
		List<Integer> oneList = new ArrayList<>();
		for (int item : input) {
			nbTot++;
			if (index >= taille) {
				result.add(oneList);
				oneList = new ArrayList<>();
				oneList.add(item);
				index = 1;

			} else {
				oneList.add(item);
				index++;
			}
			if (nbTot == input.size()) {
				result.add(oneList);
			}
		}

		return result;
	}

}
