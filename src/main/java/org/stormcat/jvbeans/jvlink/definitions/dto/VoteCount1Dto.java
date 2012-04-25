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
 * レコードフォーマットID {@link H1} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "H1", byteLength = 28955)
public class VoteCount1Dto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code H1}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum VoteCount1DataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _2("前日売最終", "2"),

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
        private VoteCount1DataDiv(String name, String value) {
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

    /** 登録頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 2)
    private java.lang.Integer entryCount;

    /** 出走頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 30, byteLength = 2)
    private java.lang.Integer starterCount;

    /** 発売フラグ　単勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 32, byteLength = 1)
    private java.lang.Integer saleFlgWin;

    /** 発売フラグ　複勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 33, byteLength = 1)
    private java.lang.Integer saleFlgShow;

    /** 発売フラグ　枠連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 1)
    private java.lang.Integer saleFlgBracket;

    /** 発売フラグ　馬連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 1)
    private java.lang.Integer saleFlgQuinella;

    /** 発売フラグ　ワイド */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 36, byteLength = 1)
    private java.lang.Integer saleFlgQuinellaPlace;

    /** 発売フラグ　馬単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 37, byteLength = 1)
    private java.lang.Integer saleFlgExacta;

    /** 発売フラグ　3連複 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 1)
    private java.lang.Integer saleFlgTrio;

    /** 複勝着払キー */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 1)
    private java.lang.Integer showCashKey;

    /** 返還馬番情報(馬番01～28) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 40, byteLength = 1, repeatCount = 28)
    private java.util.List<java.lang.Integer> restoreHorseNoItems;

    /** 返還枠番情報(枠番1～8) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 68, byteLength = 1, repeatCount = 8)
    private java.util.List<java.lang.Integer> restoreBracketItems;

    /** 返還同枠情報(枠番1～8) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 76, byteLength = 1, repeatCount = 8)
    private java.util.List<java.lang.Integer> restoreSameBracketItems;

    /** 単勝票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 84, byteLength = 15, repeatCount = 28)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountWinDto> voteCountWinItems;

    /** 複勝票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 504, byteLength = 15, repeatCount = 28)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountShowDto> voteCountShowItems;

    /** 枠連票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 924, byteLength = 15, repeatCount = 36)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountBracketDto> voteCountBracketItems;

    /** 馬連票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1464, byteLength = 18, repeatCount = 153)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaDto> voteCountQuinellaItems;

    /** ワイド票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 4218, byteLength = 18, repeatCount = 153)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaPlaceDto> voteCountQuinellaPlaceItems;

    /** 馬単票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6972, byteLength = 18, repeatCount = 306)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountExactaDto> voteCountExactaItems;

    /** 3連複票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12480, byteLength = 20, repeatCount = 816)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountTrioDto> voteCountTrioItems;

    /** 単勝票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28800, byteLength = 11)
    private java.lang.String voteCountTotalWin;

    /** 複勝票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28811, byteLength = 11)
    private java.lang.String voteCountTotalShow;

    /** 枠連票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28822, byteLength = 11)
    private java.lang.String voteCountTotalBracket;

    /** 馬連票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28833, byteLength = 11)
    private java.lang.String voteCountTotalQuinella;

    /** ワイド票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28844, byteLength = 11)
    private java.lang.String voteCountTotalQuinellaPlace;

    /** 馬単票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28855, byteLength = 11)
    private java.lang.String voteCountTotalExacta;

    /** 3連複票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28866, byteLength = 11)
    private java.lang.String voteCountTotalTrio;

    /** 単勝返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28877, byteLength = 11)
    private java.lang.String restoreVoteCountTotalWin;

    /** 複勝返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28888, byteLength = 11)
    private java.lang.String restoreVoteCountTotalShow;

    /** 枠連返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28899, byteLength = 11)
    private java.lang.String restoreVoteCountTotalBracket;

    /** 馬連返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28910, byteLength = 11)
    private java.lang.String restoreVoteCountTotalQuinella;

    /** ワイド返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28921, byteLength = 11)
    private java.lang.String restoreVoteCountTotalQuinellaPlace;

    /** 馬単返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28932, byteLength = 11)
    private java.lang.String restoreVoteCountTotalExacta;

    /** 3連複返還票数合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28943, byteLength = 11)
    private java.lang.String restoreVoteCountTotalTrio;


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
        return VoteCount1DataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
    public java.lang.Integer getSaleFlgBracket() {
        return saleFlgBracket;
    }

    /**
     * 発売フラグ　枠連を設定します。
     * @param saleFlgBracket 発売フラグ　枠連
     */
    public void setSaleFlgBracket(java.lang.Integer saleFlgBracket) {
        this.saleFlgBracket = saleFlgBracket;
    }

    /**
     * 発売フラグ　馬連を返します。
     * @return 発売フラグ　馬連
     */
    public java.lang.Integer getSaleFlgQuinella() {
        return saleFlgQuinella;
    }

    /**
     * 発売フラグ　馬連を設定します。
     * @param saleFlgQuinella 発売フラグ　馬連
     */
    public void setSaleFlgQuinella(java.lang.Integer saleFlgQuinella) {
        this.saleFlgQuinella = saleFlgQuinella;
    }

    /**
     * 発売フラグ　ワイドを返します。
     * @return 発売フラグ　ワイド
     */
    public java.lang.Integer getSaleFlgQuinellaPlace() {
        return saleFlgQuinellaPlace;
    }

    /**
     * 発売フラグ　ワイドを設定します。
     * @param saleFlgQuinellaPlace 発売フラグ　ワイド
     */
    public void setSaleFlgQuinellaPlace(java.lang.Integer saleFlgQuinellaPlace) {
        this.saleFlgQuinellaPlace = saleFlgQuinellaPlace;
    }

    /**
     * 発売フラグ　馬単を返します。
     * @return 発売フラグ　馬単
     */
    public java.lang.Integer getSaleFlgExacta() {
        return saleFlgExacta;
    }

    /**
     * 発売フラグ　馬単を設定します。
     * @param saleFlgExacta 発売フラグ　馬単
     */
    public void setSaleFlgExacta(java.lang.Integer saleFlgExacta) {
        this.saleFlgExacta = saleFlgExacta;
    }

    /**
     * 発売フラグ　3連複を返します。
     * @return 発売フラグ　3連複
     */
    public java.lang.Integer getSaleFlgTrio() {
        return saleFlgTrio;
    }

    /**
     * 発売フラグ　3連複を設定します。
     * @param saleFlgTrio 発売フラグ　3連複
     */
    public void setSaleFlgTrio(java.lang.Integer saleFlgTrio) {
        this.saleFlgTrio = saleFlgTrio;
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
     * 返還馬番情報(馬番01～28)を返します。
     * @return 返還馬番情報(馬番01～28)
     */
    public java.util.List<java.lang.Integer> getRestoreHorseNoItems() {
        return restoreHorseNoItems;
    }

    /**
     * 返還馬番情報(馬番01～28)を設定します。
     * @param restoreHorseNoItems 返還馬番情報(馬番01～28)
     */
    public void setRestoreHorseNoItems(java.util.List<java.lang.Integer> restoreHorseNoItems) {
        this.restoreHorseNoItems = restoreHorseNoItems;
    }

    /**
     * 返還枠番情報(枠番1～8)を返します。
     * @return 返還枠番情報(枠番1～8)
     */
    public java.util.List<java.lang.Integer> getRestoreBracketItems() {
        return restoreBracketItems;
    }

    /**
     * 返還枠番情報(枠番1～8)を設定します。
     * @param restoreBracketItems 返還枠番情報(枠番1～8)
     */
    public void setRestoreBracketItems(java.util.List<java.lang.Integer> restoreBracketItems) {
        this.restoreBracketItems = restoreBracketItems;
    }

    /**
     * 返還同枠情報(枠番1～8)を返します。
     * @return 返還同枠情報(枠番1～8)
     */
    public java.util.List<java.lang.Integer> getRestoreSameBracketItems() {
        return restoreSameBracketItems;
    }

    /**
     * 返還同枠情報(枠番1～8)を設定します。
     * @param restoreSameBracketItems 返還同枠情報(枠番1～8)
     */
    public void setRestoreSameBracketItems(java.util.List<java.lang.Integer> restoreSameBracketItems) {
        this.restoreSameBracketItems = restoreSameBracketItems;
    }

    /**
     * 単勝票数を返します。
     * @return 単勝票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountWinDto> getVoteCountWinItems() {
        return voteCountWinItems;
    }

    /**
     * 単勝票数を設定します。
     * @param voteCountWinItems 単勝票数
     */
    public void setVoteCountWinItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountWinDto> voteCountWinItems) {
        this.voteCountWinItems = voteCountWinItems;
    }

    /**
     * 複勝票数を返します。
     * @return 複勝票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountShowDto> getVoteCountShowItems() {
        return voteCountShowItems;
    }

    /**
     * 複勝票数を設定します。
     * @param voteCountShowItems 複勝票数
     */
    public void setVoteCountShowItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountShowDto> voteCountShowItems) {
        this.voteCountShowItems = voteCountShowItems;
    }

    /**
     * 枠連票数を返します。
     * @return 枠連票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountBracketDto> getVoteCountBracketItems() {
        return voteCountBracketItems;
    }

    /**
     * 枠連票数を設定します。
     * @param voteCountBracketItems 枠連票数
     */
    public void setVoteCountBracketItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountBracketDto> voteCountBracketItems) {
        this.voteCountBracketItems = voteCountBracketItems;
    }

    /**
     * 馬連票数を返します。
     * @return 馬連票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaDto> getVoteCountQuinellaItems() {
        return voteCountQuinellaItems;
    }

    /**
     * 馬連票数を設定します。
     * @param voteCountQuinellaItems 馬連票数
     */
    public void setVoteCountQuinellaItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaDto> voteCountQuinellaItems) {
        this.voteCountQuinellaItems = voteCountQuinellaItems;
    }

    /**
     * ワイド票数を返します。
     * @return ワイド票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaPlaceDto> getVoteCountQuinellaPlaceItems() {
        return voteCountQuinellaPlaceItems;
    }

    /**
     * ワイド票数を設定します。
     * @param voteCountQuinellaPlaceItems ワイド票数
     */
    public void setVoteCountQuinellaPlaceItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountQuinellaPlaceDto> voteCountQuinellaPlaceItems) {
        this.voteCountQuinellaPlaceItems = voteCountQuinellaPlaceItems;
    }

    /**
     * 馬単票数を返します。
     * @return 馬単票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountExactaDto> getVoteCountExactaItems() {
        return voteCountExactaItems;
    }

    /**
     * 馬単票数を設定します。
     * @param voteCountExactaItems 馬単票数
     */
    public void setVoteCountExactaItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountExactaDto> voteCountExactaItems) {
        this.voteCountExactaItems = voteCountExactaItems;
    }

    /**
     * 3連複票数を返します。
     * @return 3連複票数
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountTrioDto> getVoteCountTrioItems() {
        return voteCountTrioItems;
    }

    /**
     * 3連複票数を設定します。
     * @param voteCountTrioItems 3連複票数
     */
    public void setVoteCountTrioItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.VoteCountTrioDto> voteCountTrioItems) {
        this.voteCountTrioItems = voteCountTrioItems;
    }

    /**
     * 単勝票数合計を返します。
     * @return 単勝票数合計
     */
    public java.lang.String getVoteCountTotalWin() {
        return voteCountTotalWin;
    }

    /**
     * 単勝票数合計を設定します。
     * @param voteCountTotalWin 単勝票数合計
     */
    public void setVoteCountTotalWin(java.lang.String voteCountTotalWin) {
        this.voteCountTotalWin = voteCountTotalWin;
    }

    /**
     * 複勝票数合計を返します。
     * @return 複勝票数合計
     */
    public java.lang.String getVoteCountTotalShow() {
        return voteCountTotalShow;
    }

    /**
     * 複勝票数合計を設定します。
     * @param voteCountTotalShow 複勝票数合計
     */
    public void setVoteCountTotalShow(java.lang.String voteCountTotalShow) {
        this.voteCountTotalShow = voteCountTotalShow;
    }

    /**
     * 枠連票数合計を返します。
     * @return 枠連票数合計
     */
    public java.lang.String getVoteCountTotalBracket() {
        return voteCountTotalBracket;
    }

    /**
     * 枠連票数合計を設定します。
     * @param voteCountTotalBracket 枠連票数合計
     */
    public void setVoteCountTotalBracket(java.lang.String voteCountTotalBracket) {
        this.voteCountTotalBracket = voteCountTotalBracket;
    }

    /**
     * 馬連票数合計を返します。
     * @return 馬連票数合計
     */
    public java.lang.String getVoteCountTotalQuinella() {
        return voteCountTotalQuinella;
    }

    /**
     * 馬連票数合計を設定します。
     * @param voteCountTotalQuinella 馬連票数合計
     */
    public void setVoteCountTotalQuinella(java.lang.String voteCountTotalQuinella) {
        this.voteCountTotalQuinella = voteCountTotalQuinella;
    }

    /**
     * ワイド票数合計を返します。
     * @return ワイド票数合計
     */
    public java.lang.String getVoteCountTotalQuinellaPlace() {
        return voteCountTotalQuinellaPlace;
    }

    /**
     * ワイド票数合計を設定します。
     * @param voteCountTotalQuinellaPlace ワイド票数合計
     */
    public void setVoteCountTotalQuinellaPlace(java.lang.String voteCountTotalQuinellaPlace) {
        this.voteCountTotalQuinellaPlace = voteCountTotalQuinellaPlace;
    }

    /**
     * 馬単票数合計を返します。
     * @return 馬単票数合計
     */
    public java.lang.String getVoteCountTotalExacta() {
        return voteCountTotalExacta;
    }

    /**
     * 馬単票数合計を設定します。
     * @param voteCountTotalExacta 馬単票数合計
     */
    public void setVoteCountTotalExacta(java.lang.String voteCountTotalExacta) {
        this.voteCountTotalExacta = voteCountTotalExacta;
    }

    /**
     * 3連複票数合計を返します。
     * @return 3連複票数合計
     */
    public java.lang.String getVoteCountTotalTrio() {
        return voteCountTotalTrio;
    }

    /**
     * 3連複票数合計を設定します。
     * @param voteCountTotalTrio 3連複票数合計
     */
    public void setVoteCountTotalTrio(java.lang.String voteCountTotalTrio) {
        this.voteCountTotalTrio = voteCountTotalTrio;
    }

    /**
     * 単勝返還票数合計を返します。
     * @return 単勝返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalWin() {
        return restoreVoteCountTotalWin;
    }

    /**
     * 単勝返還票数合計を設定します。
     * @param restoreVoteCountTotalWin 単勝返還票数合計
     */
    public void setRestoreVoteCountTotalWin(java.lang.String restoreVoteCountTotalWin) {
        this.restoreVoteCountTotalWin = restoreVoteCountTotalWin;
    }

    /**
     * 複勝返還票数合計を返します。
     * @return 複勝返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalShow() {
        return restoreVoteCountTotalShow;
    }

    /**
     * 複勝返還票数合計を設定します。
     * @param restoreVoteCountTotalShow 複勝返還票数合計
     */
    public void setRestoreVoteCountTotalShow(java.lang.String restoreVoteCountTotalShow) {
        this.restoreVoteCountTotalShow = restoreVoteCountTotalShow;
    }

    /**
     * 枠連返還票数合計を返します。
     * @return 枠連返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalBracket() {
        return restoreVoteCountTotalBracket;
    }

    /**
     * 枠連返還票数合計を設定します。
     * @param restoreVoteCountTotalBracket 枠連返還票数合計
     */
    public void setRestoreVoteCountTotalBracket(java.lang.String restoreVoteCountTotalBracket) {
        this.restoreVoteCountTotalBracket = restoreVoteCountTotalBracket;
    }

    /**
     * 馬連返還票数合計を返します。
     * @return 馬連返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalQuinella() {
        return restoreVoteCountTotalQuinella;
    }

    /**
     * 馬連返還票数合計を設定します。
     * @param restoreVoteCountTotalQuinella 馬連返還票数合計
     */
    public void setRestoreVoteCountTotalQuinella(java.lang.String restoreVoteCountTotalQuinella) {
        this.restoreVoteCountTotalQuinella = restoreVoteCountTotalQuinella;
    }

    /**
     * ワイド返還票数合計を返します。
     * @return ワイド返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalQuinellaPlace() {
        return restoreVoteCountTotalQuinellaPlace;
    }

    /**
     * ワイド返還票数合計を設定します。
     * @param restoreVoteCountTotalQuinellaPlace ワイド返還票数合計
     */
    public void setRestoreVoteCountTotalQuinellaPlace(java.lang.String restoreVoteCountTotalQuinellaPlace) {
        this.restoreVoteCountTotalQuinellaPlace = restoreVoteCountTotalQuinellaPlace;
    }

    /**
     * 馬単返還票数合計を返します。
     * @return 馬単返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalExacta() {
        return restoreVoteCountTotalExacta;
    }

    /**
     * 馬単返還票数合計を設定します。
     * @param restoreVoteCountTotalExacta 馬単返還票数合計
     */
    public void setRestoreVoteCountTotalExacta(java.lang.String restoreVoteCountTotalExacta) {
        this.restoreVoteCountTotalExacta = restoreVoteCountTotalExacta;
    }

    /**
     * 3連複返還票数合計を返します。
     * @return 3連複返還票数合計
     */
    public java.lang.String getRestoreVoteCountTotalTrio() {
        return restoreVoteCountTotalTrio;
    }

    /**
     * 3連複返還票数合計を設定します。
     * @param restoreVoteCountTotalTrio 3連複返還票数合計
     */
    public void setRestoreVoteCountTotalTrio(java.lang.String restoreVoteCountTotalTrio) {
        this.restoreVoteCountTotalTrio = restoreVoteCountTotalTrio;
    }

}