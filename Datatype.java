import java.util.ArrayList;

/**
 * datatype
 */
public class Datatype {

    public static void main(String[] args) {
        //primitve
        // int var = 20;
        // var = 30;
        float var1 = 20.20f;        
        byte bvar = 20;
        short svar = 22525;;
        int var = 2234376;
        long lvar = 223234234;
        char ch = 'A';
        boolean bl = false;

        //non-primitive
        String string = "Hello World from the storage";
        ArrayList ar;
        System.out.println(var);
        System.out.println(var1);
        System.out.println(string);
    }
}

//--------------Primitive------------
//                  |
//                  |
//                  v
// Boolean  --  Character  -- Integer
//                              |
//                              |
//                              v
//       Byte -- short  --  int --  long -- float -- double

//====================================================================================================================================
//Type      --      Default     --      Size        --      Byte    --      Range of Values
//=====================================================================================================================================
//boolean   --      false       --      1 bite      --      1/8     --      true, flase
//Byte      --                  --      8 bits      --       1      --      -128 to 127
//char      --      \u0000      --      16 bits     --       2      --      Characters representation of ASCII values 0 to 255
//short     --      0           --      16 bits     --       2      --      -32,768 to 32767
//int       --      0           --      32 bits     --       4      --      -2,147,483,648 to 2,147,483,647
//long      --      64 bits     --      64 bits     --       8      --      -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//float     --      0.0         --      32 bits     --       4      --      Upto 7 decimal digits
//double    --      0.0         --      64 bits     --       8      --      upto 16 decimal digits

//------------Non-Primitive-----------
//  String
//  ArrayList