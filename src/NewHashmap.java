import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class NewHashmap {
    HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

    public long solution(String[] queryType, int[][] query) {
        long results = 0;

        for(int i = 0; i < queryType.length; i++){
            String operation = queryType[i];
            int[] values = query[i];

            if(operation.equals("insert")){
                this.insert(values[0], values[1]);
            } else if(operation.equals("addToValue")){
                this.addToValues(values[0]);
            } else if(operation.equals("addToKey")){
                this.addToKeys(values[0]);
            } else if(operation.equals("get")){
                results += this.get(values[0]);
            }
        }

        return results;
    }

    public void insert(Integer key, Integer value){
        data.put(key, value);
    }

    public Integer get(Integer key){
        return data.get(key);
    }

    public void addToKeys(Integer valueToAddToKey){
        Iterator<Map.Entry<Integer, Integer>> iterator = data.entrySet().iterator();
        HashMap<Integer, Integer> newData = new HashMap<Integer, Integer>();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            newData.put(entry.getKey() + valueToAddToKey, entry.getValue());
        }

        data = newData;
    }

    public void addToValues(Integer valueToAddToValue){
        Iterator<Map.Entry<Integer, Integer>> iterator = data.entrySet().iterator();
        HashMap<Integer, Integer> newData = new HashMap<Integer, Integer>();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            newData.put(entry.getKey(), entry.getValue() + valueToAddToValue);
        }

        data = newData;
    }

    public HashMap<Integer, Integer> getData(){
        return data;
    }
}
