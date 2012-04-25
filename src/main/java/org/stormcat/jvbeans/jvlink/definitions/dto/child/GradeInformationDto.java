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
public class GradeInformationDto {

    /** 　　特別競走番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 4)
    private java.lang.Integer specialRaceNo;

    /** 　　競走名本題 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 5, byteLength = 60)
    private java.lang.String raceNameFull;

    /** 　　競走名略称10文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 65, byteLength = 20)
    private java.lang.String raceNameShortChar10;

    /** 　　競走名略称6文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 85, byteLength = 12)
    private java.lang.String raceNameShortChar6;

    /** 　　競走名略称3文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 97, byteLength = 6)
    private java.lang.String raceNameShortChar3;

    /** 　　重賞回次[第N回] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 103, byteLength = 3)
    private java.lang.Integer gradeTimes;

    /** 　　グレードコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 106, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd;

    /** 　　競走種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 107, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd;

    /** 　　競走記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 109, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd raceSignCd;

    /** 　　重量種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 112, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd weightTypeCd;

    /** 　　距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 113, byteLength = 4)
    private java.lang.Integer distance;

    /** 　　トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 117, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd;


    /**
     * 　　特別競走番号を返します。
     * @return 　　特別競走番号
     */
    public java.lang.Integer getSpecialRaceNo() {
        return specialRaceNo;
    }

    /**
     * 　　特別競走番号を設定します。
     * @param specialRaceNo 　　特別競走番号
     */
    public void setSpecialRaceNo(java.lang.Integer specialRaceNo) {
        this.specialRaceNo = specialRaceNo;
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
     * 　　重賞回次[第N回]を返します。
     * @return 　　重賞回次[第N回]
     */
    public java.lang.Integer getGradeTimes() {
        return gradeTimes;
    }

    /**
     * 　　重賞回次[第N回]を設定します。
     * @param gradeTimes 　　重賞回次[第N回]
     */
    public void setGradeTimes(java.lang.Integer gradeTimes) {
        this.gradeTimes = gradeTimes;
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
     * 　　競走種別コードを返します。
     * @return 　　競走種別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd getRaceTypeCd() {
        return raceTypeCd;
    }

    /**
     * 　　競走種別コードを設定します。
     * @param raceTypeCd 　　競走種別コード
     */
    public void setRaceTypeCd(org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd) {
        this.raceTypeCd = raceTypeCd;
    }

    /**
     * 　　競走記号コードを返します。
     * @return 　　競走記号コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd getRaceSignCd() {
        return raceSignCd;
    }

    /**
     * 　　競走記号コードを設定します。
     * @param raceSignCd 　　競走記号コード
     */
    public void setRaceSignCd(org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd raceSignCd) {
        this.raceSignCd = raceSignCd;
    }

    /**
     * 　　重量種別コードを返します。
     * @return 　　重量種別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd getWeightTypeCd() {
        return weightTypeCd;
    }

    /**
     * 　　重量種別コードを設定します。
     * @param weightTypeCd 　　重量種別コード
     */
    public void setWeightTypeCd(org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd weightTypeCd) {
        this.weightTypeCd = weightTypeCd;
    }

    /**
     * 　　距離を返します。
     * @return 　　距離
     */
    public java.lang.Integer getDistance() {
        return distance;
    }

    /**
     * 　　距離を設定します。
     * @param distance 　　距離
     */
    public void setDistance(java.lang.Integer distance) {
        this.distance = distance;
    }

    /**
     * 　　トラックコードを返します。
     * @return 　　トラックコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.TrackCd getTrackCd() {
        return trackCd;
    }

    /**
     * 　　トラックコードを設定します。
     * @param trackCd 　　トラックコード
     */
    public void setTrackCd(org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd) {
        this.trackCd = trackCd;
    }

}