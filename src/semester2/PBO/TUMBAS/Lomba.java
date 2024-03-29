package semester2.PBO.TUMBAS;

public class Lomba {
    protected int lomba1;
    protected int lomba2;
    protected int lomba3;
    protected int lomba4;

    public Lomba(int lomba1, int lomba2, int lomba3, int lomba4) {
        this.lomba1 = lomba1;
        this.lomba2 = lomba2;
        this.lomba3 = lomba3;
        this.lomba4 = lomba4;
    }

    @Override
    public String toString() {
        return lomba1 + ", " + lomba2 + ", " + lomba3 + ", " + lomba4;
    }

    public int getLomba1() {
        return lomba1;
    }

    public int getLomba2() {
        return lomba2;
    }

    public int getLomba3() {
        return lomba3;
    }

    public int getLomba4() {
        return lomba4;
    }

    public double getHasil() {
        return ((getLomba1() + getLomba2() + getLomba3() + getLomba4()) / 4); 
    }
}

class UIUX extends Lomba{
    int lomba1, lomba2, lomba3, lomba4;
    public UIUX(int lomba1, int lomba2, int lomba3, int lomba4) {
        super(lomba1, lomba2, lomba3, lomba4);
    }
}

class Algo extends Lomba{
    public Algo(int lomba1, int lomba2, int lomba3) {
        super(lomba1, lomba2, lomba3, 0);
    }

    @Override
    public double getHasil() {
        return ((getLomba1() + getLomba2() + getLomba3()) / 3);
    }

    @Override
    public String toString() {
        return lomba1 + ", " + lomba2 + ", " + lomba3;
    }
}

class Data extends Lomba{
    int lomba1, lomba2, lomba3;

    public Data(int lomba1, int lomba2, int lomba3) {
        super(lomba1, lomba2, lomba3, 0);
    }

    @Override
    public double getHasil() {
        return ((getLomba1() + getLomba2() + getLomba3()) / 3);
    }

    @Override
    public String toString() {
        return lomba1 + ", " + lomba2 + ", " + lomba3;
    }
}
