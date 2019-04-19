package service;

import java.util.*;
import entity.*;

public class MotorService {

    private static List<Motor> data = new LinkedList<Motor>();

    public void addData(Motor mtr) {
        data.add(mtr);
        System.out.println("data telah tersimpan");
    }

    public void updateData(Motor mtr) {
        int index = data.indexOf(mtr);
        if(index >= 0) {
            data.set(index, mtr);
            System.out.println("data telah berubah");
        }
    }

    public void deleteData(String id) {
        int idx = data.indexOf(new Motor(id, "", "","", "",""));
        if(idx >= 0) {
            data.remove(idx);
            System.out.println("data telah terhapus");
        }
    }

    public void showAllData() {
        int i=1;
        System.out.println("\nData di List :");
        for(Motor mtr : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID : " + mtr.getId());
            System.out.println("  NAMA COSTUMER : " + mtr.getNama());
            System.out.println("  MERK MOTOR : " + mtr.getMerk());
            System.out.println("  TAHUN : " + mtr.getTahun());
            System.out.println("  KERUSAKAN : " + mtr.getKerusakan());
            System.out.println("  BIAYA : " + mtr.getBiaya());
        }
    }

}