import java.lang.invoke.MethodHandles;

public class Lop {
//    public static void main(String[] args) {
//        Lop lop=new Lop();
//        System.out.println(lop.gioitinh);
//    }
    public String mahocsinh;
    public String ten;
    public int tuoi;
    public boolean gioitinh;



public Lop(){
    this.mahocsinh="HS0000";
    this.ten="Chua co ten";
    this.tuoi=0;
    this.gioitinh=true;
}
public Lop(String mahocsinh){
    this.mahocsinh= mahocsinh;
    this.ten="Chua co ten";
    this.tuoi=0;
    this.gioitinh=true;
}
public Lop(String mahocsinh, String ten){
    this.mahocsinh=mahocsinh;
    this.ten=ten;
    this.tuoi=0;
    this.gioitinh=true;

}
public Lop(String mahocsinh, String ten, int tuoi, boolean gioitinh ){
    this(mahocsinh,ten);
    this.tuoi=tuoi;
    this.gioitinh=gioitinh;

}
public String getMahocsinh(){
    return mahocsinh=mahocsinh;
}
public void setMahocsinh(String mahocsinh){
    this.mahocsinh=mahocsinh;
}
    public String getTen(){
        return ten=ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public int getTuoi(){
    return tuoi;
    }
    public void setTuoi(int tuoi){
    this.tuoi=tuoi;
    }
    public boolean isGioitinh(){
    return gioitinh;
    }
    public void setGioitinh(boolean gioitinh){
    this.gioitinh=gioitinh;
    }}
class AppHS{
    public static void main(String[] args) {
        Lop objHs1 = new Lop();
        objHs1.setMahocsinh("HS0001");
        objHs1.setTen( "Nguyen van nam");
        objHs1.setTuoi(15);
        objHs1.setGioitinh(true);

        Lop objHS2 = new Lop("HS0002");
        objHS2.setTen("pham thanh mai");
        objHS2.setGioitinh(false);
        System.out.println(objHs1.getTen());
        System.out.println(objHs1.getMahocsinh());
        System.out.println(objHs1.getTuoi());
//        System.out.println(objHs1.isGioitinh() ? "Nam" : "Nu");
        if ( objHs1.isGioitinh()){
            System.out.println("Gioi tinh: Nam");
        }else {
            System.out.println("Gioi tu=inh : Nu");
        }
    }
// 2 class rieng biet
}
