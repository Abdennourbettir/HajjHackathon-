package com.example.souad.pilgrimsupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by souad on 01/08/18.
 */
public class expandable {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> security = new ArrayList<>();



        List<String> Health = new ArrayList<>();
        Health.add("Healthy food scanner");
        Health.add("Call emergency");





        expandableListDetail.put("CRICKET TEAMS", security);
        expandableListDetail.put("FOOTBALL TEAMS", Health);
        return expandableListDetail;
    }
}
