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
package org.stormcat.jvbeans.jvlink.definitions.dto;

 /**
 * レコードフォーマットID {@link WE} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "WE", byteLength = 42)
public class WeatherTrackStateDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code WE}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum WeatherTrackStateDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("初期値", "1"),

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
        private WeatherTrackStateDataDiv(String name, String value) {
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

    /** 開催年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 4)
    private java.lang.Integer holdingYear;

    /** 開催月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 16, byteLength = 4)
    private java.lang.String holdingDate;

    /** 競馬場コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseCd courseCd;

    /** 開催回[第N回] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 22, byteLength = 2)
    private java.lang.Integer holdingNo;

    /** 開催日目[N日目] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 24, byteLength = 2)
    private java.lang.Integer holdingDay;

    /** 発表月日時分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 26, byteLength = 8)
    private java.util.Date announceDate;

    /** 変更識別 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 1)
    private java.lang.Integer changeIdentification;

    /** 天候状態 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 1)
    private java.lang.Integer weatherStateNow;

    /** 馬場状態・芝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 36, byteLength = 1)
    private java.lang.Integer turfStateNow;

    /** 馬場状態・ダート */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 37, byteLength = 1)
    private java.lang.Integer dirtStateNow;

    /** 天候状態 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 1)
    private java.lang.Integer weatherStateBefere;

    /** 馬場状態・芝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 1)
    private java.lang.Integer turfStateBefore;

    /** 馬場状態・ダート */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 40, byteLength = 1)
    private java.lang.Integer dirtStateBefore;


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
        return WeatherTrackStateDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
    public java.lang.Integer getHoldingNo() {
        return holdingNo;
    }

    /**
     * 開催回[第N回]を設定します。
     * @param holdingNo 開催回[第N回]
     */
    public void setHoldingNo(java.lang.Integer holdingNo) {
        this.holdingNo = holdingNo;
    }

    /**
     * 開催日目[N日目]を返します。
     * @return 開催日目[N日目]
     */
    public java.lang.Integer getHoldingDay() {
        return holdingDay;
    }

    /**
     * 開催日目[N日目]を設定します。
     * @param holdingDay 開催日目[N日目]
     */
    public void setHoldingDay(java.lang.Integer holdingDay) {
        this.holdingDay = holdingDay;
    }

    /**
     * 発表月日時分を返します。
     * @return 発表月日時分
     */
    public java.util.Date getAnnounceDate() {
        return announceDate;
    }

    /**
     * 発表月日時分を設定します。
     * @param announceDate 発表月日時分
     */
    public void setAnnounceDate(java.util.Date announceDate) {
        this.announceDate = announceDate;
    }

    /**
     * 変更識別を返します。
     * @return 変更識別
     */
    public java.lang.Integer getChangeIdentification() {
        return changeIdentification;
    }

    /**
     * 変更識別を設定します。
     * @param changeIdentification 変更識別
     */
    public void setChangeIdentification(java.lang.Integer changeIdentification) {
        this.changeIdentification = changeIdentification;
    }

    /**
     * 天候状態を返します。
     * @return 天候状態
     */
    public java.lang.Integer getWeatherStateNow() {
        return weatherStateNow;
    }

    /**
     * 天候状態を設定します。
     * @param weatherStateNow 天候状態
     */
    public void setWeatherStateNow(java.lang.Integer weatherStateNow) {
        this.weatherStateNow = weatherStateNow;
    }

    /**
     * 馬場状態・芝を返します。
     * @return 馬場状態・芝
     */
    public java.lang.Integer getTurfStateNow() {
        return turfStateNow;
    }

    /**
     * 馬場状態・芝を設定します。
     * @param turfStateNow 馬場状態・芝
     */
    public void setTurfStateNow(java.lang.Integer turfStateNow) {
        this.turfStateNow = turfStateNow;
    }

    /**
     * 馬場状態・ダートを返します。
     * @return 馬場状態・ダート
     */
    public java.lang.Integer getDirtStateNow() {
        return dirtStateNow;
    }

    /**
     * 馬場状態・ダートを設定します。
     * @param dirtStateNow 馬場状態・ダート
     */
    public void setDirtStateNow(java.lang.Integer dirtStateNow) {
        this.dirtStateNow = dirtStateNow;
    }

    /**
     * 天候状態を返します。
     * @return 天候状態
     */
    public java.lang.Integer getWeatherStateBefere() {
        return weatherStateBefere;
    }

    /**
     * 天候状態を設定します。
     * @param weatherStateBefere 天候状態
     */
    public void setWeatherStateBefere(java.lang.Integer weatherStateBefere) {
        this.weatherStateBefere = weatherStateBefere;
    }

    /**
     * 馬場状態・芝を返します。
     * @return 馬場状態・芝
     */
    public java.lang.Integer getTurfStateBefore() {
        return turfStateBefore;
    }

    /**
     * 馬場状態・芝を設定します。
     * @param turfStateBefore 馬場状態・芝
     */
    public void setTurfStateBefore(java.lang.Integer turfStateBefore) {
        this.turfStateBefore = turfStateBefore;
    }

    /**
     * 馬場状態・ダートを返します。
     * @return 馬場状態・ダート
     */
    public java.lang.Integer getDirtStateBefore() {
        return dirtStateBefore;
    }

    /**
     * 馬場状態・ダートを設定します。
     * @param dirtStateBefore 馬場状態・ダート
     */
    public void setDirtStateBefore(java.lang.Integer dirtStateBefore) {
        this.dirtStateBefore = dirtStateBefore;
    }

}