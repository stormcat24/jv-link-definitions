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
 * レコードフォーマットID {@link JC} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "JC", byteLength = 161)
public class JockeyChangeDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code JC}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum JockeyChangeDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private JockeyChangeDataDiv(String name, String value) {
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

    /** レース番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 26, byteLength = 2)
    private java.lang.Integer raceNo;

    /** 発表月日時分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 8)
    private java.util.Date announceDate;

    /** 馬番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 36, byteLength = 2)
    private java.lang.Integer horseNo;

    /** 馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 36)
    private java.lang.String horseName;

    /** 負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 74, byteLength = 3, correction = 0.1f)
    private java.lang.Float loadWeightAfter;

    /** 騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 77, byteLength = 5)
    private java.lang.String jockeyCdAfter;

    /** 騎手名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 82, byteLength = 34)
    private java.lang.String jockeyNameAfter;

    /** 騎手見習コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 116, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdAfter;

    /** 負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 117, byteLength = 3, correction = 0.1f)
    private java.lang.Float loadWeightBefore;

    /** 騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 120, byteLength = 5)
    private java.lang.String jockeyCdBefore;

    /** 騎手名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 125, byteLength = 34)
    private java.lang.String jockeyNameBefore;

    /** 騎手見習コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 159, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdBefore;


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
        return JockeyChangeDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * レース番号を返します。
     * @return レース番号
     */
    public java.lang.Integer getRaceNo() {
        return raceNo;
    }

    /**
     * レース番号を設定します。
     * @param raceNo レース番号
     */
    public void setRaceNo(java.lang.Integer raceNo) {
        this.raceNo = raceNo;
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
     * 馬番を返します。
     * @return 馬番
     */
    public java.lang.Integer getHorseNo() {
        return horseNo;
    }

    /**
     * 馬番を設定します。
     * @param horseNo 馬番
     */
    public void setHorseNo(java.lang.Integer horseNo) {
        this.horseNo = horseNo;
    }

    /**
     * 馬名を返します。
     * @return 馬名
     */
    public java.lang.String getHorseName() {
        return horseName;
    }

    /**
     * 馬名を設定します。
     * @param horseName 馬名
     */
    public void setHorseName(java.lang.String horseName) {
        this.horseName = horseName;
    }

    /**
     * 負担重量を返します。
     * @return 負担重量
     */
    public java.lang.Float getLoadWeightAfter() {
        return loadWeightAfter;
    }

    /**
     * 負担重量を設定します。
     * @param loadWeightAfter 負担重量
     */
    public void setLoadWeightAfter(java.lang.Float loadWeightAfter) {
        this.loadWeightAfter = loadWeightAfter;
    }

    /**
     * 騎手コードを返します。
     * @return 騎手コード
     */
    public java.lang.String getJockeyCdAfter() {
        return jockeyCdAfter;
    }

    /**
     * 騎手コードを設定します。
     * @param jockeyCdAfter 騎手コード
     */
    public void setJockeyCdAfter(java.lang.String jockeyCdAfter) {
        this.jockeyCdAfter = jockeyCdAfter;
    }

    /**
     * 騎手名を返します。
     * @return 騎手名
     */
    public java.lang.String getJockeyNameAfter() {
        return jockeyNameAfter;
    }

    /**
     * 騎手名を設定します。
     * @param jockeyNameAfter 騎手名
     */
    public void setJockeyNameAfter(java.lang.String jockeyNameAfter) {
        this.jockeyNameAfter = jockeyNameAfter;
    }

    /**
     * 騎手見習コードを返します。
     * @return 騎手見習コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd getJockeyMateCdAfter() {
        return jockeyMateCdAfter;
    }

    /**
     * 騎手見習コードを設定します。
     * @param jockeyMateCdAfter 騎手見習コード
     */
    public void setJockeyMateCdAfter(org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdAfter) {
        this.jockeyMateCdAfter = jockeyMateCdAfter;
    }

    /**
     * 負担重量を返します。
     * @return 負担重量
     */
    public java.lang.Float getLoadWeightBefore() {
        return loadWeightBefore;
    }

    /**
     * 負担重量を設定します。
     * @param loadWeightBefore 負担重量
     */
    public void setLoadWeightBefore(java.lang.Float loadWeightBefore) {
        this.loadWeightBefore = loadWeightBefore;
    }

    /**
     * 騎手コードを返します。
     * @return 騎手コード
     */
    public java.lang.String getJockeyCdBefore() {
        return jockeyCdBefore;
    }

    /**
     * 騎手コードを設定します。
     * @param jockeyCdBefore 騎手コード
     */
    public void setJockeyCdBefore(java.lang.String jockeyCdBefore) {
        this.jockeyCdBefore = jockeyCdBefore;
    }

    /**
     * 騎手名を返します。
     * @return 騎手名
     */
    public java.lang.String getJockeyNameBefore() {
        return jockeyNameBefore;
    }

    /**
     * 騎手名を設定します。
     * @param jockeyNameBefore 騎手名
     */
    public void setJockeyNameBefore(java.lang.String jockeyNameBefore) {
        this.jockeyNameBefore = jockeyNameBefore;
    }

    /**
     * 騎手見習コードを返します。
     * @return 騎手見習コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd getJockeyMateCdBefore() {
        return jockeyMateCdBefore;
    }

    /**
     * 騎手見習コードを設定します。
     * @param jockeyMateCdBefore 騎手見習コード
     */
    public void setJockeyMateCdBefore(org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdBefore) {
        this.jockeyMateCdBefore = jockeyMateCdBefore;
    }

}