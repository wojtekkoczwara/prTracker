package com.app.prTracker.entity;

import java.util.ArrayList;
import java.util.List;

public class PRList {

    List<Exercise> prList;

    public PRList() {
        this.prList = new ArrayList<>();
    }

    public List<Exercise> getPrList() {
        return prList;
    }

    public void setPrList(List<Exercise> prList) {
        this.prList = prList;
    }

    @Override
    public String toString() {
        return "prList = " + prList;
    }
}
