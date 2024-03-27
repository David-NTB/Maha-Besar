package semester2.PBO.TUMBAS;

public class Lomba {
    protected int nilai1;
    protected int nilai2;
    protected int nilai3;
    protected int nilai4;

    public Lomba(int nilai1, int nilai2, int nilai3, int nilai4) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
        this.nilai3 = nilai3;
        this.nilai4 = nilai4;
    }

    public int getNilai1() {
        return nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public int getNilai4() {
        return nilai4;
    }

    public double getHasil() {
        return ((getNilai1() + getNilai2() + getNilai3() + getNilai4()) / 4); 
    }
}

class UIUX extends Lomba{
    int n1, n2, n3, n4;

    public UIUX(int n1, int n2, int n3, int n4) {
        super(n1, n2, n3, n4);
    }

    @Override
    public double getHasil() {
        return super.getHasil();
    }

    @Override
    public String toString() {
        return n1 + ", " + n2 + ", " + n3 + ", " + n4;
    }
}

class Algo extends Lomba{
    int n1, n2, n3;

    public Algo(int n1, int n2, int n3) {
        super(n1, n2, n3, 0);
    }

    @Override
    public double getHasil() {
        return ((getNilai1() + getNilai2() + getNilai3() + getNilai3()) / 3);
    }
    
    @Override
    public String toString() {
        return n1 + ", " + n2 + ", " + n3;
    }
}

class Data extends Lomba{
    int n1, n2, n3;

    public Data(int n1, int n2, int n3) {
        super(n1, n2, n3, 0);
    }

    @Override
    public double getHasil() {
        return ((getNilai1() + getNilai2() + getNilai3() + getNilai3()) / 3);
    }

    @Override
    public String toString() {
        return n1 + ", " + n2 + ", " + n3;
    }
}
