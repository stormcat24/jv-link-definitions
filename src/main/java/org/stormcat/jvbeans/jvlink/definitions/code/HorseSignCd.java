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
 * <b>2204.馬記号コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum HorseSignCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("下記以外　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "00", ""),
    
    /** (抽) */
    MARU_S("(抽)", "01", "(S)"),
    
    /** [抽]  */
    KAKU_S("[抽] ", "02", ""),
    
    /** (父) */
    MARU_D("(父)", "03", "(D)"),
    
    /** (市)  */
    MARU_A("(市) ", "04", "(A)"),
    
    /** (地) */
    MARU_R("(地)", "05", "(R)"),
    
    /** (外) */
    MARU_F("(外)", "06", "(F)"),
    
    /** (父)(抽) */
    MARU_D_MARU_S("(父)(抽)", "07", "(D)(S)"),
    
    /** (父)(市) */
    MARU_D_MARU_A("(父)(市)", "08", "(D)(A)"),
    
    /** (父)(地) */
    MARU_D_MARU_R("(父)(地)", "09", "(D)(R)"),
    
    /** (市)(地) */
    MARU_A_MARU_R("(市)(地)", "10", "(A)(R)"),
    
    /** (外)(地) */
    MARU_F_MARU_R("(外)(地)", "11", "(F)(R)"),
    
    /** (父)(市)(地) */
    MARU_D_MARU_A_MARU_R("(父)(市)(地)", "12", "(D)(A)(R)"),
    
    /** (招) */
    MARU_I("(招)", "15", "(I)"),
    
    /** (招)(外) */
    MARU_I_MARU_F("(招)(外)", "16", "(I)(F)"),
    
    /** (招)(父) */
    MARU_I_MARU_D("(招)(父)", "17", "(I)(D)"),
    
    /** (招)(市) */
    MARU_I_MARU_A("(招)(市)", "18", "(I)(A)"),
    
    /** (招)(父)(市) */
    MARU_I_MARU_D_MARU_A("(招)(父)(市)", "19", "(I)(D)(A)"),
    
    /** (父)(外)  */
    MARU_D_MARU_F("(父)(外) ", "20", ""),
    
    /** [地]  */
    KAKU_R("[地] ", "21", "[R]"),
    
    /** (外)[地]  */
    MARU_F_KAKU_R("(外)[地] ", "22", "(F)[R]"),
    
    /** (父)[地]  */
    MARU_D_KAKU_R("(父)[地] ", "23", "(D)[R]"),
    
    /** (市)[地]  */
    MARU_A_KAKU_R("(市)[地] ", "24", "(A)[R]"),
    
    /** (父)(市)[地]  */
    MARU_D_MARU_A_KAKU_R("(父)(市)[地] ", "25", "(D)(A)[R]"),
    
    /** [外]  */
    KAKU_F("[外] ", "26", "[F]"),
    
    /** (父)[外]   */
    MARU_D_KAKU_F("(父)[外]  ", "27", "(D)[F]"),
    
    /** (持) */
    MOCHIKOMI("(持)", "31", ""),
    
    /** (父)(外)(地) */
    MARU_D_MARU_F_MARU_R("(父)(外)(地)", "40", "(D)(F)(R)"),
    
    /** (父)(外)[地]  */
    MARU_D_MARU_F_KAKU_R("(父)(外)[地] ", "41", "(D)(F)[R]"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 欧字名 */
    private String nameEng;
    
    private HorseSignCd(String name, String value, String nameEng) {
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
    
}