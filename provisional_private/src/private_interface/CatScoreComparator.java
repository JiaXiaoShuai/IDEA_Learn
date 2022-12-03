package private_interface;

import java.util.Comparator;

public class CatScoreComparator implements Comparator {



    @Override
    public int compare(Object o1, Object o2) {
        Cat cat01 =(Cat) o1;
        Cat cat02 =(Cat) o2;
        int result = cat01.getAge()- cat02.getAge();
        return result !=0 ? result : cat01.getName().compareTo(cat02.getName());
    }

    /*@Override
    public boolean equals(Object obj) {
        return false;
    }*/
}
