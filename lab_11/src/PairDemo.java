public class PairDemo {
    public static void main(String args[]){
        Pair<Integer> pair = new Pair<>(21,15);
        System.out.println("Para: " + pair.getFirst() + " " + pair.getSecond());
        Pair<Integer> swap = PairUtil.swap(pair);
        System.out.println("Para: " + swap.getFirst() + " " + swap.getSecond());
    }
}

