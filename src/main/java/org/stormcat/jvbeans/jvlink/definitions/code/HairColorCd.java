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
 * <b>2203.毛色コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum HairColorCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "00", "", ""),
    
    /** 栗毛 */
    CHESTNUT("栗毛", "01", "chestnut", "ch."),
    
    /** 栃栗毛 */
    DARK_CHESTNUT("栃栗毛", "02", "dark chestnut", "d.ch."),
    
    /** 鹿毛 */
    BAY("鹿毛", "03", "bay", "b."),
    
    /** 黒鹿毛 */
    DARK_BAY("黒鹿毛", "04", "dark bay", "d.b."),
    
    /** 青鹿毛 */
    BROWN("青鹿毛", "05", "brown", "br."),
    
    /** 青毛 */
    BLACK("青毛", "06", "black", "bl."),
    
    /** 芦毛 */
    GREY("芦毛", "07", "grey", "g."),
    
    /** 栗粕毛 */
    RED_ROAN("栗粕毛", "08", "", ""),
    
    /** 鹿粕毛 */
    BAY_ROAN("鹿粕毛", "09", "", ""),
    
    /** 青粕毛 */
    BLUE_ROAN("青粕毛", "10", "", ""),
    
    /** 白毛 */
    WHITE("白毛", "11", "white", "w."),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 欧字名 */
    private String nameEng;
    
    /** 欧字略名(5文字) */
    private String nameEngChar5;
    
    private HairColorCd(String name, String value, String nameEng, String nameEngChar5) {
        this.name = name;
        this.value = value;
        this.nameEng = nameEng;
        this.nameEngChar5 = nameEngChar5; 
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
     * 欧字名 を返します。
     * @return 欧字名 
     */
    public String getNameEng() {
        return this.nameEng;
    }
    
    /**
     * 欧字略名(5文字) を返します。
     * @return 欧字略名(5文字) 
     */
    public String getNameEngChar5() {
        return this.nameEngChar5;
    }
    
}