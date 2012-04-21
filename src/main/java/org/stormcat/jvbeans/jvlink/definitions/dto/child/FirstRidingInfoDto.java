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
public class FirstRidingInfoDto {

    /** 　　年月日場回日R */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 16)
    private java.lang.String raceKey;

    /** 　　出走頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 17, byteLength = 2)
    private java.lang.Integer startHorseCount;

    /** 　　血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 19, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 29, byteLength = 36)
    private java.lang.String horseName;

    /** 　　確定着順 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 65, byteLength = 2)
    private java.lang.Integer fixedArrivalOrder;

    /** 　　異常区分コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 67, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd abnormalDivCd;


    /**
     * 　　年月日場回日Rを返します。
     * @return 　　年月日場回日R
     */
    public java.lang.String getRaceKey() {
        return raceKey;
    }

    /**
     * 　　年月日場回日Rを設定します。
     * @param raceKey 　　年月日場回日R
     */
    public void setRaceKey(java.lang.String raceKey) {
        this.raceKey = raceKey;
    }

    /**
     * 　　出走頭数を返します。
     * @return 　　出走頭数
     */
    public java.lang.Integer getStartHorseCount() {
        return startHorseCount;
    }

    /**
     * 　　出走頭数を設定します。
     * @param startHorseCount 　　出走頭数
     */
    public void setStartHorseCount(java.lang.Integer startHorseCount) {
        this.startHorseCount = startHorseCount;
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
     * 　　確定着順を返します。
     * @return 　　確定着順
     */
    public java.lang.Integer getFixedArrivalOrder() {
        return fixedArrivalOrder;
    }

    /**
     * 　　確定着順を設定します。
     * @param fixedArrivalOrder 　　確定着順
     */
    public void setFixedArrivalOrder(java.lang.Integer fixedArrivalOrder) {
        this.fixedArrivalOrder = fixedArrivalOrder;
    }

    /**
     * 　　異常区分コードを返します。
     * @return 　　異常区分コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd getAbnormalDivCd() {
        return abnormalDivCd;
    }

    /**
     * 　　異常区分コードを設定します。
     * @param abnormalDivCd 　　異常区分コード
     */
    public void setAbnormalDivCd(org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd abnormalDivCd) {
        this.abnormalDivCd = abnormalDivCd;
    }

}