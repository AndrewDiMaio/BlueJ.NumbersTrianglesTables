 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        StringBuilder table = new StringBuilder();
        
         int a;
         int b;
         for (a = 1; a <= 5; ++a) {
             for (b = 1; b <= 5; ++b) {
            table.append(String.format("%3d |", (a*b)));
        }
        table.append("\n");
    }
    return table.toString();
    }    

    public static String getLargeMultiplicationTable() {
         StringBuilder table = new StringBuilder();
        
         int a;
         int b;
         for (a = 1; a <= 10; ++a) {
             for (b = 1; b <= 10; ++b) {
            table.append(String.format("%3d |", (a*b)));
        }
        table.append("\n");
    }
    return table.toString();
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder table = new StringBuilder();
        
         int a;
         int b;
         for (a = 1; a <= tableSize; ++a) {
             for (b = 1; b <= tableSize; ++b) {
            table.append(String.format("%3d |", (a*b)));
        }
        table.append("\n");
    }
    return table.toString();
    }
}
