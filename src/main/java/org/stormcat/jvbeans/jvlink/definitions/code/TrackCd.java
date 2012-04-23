/*
 * Copyright 2009-2012 the Stormcat Project.
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
 * <b>2009.トラックコード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum TrackCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "00", "", ""),
    
    /** 平地　芝 　　 直線 */
    FLAT_TURF_STRAIGHT("平地　芝 　　 直線", "10", "芝・直", "Turf Str."),
    
    /** 平地　芝 　　 左回り */
    FLAT_TURF_LEFT("平地　芝 　　 左回り", "11", "芝・左", "Turf"),
    
    /** 平地　芝  　　左回り  外回り */
    FLAT_TURF_LEFT_OUT("平地　芝  　　左回り  外回り", "12", "芝・左外", "Turf"),
    
    /** 平地　芝  　　左回り  内－外回り */
    FLAT_TURF_LEFT_IN_TO_OUT("平地　芝  　　左回り  内－外回り", "13", "芝・左内→外", "Turf"),
    
    /** 平地　芝  　　左回り  外－内回り */
    FLAT_TURF_LEFT_OUT_TO_IN("平地　芝  　　左回り  外－内回り", "14", "芝・左外→内", "Turf"),
    
    /** 平地　芝  　　左回り  内２周 */
    FLAT_TURF_LEFT_IN_AROUND2("平地　芝  　　左回り  内２周", "15", "芝・左内２周", "Turf"),
    
    /** 平地　芝  　　左回り  外２周 */
    FLAT_TURF_LEFT_OUT_AROUND2("平地　芝  　　左回り  外２周", "16", "芝・左外２周", "Turf"),
    
    /** 平地　芝  　　右回り */
    FLAT_TURF_RIGHT("平地　芝  　　右回り", "17", "芝・右", "Turf"),
    
    /** 平地　芝  　　右回り  外回り */
    FLAT_TURF_RIGHT_OUT("平地　芝  　　右回り  外回り", "18", "芝・右外", "Turf"),
    
    /** 平地　芝  　　右回り  内－外回り */
    FLAT_TURF_RIGHT_IN_TO_OUT("平地　芝  　　右回り  内－外回り", "19", "芝・右内→外", "Turf"),
    
    /** 平地　芝  　　右回り  外－内回り */
    FLAT_TURF_RIGHT_OUT_TO_IN("平地　芝  　　右回り  外－内回り", "20", "芝・右外→内", "Turf"),
    
    /** 平地　芝  　　右回り  内２周 */
    FLAT_TURF_RIGHT_IN_AROUND2("平地　芝  　　右回り  内２周", "21", "芝・右内２周", "Turf"),
    
    /** 平地　芝  　　右回り  外２周 */
    FLAT_TURF_RIGHT_OUT_AROUND2("平地　芝  　　右回り  外２周", "22", "芝・右外２周", "Turf"),
    
    /** 平地　ダート  左回り  */
    FLAT_DIRT_LEFT("平地　ダート  左回り ", "23", "ダート・左", "Dirt"),
    
    /** 平地　ダート  右回り */
    FLAT_DIRT_RIGHT("平地　ダート  右回り", "24", "ダート・右", "Dirt"),
    
    /** 平地　ダート　左回り　内回り */
    FLAT_DIRT_LEFT_IN("平地　ダート　左回り　内回り", "25", "ダート・左内", "Dirt"),
    
    /** 平地　ダート　右回り　外回り */
    FLAT_DIRT_RIGHT_OUT("平地　ダート　右回り　外回り", "26", "ダート・右外", "Dirt"),
    
    /** 平地　サンド　左回り */
    FLAT_SAND_LEFT("平地　サンド　左回り", "27", "サンド・左", "Sand"),
    
    /** 平地　サンド　右回り */
    FLAT_SAND_RIGHT("平地　サンド　右回り", "28", "サンド・右", "Sand"),
    
    /** 平地　ダート  直線 */
    FLAT_DIRT_STRAIGHT("平地　ダート  直線", "29", "ダート・直", "Dirt Str."),
    
    /** 障害　芝  襷 */
    OBSTACLE_TURF_襷("障害　芝  襷", "51", "芝・襷", "Turf"),
    
    /** 障害　芝　ダート */
    OBSTACLE_TURF_TO_DIRT("障害　芝　ダート", "52", "芝→ダート", "Turf_Dirt"),
    
    /** 障害　芝・左 */
    OBSTACLE_TURF_LEFT("障害　芝・左", "53", "芝・左", "Turf"),
    
    /** 障害　芝 */
    OBSTACLE_TURF("障害　芝", "54", "芝", "Turf"),
    
    /** 障害　芝  外回り */
    OBSTACLE_TURF__OUT("障害　芝  外回り", "55", "芝・外", "Turf"),
    
    /** 障害　芝  外－内回り  */
    OBSTACLE_TURF__OUT_TO_IN("障害　芝  外－内回り ", "56", "芝・外→内", "Turf"),
    
    /** 障害　芝  内－外回り */
    OBSTACLE_TURF__IN_TO_OUT("障害　芝  内－外回り", "57", "芝・内→外", "Turf"),
    
    /** 障害　芝  内２周以上 */
    OBSTACLE_TURF__IN_AROUND2("障害　芝  内２周以上", "58", "芝・内２周", "Turf"),
    
    /** 障害　芝  外２周以上 */
    OBSTACLE_TURF__OUT_AROUND2("障害　芝  外２周以上", "59", "芝・外２周", "Turf"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 略名(6文字) */
    private String nameChar6;
    
    /** 欧字名 */
    private String nameEng;
    
    private TrackCd(String name, String value, String nameChar6, String nameEng) {
        this.name = name;
        this.value = value;
        this.nameChar6 = nameChar6;
        this.nameEng = nameEng;
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
    public String getValue() {
        return this.value;
    }
    
    /**
     * 略名(6文字)を返します。
     * @return 略名(6文字)
     */
    public String getNameChar6() {
        return this.nameChar6;
    }
    
    /**
     * 欧字名を返します。
     * @return 欧字名
     */
    public String getNameEng() {
        return this.nameEng;
    }
    
}