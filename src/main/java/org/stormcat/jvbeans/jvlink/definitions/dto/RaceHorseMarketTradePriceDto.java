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
 * レコードフォーマットID {@link HS} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "HS", byteLength = 196)
public class RaceHorseMarketTradePriceDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code HS}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RaceHorseMarketTradePriceDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private RaceHorseMarketTradePriceDataDiv(String name, String value) {
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

    /** 血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 父馬 繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 22, byteLength = 8)
    private java.lang.String breedingRegistNoFather;

    /** 母馬 繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 30, byteLength = 8)
    private java.lang.String breedingRegistNoMother;

    /** 生年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 4)
    private java.lang.Integer birthYear;

    /** 主催者・市場コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 6)
    private java.lang.String organizerMarketCd;

    /** 主催者名称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 48, byteLength = 40)
    private java.lang.String organizerName;

    /** 市場の名称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 88, byteLength = 80)
    private java.lang.String marketName;

    /** 市場の開催期間(開始日) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 168, byteLength = 8)
    private java.util.Date marketStartDate;

    /** 市場の開催期間(終了日) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 176, byteLength = 8)
    private java.util.Date marketCloseDate;

    /** 取引時の競走馬の年齢 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 184, byteLength = 1)
    private java.lang.Integer tradedHorseYear;

    /** 取引価格 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 185, byteLength = 10)
    private java.lang.Integer tradePrice;


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
        return RaceHorseMarketTradePriceDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 血統登録番号を返します。
     * @return 血統登録番号
     */
    public java.lang.String getBloodRegistNo() {
        return bloodRegistNo;
    }

    /**
     * 血統登録番号を設定します。
     * @param bloodRegistNo 血統登録番号
     */
    public void setBloodRegistNo(java.lang.String bloodRegistNo) {
        this.bloodRegistNo = bloodRegistNo;
    }

    /**
     * 父馬 繁殖登録番号を返します。
     * @return 父馬 繁殖登録番号
     */
    public java.lang.String getBreedingRegistNoFather() {
        return breedingRegistNoFather;
    }

    /**
     * 父馬 繁殖登録番号を設定します。
     * @param breedingRegistNoFather 父馬 繁殖登録番号
     */
    public void setBreedingRegistNoFather(java.lang.String breedingRegistNoFather) {
        this.breedingRegistNoFather = breedingRegistNoFather;
    }

    /**
     * 母馬 繁殖登録番号を返します。
     * @return 母馬 繁殖登録番号
     */
    public java.lang.String getBreedingRegistNoMother() {
        return breedingRegistNoMother;
    }

    /**
     * 母馬 繁殖登録番号を設定します。
     * @param breedingRegistNoMother 母馬 繁殖登録番号
     */
    public void setBreedingRegistNoMother(java.lang.String breedingRegistNoMother) {
        this.breedingRegistNoMother = breedingRegistNoMother;
    }

    /**
     * 生年を返します。
     * @return 生年
     */
    public java.lang.Integer getBirthYear() {
        return birthYear;
    }

    /**
     * 生年を設定します。
     * @param birthYear 生年
     */
    public void setBirthYear(java.lang.Integer birthYear) {
        this.birthYear = birthYear;
    }

    /**
     * 主催者・市場コードを返します。
     * @return 主催者・市場コード
     */
    public java.lang.String getOrganizerMarketCd() {
        return organizerMarketCd;
    }

    /**
     * 主催者・市場コードを設定します。
     * @param organizerMarketCd 主催者・市場コード
     */
    public void setOrganizerMarketCd(java.lang.String organizerMarketCd) {
        this.organizerMarketCd = organizerMarketCd;
    }

    /**
     * 主催者名称を返します。
     * @return 主催者名称
     */
    public java.lang.String getOrganizerName() {
        return organizerName;
    }

    /**
     * 主催者名称を設定します。
     * @param organizerName 主催者名称
     */
    public void setOrganizerName(java.lang.String organizerName) {
        this.organizerName = organizerName;
    }

    /**
     * 市場の名称を返します。
     * @return 市場の名称
     */
    public java.lang.String getMarketName() {
        return marketName;
    }

    /**
     * 市場の名称を設定します。
     * @param marketName 市場の名称
     */
    public void setMarketName(java.lang.String marketName) {
        this.marketName = marketName;
    }

    /**
     * 市場の開催期間(開始日)を返します。
     * @return 市場の開催期間(開始日)
     */
    public java.util.Date getMarketStartDate() {
        return marketStartDate;
    }

    /**
     * 市場の開催期間(開始日)を設定します。
     * @param marketStartDate 市場の開催期間(開始日)
     */
    public void setMarketStartDate(java.util.Date marketStartDate) {
        this.marketStartDate = marketStartDate;
    }

    /**
     * 市場の開催期間(終了日)を返します。
     * @return 市場の開催期間(終了日)
     */
    public java.util.Date getMarketCloseDate() {
        return marketCloseDate;
    }

    /**
     * 市場の開催期間(終了日)を設定します。
     * @param marketCloseDate 市場の開催期間(終了日)
     */
    public void setMarketCloseDate(java.util.Date marketCloseDate) {
        this.marketCloseDate = marketCloseDate;
    }

    /**
     * 取引時の競走馬の年齢を返します。
     * @return 取引時の競走馬の年齢
     */
    public java.lang.Integer getTradedHorseYear() {
        return tradedHorseYear;
    }

    /**
     * 取引時の競走馬の年齢を設定します。
     * @param tradedHorseYear 取引時の競走馬の年齢
     */
    public void setTradedHorseYear(java.lang.Integer tradedHorseYear) {
        this.tradedHorseYear = tradedHorseYear;
    }

    /**
     * 取引価格を返します。
     * @return 取引価格
     */
    public java.lang.Integer getTradePrice() {
        return tradePrice;
    }

    /**
     * 取引価格を設定します。
     * @param tradePrice 取引価格
     */
    public void setTradePrice(java.lang.Integer tradePrice) {
        this.tradePrice = tradePrice;
    }

}