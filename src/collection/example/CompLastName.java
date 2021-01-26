package collection.example;

import java.util.Comparator;

// կոմպարատորը կանոնակարգում ավանդատուներին է ըստ ազգանուններով
public class CompLastName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;
        // որոնում է այն սիմվոլ, որից սկսվում է ազգանունը
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }

}
