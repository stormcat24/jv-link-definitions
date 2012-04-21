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
 * レコードフォーマットID {@link BN} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "BN", byteLength = 477)
public class OwnerMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code BN}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum OwnerMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private OwnerMasterDataDiv(String name, String value) {
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

    /** 馬主コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 6)
    private java.lang.String ownerCd;

    /** 馬主名(法人格有) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 18, byteLength = 64)
    private java.lang.String ownerNameWithCorp;

    /** 馬主名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 82, byteLength = 64)
    private java.lang.String ownerNameWithoutCorp;

    /** 馬主名半角ｶﾅ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 146, byteLength = 50)
    private java.lang.String ownerNameHalfKana;

    /** 馬主名欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 196, byteLength = 100)
    private java.lang.String ownerNameEng;

    /** 服色標示 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 296, byteLength = 60)
    private java.lang.String clothingMark;

    /** 本年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 356, byteLength = 60, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> totalResultInfoItems;


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
        return OwnerMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 馬主コードを返します。
     * @return 馬主コード
     */
    public java.lang.String getOwnerCd() {
        return ownerCd;
    }

    /**
     * 馬主コードを設定します。
     * @param ownerCd 馬主コード
     */
    public void setOwnerCd(java.lang.String ownerCd) {
        this.ownerCd = ownerCd;
    }

    /**
     * 馬主名(法人格有)を返します。
     * @return 馬主名(法人格有)
     */
    public java.lang.String getOwnerNameWithCorp() {
        return ownerNameWithCorp;
    }

    /**
     * 馬主名(法人格有)を設定します。
     * @param ownerNameWithCorp 馬主名(法人格有)
     */
    public void setOwnerNameWithCorp(java.lang.String ownerNameWithCorp) {
        this.ownerNameWithCorp = ownerNameWithCorp;
    }

    /**
     * 馬主名(法人格無)を返します。
     * @return 馬主名(法人格無)
     */
    public java.lang.String getOwnerNameWithoutCorp() {
        return ownerNameWithoutCorp;
    }

    /**
     * 馬主名(法人格無)を設定します。
     * @param ownerNameWithoutCorp 馬主名(法人格無)
     */
    public void setOwnerNameWithoutCorp(java.lang.String ownerNameWithoutCorp) {
        this.ownerNameWithoutCorp = ownerNameWithoutCorp;
    }

    /**
     * 馬主名半角ｶﾅを返します。
     * @return 馬主名半角ｶﾅ
     */
    public java.lang.String getOwnerNameHalfKana() {
        return ownerNameHalfKana;
    }

    /**
     * 馬主名半角ｶﾅを設定します。
     * @param ownerNameHalfKana 馬主名半角ｶﾅ
     */
    public void setOwnerNameHalfKana(java.lang.String ownerNameHalfKana) {
        this.ownerNameHalfKana = ownerNameHalfKana;
    }

    /**
     * 馬主名欧字を返します。
     * @return 馬主名欧字
     */
    public java.lang.String getOwnerNameEng() {
        return ownerNameEng;
    }

    /**
     * 馬主名欧字を設定します。
     * @param ownerNameEng 馬主名欧字
     */
    public void setOwnerNameEng(java.lang.String ownerNameEng) {
        this.ownerNameEng = ownerNameEng;
    }

    /**
     * 服色標示を返します。
     * @return 服色標示
     */
    public java.lang.String getClothingMark() {
        return clothingMark;
    }

    /**
     * 服色標示を設定します。
     * @param clothingMark 服色標示
     */
    public void setClothingMark(java.lang.String clothingMark) {
        this.clothingMark = clothingMark;
    }

    /**
     * 本年･累計成績情報を返します。
     * @return 本年･累計成績情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> getTotalResultInfoItems() {
        return totalResultInfoItems;
    }

    /**
     * 本年･累計成績情報を設定します。
     * @param totalResultInfoItems 本年･累計成績情報
     */
    public void setTotalResultInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> totalResultInfoItems) {
        this.totalResultInfoItems = totalResultInfoItems;
    }

}