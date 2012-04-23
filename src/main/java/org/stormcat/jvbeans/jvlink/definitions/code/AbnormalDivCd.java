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
 * <b>2101.異常区分コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum AbnormalDivCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, "", "", ""),
    
    /** 出走取消 */
    SCRATCHED("出走取消", 1, "取消", "SCRATCHED", "S"),
    
    /** 発走除外 */
    EXCLUDED_BY_STARTERS("発走除外", 2, "発除", "EXCLUDED BY STARTERS", "ES"),
    
    /** 競走除外 */
    EXCLUDED_BY_STEWARDS("競走除外", 3, "競除", "EXCLUDED BY STEWARDS", "ER"),
    
    /** 競走中止 */
    FALL_TO_FINISH("競走中止", 4, "中止", "FALL TO FINISH", "FF"),
    
    /** 失格 */
    DISQUALIFIED("失格", 5, "失格", "DISQUALIFIED", "DQ"),
    
    /** 落馬再騎乗  */
    REMOUNT_AFTER_A_CROPPER("落馬再騎乗 ", 6, "再騎", "REMOUNT AFTER A CROPPER", "RM"),
    
    /** 降着  */
    DISQUALIFIED_AND_PLACED("降着 ", 7, "降着", "DISQUALIFIED AND PLACED", "DQ&P"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 略名(2文字) */
    private String nameChar2;
    
    /** 欧字名 */
    private String nameEng;
    
    /** 欧字略名 */
    private String nameEngShort;
    
    private AbnormalDivCd(String name, Integer value, String nameChar2, String nameEng, String nameEngShort) {
        this.name = name;
        this.value = value;
        this.nameChar2 = nameChar2;
        this.nameEng = nameEng;
        this.nameEngShort = nameEngShort;
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
     * 略名(2文字)  を返します。
     * @return 略名(2文字)  
     */
    public String getNameChar2() {
        return this.nameChar2;
    }
    
    /**
     * 欧字名 を返します。
     * @return 欧字名 
     */
    public String getNameEng() {
        return this.nameEng;
    }
    
    /**
     * 欧字略名 を返します。
     * @return 欧字略名 
     */
    public String getNameEngShort() {
        return this.nameEngShort;
    }    
    
}