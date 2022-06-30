package BalancedWordsCounter;

import java.util.HashMap;

public class BalancedWordsCounter {
    
    // substring can repeat with the same letter but on other position (?)
    // test shows 28 so i think that it works good?

    public int count(String string) throws RuntimeException{

        if(string == null){
            throw new RuntimeException();
        }

        int count = 0;
        int length = string.length();

        for(int i = 0; i < length; i++){

            HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
        
            for(int j = i; j < length; j++){

                char character = string.charAt(j);

                if(character == Character.getNumericValue(character) + '0'){
                    throw new RuntimeException();
                }

                
                if(hashmap.get(character) != null){
                    hashmap.replace(character, (hashmap.get(character) + 1));
                }else{
                    hashmap.put(character, 1);
                }

                if(hashmap.size() == 1){
                    count++;
                }else{

                    int last = 0;
                    boolean ifBalanced = true;

                    for(Integer c : hashmap.values()){
                        if(last == 0){
                            last = c;
                            continue;
                        }
                        if(last != c){
                            ifBalanced = false;
                            break;
                        }
                        last = c;
                    }

                    if(ifBalanced){
                        count++;
                    }

                }
            }

        }
        return count;
    }
}
