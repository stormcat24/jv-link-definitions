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
 * <b>2006.競走記号コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum RaceSignCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 記号なし　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    UNKNOWN("記号なし　または未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "000", ""),
    
    /** (指定) */
    DSN("(指定)", "001", "DSN"),
    
    /** 見習騎手 (2003年までの表記), 若手騎手 (2004年からの表記) */
    YOUNG_JOCKEY("見習騎手 (2003年までの表記), 若手騎手 (2004年からの表記)", "002", ""),
    
    /** [指定] */
    DES("[指定]", "003", "DES"),
    
    /** (特指) */
    SD("(特指)", "004", "SD"),
    
    /** 牝 */
    FEMALE("牝", "020", "F&M"),
    
    /** 牝 (指定) */
    FEMALE_DSN("牝 (指定)", "021", "F&M DSN"),
    
    /** 牝 [指定] */
    FEMALE_DES("牝 [指定]", "023", "F&M DES"),
    
    /** 牝 (特指) */
    FEMALE_SD("牝 (特指)", "024", "F&M SD"),
    
    /** 牡・ｾﾝ */
    MALE_GELDINGS("牡・ｾﾝ", "030", "C･G"),
    
    /** 牡・ｾﾝ (指定) */
    MALE_GELDINGS_DSN("牡・ｾﾝ (指定)", "031", "C･G DSN"),
    
    /** 牡・ｾﾝ [指定] */
    MALE_GELDINGS_DES("牡・ｾﾝ [指定]", "033", "C･G DES"),
    
    /** 牡・ｾﾝ (特指) */
    MALE_GELDINGS_SD("牡・ｾﾝ (特指)", "034", "C･G SD"),
    
    /** 牡・牝 */
    MALE_FEMALE("牡・牝", "040", "C･F"),
    
    /** 牡・牝 (指定) */
    MALE_FEMALE_DSN("牡・牝 (指定)", "041", "C･F DSN"),
    
    /** 牡・牝 [指定] */
    MALE_FEMALE_DES("牡・牝 [指定]", "043", "C･F DES"),
    
    /** 牡・牝 (特指) */
    MALE_FEMALE_SD("牡・牝 (特指)", "044", "C･F SD"),
    
    /** (混合) */
    MIX("(混合)", "A00", "MIX"),
    
    /** (混合)(指定) */
    MIX_DSN("(混合)(指定)", "A01", "MIX DSN"),
    
    /** (混合) 見習騎手 (2003年までの表記), (混合) 若手騎手 (2004年からの表記) */
    MIX_YOUNG_JOCKEY("(混合) 見習騎手 (2003年までの表記), (混合) 若手騎手 (2004年からの表記)", "A02", "MIX"),
    
    /** (混合)[指定] */
    MIX_DES("(混合)[指定]", "A03", "MIX DES"),
    
    /** (混合)(特指) */
    MIX_SD("(混合)(特指)", "A04", "MIX SD"),
    
    /** (混合) 牡 */
    MIX_MALE("(混合) 牡", "A10", "MIX C"),
    
    /** (混合) 牡 (指定) */
    MIX_MALE_DSN("(混合) 牡 (指定)", "A11", "MIX C"),
    
    /** (混合) 牡 [指定] */
    MIX_MALE_DES("(混合) 牡 [指定]", "A13", "MIX C DES"),
    
    /** (混合) 牡 (特指) */
    MIX_MALE_SD("(混合) 牡 (特指)", "A14", "MIX C SD"),
    
    /** (混合) 牝 */
    MIX_FEMALE("(混合) 牝", "A20", "MIX F&M"),
    
    /** (混合) 牝 (指定) */
    MIX_FEMALE_DSN("(混合) 牝 (指定)", "A21", "MIX F&M DSN"),
    
    /** (混合) 牝 [指定] */
    MIX_FEMALE_DES("(混合) 牝 [指定]", "A23", "MIX F&M DES"),
    
    /** (混合) 牝 (特指) */
    MIX_FEMALE_SD("(混合) 牝 (特指)", "A24", "MIX F&M SD"),
    
    /** (混合) 牡・ｾﾝ */
    MIX_MALE_GELDINGS("(混合) 牡・ｾﾝ", "A30", "MIX C･G"),
    
    /** (混合) 牡・ｾﾝ (指定) */
    MIX_MALE_GELDINGS_DSN("(混合) 牡・ｾﾝ (指定)", "A31", "MIX C･G DSN"),
    
    /** (混合) 牡・ｾﾝ [指定] */
    MIX_MALE_GELDINGS_DES("(混合) 牡・ｾﾝ [指定]", "A33", "MIX C･G DES"),
    
    /** (混合) 牡・ｾﾝ (特指) */
    MIX_MALE_GELDINGS_SD("(混合) 牡・ｾﾝ (特指)", "A34", "MIX C･G SD"),
    
    /** (混合) 牡・牝 */
    MIX_MALE_FEMALE("(混合) 牡・牝", "A40", "MIX C･F"),
    
    /** (混合) 牡・牝 (指定) */
    MIX_MALE_FEMALE_DSN("(混合) 牡・牝 (指定)", "A41", "MIX C･F DSN"),
    
    /** (父) */
    MARU_D("(父)", "B00", "(D)"),
    
    /** (父)(指定) */
    MARU_D_DSN("(父)(指定)", "B01", "(D) DSN"),
    
    /** (父)[指定] */
    MARU_D_DES("(父)[指定]", "B03", "(D) DES"),
    
    /** (父)(特指) */
    MARU_D_SD("(父)(特指)", "B04", "(D) SD"),
    
    /** (市) */
    MARU_A("(市)", "C00", "(A)"),
    
    /** (市)(指定) */
    MARU_A_DSN("(市)(指定)", "C01", "(A) DSN"),
    
    /** (市)[指定] */
    MARU_A_DES("(市)[指定]", "C03", "(A) DES"),
    
    /** (市)(特指) */
    MARU_A_SD("(市)(特指)", "C04", "(A) SD"),
    
    /** (抽) */
    MARU_S("(抽)", "D00", "(S)"),
    
    /** (抽)(指定) */
    MARU_S_DSN("(抽)(指定)", "D01", "(S) DSN"),
    
    /** (抽)[指定] */
    MARU_S_DES("(抽)[指定]", "D03", "(S) DES"),
    
    /** [抽] */
    KAKU_S("[抽]", "E00", ""),
    
    /** [抽](指定) */
    KAKU_S_DSN("[抽](指定)", "E01", "DSN"),
    
    /** [抽][指定] */
    KAKU_S_DES("[抽][指定]", "E03", "DES"),
    
    /** (市)(抽) */
    MARU_A_MARU_S("(市)(抽)", "F00", "(A)(S)"),
    
    /** (市)(抽)(指定) */
    MARU_A_MARU_S_DSN("(市)(抽)(指定)", "F01", "(A)(S) DSN"),
    
    /** (市)(抽)[指定] */
    MARU_A_MARU_S_DES("(市)(抽)[指定]", "F03", "(A)(S) DES"),
    
    /** (市)(抽)(特指) */
    MARU_A_MARU_S_SD("(市)(抽)(特指)", "F04", "(A)(S) SD"),
    
    /** (抽) 関西配布馬 */
    MARU_S_KANSAI("(抽) 関西配布馬", "G00", ""),
    
    /** (抽) 関西配布馬 (指定) */
    MARU_S_KANSAI_DSN("(抽) 関西配布馬 (指定)", "G01", "DSN"),
    
    /** (抽) 関西配布馬 [指定] */
    MARU_S_KANSAI_DES("(抽) 関西配布馬 [指定]", "G03", "DES"),
    
    /** (抽) 関東配布馬 */
    MARU_S_KANTO("(抽) 関東配布馬", "H00", ""),
    
    /** (抽) 関東配布馬 (指定) */
    MARU_S_KANTO_DSN("(抽) 関東配布馬 (指定)", "H01", "DSN"),
    
    /** [抽] 関西配布馬 */
    KAKU_S_KANSAI("[抽] 関西配布馬", "I00", ""),
    
    /** [抽] 関西配布馬 (指定) */
    KAKU_S_KANSAI_DSN("[抽] 関西配布馬 (指定)", "I01", "DSN"),
    
    /** [抽] 関西配布馬 [指定] */
    KAKU_S_KANSAI_DES("[抽] 関西配布馬 [指定]", "I03", "DES"),
    
    /** [抽] 関東配布馬 */
    KAKU_S_KANTO("[抽] 関東配布馬", "J00", ""),
    
    /** [抽] 関東配布馬 (指定) */
    KAKU_S_KANTO_DSN("[抽] 関東配布馬 (指定)", "J01", "DSN"),
    
    /** (市)(抽) 関西配布馬 */
    MARU_A_MARU_S_KANSAI("(市)(抽) 関西配布馬", "K00", ""),
    
    /** (市)(抽) 関西配布馬 (指定) */
    MARU_A_MARU_S_KANSAI_DSN("(市)(抽) 関西配布馬 (指定)", "K01", "DSN"),
    
    /** (市)(抽) 関西配布馬 [指定] */
    MARU_A_MARU_S_KANSAI_DES("(市)(抽) 関西配布馬 [指定]", "K03", "DES"),
    
    /** (市)(抽) 関東配布馬 */
    MARU_A_MARU_S_KANTO("(市)(抽) 関東配布馬", "L00", ""),
    
    /** (市)(抽) 関東配布馬 (指定) */
    MARU_A_MARU_S_KANTO_DSN("(市)(抽) 関東配布馬 (指定)", "L01", "DSN"),
    
    /** (市)(抽) 関東配布馬 [指定] */
    MARU_A_MARU_S_KANTO_DES("(市)(抽) 関東配布馬 [指定]", "L03", "DES"),
    
    /** 九州産馬 */
    KYUSHU("九州産馬", "M00", ""),
    
    /** 九州産馬 (指定) */
    KYUSHU_DSN("九州産馬 (指定)", "M01", "DSN"),
    
    /** 九州産馬 [指定] */
    KYUSHU_DES("九州産馬 [指定]", "M03", "DES"),
    
    /** 九州産馬 (特指) */
    KYUSHU_SD("九州産馬 (特指)", "M04", "SD"),
    
    /** (国際) */
    INT("(国際)", "N00", "INT"),
    
    /** (国際)(指定) */
    INT_DSN("(国際)(指定)", "N01", "INT DSN"),
    
    /** (国際)[指定] */
    INT_DES("(国際)[指定]", "N03", "INT DES"),
    
    /** (国際)(特指) */
    INT_SD("(国際)(特指)", "N04", "INT SD"),
    
    /** (国際) 牝 */
    INT_FEMALE("(国際) 牝", "N20", "INT F&M"),
    
    /** (国際) 牝 (指定) */
    INT_FEMALE_DSN("(国際) 牝 (指定)", "N21", "INT F&M DSN"),
    
    /** (国際) 牝 [指定] */
    INT_FEMALE_DES("(国際) 牝 [指定]", "N23", "INT F&M DES"),
    
    /** (国際) 牝 (特指) */
    INT_FEMALE_SD("(国際) 牝 (特指)", "N24", "INT F&M SD"),
    
    /** (国際) 牡・ｾﾝ */
    INT_MALE_GELDINGS("(国際) 牡・ｾﾝ", "N30", "INT C･G"),
    
    /** (国際) 牡・ｾﾝ (指定) */
    INT_MALE_GELDINGS_DSN("(国際) 牡・ｾﾝ (指定)", "N31", "INT C･G DSN"),
    
    /** (国際) 牡・牝 */
    INT_MALE_FEMALE("(国際) 牡・牝", "N40", "INT C･F"),
    
    /** (国際) 牡・牝 (指定) */
    INT_MALE_FEMALE_DSN("(国際) 牡・牝 (指定)", "N41", "INT C･F DSN"),
    
    ;

    /** 名称 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 欧字名 */
    private String nameEng;
    
    private RaceSignCd(String name, String value, String nameEng) {
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