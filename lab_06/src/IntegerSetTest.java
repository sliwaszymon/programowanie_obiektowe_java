public class IntegerSetTest {
    public static void main(String[] args){
        IntegerSet a = new IntegerSet();
        a.insertElement(7);
        a.insertElement(21);
        a.insertElement(67);
        System.out.println(a);
        IntegerSet b = new IntegerSet();
        b.insertElement(7);
        b.insertElement(24);
        b.insertElement(81);
        System.out.println(b);
        IntegerSet c = IntegerSet.union(a, b);
        System.out.println(c);
        IntegerSet d = IntegerSet.intersection(a, b);
        System.out.println(d);
        System.out.println(c.equals(a));
        c.deleteElement(24);
        c.deleteElement(81);
        System.out.println(c.equals(a));
    }
}
