public class UC1 {
public int squareroot(int x1, int x2 , int y1 ,int y2){
     int cartiesanjoin= ((x2-x1)^2+ (y2-y1)^2);
     return cartiesanjoin;
}

    public static void main(String[] args) {
    UC1 u = new UC1();
        System.out.println(u.squareroot(10,10,20,30));
    }
}
