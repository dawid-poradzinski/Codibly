package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BubbleSort{

    public List<Number> sort(List<Number> input) throws RuntimeException{
        
        if(input == null){
            throw new RuntimeException("RuntimeException");
        }

        for(int i = 0; i < input.size(); i++){
            if(input.get(i) == null){
                input.remove(i);
            }
        }

        for(int i = 0; i < input.size(); i++){
            for(int j = input.size() - 1; j > 0 + i; j--){
                
                Number first = input.get(j), second = input.get(j-1);

                if(second.doubleValue() > first.doubleValue()){

                        input.set(j-1, first);
                        input.set(j, second);
                   
                }
            }
        }

        return input;
        
    }
}