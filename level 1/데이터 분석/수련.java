import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIdx = getIndex(ext);
        int sortIdx = getIndex(sort_by);

        List<int[]> filtered = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (data[i][extIdx] < val_ext) {
                filtered.add(data[i]);
            }
        }
        Collections.sort(filtered, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[sortIdx], b[sortIdx]);
            }
        });
        int[][] result = new int[filtered.size()][];
        for (int i = 0; i < filtered.size(); i++) {
            result[i] = filtered.get(i);
        }

        return result;
    }

    private int getIndex(String key) {
        switch (key) {
            case "code": return 0;
            case "date": return 1;
            case "maximum": return 2;
            case "remain": return 3;
        }
        return -1;
    }

}
