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
 * レコードフォーマットID {@link HR} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "HR", byteLength = 719)
public class RefundDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code HR}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RefundDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("速報成績(払戻金確定)", "1"),

        _2("成績(月曜)", "2"),

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
        private RefundDataDiv(String name, String value) {
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

    /** 不成立フラグ　単勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 32, byteLength = 1)
    private java.lang.Integer failureFlgWin;

    /** 不成立フラグ　複勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 33, byteLength = 1)
    private java.lang.Integer failureFlgShow;

    /** 不成立フラグ　枠連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 1)
    private java.lang.Integer failureFlgBracket;

    /** 不成立フラグ　馬連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 1)
    private java.lang.Integer failureFlgQuinella;

    /** 不成立フラグ　ワイド */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 36, byteLength = 1)
    private java.lang.Integer failureFlgQuinellaPlace;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 37, byteLength = 1)
    private java.lang.String spare1;

    /** 不成立フラグ　馬単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 1)
    private java.lang.Integer failureFlgExacta;

    /** 不成立フラグ　3連複 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 1)
    private java.lang.Integer failureFlgTrio;

    /** 不成立フラグ　3連単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 40, byteLength = 1)
    private java.lang.Integer failureFlgTrifecta;

    /** 特払フラグ　単勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 41, byteLength = 1)
    private java.lang.Integer specialRefundFlgWin;

    /** 特払フラグ　複勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 1)
    private java.lang.Integer specialRefundFlgShow;

    /** 特払フラグ　枠連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 43, byteLength = 1)
    private java.lang.Integer specialRefundFlgBracket;

    /** 特払フラグ　馬連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 44, byteLength = 1)
    private java.lang.Integer specialRefundFlgQuinella;

    /** 特払フラグ　ワイド */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 45, byteLength = 1)
    private java.lang.Integer specialRefundFlgQuinellaPlace;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 46, byteLength = 1)
    private java.lang.String spare2;

    /** 特払フラグ　馬単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 47, byteLength = 1)
    private java.lang.Integer specialRefundFlgExacta;

    /** 特払フラグ　3連複 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 48, byteLength = 1)
    private java.lang.Integer specialRefundFlgTrio;

    /** 特払フラグ　3連単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 49, byteLength = 1)
    private java.lang.Integer specialRefundFlgTrifecta;

    /** 返還フラグ　単勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 50, byteLength = 1)
    private java.lang.Integer restoreFlgWin;

    /** 返還フラグ　複勝 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 51, byteLength = 1)
    private java.lang.Integer restoreFlgShow;

    /** 返還フラグ　枠連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 52, byteLength = 1)
    private java.lang.Integer restoreFlgBracket;

    /** 返還フラグ　馬連 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 53, byteLength = 1)
    private java.lang.Integer restoreFlgQuinella;

    /** 返還フラグ　ワイド */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 54, byteLength = 1)
    private java.lang.Integer restoreFlgQuinellaPlace;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 55, byteLength = 1)
    private java.lang.String spare3;

    /** 返還フラグ　馬単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 56, byteLength = 1)
    private java.lang.Integer restoreFlgExacta;

    /** 返還フラグ　3連複 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 57, byteLength = 1)
    private java.lang.Integer restoreFlgTrio;

    /** 返還フラグ　3連単 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 58, byteLength = 1)
    private java.lang.Integer restoreFlgTrifecta;

    /** 返還馬番情報(馬番01～28) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 59, byteLength = 1, repeatCount = 28)
    private java.util.List<java.lang.Integer> restoreHorseNoItems;

    /** 返還枠番情報(枠番1～8) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 87, byteLength = 1, repeatCount = 8)
    private java.util.List<java.lang.Integer> restoreBracketItems;

    /** 返還同枠情報(枠番1～8) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 95, byteLength = 1, repeatCount = 8)
    private java.util.List<java.lang.Integer> restoreSameBracketItems;

    /** 単勝払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 103, byteLength = 13, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinDto> refundWinItems;

    /** 複勝払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 142, byteLength = 13, repeatCount = 5)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundShowDto> refundShowItems;

    /** 枠連払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 207, byteLength = 13, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundBracketDto> refundBracketItems;

    /** 馬連払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 246, byteLength = 16, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaDto> refundQuinellaItems;

    /** ワイド払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 294, byteLength = 16, repeatCount = 7)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaPlaceDto> refundQuinellaPlaceItems;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 406, byteLength = 16, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundSpareDto> refundSpareItems;

    /** 馬単払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 454, byteLength = 16, repeatCount = 6)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundExactaDto> refundExactaItems;

    /** 3連複払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 550, byteLength = 18, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrioDto> refundTrioItems;

    /** 3連単払戻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 604, byteLength = 19, repeatCount = 6)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrifectaDto> refundTrifectaItems;


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
        return RefundDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 不成立フラグ　単勝を返します。
     * @return 不成立フラグ　単勝
     */
    public java.lang.Integer getFailureFlgWin() {
        return failureFlgWin;
    }

    /**
     * 不成立フラグ　単勝を設定します。
     * @param failureFlgWin 不成立フラグ　単勝
     */
    public void setFailureFlgWin(java.lang.Integer failureFlgWin) {
        this.failureFlgWin = failureFlgWin;
    }

    /**
     * 不成立フラグ　複勝を返します。
     * @return 不成立フラグ　複勝
     */
    public java.lang.Integer getFailureFlgShow() {
        return failureFlgShow;
    }

    /**
     * 不成立フラグ　複勝を設定します。
     * @param failureFlgShow 不成立フラグ　複勝
     */
    public void setFailureFlgShow(java.lang.Integer failureFlgShow) {
        this.failureFlgShow = failureFlgShow;
    }

    /**
     * 不成立フラグ　枠連を返します。
     * @return 不成立フラグ　枠連
     */
    public java.lang.Integer getFailureFlgBracket() {
        return failureFlgBracket;
    }

    /**
     * 不成立フラグ　枠連を設定します。
     * @param failureFlgBracket 不成立フラグ　枠連
     */
    public void setFailureFlgBracket(java.lang.Integer failureFlgBracket) {
        this.failureFlgBracket = failureFlgBracket;
    }

    /**
     * 不成立フラグ　馬連を返します。
     * @return 不成立フラグ　馬連
     */
    public java.lang.Integer getFailureFlgQuinella() {
        return failureFlgQuinella;
    }

    /**
     * 不成立フラグ　馬連を設定します。
     * @param failureFlgQuinella 不成立フラグ　馬連
     */
    public void setFailureFlgQuinella(java.lang.Integer failureFlgQuinella) {
        this.failureFlgQuinella = failureFlgQuinella;
    }

    /**
     * 不成立フラグ　ワイドを返します。
     * @return 不成立フラグ　ワイド
     */
    public java.lang.Integer getFailureFlgQuinellaPlace() {
        return failureFlgQuinellaPlace;
    }

    /**
     * 不成立フラグ　ワイドを設定します。
     * @param failureFlgQuinellaPlace 不成立フラグ　ワイド
     */
    public void setFailureFlgQuinellaPlace(java.lang.Integer failureFlgQuinellaPlace) {
        this.failureFlgQuinellaPlace = failureFlgQuinellaPlace;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.lang.String getSpare1() {
        return spare1;
    }

    /**
     * 予備を設定します。
     * @param spare1 予備
     */
    public void setSpare1(java.lang.String spare1) {
        this.spare1 = spare1;
    }

    /**
     * 不成立フラグ　馬単を返します。
     * @return 不成立フラグ　馬単
     */
    public java.lang.Integer getFailureFlgExacta() {
        return failureFlgExacta;
    }

    /**
     * 不成立フラグ　馬単を設定します。
     * @param failureFlgExacta 不成立フラグ　馬単
     */
    public void setFailureFlgExacta(java.lang.Integer failureFlgExacta) {
        this.failureFlgExacta = failureFlgExacta;
    }

    /**
     * 不成立フラグ　3連複を返します。
     * @return 不成立フラグ　3連複
     */
    public java.lang.Integer getFailureFlgTrio() {
        return failureFlgTrio;
    }

    /**
     * 不成立フラグ　3連複を設定します。
     * @param failureFlgTrio 不成立フラグ　3連複
     */
    public void setFailureFlgTrio(java.lang.Integer failureFlgTrio) {
        this.failureFlgTrio = failureFlgTrio;
    }

    /**
     * 不成立フラグ　3連単を返します。
     * @return 不成立フラグ　3連単
     */
    public java.lang.Integer getFailureFlgTrifecta() {
        return failureFlgTrifecta;
    }

    /**
     * 不成立フラグ　3連単を設定します。
     * @param failureFlgTrifecta 不成立フラグ　3連単
     */
    public void setFailureFlgTrifecta(java.lang.Integer failureFlgTrifecta) {
        this.failureFlgTrifecta = failureFlgTrifecta;
    }

    /**
     * 特払フラグ　単勝を返します。
     * @return 特払フラグ　単勝
     */
    public java.lang.Integer getSpecialRefundFlgWin() {
        return specialRefundFlgWin;
    }

    /**
     * 特払フラグ　単勝を設定します。
     * @param specialRefundFlgWin 特払フラグ　単勝
     */
    public void setSpecialRefundFlgWin(java.lang.Integer specialRefundFlgWin) {
        this.specialRefundFlgWin = specialRefundFlgWin;
    }

    /**
     * 特払フラグ　複勝を返します。
     * @return 特払フラグ　複勝
     */
    public java.lang.Integer getSpecialRefundFlgShow() {
        return specialRefundFlgShow;
    }

    /**
     * 特払フラグ　複勝を設定します。
     * @param specialRefundFlgShow 特払フラグ　複勝
     */
    public void setSpecialRefundFlgShow(java.lang.Integer specialRefundFlgShow) {
        this.specialRefundFlgShow = specialRefundFlgShow;
    }

    /**
     * 特払フラグ　枠連を返します。
     * @return 特払フラグ　枠連
     */
    public java.lang.Integer getSpecialRefundFlgBracket() {
        return specialRefundFlgBracket;
    }

    /**
     * 特払フラグ　枠連を設定します。
     * @param specialRefundFlgBracket 特払フラグ　枠連
     */
    public void setSpecialRefundFlgBracket(java.lang.Integer specialRefundFlgBracket) {
        this.specialRefundFlgBracket = specialRefundFlgBracket;
    }

    /**
     * 特払フラグ　馬連を返します。
     * @return 特払フラグ　馬連
     */
    public java.lang.Integer getSpecialRefundFlgQuinella() {
        return specialRefundFlgQuinella;
    }

    /**
     * 特払フラグ　馬連を設定します。
     * @param specialRefundFlgQuinella 特払フラグ　馬連
     */
    public void setSpecialRefundFlgQuinella(java.lang.Integer specialRefundFlgQuinella) {
        this.specialRefundFlgQuinella = specialRefundFlgQuinella;
    }

    /**
     * 特払フラグ　ワイドを返します。
     * @return 特払フラグ　ワイド
     */
    public java.lang.Integer getSpecialRefundFlgQuinellaPlace() {
        return specialRefundFlgQuinellaPlace;
    }

    /**
     * 特払フラグ　ワイドを設定します。
     * @param specialRefundFlgQuinellaPlace 特払フラグ　ワイド
     */
    public void setSpecialRefundFlgQuinellaPlace(java.lang.Integer specialRefundFlgQuinellaPlace) {
        this.specialRefundFlgQuinellaPlace = specialRefundFlgQuinellaPlace;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.lang.String getSpare2() {
        return spare2;
    }

    /**
     * 予備を設定します。
     * @param spare2 予備
     */
    public void setSpare2(java.lang.String spare2) {
        this.spare2 = spare2;
    }

    /**
     * 特払フラグ　馬単を返します。
     * @return 特払フラグ　馬単
     */
    public java.lang.Integer getSpecialRefundFlgExacta() {
        return specialRefundFlgExacta;
    }

    /**
     * 特払フラグ　馬単を設定します。
     * @param specialRefundFlgExacta 特払フラグ　馬単
     */
    public void setSpecialRefundFlgExacta(java.lang.Integer specialRefundFlgExacta) {
        this.specialRefundFlgExacta = specialRefundFlgExacta;
    }

    /**
     * 特払フラグ　3連複を返します。
     * @return 特払フラグ　3連複
     */
    public java.lang.Integer getSpecialRefundFlgTrio() {
        return specialRefundFlgTrio;
    }

    /**
     * 特払フラグ　3連複を設定します。
     * @param specialRefundFlgTrio 特払フラグ　3連複
     */
    public void setSpecialRefundFlgTrio(java.lang.Integer specialRefundFlgTrio) {
        this.specialRefundFlgTrio = specialRefundFlgTrio;
    }

    /**
     * 特払フラグ　3連単を返します。
     * @return 特払フラグ　3連単
     */
    public java.lang.Integer getSpecialRefundFlgTrifecta() {
        return specialRefundFlgTrifecta;
    }

    /**
     * 特払フラグ　3連単を設定します。
     * @param specialRefundFlgTrifecta 特払フラグ　3連単
     */
    public void setSpecialRefundFlgTrifecta(java.lang.Integer specialRefundFlgTrifecta) {
        this.specialRefundFlgTrifecta = specialRefundFlgTrifecta;
    }

    /**
     * 返還フラグ　単勝を返します。
     * @return 返還フラグ　単勝
     */
    public java.lang.Integer getRestoreFlgWin() {
        return restoreFlgWin;
    }

    /**
     * 返還フラグ　単勝を設定します。
     * @param restoreFlgWin 返還フラグ　単勝
     */
    public void setRestoreFlgWin(java.lang.Integer restoreFlgWin) {
        this.restoreFlgWin = restoreFlgWin;
    }

    /**
     * 返還フラグ　複勝を返します。
     * @return 返還フラグ　複勝
     */
    public java.lang.Integer getRestoreFlgShow() {
        return restoreFlgShow;
    }

    /**
     * 返還フラグ　複勝を設定します。
     * @param restoreFlgShow 返還フラグ　複勝
     */
    public void setRestoreFlgShow(java.lang.Integer restoreFlgShow) {
        this.restoreFlgShow = restoreFlgShow;
    }

    /**
     * 返還フラグ　枠連を返します。
     * @return 返還フラグ　枠連
     */
    public java.lang.Integer getRestoreFlgBracket() {
        return restoreFlgBracket;
    }

    /**
     * 返還フラグ　枠連を設定します。
     * @param restoreFlgBracket 返還フラグ　枠連
     */
    public void setRestoreFlgBracket(java.lang.Integer restoreFlgBracket) {
        this.restoreFlgBracket = restoreFlgBracket;
    }

    /**
     * 返還フラグ　馬連を返します。
     * @return 返還フラグ　馬連
     */
    public java.lang.Integer getRestoreFlgQuinella() {
        return restoreFlgQuinella;
    }

    /**
     * 返還フラグ　馬連を設定します。
     * @param restoreFlgQuinella 返還フラグ　馬連
     */
    public void setRestoreFlgQuinella(java.lang.Integer restoreFlgQuinella) {
        this.restoreFlgQuinella = restoreFlgQuinella;
    }

    /**
     * 返還フラグ　ワイドを返します。
     * @return 返還フラグ　ワイド
     */
    public java.lang.Integer getRestoreFlgQuinellaPlace() {
        return restoreFlgQuinellaPlace;
    }

    /**
     * 返還フラグ　ワイドを設定します。
     * @param restoreFlgQuinellaPlace 返還フラグ　ワイド
     */
    public void setRestoreFlgQuinellaPlace(java.lang.Integer restoreFlgQuinellaPlace) {
        this.restoreFlgQuinellaPlace = restoreFlgQuinellaPlace;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.lang.String getSpare3() {
        return spare3;
    }

    /**
     * 予備を設定します。
     * @param spare3 予備
     */
    public void setSpare3(java.lang.String spare3) {
        this.spare3 = spare3;
    }

    /**
     * 返還フラグ　馬単を返します。
     * @return 返還フラグ　馬単
     */
    public java.lang.Integer getRestoreFlgExacta() {
        return restoreFlgExacta;
    }

    /**
     * 返還フラグ　馬単を設定します。
     * @param restoreFlgExacta 返還フラグ　馬単
     */
    public void setRestoreFlgExacta(java.lang.Integer restoreFlgExacta) {
        this.restoreFlgExacta = restoreFlgExacta;
    }

    /**
     * 返還フラグ　3連複を返します。
     * @return 返還フラグ　3連複
     */
    public java.lang.Integer getRestoreFlgTrio() {
        return restoreFlgTrio;
    }

    /**
     * 返還フラグ　3連複を設定します。
     * @param restoreFlgTrio 返還フラグ　3連複
     */
    public void setRestoreFlgTrio(java.lang.Integer restoreFlgTrio) {
        this.restoreFlgTrio = restoreFlgTrio;
    }

    /**
     * 返還フラグ　3連単を返します。
     * @return 返還フラグ　3連単
     */
    public java.lang.Integer getRestoreFlgTrifecta() {
        return restoreFlgTrifecta;
    }

    /**
     * 返還フラグ　3連単を設定します。
     * @param restoreFlgTrifecta 返還フラグ　3連単
     */
    public void setRestoreFlgTrifecta(java.lang.Integer restoreFlgTrifecta) {
        this.restoreFlgTrifecta = restoreFlgTrifecta;
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
     * 単勝払戻を返します。
     * @return 単勝払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinDto> getRefundWinItems() {
        return refundWinItems;
    }

    /**
     * 単勝払戻を設定します。
     * @param refundWinItems 単勝払戻
     */
    public void setRefundWinItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinDto> refundWinItems) {
        this.refundWinItems = refundWinItems;
    }

    /**
     * 複勝払戻を返します。
     * @return 複勝払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundShowDto> getRefundShowItems() {
        return refundShowItems;
    }

    /**
     * 複勝払戻を設定します。
     * @param refundShowItems 複勝払戻
     */
    public void setRefundShowItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundShowDto> refundShowItems) {
        this.refundShowItems = refundShowItems;
    }

    /**
     * 枠連払戻を返します。
     * @return 枠連払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundBracketDto> getRefundBracketItems() {
        return refundBracketItems;
    }

    /**
     * 枠連払戻を設定します。
     * @param refundBracketItems 枠連払戻
     */
    public void setRefundBracketItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundBracketDto> refundBracketItems) {
        this.refundBracketItems = refundBracketItems;
    }

    /**
     * 馬連払戻を返します。
     * @return 馬連払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaDto> getRefundQuinellaItems() {
        return refundQuinellaItems;
    }

    /**
     * 馬連払戻を設定します。
     * @param refundQuinellaItems 馬連払戻
     */
    public void setRefundQuinellaItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaDto> refundQuinellaItems) {
        this.refundQuinellaItems = refundQuinellaItems;
    }

    /**
     * ワイド払戻を返します。
     * @return ワイド払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaPlaceDto> getRefundQuinellaPlaceItems() {
        return refundQuinellaPlaceItems;
    }

    /**
     * ワイド払戻を設定します。
     * @param refundQuinellaPlaceItems ワイド払戻
     */
    public void setRefundQuinellaPlaceItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundQuinellaPlaceDto> refundQuinellaPlaceItems) {
        this.refundQuinellaPlaceItems = refundQuinellaPlaceItems;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundSpareDto> getRefundSpareItems() {
        return refundSpareItems;
    }

    /**
     * 予備を設定します。
     * @param refundSpareItems 予備
     */
    public void setRefundSpareItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundSpareDto> refundSpareItems) {
        this.refundSpareItems = refundSpareItems;
    }

    /**
     * 馬単払戻を返します。
     * @return 馬単払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundExactaDto> getRefundExactaItems() {
        return refundExactaItems;
    }

    /**
     * 馬単払戻を設定します。
     * @param refundExactaItems 馬単払戻
     */
    public void setRefundExactaItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundExactaDto> refundExactaItems) {
        this.refundExactaItems = refundExactaItems;
    }

    /**
     * 3連複払戻を返します。
     * @return 3連複払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrioDto> getRefundTrioItems() {
        return refundTrioItems;
    }

    /**
     * 3連複払戻を設定します。
     * @param refundTrioItems 3連複払戻
     */
    public void setRefundTrioItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrioDto> refundTrioItems) {
        this.refundTrioItems = refundTrioItems;
    }

    /**
     * 3連単払戻を返します。
     * @return 3連単払戻
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrifectaDto> getRefundTrifectaItems() {
        return refundTrifectaItems;
    }

    /**
     * 3連単払戻を設定します。
     * @param refundTrifectaItems 3連単払戻
     */
    public void setRefundTrifectaItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundTrifectaDto> refundTrifectaItems) {
        this.refundTrifectaItems = refundTrifectaItems;
    }

}