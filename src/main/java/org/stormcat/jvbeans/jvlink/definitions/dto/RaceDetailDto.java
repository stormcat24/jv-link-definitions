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
 * レコードフォーマットID {@link RA} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "RA", byteLength = 1272)
public class RaceDetailDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code RA}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RaceDetailDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("出走馬名表(木曜)", "1"),

        _2("出馬表(金･土曜)", "2"),

        _3("速報成績(3着まで確定)", "3"),

        _4("速報成績(5着まで確定)", "4"),

        _5("速報成績(全馬着順確定)", "5"),

        _6("速報成績(全馬着順+コーナ通過順)", "6"),

        _7("成績(月曜)", "7"),

        _A("地方競馬", "A"),

        _B("海外国際レース", "B"),

        _9("レース中止", "9"),

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
        private RaceDetailDataDiv(String name, String value) {
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

    /** 競走名略称10文字 */
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

    /** 変更前グレードコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 616, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCdBefore;

    /** 競走種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 617, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceTypeCd raceTypeCd;

    /** 競走記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 619, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceSignCd raceSignCd;

    /** 重量種別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 622, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeightTypeCd weightTypeCd;

    /** 競走条件コード 2歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 623, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld2;

    /** 競走条件コード 3歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 626, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld3;

    /** 競走条件コード 4歳条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 629, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld4;

    /** 競走条件コード 5歳以上条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 632, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdOld5;

    /** 競走条件コード 最若年条件 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 635, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.RaceConditionCd raceConditionCdYoungest;

    /** 競走条件名称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 638, byteLength = 60)
    private java.lang.String raceConditionName;

    /** 距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 698, byteLength = 4)
    private java.lang.String distance;

    /** 変更前距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 702, byteLength = 4)
    private java.lang.String distanceBefore;

    /** トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 706, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd;

    /** 変更前トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 708, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCdBefore;

    /** コース区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 710, byteLength = 2)
    private java.lang.String courseDiv;

    /** 変更前コース区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 712, byteLength = 2)
    private java.lang.String courseDivBefore;

    /** 本賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 714, byteLength = 8, repeatCount = 7)
    private java.util.List<java.lang.Long> addedMoneyItems;

    /** 変更前本賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 770, byteLength = 8, repeatCount = 5)
    private java.util.List<java.lang.Long> addedMoneyBeforeItems;

    /** 付加賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 810, byteLength = 8, repeatCount = 5)
    private java.util.List<java.lang.Long> stakesMoneyItems;

    /** 変更前付加賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 850, byteLength = 8, repeatCount = 3)
    private java.util.List<java.lang.Long> stakesMoneyBeforeItems;

    /** 発走時刻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 874, byteLength = 4)
    private java.lang.String startTime;

    /** 変更前発走時刻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 878, byteLength = 4)
    private java.lang.String startTimeBefore;

    /** 登録頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 882, byteLength = 2)
    private java.lang.String entryCount;

    /** 出走頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 884, byteLength = 2)
    private java.lang.String starterCount;

    /** 入線頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 886, byteLength = 2)
    private java.lang.String finishedCount;

    /** 天候コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 888, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.WeatherCd weatherCd;

    /** 芝馬場状態コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 889, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd turfConditionCd;

    /** ダート馬場状態コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 890, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseConditionCd dirtConditionCd;

    /** ラップタイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 891, byteLength = 3, repeatCount = 25)
    private java.util.List<java.lang.Float> lapTimeItems;

    /** 障害マイルタイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 966, byteLength = 4)
    private java.lang.String obstacleMileTime;

    /** 前3ハロン */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 970, byteLength = 3)
    private java.lang.Float firstFurlong3;

    /** 前4ハロン */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 973, byteLength = 3)
    private java.lang.Float firstFurlong4;

    /** 後3ハロン */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 976, byteLength = 3)
    private java.lang.Float lastFurlong3;

    /** 後4ハロン */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 979, byteLength = 3)
    private java.lang.Float lastFurlong4;

    /** コーナー通過順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 982, byteLength = 72, repeatCount = 4)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.CornerPassageRankDto> cornerPassageRankItems;

    /** レコード更新区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1270, byteLength = 1)
    private java.lang.String recordBreakDiv;


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
        return RaceDetailDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 競走名略称10文字を返します。
     * @return 競走名略称10文字
     */
    public java.lang.String getRaceNameShortChar10() {
        return raceNameShortChar10;
    }

    /**
     * 競走名略称10文字を設定します。
     * @param raceNameShortChar10 競走名略称10文字
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
     * 変更前グレードコードを返します。
     * @return 変更前グレードコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.GradeCd getGradeCdBefore() {
        return gradeCdBefore;
    }

    /**
     * 変更前グレードコードを設定します。
     * @param gradeCdBefore 変更前グレードコード
     */
    public void setGradeCdBefore(org.stormcat.jvbeans.jvlink.definitions.code.GradeCd gradeCdBefore) {
        this.gradeCdBefore = gradeCdBefore;
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
     * 競走条件名称を返します。
     * @return 競走条件名称
     */
    public java.lang.String getRaceConditionName() {
        return raceConditionName;
    }

    /**
     * 競走条件名称を設定します。
     * @param raceConditionName 競走条件名称
     */
    public void setRaceConditionName(java.lang.String raceConditionName) {
        this.raceConditionName = raceConditionName;
    }

    /**
     * 距離を返します。
     * @return 距離
     */
    public java.lang.String getDistance() {
        return distance;
    }

    /**
     * 距離を設定します。
     * @param distance 距離
     */
    public void setDistance(java.lang.String distance) {
        this.distance = distance;
    }

    /**
     * 変更前距離を返します。
     * @return 変更前距離
     */
    public java.lang.String getDistanceBefore() {
        return distanceBefore;
    }

    /**
     * 変更前距離を設定します。
     * @param distanceBefore 変更前距離
     */
    public void setDistanceBefore(java.lang.String distanceBefore) {
        this.distanceBefore = distanceBefore;
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
     * 変更前トラックコードを返します。
     * @return 変更前トラックコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.TrackCd getTrackCdBefore() {
        return trackCdBefore;
    }

    /**
     * 変更前トラックコードを設定します。
     * @param trackCdBefore 変更前トラックコード
     */
    public void setTrackCdBefore(org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCdBefore) {
        this.trackCdBefore = trackCdBefore;
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
     * 変更前コース区分を返します。
     * @return 変更前コース区分
     */
    public java.lang.String getCourseDivBefore() {
        return courseDivBefore;
    }

    /**
     * 変更前コース区分を設定します。
     * @param courseDivBefore 変更前コース区分
     */
    public void setCourseDivBefore(java.lang.String courseDivBefore) {
        this.courseDivBefore = courseDivBefore;
    }

    /**
     * 本賞金を返します。
     * @return 本賞金
     */
    public java.util.List<java.lang.Long> getAddedMoneyItems() {
        return addedMoneyItems;
    }

    /**
     * 本賞金を設定します。
     * @param addedMoneyItems 本賞金
     */
    public void setAddedMoneyItems(java.util.List<java.lang.Long> addedMoneyItems) {
        this.addedMoneyItems = addedMoneyItems;
    }

    /**
     * 変更前本賞金を返します。
     * @return 変更前本賞金
     */
    public java.util.List<java.lang.Long> getAddedMoneyBeforeItems() {
        return addedMoneyBeforeItems;
    }

    /**
     * 変更前本賞金を設定します。
     * @param addedMoneyBeforeItems 変更前本賞金
     */
    public void setAddedMoneyBeforeItems(java.util.List<java.lang.Long> addedMoneyBeforeItems) {
        this.addedMoneyBeforeItems = addedMoneyBeforeItems;
    }

    /**
     * 付加賞金を返します。
     * @return 付加賞金
     */
    public java.util.List<java.lang.Long> getStakesMoneyItems() {
        return stakesMoneyItems;
    }

    /**
     * 付加賞金を設定します。
     * @param stakesMoneyItems 付加賞金
     */
    public void setStakesMoneyItems(java.util.List<java.lang.Long> stakesMoneyItems) {
        this.stakesMoneyItems = stakesMoneyItems;
    }

    /**
     * 変更前付加賞金を返します。
     * @return 変更前付加賞金
     */
    public java.util.List<java.lang.Long> getStakesMoneyBeforeItems() {
        return stakesMoneyBeforeItems;
    }

    /**
     * 変更前付加賞金を設定します。
     * @param stakesMoneyBeforeItems 変更前付加賞金
     */
    public void setStakesMoneyBeforeItems(java.util.List<java.lang.Long> stakesMoneyBeforeItems) {
        this.stakesMoneyBeforeItems = stakesMoneyBeforeItems;
    }

    /**
     * 発走時刻を返します。
     * @return 発走時刻
     */
    public java.lang.String getStartTime() {
        return startTime;
    }

    /**
     * 発走時刻を設定します。
     * @param startTime 発走時刻
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }

    /**
     * 変更前発走時刻を返します。
     * @return 変更前発走時刻
     */
    public java.lang.String getStartTimeBefore() {
        return startTimeBefore;
    }

    /**
     * 変更前発走時刻を設定します。
     * @param startTimeBefore 変更前発走時刻
     */
    public void setStartTimeBefore(java.lang.String startTimeBefore) {
        this.startTimeBefore = startTimeBefore;
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
     * 出走頭数を返します。
     * @return 出走頭数
     */
    public java.lang.String getStarterCount() {
        return starterCount;
    }

    /**
     * 出走頭数を設定します。
     * @param starterCount 出走頭数
     */
    public void setStarterCount(java.lang.String starterCount) {
        this.starterCount = starterCount;
    }

    /**
     * 入線頭数を返します。
     * @return 入線頭数
     */
    public java.lang.String getFinishedCount() {
        return finishedCount;
    }

    /**
     * 入線頭数を設定します。
     * @param finishedCount 入線頭数
     */
    public void setFinishedCount(java.lang.String finishedCount) {
        this.finishedCount = finishedCount;
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
     * ラップタイムを返します。
     * @return ラップタイム
     */
    public java.util.List<java.lang.Float> getLapTimeItems() {
        return lapTimeItems;
    }

    /**
     * ラップタイムを設定します。
     * @param lapTimeItems ラップタイム
     */
    public void setLapTimeItems(java.util.List<java.lang.Float> lapTimeItems) {
        this.lapTimeItems = lapTimeItems;
    }

    /**
     * 障害マイルタイムを返します。
     * @return 障害マイルタイム
     */
    public java.lang.String getObstacleMileTime() {
        return obstacleMileTime;
    }

    /**
     * 障害マイルタイムを設定します。
     * @param obstacleMileTime 障害マイルタイム
     */
    public void setObstacleMileTime(java.lang.String obstacleMileTime) {
        this.obstacleMileTime = obstacleMileTime;
    }

    /**
     * 前3ハロンを返します。
     * @return 前3ハロン
     */
    public java.lang.Float getFirstFurlong3() {
        return firstFurlong3;
    }

    /**
     * 前3ハロンを設定します。
     * @param firstFurlong3 前3ハロン
     */
    public void setFirstFurlong3(java.lang.Float firstFurlong3) {
        this.firstFurlong3 = firstFurlong3;
    }

    /**
     * 前4ハロンを返します。
     * @return 前4ハロン
     */
    public java.lang.Float getFirstFurlong4() {
        return firstFurlong4;
    }

    /**
     * 前4ハロンを設定します。
     * @param firstFurlong4 前4ハロン
     */
    public void setFirstFurlong4(java.lang.Float firstFurlong4) {
        this.firstFurlong4 = firstFurlong4;
    }

    /**
     * 後3ハロンを返します。
     * @return 後3ハロン
     */
    public java.lang.Float getLastFurlong3() {
        return lastFurlong3;
    }

    /**
     * 後3ハロンを設定します。
     * @param lastFurlong3 後3ハロン
     */
    public void setLastFurlong3(java.lang.Float lastFurlong3) {
        this.lastFurlong3 = lastFurlong3;
    }

    /**
     * 後4ハロンを返します。
     * @return 後4ハロン
     */
    public java.lang.Float getLastFurlong4() {
        return lastFurlong4;
    }

    /**
     * 後4ハロンを設定します。
     * @param lastFurlong4 後4ハロン
     */
    public void setLastFurlong4(java.lang.Float lastFurlong4) {
        this.lastFurlong4 = lastFurlong4;
    }

    /**
     * コーナー通過順位を返します。
     * @return コーナー通過順位
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.CornerPassageRankDto> getCornerPassageRankItems() {
        return cornerPassageRankItems;
    }

    /**
     * コーナー通過順位を設定します。
     * @param cornerPassageRankItems コーナー通過順位
     */
    public void setCornerPassageRankItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.CornerPassageRankDto> cornerPassageRankItems) {
        this.cornerPassageRankItems = cornerPassageRankItems;
    }

    /**
     * レコード更新区分を返します。
     * @return レコード更新区分
     */
    public java.lang.String getRecordBreakDiv() {
        return recordBreakDiv;
    }

    /**
     * レコード更新区分を設定します。
     * @param recordBreakDiv レコード更新区分
     */
    public void setRecordBreakDiv(java.lang.String recordBreakDiv) {
        this.recordBreakDiv = recordBreakDiv;
    }

}