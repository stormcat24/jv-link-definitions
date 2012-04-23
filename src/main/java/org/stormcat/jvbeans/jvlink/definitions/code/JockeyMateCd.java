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
 * <b>2303.騎手見習コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum JockeyMateCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, ""),
    
    /** 1Kg減 */
    REDUCING_WEIGHT_1("1Kg減", 1, "☆"),
    
    /** 2Kg減 */
    REDUCING_WEIGHT_2("2Kg減", 2, "△"),
    
    /** 3Kg減 */
    REDUCING_WEIGHT_3("3Kg減", 3, "▲"),
    
    ;

    /** 減量値 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 略名 */
    private String nameSign;
    
    private JockeyMateCd(String name, Integer value, String nameSign) {
        this.name = name;
        this.value = value;
        this.nameSign = nameSign;
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
     * 略名を返します。
     * @return 略名
     */
    public String getNameSign() {
        return this.nameSign;
    }
    
}