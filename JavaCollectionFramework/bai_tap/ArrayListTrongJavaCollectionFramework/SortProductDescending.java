package JavaCollectionFramework.bai_tap.ArrayListTrongJavaCollectionFramework;

import java.util.Comparator;

public class SortProductDescending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return ((o1.getPrice() < o2.getPrice() ) ? 1 : -1);
    }
}