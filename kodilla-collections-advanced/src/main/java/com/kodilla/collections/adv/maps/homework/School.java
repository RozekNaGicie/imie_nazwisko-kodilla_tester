package com.kodilla.collections.adv.maps.homework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Integer> studentList;

    public School(List studentList){
//        this.studentArr = studentArr;
        this.studentList = studentList;
    }

//    public void studentNumber(){
//        for (Integer lister: this.studentArr) {
//            this.studentList.add(lister);
//        }
//    }

    public List<Integer> getStudentList() {
        return studentList;
    }
}
