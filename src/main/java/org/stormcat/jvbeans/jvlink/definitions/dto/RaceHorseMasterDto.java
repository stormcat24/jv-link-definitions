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
 * レコードフォーマットID {@link UM} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "UM", byteLength = 1577)
public class RaceHorseMasterDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code UM}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RaceHorseMasterDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("新規馬名登録", "1"),

        _2("馬名変更", "2"),

        _3("再登録(抹消後の再登録)", "3"),

        _4("その他更新", "4"),

        _9("抹消", "9"),

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
        private RaceHorseMasterDataDiv(String name, String value) {
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

    /** 競走馬抹消区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 22, byteLength = 1)
    private java.lang.Integer raceHorseEraseDiv;

    /** 競走馬登録年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 23, byteLength = 8)
    private java.util.Date raceHorseRegistDate;

    /** 競走馬抹消年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 31, byteLength = 8)
    private java.util.Date raceHorseEraseDate;

    /** 生年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 8)
    private java.util.Date birthDate;

    /** 馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 47, byteLength = 36)
    private java.lang.String horseName;

    /** 馬名半角ｶﾅ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 83, byteLength = 36)
    private java.lang.String horseNameHalfKana;

    /** 馬名欧字 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 119, byteLength = 60)
    private java.lang.String horseNameEng;

    /** JRA施設在きゅうフラグ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 179, byteLength = 1)
    private java.lang.Integer jraFacilityStayFlg;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 180, byteLength = 19)
    private java.lang.String spare1;

    /** 馬記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 199, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd;

    /** 性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 201, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 品種コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 202, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.BreedCd breedCd;

    /** 毛色コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 203, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd hairColorCd;

    /** 3代血統情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 205, byteLength = 44, repeatCount = 14)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BreedingInfoDto> breedingInfoItems;

    /** 東西所属コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 821, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd ewBelongCd;

    /** 調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 822, byteLength = 5)
    private java.lang.String trainerCd;

    /** 調教師名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 827, byteLength = 8)
    private java.lang.String trainerNameShort;

    /** 招待地域名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 835, byteLength = 20)
    private java.lang.String invitationAreaName;

    /** 生産者コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 855, byteLength = 6)
    private java.lang.String breederCd;

    /** 生産者名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 861, byteLength = 70)
    private java.lang.String breederNameWithoutCorp;

    /** 産地名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 931, byteLength = 20)
    private java.lang.String sourceAreaName;

    /** 馬主コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 951, byteLength = 6)
    private java.lang.String ownerCd;

    /** 馬主名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 957, byteLength = 64)
    private java.lang.String ownerNameWithoutCorp;

    /** 平地本賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1021, byteLength = 9, correction = 100.0f)
    private java.lang.Long addedMoneyTotalFlat;

    /** 障害本賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1030, byteLength = 9, correction = 100.0f)
    private java.lang.Long addedMoneyTotalObstacle;

    /** 平地付加賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1039, byteLength = 9, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalFlat;

    /** 障害付加賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1048, byteLength = 9, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalObstacle;

    /** 平地収得賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1057, byteLength = 9, correction = 100.0f)
    private java.lang.Long allMoneyTotalFlat;

    /** 障害収得賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1066, byteLength = 9, correction = 100.0f)
    private java.lang.Long allMoneyTotalObstacle;

    /** 総合着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1075, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTotalItems;

    /** 中央合計着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1093, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTotalJraItems;

    /** 芝直・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1111, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfStraightItems;

    /** 芝右・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1129, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfRightItems;

    /** 芝左・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1147, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfLeftItems;

    /** ダ直・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1165, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtStraightItems;

    /** ダ右・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1183, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtRightItems;

    /** ダ左・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1201, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtLeftItems;

    /** 障害・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1219, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleItems;

    /** 芝良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1237, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfFirmItems;

    /** 芝稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1255, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfGoodItems;

    /** 芝重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1273, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfYieldingItems;

    /** 芝不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1291, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfSoftItems;

    /** ダ良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1309, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtStandardItems;

    /** ダ稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1327, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtGoodItems;

    /** ダ重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1345, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtMuddyItems;

    /** ダ不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1363, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtSloppyItems;

    /** 障良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1381, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleStandardItems;

    /** 障稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1399, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleGoodItems;

    /** 障重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1417, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleMuddyItems;

    /** 障不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1435, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleSloppyItems;

    /** 芝16下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1453, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1600Items;

    /** 芝22下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1471, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2200Items;

    /** 芝22超・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1489, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2200OverItems;

    /** ダ16下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1507, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1600Items;

    /** ダ22下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1525, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2200Items;

    /** ダ22超・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1543, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2200OverItems;

    /** 脚質傾向 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1561, byteLength = 3, repeatCount = 4)
    private java.util.List<java.lang.Integer> tacticInclinationItems;

    /** 登録レース数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1573, byteLength = 3)
    private java.lang.Integer registedRaceCount;


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
        return RaceHorseMasterDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 競走馬抹消区分を返します。
     * @return 競走馬抹消区分
     */
    public java.lang.Integer getRaceHorseEraseDiv() {
        return raceHorseEraseDiv;
    }

    /**
     * 競走馬抹消区分を設定します。
     * @param raceHorseEraseDiv 競走馬抹消区分
     */
    public void setRaceHorseEraseDiv(java.lang.Integer raceHorseEraseDiv) {
        this.raceHorseEraseDiv = raceHorseEraseDiv;
    }

    /**
     * 競走馬登録年月日を返します。
     * @return 競走馬登録年月日
     */
    public java.util.Date getRaceHorseRegistDate() {
        return raceHorseRegistDate;
    }

    /**
     * 競走馬登録年月日を設定します。
     * @param raceHorseRegistDate 競走馬登録年月日
     */
    public void setRaceHorseRegistDate(java.util.Date raceHorseRegistDate) {
        this.raceHorseRegistDate = raceHorseRegistDate;
    }

    /**
     * 競走馬抹消年月日を返します。
     * @return 競走馬抹消年月日
     */
    public java.util.Date getRaceHorseEraseDate() {
        return raceHorseEraseDate;
    }

    /**
     * 競走馬抹消年月日を設定します。
     * @param raceHorseEraseDate 競走馬抹消年月日
     */
    public void setRaceHorseEraseDate(java.util.Date raceHorseEraseDate) {
        this.raceHorseEraseDate = raceHorseEraseDate;
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
     * JRA施設在きゅうフラグを返します。
     * @return JRA施設在きゅうフラグ
     */
    public java.lang.Integer getJraFacilityStayFlg() {
        return jraFacilityStayFlg;
    }

    /**
     * JRA施設在きゅうフラグを設定します。
     * @param jraFacilityStayFlg JRA施設在きゅうフラグ
     */
    public void setJraFacilityStayFlg(java.lang.Integer jraFacilityStayFlg) {
        this.jraFacilityStayFlg = jraFacilityStayFlg;
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
     * 馬記号コードを返します。
     * @return 馬記号コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd getHorseSignCd() {
        return horseSignCd;
    }

    /**
     * 馬記号コードを設定します。
     * @param horseSignCd 馬記号コード
     */
    public void setHorseSignCd(org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd) {
        this.horseSignCd = horseSignCd;
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
     * 3代血統情報を返します。
     * @return 3代血統情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BreedingInfoDto> getBreedingInfoItems() {
        return breedingInfoItems;
    }

    /**
     * 3代血統情報を設定します。
     * @param breedingInfoItems 3代血統情報
     */
    public void setBreedingInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.BreedingInfoDto> breedingInfoItems) {
        this.breedingInfoItems = breedingInfoItems;
    }

    /**
     * 東西所属コードを返します。
     * @return 東西所属コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd getEwBelongCd() {
        return ewBelongCd;
    }

    /**
     * 東西所属コードを設定します。
     * @param ewBelongCd 東西所属コード
     */
    public void setEwBelongCd(org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd ewBelongCd) {
        this.ewBelongCd = ewBelongCd;
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
     * 生産者名(法人格無)を返します。
     * @return 生産者名(法人格無)
     */
    public java.lang.String getBreederNameWithoutCorp() {
        return breederNameWithoutCorp;
    }

    /**
     * 生産者名(法人格無)を設定します。
     * @param breederNameWithoutCorp 生産者名(法人格無)
     */
    public void setBreederNameWithoutCorp(java.lang.String breederNameWithoutCorp) {
        this.breederNameWithoutCorp = breederNameWithoutCorp;
    }

    /**
     * 産地名を返します。
     * @return 産地名
     */
    public java.lang.String getSourceAreaName() {
        return sourceAreaName;
    }

    /**
     * 産地名を設定します。
     * @param sourceAreaName 産地名
     */
    public void setSourceAreaName(java.lang.String sourceAreaName) {
        this.sourceAreaName = sourceAreaName;
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
     * 平地本賞金累計を返します。
     * @return 平地本賞金累計
     */
    public java.lang.Long getAddedMoneyTotalFlat() {
        return addedMoneyTotalFlat;
    }

    /**
     * 平地本賞金累計を設定します。
     * @param addedMoneyTotalFlat 平地本賞金累計
     */
    public void setAddedMoneyTotalFlat(java.lang.Long addedMoneyTotalFlat) {
        this.addedMoneyTotalFlat = addedMoneyTotalFlat;
    }

    /**
     * 障害本賞金累計を返します。
     * @return 障害本賞金累計
     */
    public java.lang.Long getAddedMoneyTotalObstacle() {
        return addedMoneyTotalObstacle;
    }

    /**
     * 障害本賞金累計を設定します。
     * @param addedMoneyTotalObstacle 障害本賞金累計
     */
    public void setAddedMoneyTotalObstacle(java.lang.Long addedMoneyTotalObstacle) {
        this.addedMoneyTotalObstacle = addedMoneyTotalObstacle;
    }

    /**
     * 平地付加賞金累計を返します。
     * @return 平地付加賞金累計
     */
    public java.lang.Long getStakesMoneyTotalFlat() {
        return stakesMoneyTotalFlat;
    }

    /**
     * 平地付加賞金累計を設定します。
     * @param stakesMoneyTotalFlat 平地付加賞金累計
     */
    public void setStakesMoneyTotalFlat(java.lang.Long stakesMoneyTotalFlat) {
        this.stakesMoneyTotalFlat = stakesMoneyTotalFlat;
    }

    /**
     * 障害付加賞金累計を返します。
     * @return 障害付加賞金累計
     */
    public java.lang.Long getStakesMoneyTotalObstacle() {
        return stakesMoneyTotalObstacle;
    }

    /**
     * 障害付加賞金累計を設定します。
     * @param stakesMoneyTotalObstacle 障害付加賞金累計
     */
    public void setStakesMoneyTotalObstacle(java.lang.Long stakesMoneyTotalObstacle) {
        this.stakesMoneyTotalObstacle = stakesMoneyTotalObstacle;
    }

    /**
     * 平地収得賞金累計を返します。
     * @return 平地収得賞金累計
     */
    public java.lang.Long getAllMoneyTotalFlat() {
        return allMoneyTotalFlat;
    }

    /**
     * 平地収得賞金累計を設定します。
     * @param allMoneyTotalFlat 平地収得賞金累計
     */
    public void setAllMoneyTotalFlat(java.lang.Long allMoneyTotalFlat) {
        this.allMoneyTotalFlat = allMoneyTotalFlat;
    }

    /**
     * 障害収得賞金累計を返します。
     * @return 障害収得賞金累計
     */
    public java.lang.Long getAllMoneyTotalObstacle() {
        return allMoneyTotalObstacle;
    }

    /**
     * 障害収得賞金累計を設定します。
     * @param allMoneyTotalObstacle 障害収得賞金累計
     */
    public void setAllMoneyTotalObstacle(java.lang.Long allMoneyTotalObstacle) {
        this.allMoneyTotalObstacle = allMoneyTotalObstacle;
    }

    /**
     * 総合着回数を返します。
     * @return 総合着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTotalItems() {
        return finishCountTotalItems;
    }

    /**
     * 総合着回数を設定します。
     * @param finishCountTotalItems 総合着回数
     */
    public void setFinishCountTotalItems(java.util.List<java.lang.Integer> finishCountTotalItems) {
        this.finishCountTotalItems = finishCountTotalItems;
    }

    /**
     * 中央合計着回数を返します。
     * @return 中央合計着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTotalJraItems() {
        return finishCountTotalJraItems;
    }

    /**
     * 中央合計着回数を設定します。
     * @param finishCountTotalJraItems 中央合計着回数
     */
    public void setFinishCountTotalJraItems(java.util.List<java.lang.Integer> finishCountTotalJraItems) {
        this.finishCountTotalJraItems = finishCountTotalJraItems;
    }

    /**
     * 芝直・着回数を返します。
     * @return 芝直・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfStraightItems() {
        return finishCountTurfStraightItems;
    }

    /**
     * 芝直・着回数を設定します。
     * @param finishCountTurfStraightItems 芝直・着回数
     */
    public void setFinishCountTurfStraightItems(java.util.List<java.lang.Integer> finishCountTurfStraightItems) {
        this.finishCountTurfStraightItems = finishCountTurfStraightItems;
    }

    /**
     * 芝右・着回数を返します。
     * @return 芝右・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfRightItems() {
        return finishCountTurfRightItems;
    }

    /**
     * 芝右・着回数を設定します。
     * @param finishCountTurfRightItems 芝右・着回数
     */
    public void setFinishCountTurfRightItems(java.util.List<java.lang.Integer> finishCountTurfRightItems) {
        this.finishCountTurfRightItems = finishCountTurfRightItems;
    }

    /**
     * 芝左・着回数を返します。
     * @return 芝左・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfLeftItems() {
        return finishCountTurfLeftItems;
    }

    /**
     * 芝左・着回数を設定します。
     * @param finishCountTurfLeftItems 芝左・着回数
     */
    public void setFinishCountTurfLeftItems(java.util.List<java.lang.Integer> finishCountTurfLeftItems) {
        this.finishCountTurfLeftItems = finishCountTurfLeftItems;
    }

    /**
     * ダ直・着回数を返します。
     * @return ダ直・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtStraightItems() {
        return finishCountDirtStraightItems;
    }

    /**
     * ダ直・着回数を設定します。
     * @param finishCountDirtStraightItems ダ直・着回数
     */
    public void setFinishCountDirtStraightItems(java.util.List<java.lang.Integer> finishCountDirtStraightItems) {
        this.finishCountDirtStraightItems = finishCountDirtStraightItems;
    }

    /**
     * ダ右・着回数を返します。
     * @return ダ右・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtRightItems() {
        return finishCountDirtRightItems;
    }

    /**
     * ダ右・着回数を設定します。
     * @param finishCountDirtRightItems ダ右・着回数
     */
    public void setFinishCountDirtRightItems(java.util.List<java.lang.Integer> finishCountDirtRightItems) {
        this.finishCountDirtRightItems = finishCountDirtRightItems;
    }

    /**
     * ダ左・着回数を返します。
     * @return ダ左・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtLeftItems() {
        return finishCountDirtLeftItems;
    }

    /**
     * ダ左・着回数を設定します。
     * @param finishCountDirtLeftItems ダ左・着回数
     */
    public void setFinishCountDirtLeftItems(java.util.List<java.lang.Integer> finishCountDirtLeftItems) {
        this.finishCountDirtLeftItems = finishCountDirtLeftItems;
    }

    /**
     * 障害・着回数を返します。
     * @return 障害・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleItems() {
        return finishCountObstacleItems;
    }

    /**
     * 障害・着回数を設定します。
     * @param finishCountObstacleItems 障害・着回数
     */
    public void setFinishCountObstacleItems(java.util.List<java.lang.Integer> finishCountObstacleItems) {
        this.finishCountObstacleItems = finishCountObstacleItems;
    }

    /**
     * 芝良・着回数を返します。
     * @return 芝良・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfFirmItems() {
        return finishCountTurfFirmItems;
    }

    /**
     * 芝良・着回数を設定します。
     * @param finishCountTurfFirmItems 芝良・着回数
     */
    public void setFinishCountTurfFirmItems(java.util.List<java.lang.Integer> finishCountTurfFirmItems) {
        this.finishCountTurfFirmItems = finishCountTurfFirmItems;
    }

    /**
     * 芝稍・着回数を返します。
     * @return 芝稍・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfGoodItems() {
        return finishCountTurfGoodItems;
    }

    /**
     * 芝稍・着回数を設定します。
     * @param finishCountTurfGoodItems 芝稍・着回数
     */
    public void setFinishCountTurfGoodItems(java.util.List<java.lang.Integer> finishCountTurfGoodItems) {
        this.finishCountTurfGoodItems = finishCountTurfGoodItems;
    }

    /**
     * 芝重・着回数を返します。
     * @return 芝重・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfYieldingItems() {
        return finishCountTurfYieldingItems;
    }

    /**
     * 芝重・着回数を設定します。
     * @param finishCountTurfYieldingItems 芝重・着回数
     */
    public void setFinishCountTurfYieldingItems(java.util.List<java.lang.Integer> finishCountTurfYieldingItems) {
        this.finishCountTurfYieldingItems = finishCountTurfYieldingItems;
    }

    /**
     * 芝不・着回数を返します。
     * @return 芝不・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfSoftItems() {
        return finishCountTurfSoftItems;
    }

    /**
     * 芝不・着回数を設定します。
     * @param finishCountTurfSoftItems 芝不・着回数
     */
    public void setFinishCountTurfSoftItems(java.util.List<java.lang.Integer> finishCountTurfSoftItems) {
        this.finishCountTurfSoftItems = finishCountTurfSoftItems;
    }

    /**
     * ダ良・着回数を返します。
     * @return ダ良・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtStandardItems() {
        return finishCountDirtStandardItems;
    }

    /**
     * ダ良・着回数を設定します。
     * @param finishCountDirtStandardItems ダ良・着回数
     */
    public void setFinishCountDirtStandardItems(java.util.List<java.lang.Integer> finishCountDirtStandardItems) {
        this.finishCountDirtStandardItems = finishCountDirtStandardItems;
    }

    /**
     * ダ稍・着回数を返します。
     * @return ダ稍・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtGoodItems() {
        return finishCountDirtGoodItems;
    }

    /**
     * ダ稍・着回数を設定します。
     * @param finishCountDirtGoodItems ダ稍・着回数
     */
    public void setFinishCountDirtGoodItems(java.util.List<java.lang.Integer> finishCountDirtGoodItems) {
        this.finishCountDirtGoodItems = finishCountDirtGoodItems;
    }

    /**
     * ダ重・着回数を返します。
     * @return ダ重・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtMuddyItems() {
        return finishCountDirtMuddyItems;
    }

    /**
     * ダ重・着回数を設定します。
     * @param finishCountDirtMuddyItems ダ重・着回数
     */
    public void setFinishCountDirtMuddyItems(java.util.List<java.lang.Integer> finishCountDirtMuddyItems) {
        this.finishCountDirtMuddyItems = finishCountDirtMuddyItems;
    }

    /**
     * ダ不・着回数を返します。
     * @return ダ不・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtSloppyItems() {
        return finishCountDirtSloppyItems;
    }

    /**
     * ダ不・着回数を設定します。
     * @param finishCountDirtSloppyItems ダ不・着回数
     */
    public void setFinishCountDirtSloppyItems(java.util.List<java.lang.Integer> finishCountDirtSloppyItems) {
        this.finishCountDirtSloppyItems = finishCountDirtSloppyItems;
    }

    /**
     * 障良・着回数を返します。
     * @return 障良・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleStandardItems() {
        return finishCountObstacleStandardItems;
    }

    /**
     * 障良・着回数を設定します。
     * @param finishCountObstacleStandardItems 障良・着回数
     */
    public void setFinishCountObstacleStandardItems(java.util.List<java.lang.Integer> finishCountObstacleStandardItems) {
        this.finishCountObstacleStandardItems = finishCountObstacleStandardItems;
    }

    /**
     * 障稍・着回数を返します。
     * @return 障稍・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleGoodItems() {
        return finishCountObstacleGoodItems;
    }

    /**
     * 障稍・着回数を設定します。
     * @param finishCountObstacleGoodItems 障稍・着回数
     */
    public void setFinishCountObstacleGoodItems(java.util.List<java.lang.Integer> finishCountObstacleGoodItems) {
        this.finishCountObstacleGoodItems = finishCountObstacleGoodItems;
    }

    /**
     * 障重・着回数を返します。
     * @return 障重・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleMuddyItems() {
        return finishCountObstacleMuddyItems;
    }

    /**
     * 障重・着回数を設定します。
     * @param finishCountObstacleMuddyItems 障重・着回数
     */
    public void setFinishCountObstacleMuddyItems(java.util.List<java.lang.Integer> finishCountObstacleMuddyItems) {
        this.finishCountObstacleMuddyItems = finishCountObstacleMuddyItems;
    }

    /**
     * 障不・着回数を返します。
     * @return 障不・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleSloppyItems() {
        return finishCountObstacleSloppyItems;
    }

    /**
     * 障不・着回数を設定します。
     * @param finishCountObstacleSloppyItems 障不・着回数
     */
    public void setFinishCountObstacleSloppyItems(java.util.List<java.lang.Integer> finishCountObstacleSloppyItems) {
        this.finishCountObstacleSloppyItems = finishCountObstacleSloppyItems;
    }

    /**
     * 芝16下・着回数を返します。
     * @return 芝16下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1600Items() {
        return finishCountTurf1600Items;
    }

    /**
     * 芝16下・着回数を設定します。
     * @param finishCountTurf1600Items 芝16下・着回数
     */
    public void setFinishCountTurf1600Items(java.util.List<java.lang.Integer> finishCountTurf1600Items) {
        this.finishCountTurf1600Items = finishCountTurf1600Items;
    }

    /**
     * 芝22下・着回数を返します。
     * @return 芝22下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2200Items() {
        return finishCountTurf2200Items;
    }

    /**
     * 芝22下・着回数を設定します。
     * @param finishCountTurf2200Items 芝22下・着回数
     */
    public void setFinishCountTurf2200Items(java.util.List<java.lang.Integer> finishCountTurf2200Items) {
        this.finishCountTurf2200Items = finishCountTurf2200Items;
    }

    /**
     * 芝22超・着回数を返します。
     * @return 芝22超・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2200OverItems() {
        return finishCountTurf2200OverItems;
    }

    /**
     * 芝22超・着回数を設定します。
     * @param finishCountTurf2200OverItems 芝22超・着回数
     */
    public void setFinishCountTurf2200OverItems(java.util.List<java.lang.Integer> finishCountTurf2200OverItems) {
        this.finishCountTurf2200OverItems = finishCountTurf2200OverItems;
    }

    /**
     * ダ16下・着回数を返します。
     * @return ダ16下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1600Items() {
        return finishCountDirt1600Items;
    }

    /**
     * ダ16下・着回数を設定します。
     * @param finishCountDirt1600Items ダ16下・着回数
     */
    public void setFinishCountDirt1600Items(java.util.List<java.lang.Integer> finishCountDirt1600Items) {
        this.finishCountDirt1600Items = finishCountDirt1600Items;
    }

    /**
     * ダ22下・着回数を返します。
     * @return ダ22下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2200Items() {
        return finishCountDirt2200Items;
    }

    /**
     * ダ22下・着回数を設定します。
     * @param finishCountDirt2200Items ダ22下・着回数
     */
    public void setFinishCountDirt2200Items(java.util.List<java.lang.Integer> finishCountDirt2200Items) {
        this.finishCountDirt2200Items = finishCountDirt2200Items;
    }

    /**
     * ダ22超・着回数を返します。
     * @return ダ22超・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2200OverItems() {
        return finishCountDirt2200OverItems;
    }

    /**
     * ダ22超・着回数を設定します。
     * @param finishCountDirt2200OverItems ダ22超・着回数
     */
    public void setFinishCountDirt2200OverItems(java.util.List<java.lang.Integer> finishCountDirt2200OverItems) {
        this.finishCountDirt2200OverItems = finishCountDirt2200OverItems;
    }

    /**
     * 脚質傾向を返します。
     * @return 脚質傾向
     */
    public java.util.List<java.lang.Integer> getTacticInclinationItems() {
        return tacticInclinationItems;
    }

    /**
     * 脚質傾向を設定します。
     * @param tacticInclinationItems 脚質傾向
     */
    public void setTacticInclinationItems(java.util.List<java.lang.Integer> tacticInclinationItems) {
        this.tacticInclinationItems = tacticInclinationItems;
    }

    /**
     * 登録レース数を返します。
     * @return 登録レース数
     */
    public java.lang.Integer getRegistedRaceCount() {
        return registedRaceCount;
    }

    /**
     * 登録レース数を設定します。
     * @param registedRaceCount 登録レース数
     */
    public void setRegistedRaceCount(java.lang.Integer registedRaceCount) {
        this.registedRaceCount = registedRaceCount;
    }

}