public class UC3 {
    public int line1(int l, int b, int h){
        int line1=l*b*h;
        return line1;
    }
    public int line2(int l , int b ,int h){
        int line2=l*b*h;
        return line2;
    }
    {
        if ((line1(0,0,0)<=line2(0,0,0))){
        }
        else {
            System.out.println("nothing");
        }
    }

    public static void main(String[] args) {
        UC3 u = new UC3();
        //System.out.println(u.line1(10,20,30));
        System.out.println(u.line2(20,30,40));
    }
}
