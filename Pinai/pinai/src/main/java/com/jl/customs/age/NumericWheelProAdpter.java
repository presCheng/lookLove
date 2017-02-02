/*
 *  Copyright 2010 Yuri Kanivets
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.jl.customs.age;

import com.jl.customs.timer.WheelAdapter;


/**
 * Numeric Wheel adapter.
 */
public class NumericWheelProAdpter implements WheelAdapter {
    /**
     * The default min value
     */
    public static final int DEFAULT_MAX_VALUE = 9;
    /**
     * The default max value
     */
    private static final int DEFAULT_MIN_VALUE = 0;
    public static String[] PROVINCE = new String[]{
            "*北京",
            "上海",
            "天津",
            "重庆",
            "*黑龙江",
            "吉林",
            "辽宁",
            "山东",
            "山西",
            "陕西",
            "河北",
            "河南",
            "湖北",
            "湖南",
            "海南",
            "江苏",
            "江西",
            "广东",
            "广西",
            "云南",
            "贵州",
            "四川",
            "内蒙古",
            "宁夏",
            "甘肃",
            "青海",
            "西藏",
            "新疆",
            "安徽",
            "浙江",
            "福建",
            "台湾",
            "香港",
            "澳门",
            "国外",
    };
    // Values
    private int minValue;
    private int maxValue;

    // format
    private String format;

    /**
     * Default constructor
     */
    public NumericWheelProAdpter() {
        this(DEFAULT_MIN_VALUE, DEFAULT_MAX_VALUE);
    }

    /**
     * Constructor
     *
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     */
    public NumericWheelProAdpter(int minValue, int maxValue) {
        this(minValue, maxValue, null);
    }

    /**
     * Constructor
     *
     * @param minValue the wheel min value
     * @param maxValue the wheel max value
     * @param format   the format string
     */
    public NumericWheelProAdpter(int minValue, int maxValue, String format) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.format = format;
    }

    @Override
    public String getItem(int index) {
        if (index >=0 && index < getItemsCount()) {
            System.out.println(index + "");
            return PROVINCE[index];
        }
        return null;
    }

    @Override
    public int getItemsCount() {
        return maxValue - minValue + 1;
    }

    @Override
    public int getMaximumLength() {
        int max = Math.max(Math.abs(maxValue), Math.abs(minValue));
        int maxLen = Integer.toString(max).length();
        if (minValue < 0) {
            maxLen++;
        }
        return maxLen;
    }
}