package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ObjectRemove100andAhmet {
    public static void main(String[] args) {
        List<Object> mix = new ArrayList<>(Arrays.asList(130,"Ahmed",95,"NotAhmed",125,"maybe Ahmed", 50));

        for (Iterator<Object> iter = mix.iterator(); iter.hasNext();) {

            String current = iter.next().toString();

            if (Character.isDigit(current.charAt(0))){
                int num = Integer.parseInt(current);
                if (num>100) iter.remove();
            } else {
                if (current.equals("Ahmed")) {
                    iter.remove();
                }
            }
        }

        System.out.println(mix);


    }
}
