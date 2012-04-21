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
 * レコードフォーマットID {@link O1} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "O1", byteLength = 962)
public class Odds1Dto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code O1}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum Odds1DataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("中間", "1"),

        _2("前日売最終", "2"),

        _3("最終", "3"),

        _4("確定", "4"),

        _5("確定(月曜)", "5"),

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
        private Odds1DataDiv(String name, String value) {
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

    /** 登録頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 36, byteLength = 2)
    private java.lang.Integer entryCount;

    /** 出走頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 2)
    private java.lang.Integer starterCount;

    /** 発売フラグ　単勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 40, byteLength = 1)
    private java.lang.Integer saleFlgWin;

    /** 発売フラグ　複勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 41, byteLength = 1)
    private java.lang.Integer saleFlgShow;

    /** 発売フラグ　枠連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 1)
    private java.lang.Integer saleFlgbracket;

    /** 複勝着払キー */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 43, byteLength = 1)
    private java.lang.Integer showCashKey;

    /** 単勝オッズ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 44, byteLength = 8, repeatCount = 28)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.WinOddsDto> winOddsItems;

    /** 複勝オッズ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 268, byteLength = 12, repeatCount = 28)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ShowOddsDto> showOddsItems;

    /** 枠連オッズ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 604, byteLength = 9, repeatCount = 36)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BracketOddsDto> bracketOddsItems;

    /** 単勝票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 928, byteLength = 11)
    private java.lang.String voteTotalCountWin;

    /** 複勝票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 939, byteLength = 11)
    private java.lang.String voteTotalCountShow;

    /** 枠連票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 950, byteLength = 11)
    private java.lang.String voteTotalCountBracket;


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
        return Odds1DataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 登録頭数を返します。
     * @return 登録頭数
     */
    public java.lang.Integer getEntryCount() {
        return entryCount;
    }

    /**
     * 登録頭数を設定します。
     * @param entryCount 登録頭数
     */
    public void setEntryCount(java.lang.Integer entryCount) {
        this.entryCount = entryCount;
    }

    /**
     * 出走頭数を返します。
     * @return 出走頭数
     */
    public java.lang.Integer getStarterCount() {
        return starterCount;
    }

    /**
     * 出走頭数を設定します。
     * @param starterCount 出走頭数
     */
    public void setStarterCount(java.lang.Integer starterCount) {
        this.starterCount = starterCount;
    }

    /**
     * 発売フラグ　単勝を返します。
     * @return 発売フラグ　単勝
     */
    public java.lang.Integer getSaleFlgWin() {
        return saleFlgWin;
    }

    /**
     * 発売フラグ　単勝を設定します。
     * @param saleFlgWin 発売フラグ　単勝
     */
    public void setSaleFlgWin(java.lang.Integer saleFlgWin) {
        this.saleFlgWin = saleFlgWin;
    }

    /**
     * 発売フラグ　複勝を返します。
     * @return 発売フラグ　複勝
     */
    public java.lang.Integer getSaleFlgShow() {
        return saleFlgShow;
    }

    /**
     * 発売フラグ　複勝を設定します。
     * @param saleFlgShow 発売フラグ　複勝
     */
    public void setSaleFlgShow(java.lang.Integer saleFlgShow) {
        this.saleFlgShow = saleFlgShow;
    }

    /**
     * 発売フラグ　枠連を返します。
     * @return 発売フラグ　枠連
     */
    public java.lang.Integer getSaleFlgbracket() {
        return saleFlgbracket;
    }

    /**
     * 発売フラグ　枠連を設定します。
     * @param saleFlgbracket 発売フラグ　枠連
     */
    public void setSaleFlgbracket(java.lang.Integer saleFlgbracket) {
        this.saleFlgbracket = saleFlgbracket;
    }

    /**
     * 複勝着払キーを返します。
     * @return 複勝着払キー
     */
    public java.lang.Integer getShowCashKey() {
        return showCashKey;
    }

    /**
     * 複勝着払キーを設定します。
     * @param showCashKey 複勝着払キー
     */
    public void setShowCashKey(java.lang.Integer showCashKey) {
        this.showCashKey = showCashKey;
    }

    /**
     * 単勝オッズを返します。
     * @return 単勝オッズ
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.WinOddsDto> getWinOddsItems() {
        return winOddsItems;
    }

    /**
     * 単勝オッズを設定します。
     * @param winOddsItems 単勝オッズ
     */
    public void setWinOddsItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.WinOddsDto> winOddsItems) {
        this.winOddsItems = winOddsItems;
    }

    /**
     * 複勝オッズを返します。
     * @return 複勝オッズ
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ShowOddsDto> getShowOddsItems() {
        return showOddsItems;
    }

    /**
     * 複勝オッズを設定します。
     * @param showOddsItems 複勝オッズ
     */
    public void setShowOddsItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ShowOddsDto> showOddsItems) {
        this.showOddsItems = showOddsItems;
    }

    /**
     * 枠連オッズを返します。
     * @return 枠連オッズ
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BracketOddsDto> getBracketOddsItems() {
        return bracketOddsItems;
    }

    /**
     * 枠連オッズを設定します。
     * @param bracketOddsItems 枠連オッズ
     */
    public void setBracketOddsItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BracketOddsDto> bracketOddsItems) {
        this.bracketOddsItems = bracketOddsItems;
    }

    /**
     * 単勝票数合計を返します。
     * @return 単勝票数合計
     */
    public java.lang.String getVoteTotalCountWin() {
        return voteTotalCountWin;
    }

    /**
     * 単勝票数合計を設定します。
     * @param voteTotalCountWin 単勝票数合計
     */
    public void setVoteTotalCountWin(java.lang.String voteTotalCountWin) {
        this.voteTotalCountWin = voteTotalCountWin;
    }

    /**
     * 複勝票数合計を返します。
     * @return 複勝票数合計
     */
    public java.lang.String getVoteTotalCountShow() {
        return voteTotalCountShow;
    }

    /**
     * 複勝票数合計を設定します。
     * @param voteTotalCountShow 複勝票数合計
     */
    public void setVoteTotalCountShow(java.lang.String voteTotalCountShow) {
        this.voteTotalCountShow = voteTotalCountShow;
    }

    /**
     * 枠連票数合計を返します。
     * @return 枠連票数合計
     */
    public java.lang.String getVoteTotalCountBracket() {
        return voteTotalCountBracket;
    }

    /**
     * 枠連票数合計を設定します。
     * @param voteTotalCountBracket 枠連票数合計
     */
    public void setVoteTotalCountBracket(java.lang.String voteTotalCountBracket) {
        this.voteTotalCountBracket = voteTotalCountBracket;
    }

}