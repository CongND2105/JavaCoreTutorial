package org.example.collection.map.treemap;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Dictionary {

    private final Map<String,String> dictionnary = new TreeMap<>();

    public String addDictionary(String keyword, String meaning){
        return this.dictionnary.put(keyword,meaning);
    }
    public void deleteDictionary(String keyword){
        dictionnary.remove(keyword);
    }
    public String lookUpDictionary(String keyword){
        return this.dictionnary.get(keyword);
    }
    public void printKeyWordinDictionaryList(){
        System.out.println(Arrays.toString(dictionnary.keySet().toArray()));
    }
    public int getDictionaryCount(){
        return this.dictionnary.size();
    }
    public void deleteAllDictionary(){
        dictionnary.clear();
    }


}
