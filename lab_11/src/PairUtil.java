public class PairUtil<T> {
    public static <T> Pair<T> swap(Pair<T> pair){
        return new Pair<>(pair.getSecond(), pair.getFirst());
    }

}
