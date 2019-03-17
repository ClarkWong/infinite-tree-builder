/*
 * Copyright (c) 2019, XuyuanWang
 */
package com.github.xuyuanwang.infinitetree;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用演示
 *
 * @author XuyuanWang
 */
public class Demo {

    /**
     * 主方法，构建地区树
     *
     * @param args
     */
    public static void main(String[] args) {
        List<District> districts = initDistrictData();
        List<Node> districtTree = Builder.buildTree(districts);
        System.out.println(districtTree);
    }

    /**
     * 初始化地区数据
     *
     * @return
     */
    private static List<District> initDistrictData() {
        // 省级地区
        District beijing = new District();
        beijing.setId("110000");
        beijing.setName("北京市");
        beijing.setLevel(1);
        beijing.setIndexNumber(0);
        beijing.setParentId("root");

        District zhejiang = new District();
        zhejiang.setId("330000");
        zhejiang.setName("浙江省");
        zhejiang.setLevel(1);
        zhejiang.setIndexNumber(1);
        zhejiang.setParentId("root");

        // 市级地区
        District hangzhou = new District();
        hangzhou.setId("330100");
        hangzhou.setName("杭州市");
        hangzhou.setLevel(2);
        hangzhou.setIndexNumber(0);
        hangzhou.setParentId("330000");

        District ningbo = new District();
        ningbo.setId("330200");
        ningbo.setName("宁波市");
        ningbo.setLevel(2);
        ningbo.setIndexNumber(1);
        ningbo.setParentId("330000");

        // 区级地区
        District xihuDistrict = new District();
        xihuDistrict.setId("330106");
        xihuDistrict.setName("西湖区");
        xihuDistrict.setLevel(3);
        xihuDistrict.setIndexNumber(0);
        xihuDistrict.setParentId("330100");

        District yuhangDistrict = new District();
        yuhangDistrict.setId("330110");
        yuhangDistrict.setName("余杭区");
        yuhangDistrict.setLevel(3);
        yuhangDistrict.setIndexNumber(1);
        yuhangDistrict.setParentId("330100");

        List<District> districts = new ArrayList<>(6);
        districts.add(beijing);
        districts.add(zhejiang);
        districts.add(hangzhou);
        districts.add(ningbo);
        districts.add(xihuDistrict);
        districts.add(yuhangDistrict);
        return districts;
    }

}