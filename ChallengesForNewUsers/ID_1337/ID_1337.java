import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ID_1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];

        List<pair> save = new ArrayList<>();
        
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++)
                if (mat[i][j] == 1) count++;
            pair news = new pair(i, count);
            save.add(news);
        }
        
        Collections.sort(save, new Comparator<pair>() {
            @Override
            public int compare(pair item1, pair item2) {
                return (item1.value > item2.value ? 1 : (item1.value == item2.value ? 0 : -1));
            }
        });

        int index = 0;
        for (pair item : save) {
            if (index == k) break;
            result[index++] = item.key;
        }

        return result;
    }
}

class pair {
    int key;
    int value;

    public pair(int key, int value) {
        this.value = value;
        this.key = key;
    }
}