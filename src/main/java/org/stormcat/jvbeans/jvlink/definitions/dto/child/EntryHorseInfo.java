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
package org.stormcat.jvbeans.jvlink.definitions.dto.child;

 /**
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public class EntryHorseInfo {

    /** 　　連番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 3)
    private java.lang.Integer seqNo;

    /** 　　血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 4, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 14, byteLength = 36)
    private java.lang.String horseName;

    /** 　　馬記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 50, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd;

    /** 　　性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 52, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 　　調教師東西所属コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 53, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd trainerEWBelongCd;

    /** 　　調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 54, byteLength = 5)
    private java.lang.String trainerCd;

    /** 　　調教師名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 59, byteLength = 8)
    private java.lang.String trainerNameShort;

    /** 　　負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 67, byteLength = 3, correction = 0.1f)
    private java.lang.Float loadWeight;

    /** 　　交流区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 70, byteLength = 1)
    private java.lang.String interchangeDiv;


    /**
     * 　　連番を返します。
     * @return 　　連番
     */
    public java.lang.Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 　　連番を設定します。
     * @param seqNo 　　連番
     */
    public void setSeqNo(java.lang.Integer seqNo) {
        this.seqNo = seqNo;
    }

    /**
     * 　　血統登録番号を返します。
     * @return 　　血統登録番号
     */
    public java.lang.String getBloodRegistNo() {
        return bloodRegistNo;
    }

    /**
     * 　　血統登録番号を設定します。
     * @param bloodRegistNo 　　血統登録番号
     */
    public void setBloodRegistNo(java.lang.String bloodRegistNo) {
        this.bloodRegistNo = bloodRegistNo;
    }

    /**
     * 　　馬名を返します。
     * @return 　　馬名
     */
    public java.lang.String getHorseName() {
        return horseName;
    }

    /**
     * 　　馬名を設定します。
     * @param horseName 　　馬名
     */
    public void setHorseName(java.lang.String horseName) {
        this.horseName = horseName;
    }

    /**
     * 　　馬記号コードを返します。
     * @return 　　馬記号コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd getHorseSignCd() {
        return horseSignCd;
    }

    /**
     * 　　馬記号コードを設定します。
     * @param horseSignCd 　　馬記号コード
     */
    public void setHorseSignCd(org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd) {
        this.horseSignCd = horseSignCd;
    }

    /**
     * 　　性別コードを返します。
     * @return 　　性別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.SexCd getSexCd() {
        return sexCd;
    }

    /**
     * 　　性別コードを設定します。
     * @param sexCd 　　性別コード
     */
    public void setSexCd(org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd) {
        this.sexCd = sexCd;
    }

    /**
     * 　　調教師東西所属コードを返します。
     * @return 　　調教師東西所属コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd getTrainerEWBelongCd() {
        return trainerEWBelongCd;
    }

    /**
     * 　　調教師東西所属コードを設定します。
     * @param trainerEWBelongCd 　　調教師東西所属コード
     */
    public void setTrainerEWBelongCd(org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd trainerEWBelongCd) {
        this.trainerEWBelongCd = trainerEWBelongCd;
    }

    /**
     * 　　調教師コードを返します。
     * @return 　　調教師コード
     */
    public java.lang.String getTrainerCd() {
        return trainerCd;
    }

    /**
     * 　　調教師コードを設定します。
     * @param trainerCd 　　調教師コード
     */
    public void setTrainerCd(java.lang.String trainerCd) {
        this.trainerCd = trainerCd;
    }

    /**
     * 　　調教師名略称を返します。
     * @return 　　調教師名略称
     */
    public java.lang.String getTrainerNameShort() {
        return trainerNameShort;
    }

    /**
     * 　　調教師名略称を設定します。
     * @param trainerNameShort 　　調教師名略称
     */
    public void setTrainerNameShort(java.lang.String trainerNameShort) {
        this.trainerNameShort = trainerNameShort;
    }

    /**
     * 　　負担重量を返します。
     * @return 　　負担重量
     */
    public java.lang.Float getLoadWeight() {
        return loadWeight;
    }

    /**
     * 　　負担重量を設定します。
     * @param loadWeight 　　負担重量
     */
    public void setLoadWeight(java.lang.Float loadWeight) {
        this.loadWeight = loadWeight;
    }

    /**
     * 　　交流区分を返します。
     * @return 　　交流区分
     */
    public java.lang.String getInterchangeDiv() {
        return interchangeDiv;
    }

    /**
     * 　　交流区分を設定します。
     * @param interchangeDiv 　　交流区分
     */
    public void setInterchangeDiv(java.lang.String interchangeDiv) {
        this.interchangeDiv = interchangeDiv;
    }

}