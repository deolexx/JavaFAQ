package com.deo.javalearning.collectionsFramework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

    private static final Logger logger = LogManager.getLogger(TreeMapDemo.class);

    public static void main(String[] args) {
        NavigableMap<Integer, String> treemap = new TreeMap<>();
        treemap.put(100, "100");
        treemap.put(200, "200");
        treemap.put(300, "300");
        treemap.put(400, "400");
        treemap.put(500, "500");
        treemap.put(600, "600");
        treemap.put(700, "700");
        treemap.put(800, "800");
        treemap.put(900, "900");
        treemap.put(1000, "1000");
        logger.info(treemap.ceilingEntry(501));
        logger.info(treemap.floorEntry(499));
        logger.info(treemap.floorEntry(501).getValue());

    }
}
