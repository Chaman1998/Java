public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type Casting");

        float fvar = 23.24f;
        double dvar = fvar;
        
        //Automatic Casting - wide casting
        long lvar = (long) fvar;

        System.out.println(fvar);
        System.out.println(dvar);
        System.out.println(lvar);
    }
}
