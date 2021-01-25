package Task7_ComplexNum;

public class ComOperation {
    double FR,FI,SR,SI;

    public ComOperation(double FR, double FI, double SR, double SI) {
        this.FR = FR;
        this.FI = FI;
        this.SR = SR;
        this.SI = SI;
    }

    complexNum a = new complexNum(FR, FI);
    complexNum b = new complexNum(SR, SI);

    public void add(){
        double RR = FR + SR;
        double RI = FI + SI;
        System.out.println("两复数相加的结果为："+RR+"+"+RI+"i");
    }

    public void reduce(){
        double RR = FR - SR;
        double RI = FI - SI;
        System.out.println("两复数相减的结果为："+RR+"+"+RI+"i");
    }

    public void multiply(){
        double RR = FR*SR - FI*SI;
        double RI = FR*SI + FI*SR;
        System.out.println("两复数相乘的结果为："+RR+"+"+RI+"i");
    }
}
