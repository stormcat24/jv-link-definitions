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
 * <b>2005.競走種別コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum RaceTypeCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "00", "", "", "", ""),
    
    /** サラブレッド系2歳 */
    TWO_YEAR_OLDS("サラブレッド系2歳", "11", "サラ２才", "サラ系２歳", "サラ系２歳", "TWO-YEAR-OLDS"),
    
    /** サラブレッド系3歳 */
    THREE_YEAR_OLDS("サラブレッド系3歳", "12", "サラ３才", "サラ系３歳", "サラ系３歳", "THREE-YEAR-OLDS"),
    
    /** サラブレッド系3歳以上 */
    THREE_YEAR_OLDS_UP("サラブレッド系3歳以上", "13", "サラ３上", "サラ系３歳上", "サラ系３歳以上", "THREE-YEAR-OLDS & UP"),
    
    /** サラブレッド系4歳以上 */
    FOUR_YEAR_OLDS_UP("サラブレッド系4歳以上", "14", "サラ４上", "サラ系４歳上", "サラ系４歳以上", "FOUR-YEAR-OLDS & UP"),
    
    /** サラブレッド系障害3歳以上 */
    THREE_YEAR_OLDS_UP_STEEPLE_CHASE("サラブレッド系障害3歳以上", "18", "障害３上", "障害３歳上", "サラ障害３歳以上", "THREE-YEAR-OLDS & UP STEEPLE-CHASE"),
    
    /** サラブレッド系障害4歳以上 */
    FOUR_YEAR_OLDS_UP_STEEPLE_CHASE("サラブレッド系障害4歳以上", "19", "障害４上", "障害４歳上", "サラ障害４歳以上", "FOUR-YEAR-OLDS & UP STEEPLE-CHASE"),
    
    /** アラブ系2歳 */
    TWO_YEAR_OLDS_ANGLO_ARABS("アラブ系2歳", "21", "アラ２才", "アラ系２歳", "アラブ系２歳", "TWO-YEAR-OLDS ANGLO-ARABS"),
    
    /** アラブ系3歳 */
    THREE_YEAR_OLDS_ANGLO_ARABS("アラブ系3歳", "22", "アラ３才", "アラ系３歳", "アラブ系３歳", "THREE-YEAR-OLDS ANGLO-ARABS"),
    
    /** アラブ系3歳以上 */
    THREE_YEAR_OLDS_UP_ANGLO_ARABS("アラブ系3歳以上", "23", "アラ３上", "アラ系３歳上", "アラブ系３歳以上", "THREE-YEAR-OLDS & UP ANGLO-ARABS"),
    
    /** アラブ系4歳以上 */
    FOUR_YEAR_OLDS_UP_ANGLO_ARABS("アラブ系4歳以上", "24", "アラ４上", "アラ系４歳上", "アラブ系４歳以上", "FOUR-YEAR-OLDS & UP ANGLO-ARABS"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 略名(4文字) */
    private String nameChar4;
    
    /** 略名(6文字) */
    private String nameChar6;
    
    /** 略名(8文字) */
    private String nameChar8;
    
    /** 欧字名 */
    private String nameEng;
    
    private RaceTypeCd(String name, String value, String nameChar4, String nameChar6,
        String nameChar8, String nameEng) {
        this.name = name;
        this.value = value;
        this.nameChar4 = nameChar4;
        this.nameChar6 = nameChar6;
        this.nameChar8 = nameChar8;
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
     * 略名(4文字)を返します。
     * @return 略名(4文字)
     */
    public String getCourseNameChar4() {
        return this.nameChar4;
    }

    /**
     * 略名(6文字)を返します。
     * @return 略名(6文字)
     */    
    public String getCourseNameChar6() {
        return this.nameChar6;
    }
    
    /**
     * 略名(8文字)を返します。
     * @return 略名(8文字)
     */
    public String getCourseNameChar8() {
        return this.nameChar8;
    }
    
    /**
     * 欧字名を返します。
     * @return 欧字名
     */
    public String getCourseNameEng() {
        return this.nameEng;
    }

}