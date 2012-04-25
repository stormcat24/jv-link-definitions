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
 * レコードフォーマットID {@link KS} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "KS", byteLength = 4173)
public class JockeyMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code KS}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum JockeyMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private JockeyMasterDataDiv(String name, String value) {
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

    /** 騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 5)
    private java.lang.String jockeyCd;

    /** 騎手抹消区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 17, byteLength = 1)
    private java.lang.Integer jockeyEraseDiv;

    /** 騎手免許交付年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 18, byteLength = 8)
    private java.util.Date jockeyLicenseIssueDate;

    /** 騎手免許抹消年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 26, byteLength = 8)
    private java.util.Date jockeyLicenseEraseDate;

    /** 生年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 34, byteLength = 8)
    private java.util.Date birthDate;

    /** 騎手名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 34)
    private java.lang.String jockeyName;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 76, byteLength = 34)
    private java.lang.String spare1;

    /** 騎手名半角ｶﾅ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 110, byteLength = 30)
    private java.lang.String jockeyNameHalfKana;

    /** 騎手名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 140, byteLength = 8)
    private java.lang.String jockeyNameShort;

    /** 騎手名欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 148, byteLength = 80)
    private java.lang.String jockeyNameEng;

    /** 性別区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 228, byteLength = 1)
    private java.lang.Integer sexDiv;

    /** 騎乗資格コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 229, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.RidingQualificationCd ridingQualificationCd;

    /** 騎手見習コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 230, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCd;

    /** 騎手東西所属コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 231, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd jockeyEWBelongCd;

    /** 招待地域名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 232, byteLength = 20)
    private java.lang.String invitationAreaName;

    /** 所属調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 252, byteLength = 5)
    private java.lang.String belongingTrainerCd;

    /** 所属調教師名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 257, byteLength = 8)
    private java.lang.String belongingTrainerNameShort;

    /** 初騎乗情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 265, byteLength = 67, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstRidingInfoDto> firstRingingInfoItems;

    /** 初勝利情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 399, byteLength = 64, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstWinningInfoDto> firstWinningInfoItems;

    /** 最近重賞勝利情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 527, byteLength = 163, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.GradeWinningRecentlyInfoDto> gradeWinningRecentlyInfoItems;

    /** 本年･前年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1016, byteLength = 1052, repeatCount = 3)
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
        return JockeyMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 騎手コードを返します。
     * @return 騎手コード
     */
    public java.lang.String getJockeyCd() {
        return jockeyCd;
    }

    /**
     * 騎手コードを設定します。
     * @param jockeyCd 騎手コード
     */
    public void setJockeyCd(java.lang.String jockeyCd) {
        this.jockeyCd = jockeyCd;
    }

    /**
     * 騎手抹消区分を返します。
     * @return 騎手抹消区分
     */
    public java.lang.Integer getJockeyEraseDiv() {
        return jockeyEraseDiv;
    }

    /**
     * 騎手抹消区分を設定します。
     * @param jockeyEraseDiv 騎手抹消区分
     */
    public void setJockeyEraseDiv(java.lang.Integer jockeyEraseDiv) {
        this.jockeyEraseDiv = jockeyEraseDiv;
    }

    /**
     * 騎手免許交付年月日を返します。
     * @return 騎手免許交付年月日
     */
    public java.util.Date getJockeyLicenseIssueDate() {
        return jockeyLicenseIssueDate;
    }

    /**
     * 騎手免許交付年月日を設定します。
     * @param jockeyLicenseIssueDate 騎手免許交付年月日
     */
    public void setJockeyLicenseIssueDate(java.util.Date jockeyLicenseIssueDate) {
        this.jockeyLicenseIssueDate = jockeyLicenseIssueDate;
    }

    /**
     * 騎手免許抹消年月日を返します。
     * @return 騎手免許抹消年月日
     */
    public java.util.Date getJockeyLicenseEraseDate() {
        return jockeyLicenseEraseDate;
    }

