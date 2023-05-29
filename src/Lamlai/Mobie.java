package Lamlai;

public class Mobie {
    private String maDT;
    private String hangSX;
    private int energy;
    public Mobie(){
        this.hangSX="Nokia";
        this.maDT="MS0101";

    }
    public Mobie(String hangSX)
    {
        this.hangSX=hangSX;
    }
    public String getHangSX(){
        return hangSX;
    }
    public void setHangSX(String hangSX){
        this.hangSX=hangSX;
    }
    public void setEnergy(int energy){
        if (energy>=0||energy<100) {
            this.energy=energy;

        }
    }
    public int getEnergy(){
        return energy;
    }
}
