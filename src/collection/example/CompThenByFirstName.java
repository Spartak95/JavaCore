package collection.example;

import java.util.Comparator;

// եթե ազգանունները միանման են, ապա ավանդատուների
// հաշիվները ըստ Ա.Ա.Հ-ով կանոնակարգվում են
public class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