    /**
     * 騎手免許抹消年月日を設定します。
     * @param jockeyLicenseEraseDate 騎手免許抹消年月日
     */
    public void setJockeyLicenseEraseDate(java.util.Date jockeyLicenseEraseDate) {
        this.jockeyLicenseEraseDate = jockeyLicenseEraseDate;
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
     * 騎手名を返します。
     * @return 騎手名
     */
    public java.lang.String getJockeyName() {
        return jockeyName;
    }

    /**
     * 騎手名を設定します。
     * @param jockeyName 騎手名
     */
    public void setJockeyName(java.lang.String jockeyName) {
        this.jockeyName = jockeyName;
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
     * 騎手名半角ｶﾅを返します。
     * @return 騎手名半角ｶﾅ
     */
    public java.lang.String getJockeyNameHalfKana() {
        return jockeyNameHalfKana;
    }

    /**
     * 騎手名半角ｶﾅを設定します。
     * @param jockeyNameHalfKana 騎手名半角ｶﾅ
     */
    public void setJockeyNameHalfKana(java.lang.String jockeyNameHalfKana) {
        this.jockeyNameHalfKana = jockeyNameHalfKana;
    }

    /**
     * 騎手名略称を返します。
     * @return 騎手名略称
     */
    public java.lang.String getJockeyNameShort() {
        return jockeyNameShort;
    }

    /**
     * 騎手名略称を設定します。
     * @param jockeyNameShort 騎手名略称
     */
    public void setJockeyNameShort(java.lang.String jockeyNameShort) {
        this.jockeyNameShort = jockeyNameShort;
    }

    /**
     * 騎手名欧字を返します。
     * @return 騎手名欧字
     */
    public java.lang.String getJockeyNameEng() {
        return jockeyNameEng;
    }

    /**
     * 騎手名欧字を設定します。
     * @param jockeyNameEng 騎手名欧字
     */
    public void setJockeyNameEng(java.lang.String jockeyNameEng) {
        this.jockeyNameEng = jockeyNameEng;
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
     * 騎乗資格コードを返します。
     * @return 騎乗資格コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.RidingQualificationCd getRidingQualificationCd() {
        return ridingQualificationCd;
    }

    /**
     * 騎乗資格コードを設定します。
     * @param ridingQualificationCd 騎乗資格コード
     */
    public void setRidingQualificationCd(org.stormcat.jvbeans.jvlink.definitions.code.RidingQualificationCd ridingQualificationCd) {
        this.ridingQualificationCd = ridingQualificationCd;
    }

    /**
     * 騎手見習コードを返します。
     * @return 騎手見習コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd getJockeyMateCd() {
        return jockeyMateCd;
    }

    /**
     * 騎手見習コードを設定します。
     * @param jockeyMateCd 騎手見習コード
     */
    public void setJockeyMateCd(org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCd) {
        this.jockeyMateCd = jockeyMateCd;
    }

    /**
     * 騎手東西所属コードを返します。
     * @return 騎手東西所属コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd getJockeyEWBelongCd() {
        return jockeyEWBelongCd;
    }

    /**
     * 騎手東西所属コードを設定します。
     * @param jockeyEWBelongCd 騎手東西所属コード
     */
    public void setJockeyEWBelongCd(org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd jockeyEWBelongCd) {
        this.jockeyEWBelongCd = jockeyEWBelongCd;
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
     * 所属調教師コードを返します。
     * @return 所属調教師コード
     */
    public java.lang.String getBelongingTrainerCd() {
        return belongingTrainerCd;
    }

    /**
     * 所属調教師コードを設定します。
     * @param belongingTrainerCd 所属調教師コード
     */
    public void setBelongingTrainerCd(java.lang.String belongingTrainerCd) {
        this.belongingTrainerCd = belongingTrainerCd;
    }

    /**
     * 所属調教師名略称を返します。
     * @return 所属調教師名略称
     */
    public java.lang.String getBelongingTrainerNameShort() {
        return belongingTrainerNameShort;
    }

    /**
     * 所属調教師名略称を設定します。
     * @param belongingTrainerNameShort 所属調教師名略称
     */
    public void setBelongingTrainerNameShort(java.lang.String belongingTrainerNameShort) {
        this.belongingTrainerNameShort = belongingTrainerNameShort;
    }

    /**
     * 初騎乗情報を返します。
     * @return 初騎乗情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstRidingInfoDto> getFirstRingingInfoItems() {
        return firstRingingInfoItems;
    }

    /**
     * 初騎乗情報を設定します。
     * @param firstRingingInfoItems 初騎乗情報
     */
    public void setFirstRingingInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstRidingInfoDto> firstRingingInfoItems) {
        this.firstRingingInfoItems = firstRingingInfoItems;
    }

    /**
     * 初勝利情報を返します。
     * @return 初勝利情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstWinningInfoDto> getFirstWinningInfoItems() {
        return firstWinningInfoItems;
    }

    /**
     * 初勝利情報を設定します。
     * @param firstWinningInfoItems 初勝利情報
     */
    public void setFirstWinningInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.FirstWinningInfoDto> firstWinningInfoItems) {
        this.firstWinningInfoItems = firstWinningInfoItems;
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