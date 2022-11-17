package it.unisa.medicaltests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

public class MedicalTestList {

    private final List<MedicalTest> medicalTestList;

    public MedicalTestList() {
        this.medicalTestList = new ArrayList<>();
    }

    public void addMedicalTest(MedicalTest mt) {
        int i = 0;
        for(MedicalTest test : medicalTestList) {
            if(test.getDate().compareTo(mt.getDate()) <= 0) {
                medicalTestList.add(i, mt);
                return;
            }
            i++;
        }
    }

    public List<MedicalTest> getMedicalTestByDate(GregorianCalendar date) {
        List<MedicalTest> foundTests = new ArrayList<MedicalTest>();
        for(MedicalTest test : medicalTestList) {
            if(test.getDate().compareTo(date) == 0)
                foundTests.add(test);
        }
        return foundTests;
    }

    public List<MedicalTest> getMedicalTestByDoctor(String doctorName) {
        List<MedicalTest> foundTests = new ArrayList<MedicalTest>();
        for(MedicalTest test : medicalTestList) {
            if(test.getDoctorName().compareTo(doctorName) == 0)
                foundTests.add(test);
        }
        return foundTests;
    }

    public double getAverageCost() {
        double average = 0;
        for(MedicalTest test : medicalTestList) {
            average += test.getCost();
        }
        return average / medicalTestList.size();
    }

    public List<MedicalTest> getMedicalTestList() {
        return medicalTestList;
    }
}
