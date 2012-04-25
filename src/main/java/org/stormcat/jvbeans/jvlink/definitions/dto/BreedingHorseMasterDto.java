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
 * レコードフォーマットID {@link HN} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "HN", byteLength = 245)
public class BreedingHorseMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code HN}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum BreedingHorseMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private BreedingHorseMasterDataDiv(String name, String value) {
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

    /** 繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 8)
    private java.lang.String breedingRegistNo;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 8)
    private java.lang.String spare1;

    /** 血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 1)
    private java.lang.String spare2;

    /** 馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 36)
    private java.lang.String horseName;

    /** 馬名半角ｶﾅ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 75, byteLength = 40)
    private java.lang.String horseNameHalfKana;

    /** 馬名欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 115, byteLength = 80)
    private java.lang.String horseNameEng;

    /** 生年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 195, byteLength = 4)
    private java.lang.Integer birthYear;

    /** 性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 199, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 品種コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 200, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.BreedCd breedCd;

    /** 毛色コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 201, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd hairColorCd;

    /** 繁殖馬持込区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 203, byteLength = 1)
    private java.lang.Integer breedingHorseBringingDiv;

    /** 輸入年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 204, byteLength = 4)
    private java.lang.Integer importYear;

    /** 産地名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 208, byteLength = 20)
    private java.lang.String sourceName;

    /** 父馬繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 228, byteLength = 8)
    private java.lang.String breedingRegistNoFather;

    /** 母馬繁殖登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 236, byteLength = 8)
    private java.lang.String breedingRegistNoMother;


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
        return BreedingHorseMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 繁殖登録番号を返します。
     * @return 繁殖登録番号
     */
    public java.lang.String getBreedingRegistNo() {
        return breedingRegistNo;
    }

    /**
     * 繁殖登録番号を設定します。
     * @param breedingRegistNo 繁殖登録番号
     */
    public void setBreedingRegistNo(java.lang.String breedingRegistNo) {
        this.breedingRegistNo = breedingRegistNo;
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
     * 馬名半角ｶﾅを返します。
     * @return 馬名半角ｶﾅ
     */
    public java.lang.String getHorseNameHalfKana() {
        return horseNameHalfKana;
    }

    /**
     * 馬名半角ｶﾅを設定します。
     * @param horseNameHalfKana 馬名半角ｶﾅ
     */
    public void setHorseNameHalfKana(java.lang.String horseNameHalfKana) {
        this.horseNameHalfKana = horseNameHalfKana;
    }

    /**
     * 馬名欧字を返します。
     * @return 馬名欧字
     */
    public java.lang.String getHorseNameEng() {
        return horseNameEng;
    }

    /**
     * 馬名欧字を設定します。
     * @param horseNameEng 馬名欧字
     */
    public void setHorseNameEng(java.lang.String horseNameEng) {
        this.horseNameEng = horseNameEng;
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
     * 繁殖馬持込区分を返します。
     * @return 繁殖馬持込区分
     */
    public java.lang.Integer getBreedingHorseBringingDiv() {
        return breedingHorseBringingDiv;
    }

    /**
     * 繁殖馬持込区分を設定します。
     * @param breedingHorseBringingDiv 繁殖馬持込区分
     */
    public void setBreedingHorseBringingDiv(java.lang.Integer breedingHorseBringingDiv) {
        this.breedingHorseBringingDiv = breedingHorseBringingDiv;
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
     * 父馬繁殖登録番号を返します。
     * @return 父馬繁殖登録番号
     */
    public java.lang.String getBreedingRegistNoFather() {
        return breedingRegistNoFather;
    }

    /**
     * 父馬繁殖登録番号を設定します。
     * @param breedingRegistNoFather 父馬繁殖登録番号
     */
    public void setBreedingRegistNoFather(java.lang.String breedingRegistNoFather) {
        this.breedingRegistNoFather = breedingRegistNoFather;
    }

    /**
     * 母馬繁殖登録番号を返します。
     * @return 母馬繁殖登録番号
     */
    public java.lang.String getBreedingRegistNoMother() {
        return breedingRegistNoMother;
    }

    /**
     * 母馬繁殖登録番号を設定します。
     * @param breedingRegistNoMother 母馬繁殖登録番号
     */
    public void setBreedingRegistNoMother(java.lang.String breedingRegistNoMother) {
        this.breedingRegistNoMother = breedingRegistNoMother;
    }

}