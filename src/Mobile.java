public class Mobile {
    private String maDT;
    private String hangSx;
    private String mauSac;
    private double chieuRong;
    private double chieuDai;
    private double doDay;
    private double mucNangLuong;
    private int energy;
    public Mobile(){
        this.hangSx="nokia";
        this.mauSac="mau xanh";
        this.chieuRong=30;
        this.chieuDai=60;
        this.doDay=1;
        this.mucNangLuong=10;


    }
    public Mobile(String hangSx){
        this.hangSx=hangSx;
    }
    public Mobile(String hangSx, String mauSac){
        this.hangSx=hangSx;
        this.mauSac=mauSac;
    }
    public Mobile(String hangSx, String mauSac, String maDT, double chieuRong, double chieuDai, double mucNangLuong, double doDay){
     this(hangSx, mauSac);
     this.maDT=maDT;
     this.chieuRong=chieuRong;
     this.chieuDai=chieuDai;
     this.mucNangLuong=mucNangLuong;
     this.doDay=doDay;

    }
    public String getHangSx(){
        return hangSx;
    }
    public void setHangSx(String hangSx){
        this.hangSx=hangSx;
    }
    public String getMaDT(){
        return maDT;
    }
    public void setMaDT(String maDT){
        this.maDT=maDT;
    }
    public String getMauSac(){
        return mauSac;
    }
    public void setMauSac(String mauSac){
        this.mauSac=mauSac;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void setChieuRong(double chieuRong){
        this.chieuRong=chieuRong;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    public void setChieuDai(double chieuDai){
        this.chieuDai=chieuDai;
    }
    public double getMucNangLuong(){
        return mucNangLuong;
    }
    public void setMucNangLuong(double mucNangLuong){
        this.mucNangLuong=mucNangLuong;
    }
    public double getDoDay(){
        return doDay;
    }
    public void setDoDay(double doDay){
        this.doDay=doDay;
    }

    public void setEnergy(int energy) {
        if (energy>=0||energy<=100) {
            this.energy = energy;

        }

    }


    public int getEnergy(){
        return energy;

    }
}
class AppMobile{
    public static void main(String[] args) {
        Mobile objMobile1  =new Mobile();
objMobile1.setHangSx("Samsung");
objMobile1.setMauSac("Mau");
objMobile1.setChieuRong(15);
        System.out.println(objMobile1.getHangSx());
        System.out.println(objMobile1.getMauSac());
        System.out.println(objMobile1.getChieuRong());
Mobile objMobile2= new Mobile();
objMobile2.setChieuRong(20);
objMobile2.setChieuDai(12);
objMobile2.setMucNangLuong(100);
        System.out.println("dt2"+objMobile2.getChieuRong());
        System.out.println("dt"+objMobile1.getChieuDai());
        System.out.println(objMobile2.getMucNangLuong());
    }
}
