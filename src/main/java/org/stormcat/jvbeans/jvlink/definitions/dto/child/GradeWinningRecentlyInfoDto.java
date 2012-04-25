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
package org.stormcat.jvbeans.jvlink.definitions.dto.child;

 /**
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public class GradeWinningRecentlyInfoDto {

    /** 　　年月日場回日R */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 16)
    private java.lang.String raceKey;

    /** 　　競走名本題 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 17, byteLength = 60)
    private java.lang.String raceNameFull;

    /** 　　競走名略称10文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 77, byteLength = 20)
    private java.lang.String raceNameShortChar10;

    /** 　　競走名略称6文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 97, byteLength = 12)
    private java.lang.String raceNameShortChar6;

    /** 　　競走名略称3文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 109, byteLength = 6)
    private java.lang.String raceNameShortChar3;

    /** 　　グレードコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 115, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd;

    /** 　　出走頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 116, byteLength = 2)
    private java.lang.Integer startHorseCount;

    /** 　　血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 118, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 　　馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 128, byteLength = 36)
    private java.lang.String horseName;


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
     * 　　競走名本題を返します。
     * @return 　　競走名本題
     */
    public java.lang.String getRaceNameFull() {
        return raceNameFull;
    }

    /**
     * 　　競走名本題を設定します。
     * @param raceNameFull 　　競走名本題
     */
    public void setRaceNameFull(java.lang.String raceNameFull) {
        this.raceNameFull = raceNameFull;
    }

    /**
     * 　　競走名略称10文字を返します。
     * @return 　　競走名略称10文字
     */
    public java.lang.String getRaceNameShortChar10() {
        return raceNameShortChar10;
    }

    /**
     * 　　競走名略称10文字を設定します。
     * @param raceNameShortChar10 　　競走名略称10文字
     */
    public void setRaceNameShortChar10(java.lang.String raceNameShortChar10) {
        this.raceNameShortChar10 = raceNameShortChar10;
    }

    /**
     * 　　競走名略称6文字を返します。
     * @return 　　競走名略称6文字
     */
    public java.lang.String getRaceNameShortChar6() {
        return raceNameShortChar6;
    }

    /**
     * 　　競走名略称6文字を設定します。
     * @param raceNameShortChar6 　　競走名略称6文字
     */
    public void setRaceNameShortChar6(java.lang.String raceNameShortChar6) {
        this.raceNameShortChar6 = raceNameShortChar6;
    }

    /**
     * 　　競走名略称3文字を返します。
     * @return 　　競走名略称3文字
     */
    public java.lang.String getRaceNameShortChar3() {
        return raceNameShortChar3;
    }

    /**
     * 　　競走名略称3文字を設定します。
     * @param raceNameShortChar3 　　競走名略称3文字
     */
    public void setRaceNameShortChar3(java.lang.String raceNameShortChar3) {
        this.raceNameShortChar3 = raceNameShortChar3;
    }

    /**
     * 　　グレードコードを返します。
     * @return 　　グレードコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.GradeCd getGradeCd() {
        return gradeCd;
    }

    /**
     * 　　グレードコードを設定します。
     * @param gradeCd 　　グレードコード
     */
    public void setGradeCd(org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd) {
        this.gradeCd = gradeCd;
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

}