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
 * レコードフォーマットID {@link BT} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "BT", byteLength = 6887)
public class AncestryInfoDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code BT}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum AncestryInfoDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private AncestryInfoDataDiv(String name, String value) {
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

    /** 系統ID */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 30)
    private java.lang.String ancestryId;

    /** 系統名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 50, byteLength = 36)
    private java.lang.String ancestryName;

    /** 系統説明 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 86, byteLength = 6800)
    private java.lang.String ancestryDescription;


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
        return AncestryInfoDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 系統IDを返します。
     * @return 系統ID
     */
    public java.lang.String getAncestryId() {
        return ancestryId;
    }

    /**
     * 系統IDを設定します。
     * @param ancestryId 系統ID
     */
    public void setAncestryId(java.lang.String ancestryId) {
        this.ancestryId = ancestryId;
    }

    /**
     * 系統名を返します。
     * @return 系統名
     */
    public java.lang.String getAncestryName() {
        return ancestryName;
    }

    /**
     * 系統名を設定します。
     * @param ancestryName 系統名
     */
    public void setAncestryName(java.lang.String ancestryName) {
        this.ancestryName = ancestryName;
    }

    /**
     * 系統説明を返します。
     * @return 系統説明
     */
    public java.lang.String getAncestryDescription() {
        return ancestryDescription;
    }

    /**
     * 系統説明を設定します。
     * @param ancestryDescription 系統説明
     */
    public void setAncestryDescription(java.lang.String ancestryDescription) {
        this.ancestryDescription = ancestryDescription;
    }

}