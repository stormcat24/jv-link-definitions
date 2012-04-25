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
 * レコードフォーマットID {@link SK} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "SK", byteLength = 178)
public class SonMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code SK}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum SonMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("新規登録", "1"),

        _2("更新", "2"),

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
        private SonMasterDataDiv(String name, String value) {
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

    /** 生年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 22, byteLength = 8)
    private java.util.Date birthDate;

    /** 性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 30, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 品種コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 31, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.BreedCd breedCd;

    /** 毛色コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 32, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd hairColorCd;

    /** 産駒持込区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 1)
    private java.lang.Integer sonBringingDiv;

    /** 輸入年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 4)
    private java.lang.Integer importYear;

    /** 生産者コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 6)
    private java.lang.String breederCd;

    /** 産地名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 45, byteLength = 20)
    private java.lang.String sourceName;

    /** 3代血統 繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 65, byteLength = 8, repeatCount = 14)
    private java.util.List<java.lang.String> breedingRegistNoItems;


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
        return SonMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 生年月日を返します。
     * @return 生年月日
     */
    public java.util.Date getBirthDate() {
        return birthDate;
    }

    /**
     * 生年月日を設定します。
     * @param birthDate 生年月日
     */
    public void setBirthDate(java.util.Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 性別コードを返します。
     * @return 性別コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.SexCd getSexCd() {
        return sexCd;
    }

    /**
     * 性別コードを設定します。
     * @param sexCd 性別コード
     */
    public void setSexCd(org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd) {
        this.sexCd = sexCd;
    }

    /**
     * 品種コードを返します。
     * @return 品種コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.BreedCd getBreedCd() {
        return breedCd;
    }

    /**
     * 品種コードを設定します。
     * @param breedCd 品種コード
     */
    public void setBreedCd(org.stormcat.jvbeans.jvlink.definitions.code.BreedCd breedCd) {
        this.breedCd = breedCd;
    }

    /**
     * 毛色コードを返します。
     * @return 毛色コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd getHairColorCd() {
        return hairColorCd;
    }

    /**
     * 毛色コードを設定します。
     * @param hairColorCd 毛色コード
     */
    public void setHairColorCd(org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd hairColorCd) {
        this.hairColorCd = hairColorCd;
    }

    /**
     * 産駒持込区分を返します。
     * @return 産駒持込区分
     */
    public java.lang.Integer getSonBringingDiv() {
        return sonBringingDiv;
    }

    /**
     * 産駒持込区分を設定します。
     * @param sonBringingDiv 産駒持込区分
     */
    public void setSonBringingDiv(java.lang.Integer sonBringingDiv) {
        this.sonBringingDiv = sonBringingDiv;
    }

    /**
     * 輸入年を返します。
     * @return 輸入年
     */
    public java.lang.Integer getImportYear() {
        return importYear;
    }

    /**
     * 輸入年を設定します。
     * @param importYear 輸入年
     */
    public void setImportYear(java.lang.Integer importYear) {
        this.importYear = importYear;
    }

    /**
     * 生産者コードを返します。
     * @return 生産者コード
     */
    public java.lang.String getBreederCd() {
        return breederCd;
    }

    /**
     * 生産者コードを設定します。
     * @param breederCd 生産者コード
     */
    public void setBreederCd(java.lang.String breederCd) {
        this.breederCd = breederCd;
    }

    /**
     * 産地名を返します。
     * @return 産地名
     */
    public java.lang.String getSourceName() {
        return sourceName;
    }

    /**
     * 産地名を設定します。
     * @param sourceName 産地名
     */
    public void setSourceName(java.lang.String sourceName) {
        this.sourceName = sourceName;
    }

    /**
     * 3代血統 繁殖登録番号を返します。
     * @return 3代血統 繁殖登録番号
     */
    public java.util.List<java.lang.String> getBreedingRegistNoItems() {
        return breedingRegistNoItems;
    }

    /**
     * 3代血統 繁殖登録番号を設定します。
     * @param breedingRegistNoItems 3代血統 繁殖登録番号
     */
    public void setBreedingRegistNoItems(java.util.List<java.lang.String> breedingRegistNoItems) {
        this.breedingRegistNoItems = breedingRegistNoItems;
    }

}