/*
 * Copyright 2009-2011 the Stormcat Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.stormcat.jvbeans.jvlink.definitions.code;
 
/**
 * <b>2002.曜日コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum WeekDayCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, "", "", "", "", ""),
    
    /** 土曜日 */
    SATURDAY("土曜日", 1, "土", "土曜", "土曜日", "SATURDAY", "SAT"),
    
    /** 日曜日 */
    SUNDAY("日曜日", 2, "日", "日曜", "日曜日", "SUNDAY", "SUN"),
    
    /** 祝日 */
    NATIONAL_HOLIDAY("祝日", 3, "祝", "祝日", "祝日", "NATIONAL HOLIDAY", "HOL"),
    
    /** 月曜日 */
    MONDAY("月曜日", 4, "月", "月曜", "月曜日", "MONDAY", "MON"),
    
    /** 火曜日 */
    TUESDAY("火曜日", 5, "火", "火曜", "火曜日", "TUESDAY", "TUE"),
    
    /** 水曜日 */
    WEDNESDAY("水曜日", 6, "水", "水曜", "水曜日", "WEDNESDAY", "WED"),
    
    /** 木曜日 */
    THURSDAY("木曜日", 7, "木", "木曜", "木曜日", "THURSDAY", "THU"),
    
    /** 金曜日 */
    FRIDAY("金曜日", 8, "金", "金曜", "金曜日", "FRIDAY", "FRI"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 略名(1文字) */
    private String nameChar1;
    
    /** 略名(2文字) */
    private String nameChar2;
    
    /** 略名(3文字) */
    private String nameChar3;
    
    /** 欧字名 */
    private String nameEng;
    
    /** 欧字略名(3文字) */
    private String nameEngChar3;

    private WeekDayCd(String name, Integer value, String nameChar1, String nameChar2,
        String nameChar3, String nameEng, String nameEngChar3) {
        this.name = name;
        this.value = value;
        this.nameChar1 = nameChar1;
        this.nameChar2 = nameChar2;
        this.nameChar3 = nameChar3;
        this.nameEng = nameEng;
        this.nameEngChar3 = nameEngChar3;
    }
    
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.name;
    }    

    /**
     * {@inheritDoc}
     */
    public Integer getValue() {
        return this.value;
    }
    
    /**
     * 略名(1文字)を返します。
     * @return 略名(1文字)
     */
    public String getCourseNameChar1() {
        return this.nameChar1;
    }

    /**
     * 略名(2文字)を返します。
     * @return 略名(2文字)
     */    
    public String getCourseNameChar2() {
        return this.nameChar2;
    }
    
    /**
     * 略名(3文字)を返します。
     * @return 略名(3文字)
     */
    public String getCourseNameChar3() {
        return this.nameChar3;
    }
    
    /**
     * 欧字名を返します。
     * @return 欧字名
     */
    public String getCourseNameEng() {
        return this.nameEng;
    }

    /**
     * 欧字略名(3文字)を返します。
     * @return 欧字略名(3文字)
     */    
    public String getCourseNameEngChar3() {
        return this.nameEngChar3;
    }
    
}