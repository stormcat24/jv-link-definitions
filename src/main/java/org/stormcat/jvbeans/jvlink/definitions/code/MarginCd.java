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
 * <b>2102.着差コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum MarginCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "___", "", ""),
    
    /** 1/2馬身 */
    _1_PER_2("1/2馬身", "_12", "1/2", "1/2"),
    
    /** 3/4馬身 */
    _3_PER_4("3/4馬身", "_34", "3/4", "3/4"),
    
    /** １馬身 */
    _1("１馬身", "1__", "１", "１"),
    
    /** １1/2馬身 */
    _1_AND_1_PER_2("１1/2馬身", "112", "１1/2", "１1/2"),
    
    /** １1/4馬身 */
    _1_AND_1_PER_4("１1/4馬身", "114", "１1/4", "１1/4"),
    
    /** １3/4馬身 */
    _1_AND_3_PER_4("１3/4馬身", "134", "１3/4", "１3/4"),
    
    /** ２馬身 */
    _2("２馬身", "2__", "２", "２"),
    
    /** ２1/2馬身 */
    _2_AND_1_PER_2("２1/2馬身", "212", "２1/2", "２1/2"),
    
    /** ３馬身 */
    _3("３馬身", "3__", "３", "３"),
    
    /** ３1/2馬身 */
    _3_AND_1_PER_2("３1/2馬身", "312", "３1/2", "３1/2"),
    
    /** ４馬身 */
    _4("４馬身", "4__", "４", "４"),
    
    /** ５馬身 */
    _5("５馬身", "5__", "５", "５"),
    
    /** ６馬身 */
    _6("６馬身", "6__", "６", "６"),
    
    /** ７馬身 */
    _7("７馬身", "7__", "７", "７"),
    
    /** ８馬身 */
    _8("８馬身", "8__", "８", "８"),
    
    /** ９馬身 */
    _9("９馬身", "9__", "９", "９"),
    
    /** アタマ */
    HD("アタマ", "A__", "アタマ", "HD"),
    
    /** 同着 */
    DH("同着", "D__", "同着", "DH"),
    
    /** ハナ */
    NS("ハナ", "H__", "ハナ", "NS"),
    
    /** クビ */
    NK("クビ", "K__", "クビ", "NK"),
    
    /** 大差 */
    DS("大差", "T__", "大差", "DS"),
    
    /** １０馬身 */
    _10("１０馬身", "Z__", "１０", "１０"),
    
    /** 1/4馬身 */
    _1_PER_4("1/4馬身", "_14", "1/4", "1/4"),
    
    /** ２1/4馬身 */
    _2_AND_1_PER_4("２1/4馬身", "214", "２1/4", "２1/4"),
    
    /** ７3/4馬身 */
    _７3_PER_4("７3/4馬身", "734", "７3/4", "７3/4"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 略名(3文字) */
    private String nameChar3;
    
    /** 欧字名 */
    private String nameEng;
    
    private MarginCd(String name, String value, String nameChar3, String nameEng) {
        this.name = name;
        this.value = value;
        this.nameChar3 = nameChar3;
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
    public String getValue() {
        return this.value;
    }
    
    /**
     * 略名(3文字)  を返します。
     * @return 略名(3文字)  
     */
    public String getNameChar3() {
        return this.nameChar3;
    }
    
    /**
     * 欧字名 を返します。
     * @return 欧字名 
     */
    public String getNameEng() {
        return this.nameEng;
    }
    
}