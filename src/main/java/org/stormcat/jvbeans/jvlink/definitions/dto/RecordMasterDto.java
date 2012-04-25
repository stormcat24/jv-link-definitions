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
package org.stormcat.jvbeans.jvlink.definitions.dto;

 /**
 * レコードフォーマットID {@link RC} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "RC", byteLength = 501)
public class RecordMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code RC}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RecordMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("初期値", "1"),

        _0("該当レコード削除(提供ミスなどの理由による)", "0"),

        ;

        /** 名称 */
        private String name;

        /** 値 */
        private String value;

        /**
         * コンストラクタ
         * @param name 名称
         * @param value 値
         */
        private RecordMasterDataDiv(String name, String value) {
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

    }

    /** レコード種別ID */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 2)
    private org.stormcat.jvbeans.config.RecordTypeId recordTypeId;

    /** データ区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3, byteLength = 1)
    private java.lang.String dataDiv;

    /** データ作成年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 4, byteLength = 8)
    private java.util.Date dataCreateDate;

    /** レコード識別区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 1)
    private java.lang.Integer recordSignDiv;

    /** 開催年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 13, byteLength = 4)
    private java.lang.Integer holdingYear;

    /** 開催月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 17, byteLength = 4)
    private java.lang.String holdingDate;

    /** 競馬場コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 21, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseCd courseCd;

    /** 開催回[第N回] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 23, byteLength = 2)
    private java.lang.String holdingNo;

    /** 開催日目[N日目] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 25, byteLength = 2)
    private java.lang.String holdingDay;

    /** レース番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 27, byteLength = 2)
    private java.lang.String raceNo;

    /** 特別競走番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 29, byteLength = 4)
    private java.lang.String specialRaceNo;

    /** 競走名本題 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 33, byteLength = 60)
    private java.lang.String raceNameFull;

    /** グレードコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 93, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd;

    /** 競走種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 94, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd;

    /** 距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 96, byteLength = 4)
    private java.lang.Integer distance;

    /** トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 100, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd;

    /** レコード区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 102, byteLength = 1)
    private java.lang.Integer recordDiv;

    /** レコードタイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 103, byteLength = 4)
    private java.lang.String recordTime;

    /** 天候コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 107, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeatherCd weatherCd;

    /** 芝馬場状態コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 108, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd turfConditionCd;

    /** ダート馬場状態コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 109, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd dirtConditionCd;

    /** レコード保持馬情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 110, byteLength = 130, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RecordHolderInfoDto> recordHolderInfoItems;


    /**
     * レコード種別IDを返します。
     * @return レコード種別ID
     */
    public org.stormcat.jvbeans.config.RecordTypeId getRecordTypeId() {
        return recordTypeId;
    }

    /**
     * レコード種別IDを設定します。
     * @param recordTypeId レコード種別ID
     */
    public void setRecordTypeId(org.stormcat.jvbeans.config.RecordTypeId recordTypeId) {
        this.recordTypeId = recordTypeId;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.stormcat.jvbeans.config.DataDiv getDataDiv() {
        return RecordMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
    }

    /**
     * データ区分を設定します。
     * @param データ区分
     */
    public void setDataDiv(java.lang.String dataDiv) {
        this.dataDiv = dataDiv;
    }

    /**
     * データ作成年月日を返します。
     * @return データ作成年月日
     */
    public java.util.Date getDataCreateDate() {
        return dataCreateDate;
    }

    /**
     * データ作成年月日を設定します。
     * @param dataCreateDate データ作成年月日
     */
    public void setDataCreateDate(java.util.Date dataCreateDate) {
        this.dataCreateDate = dataCreateDate;
    }

    /**
     * レコード識別区分を返します。
     * @return レコード識別区分
     */
    public java.lang.Integer getRecordSignDiv() {
        return recordSignDiv;
    }

    /**
     * レコード識別区分を設定します。
     * @param recordSignDiv レコード識別区分
     */
    public void setRecordSignDiv(java.lang.Integer recordSignDiv) {
        this.recordSignDiv = recordSignDiv;
    }

    /**
     * 開催年を返します。
     * @return 開催年
     */
    public java.lang.Integer getHoldingYear() {
        return holdingYear;
    }

    /**
     * 開催年を設定します。
     * @param holdingYear 開催年
     */
    public void setHoldingYear(java.lang.Integer holdingYear) {
        this.holdingYear = holdingYear;
    }

    /**
     * 開催月日を返します。
     * @return 開催月日
     */
    public java.lang.String getHoldingDate() {
        return holdingDate;
    }

    /**
     * 開催月日を設定します。
     * @param holdingDate 開催月日
     */
    public void setHoldingDate(java.lang.String holdingDate) {
        this.holdingDate = holdingDate;
    }

    /**
     * 競馬場コードを返します。
     * @return 競馬場コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.CourseCd getCourseCd() {
        return courseCd;
    }

    /**
     * 競馬場コードを設定します。
     * @param courseCd 競馬場コード
     */
    public void setCourseCd(org.stormcat.jvbeans.jvlink.definitions.code.CourseCd courseCd) {
        this.courseCd = courseCd;
    }

    /**
     * 開催回[第N回]を返します。
     * @return 開催回[第N回]
     */
    public java.lang.String getHoldingNo() {
        return holdingNo;
    }

    /**
     * 開催回[第N回]を設定します。
     * @param holdingNo 開催回[第N回]
     */
    public void setHoldingNo(java.lang.String holdingNo) {
        this.holdingNo = holdingNo;
    }

    /**
     * 開催日目[N日目]を返します。
     * @return 開催日目[N日目]
     */
    public java.lang.String getHoldingDay() {
        return holdingDay;
    }

    /**
     * 開催日目[N日目]を設定します。
     * @param holdingDay 開催日目[N日目]
     */
    public void setHoldingDay(java.lang.String holdingDay) {
        this.holdingDay = holdingDay;
    }

    /**
     * レース番号を返します。
     * @return レース番号
     */
    public java.lang.String getRaceNo() {
        return raceNo;
    }

    /**
     * レース番号を設定します。
     * @param raceNo レース番号
     */
    public void setRaceNo(java.lang.String raceNo) {
        this.raceNo = raceNo;
    }

    /**
     * 特別競走番号を返します。
     * @return 特別競走番号
     */
    public java.lang.String getSpecialRaceNo() {
        return specialRaceNo;
    }

    /**
     * 特別競走番号を設定します。
     * @param specialRaceNo 特別競走番号
     */
    public void setSpecialRaceNo(java.lang.String specialRaceNo) {
        this.specialRaceNo = specialRaceNo;
    }

    /**
     * 競走名本題を返します。
     * @return 競走名本題
     */
    public java.lang.String getRaceNameFull() {
        return raceNameFull;
    }

    /**
     * 競走名本題を設定します。
     * @param raceNameFull 競走名本題
     */
    public void setRaceNameFull(java.lang.String raceNameFull) {
        this.raceNameFull = raceNameFull;
    }

    /**
     * グレードコードを返します。
     * @return グレードコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.GradeCd getGradeCd() {
        return gradeCd;
    }

    /**
     * グレードコードを設定します。
     * @param gradeCd グレードコード
     */
    public void setGradeCd(org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd) {
        this.gradeCd = gradeCd;
    }

    /**
     * 競走種別コードを返します。
     * @return 競走種別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd getRaceTypeCd() {
        return raceTypeCd;
    }

    /**
     * 競走種別コードを設定します。
     * @param raceTypeCd 競走種別コード
     */
    public void setRaceTypeCd(org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd) {
        this.raceTypeCd = raceTypeCd;
    }

    /**
     * 距離を返します。
     * @return 距離
     */
    public java.lang.Integer getDistance() {
        return distance;
    }

    /**
     * 距離を設定します。
     * @param distance 距離
     */
    public void setDistance(java.lang.Integer distance) {
        this.distance = distance;
    }

    /**
     * トラックコードを返します。
     * @return トラックコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.TrackCd getTrackCd() {
        return trackCd;
    }

    /**
     * トラックコードを設定します。
     * @param trackCd トラックコード
     */
    public void setTrackCd(org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd) {
        this.trackCd = trackCd;
    }

    /**
     * レコード区分を返します。
     * @return レコード区分
     */
    public java.lang.Integer getRecordDiv() {
        return recordDiv;
    }

    /**
     * レコード区分を設定します。
     * @param recordDiv レコード区分
     */
    public void setRecordDiv(java.lang.Integer recordDiv) {
        this.recordDiv = recordDiv;
    }

    /**
     * レコードタイムを返します。
     * @return レコードタイム
     */
    public java.lang.String getRecordTime() {
        return recordTime;
    }

    /**
     * レコードタイムを設定します。
     * @param recordTime レコードタイム
     */
    public void setRecordTime(java.lang.String recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 天候コードを返します。
     * @return 天候コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.WeatherCd getWeatherCd() {
        return weatherCd;
    }

    /**
     * 天候コードを設定します。
     * @param weatherCd 天候コード
     */
    public void setWeatherCd(org.stormcat.jvbeans.jvlink.definitions.code.WeatherCd weatherCd) {
        this.weatherCd = weatherCd;
    }

    /**
     * 芝馬場状態コードを返します。
     * @return 芝馬場状態コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd getTurfConditionCd() {
        return turfConditionCd;
    }

    /**
     * 芝馬場状態コードを設定します。
     * @param turfConditionCd 芝馬場状態コード
     */
    public void setTurfConditionCd(org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd turfConditionCd) {
        this.turfConditionCd = turfConditionCd;
    }

    /**
     * ダート馬場状態コードを返します。
     * @return ダート馬場状態コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd getDirtConditionCd() {
        return dirtConditionCd;
    }

    /**
     * ダート馬場状態コードを設定します。
     * @param dirtConditionCd ダート馬場状態コード
     */
    public void setDirtConditionCd(org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd dirtConditionCd) {
        this.dirtConditionCd = dirtConditionCd;
    }

    /**
     * レコード保持馬情報を返します。
     * @return レコード保持馬情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RecordHolderInfoDto> getRecordHolderInfoItems() {
        return recordHolderInfoItems;
    }

    /**
     * レコード保持馬情報を設定します。
     * @param recordHolderInfoItems レコード保持馬情報
     */
    public void setRecordHolderInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RecordHolderInfoDto> recordHolderInfoItems) {
        this.recordHolderInfoItems = recordHolderInfoItems;
    }

}