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
 * <b>2008.重量種別コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum WeightTypeCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, ""),
    
    /** ハンデ */
    HANDICAP("ハンデ", 1, "HANDICAP"),
    
    /** 別定 */
    SPECIAL_WEIGHT("別定", 2, "SPECIAL WEIGHT"),
    
    /** 馬齢 */
    WEIGHT_FOR_AGE("馬齢", 3, "WEIGHT FOR AGE"),
    
    /** 定量 */
    SPECIAL_WEIGHT_DEPENDS_PROFILE("定量", 4, "SPECIAL WEIGHT"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 欧字名 */
    private String nameEng;
    
    private WeightTypeCd(String name, Integer value, String nameEng) {
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
     * 欧字名を返します。
     * @return 欧字名
     */
    public String getNameEng() {
        return this.nameEng;
    }

}