package tabulation;

import java.util.ArrayList;
import java.util.HashMap;

public class BestSum {

    public ArrayList<Integer> calculate(int targetSum, int[] numbers) {
        ArrayList<ArrayList<Integer>> table = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= targetSum; i++) {
            table.add(new ArrayList<Integer>());
        }

       // table.set(0, new ArrayList<Integer>());

        for(int i = 0; i <= targetSum; i++){
           if(table.get(i) != null){
               for (int number : numbers) {
                   ArrayList<Integer> combination = new ArrayList<>(table.get(i));
                   combination.add(number);

                   if(i+number > targetSum) continue;

                   if(table.get(i+number) == null){
                       table.set(i+number, combination);
                   } else if(table.get(i+number) != null && table.get(i+number).size() > combination.size()){
                       table.set(i+number, combination);
                   }

               }
           }
        }

        return table.get(targetSum);
    }
}
