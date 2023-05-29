import java.util.Scanner;

public class HCN {


    private double chieuDai;
    private double chieuRong;
//    private double dientich;
//    private double chuvi;

    public HCN() {
        this.chieuDai = 0.0;
        this.chieuRong = 0.0;

    }

    public HCN(double chieuDai, double chieuRong) {
        this.chieuRong = chieuRong;
        this.chieuDai = chieuDai;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getDientich() {
        return chieuDai * chieuRong;


    }

    public double getChuVi() {
//
//        return (chieuDai + chieuRong) * 2;
double chuVi =(chieuDai + chieuRong) * 2;
return chuVi;
    }
}

class Abc {
    public static void main(String[] args) {
        HCN objHCN1 = new HCN();
        objHCN1.setChieuDai(1.2);
        objHCN1.setChieuRong(2.4);
        double S1 =objHCN1.getChuVi();
        double S3= objHCN1.getDientich();
        System.out.println(objHCN1.getChieuDai());
        System.out.println(objHCN1.getChieuRong());
        System.out.println(S1);
        System.out.println(S3);
HCN objHCN2 =new HCN();
objHCN2.setChieuDai(1.6);
objHCN2.setChieuRong(1.9);
double s2= objHCN2.getDientich();
double S4 =objHCN2.getDientich();
        System.out.println(objHCN2.getChieuRong());
        System.out.println(objHCN2.getChieuDai());
        System.out.println(s2);
        System.out.println(S4);

    }

}





