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
 * レコードフォーマットID {@link WF} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "WF", byteLength = 7215)
public class WinFiveDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code WF}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum WinFiveDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("重勝式詳細発表時", "1"),

        _2("重勝式対象1レース目確定時", "2"),

        _3("重勝式払戻発表時", "3"),

        _7("成績(月曜)", "7"),

        _9("重勝式中止時", "9"),

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
        private WinFiveDataDiv(String name, String value) {
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

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 2)
    private java.lang.String spare1;

    /** 重勝式対象レース情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 22, byteLength = 8, repeatCount = 5)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.SimpleRaceDto> winFiveRaceItems;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 62, byteLength = 6)
    private java.lang.String spare2;

    /** 重勝式発売票数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 68, byteLength = 11)
    private java.lang.String voteCountWinFiveItems;

    /** 有効票数情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 79, byteLength = 11, repeatCount = 5)
    private java.util.List<java.lang.Long> validVoteCountItems;

    /** 返還フラグ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 134, byteLength = 1)
    private java.lang.Integer restoreFlg;

    /** 不成立フラグ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 135, byteLength = 1)
    private java.lang.Integer failureFlg;

    /** 的中無フラグ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 136, byteLength = 1)
    private java.lang.Integer notComeTrueFlg;

    /** キャリーオーバー金額初期 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 137, byteLength = 15)
    private java.lang.Long carryOverMoneyFirst;

    /** キャリーオーバー金額残高 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 152, byteLength = 15)
    private java.lang.Long carryOverMoneyTotal;

    /** 重勝式払戻情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 167, byteLength = 29, repeatCount = 243)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinFiveDto> refundWinFiveItems;


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
        return WinFiveDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 重勝式対象レース情報を返します。
     * @return 重勝式対象レース情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.SimpleRaceDto> getWinFiveRaceItems() {
        return winFiveRaceItems;
    }

    /**
     * 重勝式対象レース情報を設定します。
     * @param winFiveRaceItems 重勝式対象レース情報
     */
    public void setWinFiveRaceItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.SimpleRaceDto> winFiveRaceItems) {
        this.winFiveRaceItems = winFiveRaceItems;
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
     * 重勝式発売票数を返します。
     * @return 重勝式発売票数
     */
    public java.lang.String getVoteCountWinFiveItems() {
        return voteCountWinFiveItems;
    }

    /**
     * 重勝式発売票数を設定します。
     * @param voteCountWinFiveItems 重勝式発売票数
     */
    public void setVoteCountWinFiveItems(java.lang.String voteCountWinFiveItems) {
        this.voteCountWinFiveItems = voteCountWinFiveItems;
    }

    /**
     * 有効票数情報を返します。
     * @return 有効票数情報
     */
    public java.util.List<java.lang.Long> getValidVoteCountItems() {
        return validVoteCountItems;
    }

    /**
     * 有効票数情報を設定します。
     * @param validVoteCountItems 有効票数情報
     */
    public void setValidVoteCountItems(java.util.List<java.lang.Long> validVoteCountItems) {
        this.validVoteCountItems = validVoteCountItems;
    }

    /**
     * 返還フラグを返します。
     * @return 返還フラグ
     */
    public java.lang.Integer getRestoreFlg() {
        return restoreFlg;
    }

    /**
     * 返還フラグを設定します。
     * @param restoreFlg 返還フラグ
     */
    public void setRestoreFlg(java.lang.Integer restoreFlg) {
        this.restoreFlg = restoreFlg;
    }

    /**
     * 不成立フラグを返します。
     * @return 不成立フラグ
     */
    public java.lang.Integer getFailureFlg() {
        return failureFlg;
    }

    /**
     * 不成立フラグを設定します。
     * @param failureFlg 不成立フラグ
     */
    public void setFailureFlg(java.lang.Integer failureFlg) {
        this.failureFlg = failureFlg;
    }

    /**
     * 的中無フラグを返します。
     * @return 的中無フラグ
     */
    public java.lang.Integer getNotComeTrueFlg() {
        return notComeTrueFlg;
    }

    /**
     * 的中無フラグを設定します。
     * @param notComeTrueFlg 的中無フラグ
     */
    public void setNotComeTrueFlg(java.lang.Integer notComeTrueFlg) {
        this.notComeTrueFlg = notComeTrueFlg;
    }

    /**
     * キャリーオーバー金額初期を返します。
     * @return キャリーオーバー金額初期
     */
    public java.lang.Long getCarryOverMoneyFirst() {
        return carryOverMoneyFirst;
    }

    /**
     * キャリーオーバー金額初期を設定します。
     * @param carryOverMoneyFirst キャリーオーバー金額初期
     */
    public void setCarryOverMoneyFirst(java.lang.Long carryOverMoneyFirst) {
        this.carryOverMoneyFirst = carryOverMoneyFirst;
    }

    /**
     * キャリーオーバー金額残高を返します。
     * @return キャリーオーバー金額残高
     */
    public java.lang.Long getCarryOverMoneyTotal() {
        return carryOverMoneyTotal;
    }

    /**
     * キャリーオーバー金額残高を設定します。
     * @param carryOverMoneyTotal キャリーオーバー金額残高
     */
    public void setCarryOverMoneyTotal(java.lang.Long carryOverMoneyTotal) {
        this.carryOverMoneyTotal = carryOverMoneyTotal;
    }

    /**
     * 重勝式払戻情報を返します。
     * @return 重勝式払戻情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinFiveDto> getRefundWinFiveItems() {
        return refundWinFiveItems;
    }

    /**
     * 重勝式払戻情報を設定します。
     * @param refundWinFiveItems 重勝式払戻情報
     */
    public void setRefundWinFiveItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.RefundWinFiveDto> refundWinFiveItems) {
        this.refundWinFiveItems = refundWinFiveItems;
    }

}