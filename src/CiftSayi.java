import java.util.HashMap;
import java.util.Map;

public class CiftSayi {
    public static void main(String[] args) {
        int[] dizi = {2, 4, 5, 6, 4, 2, 8, 6, 9, 2, 4, 8};

        Map<Integer, Integer> tekrarEdenler = new HashMap<>();

        for (int sayi : dizi) {
            if (sayi % 2 == 0) {
                if (tekrarEdenler.containsKey(sayi)) {
                    int tekrarSayisi = tekrarEdenler.get(sayi);
                    tekrarEdenler.put(sayi, tekrarSayisi + 1);
                } else {
                    tekrarEdenler.put(sayi, 1);
                }
            }
        }

        for (Map.Entry<Integer, Integer> entry : tekrarEdenler.entrySet()) {
            int sayi = entry.getKey();
            int tekrarSayisi = entry.getValue();

            if (tekrarSayisi > 1) {
                System.out.println(sayi + " sayısı " + tekrarSayisi + " kez tekrar ediyor.");
            }
        }
    }
}
