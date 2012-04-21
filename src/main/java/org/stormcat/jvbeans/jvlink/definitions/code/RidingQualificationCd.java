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
 * <b>2302.騎乗資格コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum RidingQualificationCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<Integer> {

    /** 資格なし　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    NO_QUALIFICATION("資格なし　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", 0),
    
    /** 平・障 */
    FLAT_OBSTACLE("平・障", 1),
    
    /** 平地 */
    FLAT("平地", 2),
    
    /** 障害 */
    OBSTACLE("障害", 3),
    
    ;

    /** 内容 */
    private String name;
    
    /** 値 */
    private Integer value;
    
    private RidingQualificationCd(String name, Integer value) {
        this.name = name;
        this.value = value;
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
    
}