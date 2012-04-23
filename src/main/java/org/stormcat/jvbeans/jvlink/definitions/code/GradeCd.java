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
 * <b>2003.グレードコード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum GradeCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** G1（平地競走） */
    G1("G1（平地競走）", "A"),
    
    /** G2（平地競走） */
    G2("G2（平地競走）", "B"),
    
    /** G3（平地競走） */
    G3("G3（平地競走）", "C"),
    
    /** グレードのない重賞 */
    NO_GRADE("グレードのない重賞", "D"),
    
    /** 重賞以外の特別競走 */
    NO_GRADE_SPECIAL("重賞以外の特別競走", "E"),
    
    /** J･G1（障害競走） */
    JUMP_G1("J･G1（障害競走）", "F"),
    
    /** J･G2（障害競走） */
    JUMP_G2("J･G2（障害競走）", "G"),
    
    /** J･G3（障害競走） */
    JUMP_G3("J･G3（障害競走）", "H"),
    
    /** 一般競走　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    STANDARD("一般競走　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "_"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    private GradeCd(String name, String value) {
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
    public String getValue() {
        return this.value;
    }
    
}