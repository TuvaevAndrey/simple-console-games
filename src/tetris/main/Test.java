package tetris.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by karasev on 02.07.16.
 */
public class Test
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "abc");
        map.put("b", "abcd");
        map.put("c", "abc");
        map.put("d", "abcd");
        map.put("e", "abcd");
        HashMap<String,String> copy =new HashMap<>(map);
        System.out.println(copy.size());
        for (Map.Entry pair : copy.entrySet())
        {
            int count =0;
            for (Map.Entry pair2 : copy.entrySet())
            {
                if(pair.getValue().equals(pair2.getValue())){
                    count+=1;
                    if(count>1){
                        map.remove(pair2.getKey());
                    }
                }
            }
        }
        System.out.println(map.size());
    }
}
