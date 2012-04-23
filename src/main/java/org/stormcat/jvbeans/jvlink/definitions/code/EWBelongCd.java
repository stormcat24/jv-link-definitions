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
 * <b>2301.東西所属コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum EWBelongCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    OTHERS("下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0, "", ""),
    
    /** 関東 */
    MIHO("関東", 1, "美浦", "美浦トレーニングセンターに所属する。"),
    
    /** 関西 */
    RITTOH("関西", 2, "栗東", "栗東トレーニングセンターに所属する。"),
    
    /** 地方招待 */
    LOCAL_INVITATION("地方招待", 3, "招待", "地方からの招待"),
    
    /** 外国招待 */
    FOREIGN_INVITATION("外国招待", 4, "招待", "外国からの招待"),
    
    ;

    /** 名称１ */
    private String name;
    
    /** 値 */
    private Integer value;
    
    /** 名称２ */
    private String name2;
    
    /** 説明 */
    private String description;
    
    private EWBelongCd(String name, Integer value, String name2, String description) {
        this.name = name;
        this.value = value;
        this.name2 = name2;
        this.description = description;
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
     * 名称２を返します。
     * @return 名称２
     */
    public String getName2() {
        return this.name2;
    }
    
    /**
     * 説明を返します。
     * @return 説明
     */
    public String getDescription() {
        return this.description;
    }
    
}