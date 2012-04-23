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
 * <b>2201.品種コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum BreedCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, ""),
    
    /** サラブレッド */
    THOROUGHBRED("サラブレッド", 1, "サラ"),
    
    /** サラブレッド系種 */
    THOROUGHBRED_LINE("サラブレッド系種", 2, "サラ系"),
    
    /** 準サラブレッド */
    SEMI_THOROUGHBRED("準サラブレッド", 3, "準サラ"),
    
    /** 軽半血種  */
    LIGHT_HALF_BLOOD("軽半血種 ", 4, "軽半"),
    
    /** アングロアラブ  */
    ANGLO_ARAB("アングロアラブ ", 5, "アア"),
    
    /** アラブ系種 */
    ARAB_LINE("アラブ系種", 6, "アラ系"),
    
    /** アラブ */
    ARAB("アラブ", 7, "アラブ"),
    
    /** 中半血種 */
    MIDDLE_HALF_BLOOD("中半血種", 8, "中半"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 略名(3文字) */
    private String nameChar3;
    
    private BreedCd(String name, Integer value, String nameChar3) {
        this.name = name;
        this.value = value;
        this.nameChar3 = nameChar3;
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
     * 略名(3文字) を返します。
     * @return 略名(3文字) 
     */
    public String getNameChar3() {
        return this.nameChar3;
    }
    
}