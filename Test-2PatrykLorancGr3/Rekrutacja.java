package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Rekrutacja {
    public static int doswiadczenie = 0;

    public Rekrutacja() {
        this.kandydaci = new ArrayList<>();
    }

    public static void Set(){
        doswiadczenie = 2;
    }

    private ArrayList<Kandydat> kandydaci;

    public static boolean Qualified(Kandydat k){
        return k.getLataDoswiadczenia() >= doswiadczenie;
    }

    public ArrayList<Kandydat> getKandydaci() {
        return kandydaci;
    }

    public Map<Integer,String> RecruitmentMap(ArrayList<Kandydat> klist){
        Map<Integer,String> m = new HashMap<>();

        for(Kandydat k : klist){
           if(Qualified(k)){
               if(!m.containsKey(k.getLataDoswiadczenia())){
                   m.put(k.getLataDoswiadczenia(),k.getNazwa());
               }
           }
        }

        return m;
    }
}
