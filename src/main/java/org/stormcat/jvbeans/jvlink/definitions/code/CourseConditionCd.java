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
 * <b>2010.馬場状態コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum CourseConditionCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, "", ""),
    
    /** 良 */
    FIRM("良", 1, "Firm", "Standard"),
    
    /** 稍重 */
    GOOD("稍重", 2, "Good", "Good"),
    
    /** 重 */
    YIELDING("重", 3, "Yielding", "Muddy"),
    
    /** 不良 */
    SOFT("不良", 4, "Soft", "Sloppy"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 欧字名（芝） */
    private String nameEngTurf;
    
    /** 欧字名（ダート） */
    private String nameEngDirt;
    
    private CourseConditionCd(String name, Integer value, String nameEngTurf, String nameEngDirt) {
        this.name = name;
        this.value = value;
        this.nameEngTurf = nameEngTurf;
        this.nameEngDirt = nameEngDirt;
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
     * 欧字名（芝）を返します。
     * @return 欧字名（芝）
     */
    public String getNameEngTurf() {
        return this.nameEngTurf;
    }
    
    /**
     * 欧字名（ダート）を返します。
     * @return 欧字名（ダート）
     */
    public String getNameEngDirt() {
        return this.nameEngDirt;
    }

}