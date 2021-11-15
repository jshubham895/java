package shubham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class security {
    public static void main(String[] args) {
        ArrayList<Integer> security_value = new ArrayList<>();
        Collections.addAll(security_value, 17, 24, 7, 45, 15, 14, 37, 40, 8, 23, 27, 17);
        int z = 45;
        System.out.println(securitiesBuying(z, security_value));
    }

    public static int securitiesBuying(int z, ArrayList<Integer> security_value) {
        int no_of_stocks = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int idx = 1;
        for (int i = 0; i < security_value.size(); i++) {
            if (map.containsKey(security_value.get(i))) {
                map.put(security_value.get(i), idx + map.get(security_value.get(i)));
            } else {
                map.put(security_value.get(i), idx);
            }
            idx++;
        }
        Collections.sort(security_value);
        for (int i = 0; i < security_value.size(); i++) {
            int stock = security_value.get(i);
            int index = map.get(security_value.get(i));
            while (index != 0) {
                if (z - stock >= 0) {
                    z -= stock;
                    no_of_stocks++;
                    map.put(stock, index - 1);
                    index--;
                } else {
                    break;
                }
            }
        }
        return no_of_stocks;
    }
}
