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
 * <b>2011.天候コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum WeatherCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, ""),
    
    /** 晴 */
    FINE("晴", 1, "Fine"),
    
    /** 曇  */
    CLOUDY("曇 ", 2, "Cloudy"),
    
    /** 雨 */
    RAINY("雨", 3, "Rainy"),
    
    /** 小雨 */
    DRIZZLE("小雨", 4, "Drizzle"),
    
    /** 雪 */
    SNOW("雪", 5, "Snow"),
    
    /** 小雪 */
    LIGHT_SNOW("小雪", 6, "Light Snow"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 欧字名 */
    private String nameEng;
    
    private WeatherCd(String name, Integer value, String nameEng) {
        this.name = name;
        this.value = value;
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
    public Integer getValue() {
        return this.value;
    }
    
    /**
     * 欧字名 を返します。
     * @return 欧字名 
     */
    public String getNameEng() {
        return this.nameEng;
    }
    
}