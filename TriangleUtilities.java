
public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
StringBuilder stars = new StringBuilder();
        for (Integer i = 1; i <= numberOfStars;i++){
            stars.append("*");
        }
        return stars.toString();
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder stars = new StringBuilder();
        for (Integer i = 1; i <= numberOfRows;i++){
            stars.append(getRow(i) + "\n");
        }
        return stars.toString();
    }


    public static String getSmallTriangle() {
        StringBuilder stars = new StringBuilder();
        for (Integer i = 1; i <= 4;i++){
            stars.append(getRow(i) + "\n");
        }
        return stars.toString();
    }

    public static String getLargeTriangle() {
        StringBuilder stars = new StringBuilder();
        for (Integer i = 1; i <= 9;i++){
            stars.append(getRow(i) + "\n");
        }
        return stars.toString();
    }
}
