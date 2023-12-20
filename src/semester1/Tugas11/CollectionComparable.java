package semester1.Tugas11;

import java.util.ArrayList;
import java.util.Collections;

class CollectionComparable implements Comparable<CollectionComparable> {
    int noTransaksi;
    Double total;
    String tanggal;

    public CollectionComparable(int noTransaksi, Double total, String tanggal) {
        this.noTransaksi = noTransaksi;
        this.total = total;
        this.tanggal = tanggal;
    }

    int getNoTransaksi() {
        return noTransaksi;
    }

    String getTanggal() {
        return tanggal;
    }

    Double getTotal() {
        return total;
    }

    public String toString() {
        return noTransaksi + " " + tanggal + " " + total;
    }

    // @Override
    // public int compareTo(CollectionComparable transaksi) {
    //     return this.total.compareTo(transaksi.total);
    // }
    
    @Override
    public int compareTo(CollectionComparable transaksi) {
        return this.tanggal.compareTo(transaksi.tanggal);
    }
    
}

class CollectionsComparable {
    
    public static void main(String[] args) {
        CollectionsComparable cs = new CollectionsComparable();
        ArrayList<CollectionComparable> arr = new ArrayList<>();
        arr.add(new CollectionComparable(1, 752000.0, "2023-12-13"));
        arr.add(new CollectionComparable(2, 647000.0, "2023-12-14"));
        arr.add(new CollectionComparable(3, 872000.0, "2023-12-14"));
        arr.add(new CollectionComparable(4, 90000.0, "2023-12-15"));
        arr.add(new CollectionComparable(5, 123450.0, "2023-12-16"));
        
        cs.sort(arr);
    }

    void sort(ArrayList<CollectionComparable> arr){
        traversal(arr, "Original data");
        Collections.sort(arr);
        traversal(arr, "Ascending");
        Collections.reverse(arr);
        traversal(arr, "Descending");
    }

    void traversal(ArrayList<CollectionComparable> data, String jenis) {
        System.out.println("Data Transaksi sort " + jenis + " : ");
        for (int a = 0; a < data.size(); a++) {
            System.out.print(data.get(a) + " ");
            System.out.println();
        }
        System.out.println();
    }
}