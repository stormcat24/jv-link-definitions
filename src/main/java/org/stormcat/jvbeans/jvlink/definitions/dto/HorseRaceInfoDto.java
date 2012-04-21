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
 * レコードフォーマットID {@link SE} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "SE", byteLength = 555)
public class HorseRaceInfoDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code SE}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum HorseRaceInfoDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("出走馬名表(木曜)", "1"),

        _2("出馬表(金･土曜)", "2"),

        _3("速報成績(3着まで確定)", "3"),

        _4("速報成績(5着まで確定)", "4"),

        _5("速報成績(全馬着順確定)", "5"),

        _6("速報成績(全馬着順+コーナ通過順)", "6"),

        _7("成績(月曜)", "7"),

        _A("地方競馬", "A"),

        _B("海外国際レース", "B"),

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
        private HorseRaceInfoDataDiv(String name, String value) {
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

    /** 枠番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 1)
    private java.lang.Integer bracketNo;

    /** 馬番 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 29, byteLength = 2)
    private java.lang.String horseNo;

    /** 血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 31, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 41, byteLength = 36)
    private java.lang.String horseName;

    /** 馬記号コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 77, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HorseSignCd horseSignCd;

    /** 性別コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 79, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.SexCd sexCd;

    /** 品種コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 80, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.BreedCd breedCd;

    /** 毛色コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 81, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.HairColorCd hairColorCd;

    /** 馬齢 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 83, byteLength = 2)
    private java.lang.Integer age;

    /** 東西所属コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 85, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.EWBelongCd ewBelongCd;

    /** 調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 86, byteLength = 5)
    private java.lang.String trainerCd;

    /** 調教師名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 91, byteLength = 8)
    private java.lang.String trainerNameShort;

    /** 馬主コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 99, byteLength = 6)
    private java.lang.String ownerCd;

    /** 馬主名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 105, byteLength = 64)
    private java.lang.String ownerNameWithoutCorp;

    /** 服色標示 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 169, byteLength = 60)
    private java.lang.String clothingMark;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 229, byteLength = 60)
    private java.lang.String spare1;

    /** 負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 289, byteLength = 3, correction = 0.1f)
    private java.lang.Float loadWeight;

    /** 変更前負担重量 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 292, byteLength = 3)
    private java.lang.Float loadWeightBefore;

    /** ブリンカー使用区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 295, byteLength = 1)
    private java.lang.Integer blinkerUseDiv;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 296, byteLength = 1)
    private java.lang.String spare2;

    /** 騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 297, byteLength = 5)
    private java.lang.String jockeyCd;

    /** 変更前騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 302, byteLength = 5)
    private java.lang.String jockeyCdBefore;

    /** 騎手名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 307, byteLength = 8)
    private java.lang.String jockeyNameShort;

    /** 変更前騎手名略称 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 315, byteLength = 8)
    private java.lang.String jockeyNameShortBefore;

    /** 騎手見習コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 323, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCd;

    /** 変更前騎手見習コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 324, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdBefore;

    /** 馬体重 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 325, byteLength = 3)
    private java.lang.Integer horseWeight;

    /** 増減符号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 328, byteLength = 1)
    private java.lang.Character changeSign;

    /** 増減差 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 329, byteLength = 3)
    private java.lang.Integer changeAmount;

    /** 異常区分コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 332, byteLength = 1)
    private org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd abnormalDivCd;

    /** 入線順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 333, byteLength = 2)
    private java.lang.Integer finishedArrivalOrder;

    /** 確定着順 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 335, byteLength = 2)
    private java.lang.Integer fixedArrivalOrder;

    /** 同着区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 337, byteLength = 1)
    private java.lang.Integer deadHeadDiv;

    /** 同着頭数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 338, byteLength = 1)
    private java.lang.Integer deadHeadCount;

    /** 走破タイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 339, byteLength = 4)
    private java.lang.String runningTime;

    /** 着差コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 343, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd;

    /** ＋着差コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 346, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd2;

    /** ＋＋着差コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 349, byteLength = 3)
    private org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd3;

    /** 1コーナーでの順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 352, byteLength = 2)
    private java.lang.Integer rankCorner1;

    /** 2コーナーでの順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 354, byteLength = 2)
    private java.lang.Integer rankCorner2;

    /** 3コーナーでの順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 356, byteLength = 2)
    private java.lang.Integer rankCorner3;

    /** 4コーナーでの順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 358, byteLength = 2)
    private java.lang.Integer rankCorner4;

    /** 単勝オッズ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 360, byteLength = 4)
    private java.lang.String oddsWin;

    /** 単勝人気順 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 364, byteLength = 2)
    private java.lang.Integer betRankWin;

    /** 獲得本賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 366, byteLength = 8)
    private java.lang.Long aquirementAddedMoney;

    /** 獲得付加賞金 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 374, byteLength = 8)
    private java.lang.Long aquirementStakesMoney;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 382, byteLength = 3)
    private java.lang.String spare4;

    /** 予備 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 385, byteLength = 3)
    private java.lang.String spare5;

    /** 後4ハロンタイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 388, byteLength = 3, correction = 0.1f)
    private java.lang.Float lastFurlong4;

    /** 後3ハロンタイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 391, byteLength = 3, correction = 0.1f)
    private java.lang.Float lastFurlong3;

    /** 1着馬(相手馬)情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 394, byteLength = 46, repeatCount = 3)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ContenderInfoDto> contenderInfoItems;

    /** タイム差 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 532, byteLength = 4)
    private java.lang.String timeMergin;

    /** レコード更新区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 536, byteLength = 1)
    private java.lang.Integer recordBeakeDiv;

    /** マイニング区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 537, byteLength = 1)
    private java.lang.Integer miningDiv;

    /** マイニング予想走破タイム */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 538, byteLength = 5)
    private java.lang.String miningExpectationRunningTime;

    /** マイニング予想誤差(信頼度)＋ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 543, byteLength = 4)
    private java.lang.String miningExpectationErrorPlus;

    /** マイニング予想誤差(信頼度)－ */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 547, byteLength = 4)
    private java.lang.String miningExpectationErrorMinus;

    /** マイニング予想順位 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 551, byteLength = 2)
    private java.lang.Integer miningExpectationRank;

    /** 今回レース脚質判定 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 553, byteLength = 1)
    private java.lang.Integer tacticInclination;


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
        return HorseRaceInfoDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 枠番を返します。
     * @return 枠番
     */
    public java.lang.Integer getBracketNo() {
        return bracketNo;
    }

    /**
     * 枠番を設定します。
     * @param bracketNo 枠番
     */
    public void setBracketNo(java.lang.Integer bracketNo) {
        this.bracketNo = bracketNo;
    }

    /**
     * 馬番を返します。
     * @return 馬番
     */
    public java.lang.String getHorseNo() {
        return horseNo;
    }

    /**
     * 馬番を設定します。
     * @param horseNo 馬番
     */
    public void setHorseNo(java.lang.String horseNo) {
        this.horseNo = horseNo;
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
     * 馬齢を返します。
     * @return 馬齢
     */
    public java.lang.Integer getAge() {
        return age;
    }

    /**
     * 馬齢を設定します。
     * @param age 馬齢
     */
    public void setAge(java.lang.Integer age) {
        this.age = age;
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
     * 負担重量を返します。
     * @return 負担重量
     */
    public java.lang.Float getLoadWeight() {
        return loadWeight;
    }

    /**
     * 負担重量を設定します。
     * @param loadWeight 負担重量
     */
    public void setLoadWeight(java.lang.Float loadWeight) {
        this.loadWeight = loadWeight;
    }

    /**
     * 変更前負担重量を返します。
     * @return 変更前負担重量
     */
    public java.lang.Float getLoadWeightBefore() {
        return loadWeightBefore;
    }

    /**
     * 変更前負担重量を設定します。
     * @param loadWeightBefore 変更前負担重量
     */
    public void setLoadWeightBefore(java.lang.Float loadWeightBefore) {
        this.loadWeightBefore = loadWeightBefore;
    }

    /**
     * ブリンカー使用区分を返します。
     * @return ブリンカー使用区分
     */
    public java.lang.Integer getBlinkerUseDiv() {
        return blinkerUseDiv;
    }

    /**
     * ブリンカー使用区分を設定します。
     * @param blinkerUseDiv ブリンカー使用区分
     */
    public void setBlinkerUseDiv(java.lang.Integer blinkerUseDiv) {
        this.blinkerUseDiv = blinkerUseDiv;
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
     * 変更前騎手コードを返します。
     * @return 変更前騎手コード
     */
    public java.lang.String getJockeyCdBefore() {
        return jockeyCdBefore;
    }

    /**
     * 変更前騎手コードを設定します。
     * @param jockeyCdBefore 変更前騎手コード
     */
    public void setJockeyCdBefore(java.lang.String jockeyCdBefore) {
        this.jockeyCdBefore = jockeyCdBefore;
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
     * 変更前騎手名略称を返します。
     * @return 変更前騎手名略称
     */
    public java.lang.String getJockeyNameShortBefore() {
        return jockeyNameShortBefore;
    }

    /**
     * 変更前騎手名略称を設定します。
     * @param jockeyNameShortBefore 変更前騎手名略称
     */
    public void setJockeyNameShortBefore(java.lang.String jockeyNameShortBefore) {
        this.jockeyNameShortBefore = jockeyNameShortBefore;
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
     * 変更前騎手見習コードを返します。
     * @return 変更前騎手見習コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd getJockeyMateCdBefore() {
        return jockeyMateCdBefore;
    }

    /**
     * 変更前騎手見習コードを設定します。
     * @param jockeyMateCdBefore 変更前騎手見習コード
     */
    public void setJockeyMateCdBefore(org.stormcat.jvbeans.jvlink.definitions.code.JockeyMateCd jockeyMateCdBefore) {
        this.jockeyMateCdBefore = jockeyMateCdBefore;
    }

    /**
     * 馬体重を返します。
     * @return 馬体重
     */
    public java.lang.Integer getHorseWeight() {
        return horseWeight;
    }

    /**
     * 馬体重を設定します。
     * @param horseWeight 馬体重
     */
    public void setHorseWeight(java.lang.Integer horseWeight) {
        this.horseWeight = horseWeight;
    }

    /**
     * 増減符号を返します。
     * @return 増減符号
     */
    public java.lang.Character getChangeSign() {
        return changeSign;
    }

    /**
     * 増減符号を設定します。
     * @param changeSign 増減符号
     */
    public void setChangeSign(java.lang.Character changeSign) {
        this.changeSign = changeSign;
    }

    /**
     * 増減差を返します。
     * @return 増減差
     */
    public java.lang.Integer getChangeAmount() {
        return changeAmount;
    }

    /**
     * 増減差を設定します。
     * @param changeAmount 増減差
     */
    public void setChangeAmount(java.lang.Integer changeAmount) {
        this.changeAmount = changeAmount;
    }

    /**
     * 異常区分コードを返します。
     * @return 異常区分コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd getAbnormalDivCd() {
        return abnormalDivCd;
    }

    /**
     * 異常区分コードを設定します。
     * @param abnormalDivCd 異常区分コード
     */
    public void setAbnormalDivCd(org.stormcat.jvbeans.jvlink.definitions.code.AbnormalDivCd abnormalDivCd) {
        this.abnormalDivCd = abnormalDivCd;
    }

    /**
     * 入線順位を返します。
     * @return 入線順位
     */
    public java.lang.Integer getFinishedArrivalOrder() {
        return finishedArrivalOrder;
    }

    /**
     * 入線順位を設定します。
     * @param finishedArrivalOrder 入線順位
     */
    public void setFinishedArrivalOrder(java.lang.Integer finishedArrivalOrder) {
        this.finishedArrivalOrder = finishedArrivalOrder;
    }

    /**
     * 確定着順を返します。
     * @return 確定着順
     */
    public java.lang.Integer getFixedArrivalOrder() {
        return fixedArrivalOrder;
    }

    /**
     * 確定着順を設定します。
     * @param fixedArrivalOrder 確定着順
     */
    public void setFixedArrivalOrder(java.lang.Integer fixedArrivalOrder) {
        this.fixedArrivalOrder = fixedArrivalOrder;
    }

    /**
     * 同着区分を返します。
     * @return 同着区分
     */
    public java.lang.Integer getDeadHeadDiv() {
        return deadHeadDiv;
    }

    /**
     * 同着区分を設定します。
     * @param deadHeadDiv 同着区分
     */
    public void setDeadHeadDiv(java.lang.Integer deadHeadDiv) {
        this.deadHeadDiv = deadHeadDiv;
    }

    /**
     * 同着頭数を返します。
     * @return 同着頭数
     */
    public java.lang.Integer getDeadHeadCount() {
        return deadHeadCount;
    }

    /**
     * 同着頭数を設定します。
     * @param deadHeadCount 同着頭数
     */
    public void setDeadHeadCount(java.lang.Integer deadHeadCount) {
        this.deadHeadCount = deadHeadCount;
    }

    /**
     * 走破タイムを返します。
     * @return 走破タイム
     */
    public java.lang.String getRunningTime() {
        return runningTime;
    }

    /**
     * 走破タイムを設定します。
     * @param runningTime 走破タイム
     */
    public void setRunningTime(java.lang.String runningTime) {
        this.runningTime = runningTime;
    }

    /**
     * 着差コードを返します。
     * @return 着差コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.MarginCd getMarginCd() {
        return marginCd;
    }

    /**
     * 着差コードを設定します。
     * @param marginCd 着差コード
     */
    public void setMarginCd(org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd) {
        this.marginCd = marginCd;
    }

    /**
     * ＋着差コードを返します。
     * @return ＋着差コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.MarginCd getMarginCd2() {
        return marginCd2;
    }

    /**
     * ＋着差コードを設定します。
     * @param marginCd2 ＋着差コード
     */
    public void setMarginCd2(org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd2) {
        this.marginCd2 = marginCd2;
    }

    /**
     * ＋＋着差コードを返します。
     * @return ＋＋着差コード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.MarginCd getMarginCd3() {
        return marginCd3;
    }

    /**
     * ＋＋着差コードを設定します。
     * @param marginCd3 ＋＋着差コード
     */
    public void setMarginCd3(org.stormcat.jvbeans.jvlink.definitions.code.MarginCd marginCd3) {
        this.marginCd3 = marginCd3;
    }

    /**
     * 1コーナーでの順位を返します。
     * @return 1コーナーでの順位
     */
    public java.lang.Integer getRankCorner1() {
        return rankCorner1;
    }

    /**
     * 1コーナーでの順位を設定します。
     * @param rankCorner1 1コーナーでの順位
     */
    public void setRankCorner1(java.lang.Integer rankCorner1) {
        this.rankCorner1 = rankCorner1;
    }

    /**
     * 2コーナーでの順位を返します。
     * @return 2コーナーでの順位
     */
    public java.lang.Integer getRankCorner2() {
        return rankCorner2;
    }

    /**
     * 2コーナーでの順位を設定します。
     * @param rankCorner2 2コーナーでの順位
     */
    public void setRankCorner2(java.lang.Integer rankCorner2) {
        this.rankCorner2 = rankCorner2;
    }

    /**
     * 3コーナーでの順位を返します。
     * @return 3コーナーでの順位
     */
    public java.lang.Integer getRankCorner3() {
        return rankCorner3;
    }

    /**
     * 3コーナーでの順位を設定します。
     * @param rankCorner3 3コーナーでの順位
     */
    public void setRankCorner3(java.lang.Integer rankCorner3) {
        this.rankCorner3 = rankCorner3;
    }

    /**
     * 4コーナーでの順位を返します。
     * @return 4コーナーでの順位
     */
    public java.lang.Integer getRankCorner4() {
        return rankCorner4;
    }

    /**
     * 4コーナーでの順位を設定します。
     * @param rankCorner4 4コーナーでの順位
     */
    public void setRankCorner4(java.lang.Integer rankCorner4) {
        this.rankCorner4 = rankCorner4;
    }

    /**
     * 単勝オッズを返します。
     * @return 単勝オッズ
     */
    public java.lang.String getOddsWin() {
        return oddsWin;
    }

    /**
     * 単勝オッズを設定します。
     * @param oddsWin 単勝オッズ
     */
    public void setOddsWin(java.lang.String oddsWin) {
        this.oddsWin = oddsWin;
    }

    /**
     * 単勝人気順を返します。
     * @return 単勝人気順
     */
    public java.lang.Integer getBetRankWin() {
        return betRankWin;
    }

    /**
     * 単勝人気順を設定します。
     * @param betRankWin 単勝人気順
     */
    public void setBetRankWin(java.lang.Integer betRankWin) {
        this.betRankWin = betRankWin;
    }

    /**
     * 獲得本賞金を返します。
     * @return 獲得本賞金
     */
    public java.lang.Long getAquirementAddedMoney() {
        return aquirementAddedMoney;
    }

    /**
     * 獲得本賞金を設定します。
     * @param aquirementAddedMoney 獲得本賞金
     */
    public void setAquirementAddedMoney(java.lang.Long aquirementAddedMoney) {
        this.aquirementAddedMoney = aquirementAddedMoney;
    }

    /**
     * 獲得付加賞金を返します。
     * @return 獲得付加賞金
     */
    public java.lang.Long getAquirementStakesMoney() {
        return aquirementStakesMoney;
    }

    /**
     * 獲得付加賞金を設定します。
     * @param aquirementStakesMoney 獲得付加賞金
     */
    public void setAquirementStakesMoney(java.lang.Long aquirementStakesMoney) {
        this.aquirementStakesMoney = aquirementStakesMoney;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.lang.String getSpare4() {
        return spare4;
    }

    /**
     * 予備を設定します。
     * @param spare4 予備
     */
    public void setSpare4(java.lang.String spare4) {
        this.spare4 = spare4;
    }

    /**
     * 予備を返します。
     * @return 予備
     */
    public java.lang.String getSpare5() {
        return spare5;
    }

    /**
     * 予備を設定します。
     * @param spare5 予備
     */
    public void setSpare5(java.lang.String spare5) {
        this.spare5 = spare5;
    }

    /**
     * 後4ハロンタイムを返します。
     * @return 後4ハロンタイム
     */
    public java.lang.Float getLastFurlong4() {
        return lastFurlong4;
    }

    /**
     * 後4ハロンタイムを設定します。
     * @param lastFurlong4 後4ハロンタイム
     */
    public void setLastFurlong4(java.lang.Float lastFurlong4) {
        this.lastFurlong4 = lastFurlong4;
    }

    /**
     * 後3ハロンタイムを返します。
     * @return 後3ハロンタイム
     */
    public java.lang.Float getLastFurlong3() {
        return lastFurlong3;
    }

    /**
     * 後3ハロンタイムを設定します。
     * @param lastFurlong3 後3ハロンタイム
     */
    public void setLastFurlong3(java.lang.Float lastFurlong3) {
        this.lastFurlong3 = lastFurlong3;
    }

    /**
     * 1着馬(相手馬)情報を返します。
     * @return 1着馬(相手馬)情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ContenderInfoDto> getContenderInfoItems() {
        return contenderInfoItems;
    }

    /**
     * 1着馬(相手馬)情報を設定します。
     * @param contenderInfoItems 1着馬(相手馬)情報
     */
    public void setContenderInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.ContenderInfoDto> contenderInfoItems) {
        this.contenderInfoItems = contenderInfoItems;
    }

    /**
     * タイム差を返します。
     * @return タイム差
     */
    public java.lang.String getTimeMergin() {
        return timeMergin;
    }

    /**
     * タイム差を設定します。
     * @param timeMergin タイム差
     */
    public void setTimeMergin(java.lang.String timeMergin) {
        this.timeMergin = timeMergin;
    }

    /**
     * レコード更新区分を返します。
     * @return レコード更新区分
     */
    public java.lang.Integer getRecordBeakeDiv() {
        return recordBeakeDiv;
    }

    /**
     * レコード更新区分を設定します。
     * @param recordBeakeDiv レコード更新区分
     */
    public void setRecordBeakeDiv(java.lang.Integer recordBeakeDiv) {
        this.recordBeakeDiv = recordBeakeDiv;
    }

    /**
     * マイニング区分を返します。
     * @return マイニング区分
     */
    public java.lang.Integer getMiningDiv() {
        return miningDiv;
    }

    /**
     * マイニング区分を設定します。
     * @param miningDiv マイニング区分
     */
    public void setMiningDiv(java.lang.Integer miningDiv) {
        this.miningDiv = miningDiv;
    }

    /**
     * マイニング予想走破タイムを返します。
     * @return マイニング予想走破タイム
     */
    public java.lang.String getMiningExpectationRunningTime() {
        return miningExpectationRunningTime;
    }

    /**
     * マイニング予想走破タイムを設定します。
     * @param miningExpectationRunningTime マイニング予想走破タイム
     */
    public void setMiningExpectationRunningTime(java.lang.String miningExpectationRunningTime) {
        this.miningExpectationRunningTime = miningExpectationRunningTime;
    }

    /**
     * マイニング予想誤差(信頼度)＋を返します。
     * @return マイニング予想誤差(信頼度)＋
     */
    public java.lang.String getMiningExpectationErrorPlus() {
        return miningExpectationErrorPlus;
    }

    /**
     * マイニング予想誤差(信頼度)＋を設定します。
     * @param miningExpectationErrorPlus マイニング予想誤差(信頼度)＋
     */
    public void setMiningExpectationErrorPlus(java.lang.String miningExpectationErrorPlus) {
        this.miningExpectationErrorPlus = miningExpectationErrorPlus;
    }

    /**
     * マイニング予想誤差(信頼度)－を返します。
     * @return マイニング予想誤差(信頼度)－
     */
    public java.lang.String getMiningExpectationErrorMinus() {
        return miningExpectationErrorMinus;
    }

    /**
     * マイニング予想誤差(信頼度)－を設定します。
     * @param miningExpectationErrorMinus マイニング予想誤差(信頼度)－
     */
    public void setMiningExpectationErrorMinus(java.lang.String miningExpectationErrorMinus) {
        this.miningExpectationErrorMinus = miningExpectationErrorMinus;
    }

    /**
     * マイニング予想順位を返します。
     * @return マイニング予想順位
     */
    public java.lang.Integer getMiningExpectationRank() {
        return miningExpectationRank;
    }

    /**
     * マイニング予想順位を設定します。
     * @param miningExpectationRank マイニング予想順位
     */
    public void setMiningExpectationRank(java.lang.Integer miningExpectationRank) {
        this.miningExpectationRank = miningExpectationRank;
    }

    /**
     * 今回レース脚質判定を返します。
     * @return 今回レース脚質判定
     */
    public java.lang.Integer getTacticInclination() {
        return tacticInclination;
    }

    /**
     * 今回レース脚質判定を設定します。
     * @param tacticInclination 今回レース脚質判定
     */
    public void setTacticInclination(java.lang.Integer tacticInclination) {
        this.tacticInclination = tacticInclination;
    }

}