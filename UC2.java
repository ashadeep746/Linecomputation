public class UC2 {
    public  int  length1(int l,int b , int h){
        int length1=l*b*h;
        return length1;
    }
    public int length2(int l , int b, int h){
        int length2=l*b*h;
        return length2;
    }
    {
        if(length1(0,0,0)==length2(0,0,0)){
    }
        else {
            System.out.println("nothing");
        }
    }


    public static void main(String[] args) {
        UC2 U = new UC2();
        System.out.println(U.length1(20,30,30));
        System.out.println(U.length2(20,30,30));
    }
}
