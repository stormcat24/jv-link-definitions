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
public class RecordHolderInfoDto {

    /** 　　血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 11, byteLength = 36)
    private java.lang.String horseName;

    /** 　　馬記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 47, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd;

    /** 　　性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 49, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 　　調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 50, byteLength = 5)
    private java.lang.String trainerCd;

    /** 　　調教師名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 55, byteLength = 34)
    private java.lang.String trainerName;

    /** 　　負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 89, byteLength = 3, correction = 0.1f)
    private java.lang.Float loadWeight;

    /** 　　騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 92, byteLength = 5)
    private java.lang.String jockeyCd;

    /** 　　騎手名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 97, byteLength = 34)
    private java.lang.String jockeyName;


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
     * 　　調教師名を返します。
     * @return 　　調教師名
     */
    public java.lang.String getTrainerName() {
        return trainerName;
    }

    /**
     * 　　調教師名を設定します。
     * @param trainerName 　　調教師名
     */
    public void setTrainerName(java.lang.String trainerName) {
        this.trainerName = trainerName;
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
     * 　　騎手コードを返します。
     * @return 　　騎手コード
     */
    public java.lang.String getJockeyCd() {
        return jockeyCd;
    }

    /**
     * 　　騎手コードを設定します。
     * @param jockeyCd 　　騎手コード
     */
    public void setJockeyCd(java.lang.String jockeyCd) {
        this.jockeyCd = jockeyCd;
    }

    /**
     * 　　騎手名を返します。
     * @return 　　騎手名
     */
    public java.lang.String getJockeyName() {
        return jockeyName;
    }

    /**
     * 　　騎手名を設定します。
     * @param jockeyName 　　騎手名
     */
    public void setJockeyName(java.lang.String jockeyName) {
        this.jockeyName = jockeyName;
    }

}