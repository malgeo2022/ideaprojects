package com.example.demo.test;

import java.util.ArrayList;

public class RepairDAO {
    private ArrayList<Repair> repairs = new ArrayList<Repair>();

    public void save(Repair repair) {
        this.repairs.add(repair);
    }

    public Repair find(long id) {
        if(this.repairs.size() == 0) {
            return null;
        }

        for(int i = 0; i <= this.repairs.size(); i++) {
            if(this.repairs.get(i).getId() == id) {
                return this.repairs.get(i);
            }
        }
        return null;
    }

    public void remove(Repair repair) {
        this.repairs.remove(repair);
    }
}
