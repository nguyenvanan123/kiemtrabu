public class OnLai1 {
public String giong;
public String chieucao;
public String loai;
public OnLai1(){
    this.giong = "đực";
    this.chieucao="20cm";
    this.loai="chó";
}
public OnLai1(String giong){
    this();
    this.giong=giong;
}
public OnLai1(String giong, String chieucao){
    this(giong);
    this.chieucao=chieucao;
}
public OnLai1(String giong, String chieucao,String loai){
    this(giong,chieucao);
    this.loai=loai;
}
public void chay(){
    System.out.println("chay");
}

    public String getChieucao() {
        return chieucao;
    }
    public void setLoai(String lohahaai){
    this.loai=lohahaai;

    }
    public void setGiong(String laitap){
    this.giong=laitap;
    }
    public String getGiong() {
        return giong;
    }


    public static void main(String[] args) {
        OnLai1 cho= new OnLai1();
        OnLai1 cho2 =new OnLai1("cái");
        OnLai1 cho3 =new OnLai1("Cái","200cm");

        OnLai1 cho4 =new OnLai1("đực"," 3000cm","lợn");
        System.out.println(cho4.getChieucao());
        cho4.giong="laitao";
        System.out.println(cho4.getGiong());
cho2.setLoai("heo");
        System.out.println(cho2.loai);
}

}
