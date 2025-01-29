class Bigof4nums{
    int bigOf4(int x, int y, int z, int w) {
        if((x>y) && (x>z) && (x>w))
            return x;
        else if((y>x)&&(y>z)&&(y>w))
            return y;
        else if((z>x)&&(z>y)&&(z>w))
            return z;
        else
            return w;
    }
}
public class Demo037 {
    public static void main(String[] args) {
        Bigof4nums obj = new Bigof4nums();
        int bigNum = obj.bigOf4(100,200,500,600);
        System.out.println(bigNum);
    }
}