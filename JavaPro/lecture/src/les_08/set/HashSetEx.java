package les_08.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set.add("1sdfsdfsf"));
        System.out.println(set.add("1gfhgfdh"));
        System.out.println(set.add("2dfwrfsddf"));
        System.out.println(set.add("3sDfsgfdgd"));
        System.out.println(set.add("4klahjdklj"));
        System.out.println(set.add("5aporopkrl"));
        System.out.println(set.add("6al;k,l;kr"));
        System.out.println(set.add("7al;ksdlakdl"));
        System.out.println(set.add("8a;skdokfo"));

        System.out.println("---------");
        System.out.println(set);

        int i = 1;
        int count = 0;
        String value = null;
        for (String s : set){
            if (count++ == i) value = s;
        }
        System.out.println(value);
    }
}
