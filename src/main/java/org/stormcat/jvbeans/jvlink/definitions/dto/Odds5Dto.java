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
 * レコードフォーマットID {@link O5} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "O5", byteLength = 12293)
public class Odds5Dto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code O5}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum Odds5DataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private Odds5DataDiv(String name, String value) {
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

    /** 発売フラグ　3連複 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 40, byteLength = 1)
    private java.lang.Integer saleFlg;

    /** 3連複オッズ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 41, byteLength = 15, repeatCount = 816)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TrioOddsDto> trioOddsItems;

    /** 3連複票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12281, byteLength = 11)
    private java.lang.String voteTotalCount;


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
        return Odds5DataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 発売フラグ　3連複を返します。
     * @return 発売フラグ　3連複
     */
    public java.lang.Integer getSaleFlg() {
        return saleFlg;
    }

    /**
     * 発売フラグ　3連複を設定します。
     * @param saleFlg 発売フラグ　3連複
     */
    public void setSaleFlg(java.lang.Integer saleFlg) {
        this.saleFlg = saleFlg;
    }

    /**
     * 3連複オッズを返します。
     * @return 3連複オッズ
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TrioOddsDto> getTrioOddsItems() {
        return trioOddsItems;
    }

    /**
     * 3連複オッズを設定します。
     * @param trioOddsItems 3連複オッズ
     */
    public void setTrioOddsItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TrioOddsDto> trioOddsItems) {
        this.trioOddsItems = trioOddsItems;
    }

    /**
     * 3連複票数合計を返します。
     * @return 3連複票数合計
     */
    public java.lang.String getVoteTotalCount() {
        return voteTotalCount;
    }

    /**
     * 3連複票数合計を設定します。
     * @param voteTotalCount 3連複票数合計
     */
    public void setVoteTotalCount(java.lang.String voteTotalCount) {
        this.voteTotalCount = voteTotalCount;
    }

}