package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	    Kandydat k1 = new Kandydat("Jan Kowalski",28,"mistrzowie",1);
	    Kandydat k2 = new Kandydat("Adam Nowak",28,"licencjat",2);
        Kandydat k3 = new Kandydat("Anna Malinowska",29,"licencjat",5);
        Kandydat k4 = new Kandydat("Monika Bajoro",27,"licencjat",3);
        Kandydat k5 = new Kandydat("Andrzej Komp",27,"licencjat",3);
        Kandydat k6 = (Kandydat)k5.clone();
        k6.setNazwa("Michał Krzesło");
        k6.setLataDoswiadczenia(4);

        Rekrutacja r = new Rekrutacja();
        r.getKandydaci().add(k1);
        r.getKandydaci().add(k2);
        r.getKandydaci().add(k3);
        r.getKandydaci().add(k4);
        r.getKandydaci().add(k5);
        r.getKandydaci().add(k6);

        Collections.sort(r.getKandydaci());

        for(Kandydat k : r.getKandydaci()){
            System.out.println(k);
        }

        Rekrutacja.Set();
        System.out.println("Recruitment map");
        Map<Integer,String> m = r.RecruitmentMap(r.getKandydaci());

        for(int l : m.keySet()){
            System.out.println(l + ": " + m.get(l));
        }



    }
}
