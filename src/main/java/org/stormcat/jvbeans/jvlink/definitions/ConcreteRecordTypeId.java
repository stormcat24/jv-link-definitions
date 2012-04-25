/*
 * Copyright 2009-2010 the Stormcat Project.
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
package org.stormcat.jvbeans.jvlink.definitions;

import org.stormcat.jvbeans.config.RecordTypeId;

/**
 * レコード種別IDのEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.3
 *
 */
public enum ConcreteRecordTypeId implements RecordTypeId {

    /** 特別登録馬情報 */
    TK("特別登録馬情報", "TK"),

    /** レース情報 */
    RA("レース情報", "RA"),

    /** レース情報 */
    SE("レース情報", "SE"),

    /** レース情報 */
    HR("レース情報", "HR"),

    /** レース情報 */
    H1("レース情報", "H1"),

    /** レース情報 */
    H6("レース情報", "H6"),

    /** レース情報 */
    O1("レース情報", "O1"),

    /** レース情報 */
    O2("レース情報", "O2"),

    /** レース情報 */
    O3("レース情報", "O3"),

    /** レース情報 */
    O4("レース情報", "O4"),

    /** レース情報 */
    O5("レース情報", "O5"),

    /** レース情報 */
    O6("レース情報", "O6"),
    
    /** レース情報 */
    WF("レース情報", "WF"),
    
    /** レース情報 */
    JG("レース情報", "JG"),

    /** 蓄積系ソフト用　蓄積情報 */
    UM("蓄積系ソフト用　蓄積情報", "UM"),

    /** 蓄積系ソフト用　蓄積情報 */
    KS("蓄積系ソフト用　蓄積情報", "KS"),

    /** 蓄積系ソフト用　蓄積情報 */
    CH("蓄積系ソフト用　蓄積情報", "CH"),

    /** 蓄積系ソフト用　蓄積情報 */
    BR("蓄積系ソフト用　蓄積情報", "BR"),

    /** 蓄積系ソフト用　蓄積情報 */
    BN("蓄積系ソフト用　蓄積情報", "BN"),

    /** 蓄積系ソフト用　蓄積情報 */
    RC("蓄積系ソフト用　蓄積情報", "RC"),

    /** 蓄積系ソフト用　血統情報 */
    HN("蓄積系ソフト用　血統情報", "HN"),

    /** 蓄積系ソフト用　血統情報 */
    SK("蓄積系ソフト用　血統情報", "SK"),

    /** 蓄積系ソフト用　血統情報 */
    BT("蓄積系ソフト用　血統情報", "BT"),
    
    /** 蓄積系ソフト用　マイニング情報 */
    DM("蓄積系ソフト用　マイニング情報", "DM"),

    /** 蓄積系ソフト用　マイニング情報 */
    TM("蓄積系ソフト用　マイニング情報", "TM"),
    
    /** 出走時点情報 */
    CK("出走時点情報", "CK"),

    /** 坂路調教情報 */
    HC("坂路調教情報", "HC"),

    /** 開催スケジュール */
    YS("開催スケジュール", "YS"),

    /** 競走馬市場取引価格情報 */
    HS("競走馬市場取引価格情報", "HS"),

    /** 馬名の意味由来情報 */
    HY("馬名の意味由来情報", "HY"),

    /** 各種解説情報 */
    CS("各種解説情報", "CS"),

    /** 速報馬体重 */
    WH("速報馬体重", "WH"),

    /** 速報開催情報 */
    WE("速報開催情報", "WE"),

    /** 速報開催情報 */
    AV("速報開催情報", "AV"),

    /** 速報開催情報 */
    JC("速報開催情報", "JC"),

    /** 速報開催情報 */
    TC("速報開催情報", "TC"),

    /** 速報開催情報 */
    CC("速報開催情報", "CC"),




    ;

    /** 名称 */
    private String name;

    /** 値 */
    private String value;

    /**
     *
     * コンストラクタ
     * @param name 名称
     * @param value 値
     */
    private ConcreteRecordTypeId(String name, String value) {
        this.name = name;
        this.value = value;
    }

    /**
     * {@inheritDoc}
     */
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return value;
    }
    
    /**
     * {@inheritDoc}
     */
    public String toString() {
        return getValue();
    }

}
