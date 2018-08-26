public class LeftJoin{

    //nothing like my white board solution writeup - this is after class review
    public Map leftJoin(Map<String, String> one, Map<String,String> two){

        //create a new map to hold two values for every key, instead of one
        Map<String, List<String>> resultMap = new HashMap<>();

        //loop through left map paramenter (one in this case)
        //work with for each loops more
        for(String key: one.keySet()){
            List<String> tempList = new ArrayList<>();

            //join values from the "right" (two) map to the "left" (one) map
            //with the "left" map acting as the key for both added values (strings)
            if(two.containsKey(key)){
                tempList.add(one.get(key));
                tempList.add(two.get(key));
                resultMap.put(key, tempList);
            }
            //per task outline, add value "null" if there isn't
            // a join value in the right/second map for a key
            else {
                tempList.add(one.get(key));
                tempList.add(null);
                resultMap.put(key,tempList);
            }
        }
        return resultMap;
    }
}