import java.util.*;

class StockSpannerProblemBrute {

    public List<Integer> li;

    public StockSpannerProblemBrute() {
        li = new ArrayList<>();
    }

    public int next(int price) {
        li.add(price);
        int count = 1;

        for (int i = li.size() - 2; i >= 0; i--) {
            if (li.get(i) <= price) count++;
            else break;
        }

        return count;
    }
}
