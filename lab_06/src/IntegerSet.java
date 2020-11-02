public class IntegerSet {
    private boolean[] zbior;
    public IntegerSet(){
        this.zbior = new boolean[100];
    }
    static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet c = new IntegerSet();
        for(int i = 0; i < 100; i++){
            if(a.zbior[i] || b.zbior[i]){
                c.zbior[i] = true;
            }
        }
        return c;
    }
    static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet c = new IntegerSet();
        for(int i = 0; i < 100; i++){
            if(a.zbior[i] && b.zbior[i]){
                c.zbior[i] = true;
            }
        }
        return c;
    }
    void insertElement(int n){
        this.zbior[n-1] = true;
    }
    void deleteElement(int n){
        this.zbior[n-1] = false;
    }
    @Override
    public String toString(){
        StringBuilder zbior = new StringBuilder();
        for(int i = 0; i<100; i++){
            if(this.zbior[i]){
                zbior.append(i+1);
                zbior.append(" ");
            }
        }
        return zbior.toString();
    }
    boolean equals(IntegerSet a){
        return this.toString().equals(a.toString());
    }
//    boolean equals(IntegerSet a){
//        for(int i = 0; i < 100; i++){
//            if(this.zbior[i] != a.zbior[i]){
//                return false;
//            }
//        }
//        return true;
//    }
}
