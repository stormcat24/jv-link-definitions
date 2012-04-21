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
 * レコードフォーマットID {@link TK} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "TK", byteLength = 21657)
public class TokubetsuTourokubaDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code TK}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum TokubetsuTourokubaDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("ハンデ発表前(通常日曜)", "1"),

        _2("ハンデ発表後(通常月曜)", "2"),

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
        private TokubetsuTourokubaDataDiv(String name, String value) {
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

    /** 曜日コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeekDayCd weekDayCd;

    /** 特別競走番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 29, byteLength = 4)
    private java.lang.Integer specialRaceNo;

    /** 競走名本題 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 33, byteLength = 60)
    private java.lang.String raceNameFull;

    /** 競走名副題 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 93, byteLength = 60)
    private java.lang.String raceNameSub;

    /** 競走名カッコ内 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 153, byteLength = 60)
    private java.lang.String raceNameNote;

    /** 競走名本題欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 213, byteLength = 120)
    private java.lang.String raceNameFullEng;

    /** 競走名副題欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 333, byteLength = 120)
    private java.lang.String raceNameSubEng;

    /** 競走名カッコ内欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 453, byteLength = 120)
    private java.lang.String raceNameNoteEng;

    /** 競走名略称１0文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 573, byteLength = 20)
    private java.lang.String raceNameShortChar10;

    /** 競走名略称6文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 593, byteLength = 12)
    private java.lang.String raceNameShortChar6;

    /** 競走名略称3文字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 605, byteLength = 6)
    private java.lang.String raceNameShortChar3;

    /** 競走名区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 611, byteLength = 1)
    private java.lang.Integer raceNameDiv;

    /** 重賞回次[第N回] */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 612, byteLength = 3)
    private java.lang.Integer gradeTimes;

    /** グレードコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 615, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCd;

    /** 競走種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 616, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd;

    /** 競走記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 618, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd raceSignCd;

    /** 重量種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 621, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd weightTypeCd;

    /** 競走条件コード 2歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 622, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld2;

    /** 競走条件コード 3歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 625, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld3;

    /** 競走条件コード 4歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 628, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld4;

    /** 競走条件コード 5歳以上条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 631, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld5;

    /** 競走条件コード 最若年条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 634, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdYoungest;

    /** 距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 637, byteLength = 4)
    private java.lang.Integer distance;

    /** トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 641, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd;

    /** コース区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 643, byteLength = 2)
    private java.lang.String courseDiv;

    /** ハンデ発表日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 645, byteLength = 8)
    private java.lang.String handicapAnnounceDate;

    /** 登録頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 653, byteLength = 3)
    private java.lang.String entryCount;

    /** 登録馬毎情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 656, byteLength = 70, repeatCount = 300)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.EntryHorseInfo> entryHorseInfoItems;


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
        return TokubetsuTourokubaDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 曜日コードを返します。
     * @return 曜日コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.WeekDayCd getWeekDayCd() {
        return weekDayCd;
    }

    /**
     * 曜日コードを設定します。
     * @param weekDayCd 曜日コード
     */
    public void setWeekDayCd(org.stormcat.jvbeans.jvlink.definitions.code.WeekDayCd weekDayCd) {
        this.weekDayCd = weekDayCd;
    }

    /**
     * 特別競走番号を返します。
     * @return 特別競走番号
     */
    public java.lang.Integer getSpecialRaceNo() {
        return specialRaceNo;
    }

    /**
     * 特別競走番号を設定します。
     * @param specialRaceNo 特別競走番号
     */
    public void setSpecialRaceNo(java.lang.Integer specialRaceNo) {
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
     * 競走名副題を返します。
     * @return 競走名副題
     */
    public java.lang.String getRaceNameSub() {
        return raceNameSub;
    }

    /**
     * 競走名副題を設定します。
     * @param raceNameSub 競走名副題
     */
    public void setRaceNameSub(java.lang.String raceNameSub) {
        this.raceNameSub = raceNameSub;
    }

    /**
     * 競走名カッコ内を返します。
     * @return 競走名カッコ内
     */
    public java.lang.String getRaceNameNote() {
        return raceNameNote;
    }

    /**
     * 競走名カッコ内を設定します。
     * @param raceNameNote 競走名カッコ内
     */
    public void setRaceNameNote(java.lang.String raceNameNote) {
        this.raceNameNote = raceNameNote;
    }

    /**
     * 競走名本題欧字を返します。
     * @return 競走名本題欧字
     */
    public java.lang.String getRaceNameFullEng() {
        return raceNameFullEng;
    }

    /**
     * 競走名本題欧字を設定します。
     * @param raceNameFullEng 競走名本題欧字
     */
    public void setRaceNameFullEng(java.lang.String raceNameFullEng) {
        this.raceNameFullEng = raceNameFullEng;
    }

    /**
     * 競走名副題欧字を返します。
     * @return 競走名副題欧字
     */
    public java.lang.String getRaceNameSubEng() {
        return raceNameSubEng;
    }

    /**
     * 競走名副題欧字を設定します。
     * @param raceNameSubEng 競走名副題欧字
     */
    public void setRaceNameSubEng(java.lang.String raceNameSubEng) {
        this.raceNameSubEng = raceNameSubEng;
    }

    /**
     * 競走名カッコ内欧字を返します。
     * @return 競走名カッコ内欧字
     */
    public java.lang.String getRaceNameNoteEng() {
        return raceNameNoteEng;
    }

    /**
     * 競走名カッコ内欧字を設定します。
     * @param raceNameNoteEng 競走名カッコ内欧字
     */
    public void setRaceNameNoteEng(java.lang.String raceNameNoteEng) {
        this.raceNameNoteEng = raceNameNoteEng;
    }

    /**
     * 競走名略称１0文字を返します。
     * @return 競走名略称１0文字
     */
    public java.lang.String getRaceNameShortChar10() {
        return raceNameShortChar10;
    }

    /**
     * 競走名略称１0文字を設定します。
     * @param raceNameShortChar10 競走名略称１0文字
     */
    public void setRaceNameShortChar10(java.lang.String raceNameShortChar10) {
        this.raceNameShortChar10 = raceNameShortChar10;
    }

    /**
     * 競走名略称6文字を返します。
     * @return 競走名略称6文字
     */
    public java.lang.String getRaceNameShortChar6() {
        return raceNameShortChar6;
    }

    /**
     * 競走名略称6文字を設定します。
     * @param raceNameShortChar6 競走名略称6文字
     */
    public void setRaceNameShortChar6(java.lang.String raceNameShortChar6) {
        this.raceNameShortChar6 = raceNameShortChar6;
    }

    /**
     * 競走名略称3文字を返します。
     * @return 競走名略称3文字
     */
    public java.lang.String getRaceNameShortChar3() {
        return raceNameShortChar3;
    }

    /**
     * 競走名略称3文字を設定します。
     * @param raceNameShortChar3 競走名略称3文字
     */
    public void setRaceNameShortChar3(java.lang.String raceNameShortChar3) {
        this.raceNameShortChar3 = raceNameShortChar3;
    }

    /**
     * 競走名区分を返します。
     * @return 競走名区分
     */
    public java.lang.Integer getRaceNameDiv() {
        return raceNameDiv;
    }

    /**
     * 競走名区分を設定します。
     * @param raceNameDiv 競走名区分
     */
    public void setRaceNameDiv(java.lang.Integer raceNameDiv) {
        this.raceNameDiv = raceNameDiv;
    }

    /**
     * 重賞回次[第N回]を返します。
     * @return 重賞回次[第N回]
     */
    public java.lang.Integer getGradeTimes() {
        return gradeTimes;
    }

    /**
     * 重賞回次[第N回]を設定します。
     * @param gradeTimes 重賞回次[第N回]
     */
    public void setGradeTimes(java.lang.Integer gradeTimes) {
        this.gradeTimes = gradeTimes;
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
     * 競走記号コードを返します。
     * @return 競走記号コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd getRaceSignCd() {
        return raceSignCd;
    }

    /**
     * 競走記号コードを設定します。
     * @param raceSignCd 競走記号コード
     */
    public void setRaceSignCd(org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd raceSignCd) {
        this.raceSignCd = raceSignCd;
    }

    /**
     * 重量種別コードを返します。
     * @return 重量種別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd getWeightTypeCd() {
        return weightTypeCd;
    }

    /**
     * 重量種別コードを設定します。
     * @param weightTypeCd 重量種別コード
     */
    public void setWeightTypeCd(org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd weightTypeCd) {
        this.weightTypeCd = weightTypeCd;
    }

    /**
     * 競走条件コード 2歳条件を返します。
     * @return 競走条件コード 2歳条件
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd getRaceConditionCdOld2() {
        return raceConditionCdOld2;
    }

    /**
     * 競走条件コード 2歳条件を設定します。
     * @param raceConditionCdOld2 競走条件コード 2歳条件
     */
    public void setRaceConditionCdOld2(org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld2) {
        this.raceConditionCdOld2 = raceConditionCdOld2;
    }

    /**
     * 競走条件コード 3歳条件を返します。
     * @return 競走条件コード 3歳条件
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd getRaceConditionCdOld3() {
        return raceConditionCdOld3;
    }

    /**
     * 競走条件コード 3歳条件を設定します。
     * @param raceConditionCdOld3 競走条件コード 3歳条件
     */
    public void setRaceConditionCdOld3(org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld3) {
        this.raceConditionCdOld3 = raceConditionCdOld3;
    }

    /**
     * 競走条件コード 4歳条件を返します。
     * @return 競走条件コード 4歳条件
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd getRaceConditionCdOld4() {
        return raceConditionCdOld4;
    }

    /**
     * 競走条件コード 4歳条件を設定します。
     * @param raceConditionCdOld4 競走条件コード 4歳条件
     */
    public void setRaceConditionCdOld4(org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld4) {
        this.raceConditionCdOld4 = raceConditionCdOld4;
    }

    /**
     * 競走条件コード 5歳以上条件を返します。
     * @return 競走条件コード 5歳以上条件
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd getRaceConditionCdOld5() {
        return raceConditionCdOld5;
    }

    /**
     * 競走条件コード 5歳以上条件を設定します。
     * @param raceConditionCdOld5 競走条件コード 5歳以上条件
     */
    public void setRaceConditionCdOld5(org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld5) {
        this.raceConditionCdOld5 = raceConditionCdOld5;
    }

    /**
     * 競走条件コード 最若年条件を返します。
     * @return 競走条件コード 最若年条件
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd getRaceConditionCdYoungest() {
        return raceConditionCdYoungest;
    }

    /**
     * 競走条件コード 最若年条件を設定します。
     * @param raceConditionCdYoungest 競走条件コード 最若年条件
     */
    public void setRaceConditionCdYoungest(org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdYoungest) {
        this.raceConditionCdYoungest = raceConditionCdYoungest;
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
     * コース区分を返します。
     * @return コース区分
     */
    public java.lang.String getCourseDiv() {
        return courseDiv;
    }

    /**
     * コース区分を設定します。
     * @param courseDiv コース区分
     */
    public void setCourseDiv(java.lang.String courseDiv) {
        this.courseDiv = courseDiv;
    }

    /**
     * ハンデ発表日を返します。
     * @return ハンデ発表日
     */
    public java.lang.String getHandicapAnnounceDate() {
        return handicapAnnounceDate;
    }

    /**
     * ハンデ発表日を設定します。
     * @param handicapAnnounceDate ハンデ発表日
     */
    public void setHandicapAnnounceDate(java.lang.String handicapAnnounceDate) {
        this.handicapAnnounceDate = handicapAnnounceDate;
    }

    /**
     * 登録頭数を返します。
     * @return 登録頭数
     */
    public java.lang.String getEntryCount() {
        return entryCount;
    }

    /**
     * 登録頭数を設定します。
     * @param entryCount 登録頭数
     */
    public void setEntryCount(java.lang.String entryCount) {
        this.entryCount = entryCount;
    }

    /**
     * 登録馬毎情報を返します。
     * @return 登録馬毎情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.EntryHorseInfo> getEntryHorseInfoItems() {
        return entryHorseInfoItems;
    }

    /**
     * 登録馬毎情報を設定します。
     * @param entryHorseInfoItems 登録馬毎情報
     */
    public void setEntryHorseInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.EntryHorseInfo> entryHorseInfoItems) {
        this.entryHorseInfoItems = entryHorseInfoItems;
    }

}