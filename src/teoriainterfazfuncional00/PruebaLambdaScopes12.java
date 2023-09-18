package teoriainterfazfuncional00;

public class PruebaLambdaScopes12 {
    static int outerStaticNum;
    int outerNum=9;

    //Aqui podemos ver como el acceso a propiedades de una clase u objeto
    //esta completamente permitido, parece que ya no nos importa el efecto colateral
    void testScopes() {
        Converter<String,Integer> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<String,Integer> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
            
        };
    }
    public static void main(String[] args) {
        new PruebaLambdaScopes12().testScopes();
        String.valueOf(5);
    }
}
