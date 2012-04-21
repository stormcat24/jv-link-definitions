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
 * レコードフォーマットID {@link CH} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "CH", byteLength = 3862)
public class TrainerMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code CH}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum TrainerMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private TrainerMasterDataDiv(String name, String value) {
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

    /** 調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 5)
    private java.lang.String trainerCd;

    /** 調教師抹消区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 17, byteLength = 1)
    private java.lang.String trainerEraseDiv;

    /** 調教師免許交付年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 18, byteLength = 8)
    private java.util.Date trainerLicenseIssueDate;

    /** 調教師免許抹消年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 26, byteLength = 8)
    private java.util.Date trainerLicenseEraseDate;

    /** 生年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 8)
    private java.util.Date birthDate;

    /** 調教師名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 34)
    private java.lang.String trainerName;

    /** 調教師名半角ｶﾅ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 76, byteLength = 30)
    private java.lang.String trainerNameHalfKana;

    /** 調教師名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 106, byteLength = 8)
    private java.lang.String trainerNameShort;

    /** 調教師名欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 114, byteLength = 80)
    private java.lang.String trainerNameEng;

    /** 性別区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 194, byteLength = 1)
    private java.lang.Integer sexDiv;

    /** 調教師東西所属コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 195, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd trainerEWBelongCd;

    /** 招待地域名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 196, byteLength = 20)
    private java.lang.String invitationAreaName;

    /** 最近重賞勝利情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 216, byteLength = 163, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.GradeWinningRecentlyInfoDto> gradeWinningRecentlyInfoItems;

    /** 本年･前年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 705, byteLength = 1052, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoMiddleDto> totalResultInfoItems;


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
        return TrainerMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 調教師コードを返します。
     * @return 調教師コード
     */
    public java.lang.String getTrainerCd() {
        return trainerCd;
    }

    /**
     * 調教師コードを設定します。
     * @param trainerCd 調教師コード
     */
    public void setTrainerCd(java.lang.String trainerCd) {
        this.trainerCd = trainerCd;
    }

    /**
     * 調教師抹消区分を返します。
     * @return 調教師抹消区分
     */
    public java.lang.String getTrainerEraseDiv() {
        return trainerEraseDiv;
    }

    /**
     * 調教師抹消区分を設定します。
     * @param trainerEraseDiv 調教師抹消区分
     */
    public void setTrainerEraseDiv(java.lang.String trainerEraseDiv) {
        this.trainerEraseDiv = trainerEraseDiv;
    }

    /**
     * 調教師免許交付年月日を返します。
     * @return 調教師免許交付年月日
     */
    public java.util.Date getTrainerLicenseIssueDate() {
        return trainerLicenseIssueDate;
    }

    /**
     * 調教師免許交付年月日を設定します。
     * @param trainerLicenseIssueDate 調教師免許交付年月日
     */
    public void setTrainerLicenseIssueDate(java.util.Date trainerLicenseIssueDate) {
        this.trainerLicenseIssueDate = trainerLicenseIssueDate;
    }

    /**
     * 調教師免許抹消年月日を返します。
     * @return 調教師免許抹消年月日
     */
    public java.util.Date getTrainerLicenseEraseDate() {
        return trainerLicenseEraseDate;
    }

    /**
     * 調教師免許抹消年月日を設定します。
     * @param trainerLicenseEraseDate 調教師免許抹消年月日
     */
    public void setTrainerLicenseEraseDate(java.util.Date trainerLicenseEraseDate) {
        this.trainerLicenseEraseDate = trainerLicenseEraseDate;
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
     * 調教師名を返します。
     * @return 調教師名
     */
    public java.lang.String getTrainerName() {
        return trainerName;
    }

    /**
     * 調教師名を設定します。
     * @param trainerName 調教師名
     */
    public void setTrainerName(java.lang.String trainerName) {
        this.trainerName = trainerName;
    }

    /**
     * 調教師名半角ｶﾅを返します。
     * @return 調教師名半角ｶﾅ
     */
    public java.lang.String getTrainerNameHalfKana() {
        return trainerNameHalfKana;
    }

    /**
     * 調教師名半角ｶﾅを設定します。
     * @param trainerNameHalfKana 調教師名半角ｶﾅ
     */
    public void setTrainerNameHalfKana(java.lang.String trainerNameHalfKana) {
        this.trainerNameHalfKana = trainerNameHalfKana;
    }

    /**
     * 調教師名略称を返します。
     * @return 調教師名略称
     */
    public java.lang.String getTrainerNameShort() {
        return trainerNameShort;
    }

    /**
     * 調教師名略称を設定します。
     * @param trainerNameShort 調教師名略称
     */
    public void setTrainerNameShort(java.lang.String trainerNameShort) {
        this.trainerNameShort = trainerNameShort;
    }

    /**
     * 調教師名欧字を返します。
     * @return 調教師名欧字
     */
    public java.lang.String getTrainerNameEng() {
        return trainerNameEng;
    }

    /**
     * 調教師名欧字を設定します。
     * @param trainerNameEng 調教師名欧字
     */
    public void setTrainerNameEng(java.lang.String trainerNameEng) {
        this.trainerNameEng = trainerNameEng;
    }

    /**
     * 性別区分を返します。
     * @return 性別区分
     */
    public java.lang.Integer getSexDiv() {
        return sexDiv;
    }

    /**
     * 性別区分を設定します。
     * @param sexDiv 性別区分
     */
    public void setSexDiv(java.lang.Integer sexDiv) {
        this.sexDiv = sexDiv;
    }

    /**
     * 調教師東西所属コードを返します。
     * @return 調教師東西所属コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd getTrainerEWBelongCd() {
        return trainerEWBelongCd;
    }

    /**
     * 調教師東西所属コードを設定します。
     * @param trainerEWBelongCd 調教師東西所属コード
     */
    public void setTrainerEWBelongCd(org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd trainerEWBelongCd) {
        this.trainerEWBelongCd = trainerEWBelongCd;
    }

    /**
     * 招待地域名を返します。
     * @return 招待地域名
     */
    public java.lang.String getInvitationAreaName() {
        return invitationAreaName;
    }

    /**
     * 招待地域名を設定します。
     * @param invitationAreaName 招待地域名
     */
    public void setInvitationAreaName(java.lang.String invitationAreaName) {
        this.invitationAreaName = invitationAreaName;
    }

    /**
     * 最近重賞勝利情報を返します。
     * @return 最近重賞勝利情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.GradeWinningRecentlyInfoDto> getGradeWinningRecentlyInfoItems() {
        return gradeWinningRecentlyInfoItems;
    }

    /**
     * 最近重賞勝利情報を設定します。
     * @param gradeWinningRecentlyInfoItems 最近重賞勝利情報
     */
    public void setGradeWinningRecentlyInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.GradeWinningRecentlyInfoDto> gradeWinningRecentlyInfoItems) {
        this.gradeWinningRecentlyInfoItems = gradeWinningRecentlyInfoItems;
    }

    /**
     * 本年･前年･累計成績情報を返します。
     * @return 本年･前年･累計成績情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoMiddleDto> getTotalResultInfoItems() {
        return totalResultInfoItems;
    }

    /**
     * 本年･前年･累計成績情報を設定します。
     * @param totalResultInfoItems 本年･前年･累計成績情報
     */
    public void setTotalResultInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoMiddleDto> totalResultInfoItems) {
        this.totalResultInfoItems = totalResultInfoItems;
    }

}