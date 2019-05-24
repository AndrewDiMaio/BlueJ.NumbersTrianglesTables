


public class NumberUtilities {

    public static String getRange(int stop) {
        StringBuilder builder = new StringBuilder("");
        for (Integer i = 0;i<stop;i++){
            builder.append(i);
        }
        return builder.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder builder = new StringBuilder("");
        for (Integer i = start;i<stop;i++){
            builder.append(i);
        }
        return builder.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder builder = new StringBuilder("");
        for (Integer i = start;i<stop;i+=step){
            builder.append(i);
        }
        return builder.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder builder = new StringBuilder("");
            if (start % 2 == 0){
                for (Integer i = start;i<stop;i+=2){
                    builder.append(i);
                }
            }else  
                for (Integer i = start+1;i<stop;i+=2){
                    builder.append(i);
                }
            return builder.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder builder = new StringBuilder("");
            if (start % 2 != 0){
                for (Integer i = start;i<stop;i+=2){
                    builder.append(i);
                }
            }else  
                for (Integer i = start+1;i<stop;i+=2){
                    builder.append(i);
                }
            return builder.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder builder = new StringBuilder("");
        for (Integer i = start;i<=stop;i++){
            builder.append((int)Math.pow(i,exponent));
        }
        return builder.toString();
    }
}
