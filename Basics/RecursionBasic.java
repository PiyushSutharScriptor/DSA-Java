class Operations{
    public int count = 0;
    void add(){
        if(count==5){
            return;
        }
        System.out.println(count);
        count++;
        add();
    }
}

public class RecursionBasic{
    public static void main(String[] args) {
        Operations f = new Operations();
        f.add();
    }
}