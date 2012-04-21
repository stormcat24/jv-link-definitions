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
 * レコードフォーマットID {@link CK} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "CK", byteLength = 6864)
public class RaceResultDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code CK}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum RaceResultDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private RaceResultDataDiv(String name, String value) {
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

    /** 血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 馬名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 38, byteLength = 36)
    private java.lang.String horseName;

    /** 平地本賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 74, byteLength = 9, correction = 100.0f)
    private java.lang.Long addedMoneyTotalFlat;

    /** 障害本賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 83, byteLength = 9, correction = 100.0f)
    private java.lang.Long addedMoneyTotalObstacle;

    /** 平地付加賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 92, byteLength = 9, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalFlat;

    /** 障害付加賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 101, byteLength = 9, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalObstacle;

    /** 平地収得賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 110, byteLength = 9, correction = 100.0f)
    private java.lang.Long allMoneyTotalFlat;

    /** 障害収得賞金累計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 119, byteLength = 9, correction = 100.0f)
    private java.lang.Long allMoneyTotalObstacle;

    /** 総合着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 128, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTotalItems;

    /** 中央合計着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 146, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTotalJraItems;

    /** 芝直・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 164, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfStraightItems;

    /** 芝右・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 182, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfRightItems;

    /** 芝左・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 200, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfLeftItems;

    /** ダ直・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 218, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtStraightItems;

    /** ダ右・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 236, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtRightItems;

    /** ダ左・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 254, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtLeftItems;

    /** 障害・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 272, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleItems;

    /** 芝良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 290, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfFirmItems;

    /** 芝稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 308, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfGoodItems;

    /** 芝重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 326, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfYieldingItems;

    /** 芝不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 344, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfSoftItems;

    /** ダ良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 362, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtStandardItems;

    /** ダ稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 380, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtGoodItems;

    /** ダ重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 398, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtMuddyItems;

    /** ダ不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 416, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtSloppyItems;

    /** 障良・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 434, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleStandardItems;

    /** 障稍・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 452, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleGoodItems;

    /** 障重・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 470, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleMuddyItems;

    /** 障不・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 488, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleSloppyItems;

    /** 芝1200以下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 506, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1200Items;

    /** 芝1201-1400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 524, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1201To1400Items;

    /** 芝1401-1600・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 542, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1401To1600Items;

    /** 芝1601-1800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 560, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1601To1800Items;

    /** 芝1801-2000・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 578, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1801To2000Items;

    /** 芝2001-2200・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 596, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2001To2200Items;

    /** 芝2201-2400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 614, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2201To2400Items;

    /** 芝2401-2800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 632, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2401To2800Items;

    /** 芝2801以上・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 650, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2801Items;

    /** ダ1200以下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 668, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1200Items;

    /** ダ1201-1400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 686, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1201To1400Items;

    /** ダ1401-1600・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 704, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1401To1600Items;

    /** ダ1601-1800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 722, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1601To1800Items;

    /** ダ1801-2000・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 740, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1801To2000Items;

    /** ダ2001-2200・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 758, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2001To2200Items;

    /** ダ2201-2400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 776, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2201To2400Items;

    /** ダ2401-2800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 794, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2401To2800Items;

    /** ダ2801以上・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 812, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2801Items;

    /** 札幌芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 830, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfSapporoItems;

    /** 函館芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 848, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfHakodateItems;

    /** 福島芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 866, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfFukushimaItems;

    /** 新潟芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 884, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfNiigataItems;

    /** 東京芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 902, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfTokyoItems;

    /** 中山芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 920, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfNakayamaItems;

    /** 中京芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 938, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfChukyoItems;

    /** 京都芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 956, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfKyotoItems;

    /** 阪神芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 974, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfHanshinItems;

    /** 小倉芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 992, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfKokuraItems;

    /** 札幌ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1010, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtSapporoItems;

    /** 函館ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1028, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtHakodateItems;

    /** 福島ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1046, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtFukushimaItems;

    /** 新潟ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1064, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtNiigataItems;

    /** 東京ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1082, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtTokyoItems;

    /** 中山ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1100, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtNakayamaItems;

    /** 中京ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1118, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtChukyoItems;

    /** 京都ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1136, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtKyotoItems;

    /** 阪神ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1154, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtHanshinItems;

    /** 小倉ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1172, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtKokuraItems;

    /** 札幌障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1190, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleSapporoItems;

    /** 函館障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1208, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleHakodateItems;

    /** 福島障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1226, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleFukushimaItems;

    /** 新潟障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1244, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleNiigataItems;

    /** 東京障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1262, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleTokyoItems;

    /** 中山障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1280, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleNakayamaItems;

    /** 中京障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1298, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleChukyoItems;

    /** 京都障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1316, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleKyotoItems;

    /** 阪神障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1334, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleHanshinItems;

    /** 小倉障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1352, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleKokuraItems;

    /** 脚質傾向 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1370, byteLength = 3, repeatCount = 4)
    private java.util.List<java.lang.Integer> tacticInclinationItems;

    /** 登録レース数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1382, byteLength = 3)
    private java.lang.Integer registedRaceCount;

    /** 騎手コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1385, byteLength = 5)
    private java.lang.String jockeyCd;

    /** 騎手名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1390, byteLength = 34)
    private java.lang.String jockeyName;

    /** 騎手本年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1424, byteLength = 1220, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> jockeyTotalResultInfoItems;

    /** 調教師コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3864, byteLength = 5)
    private java.lang.String trainerCd;

    /** 調教師名 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3869, byteLength = 34)
    private java.lang.String trainerName;

    /** 調教師本年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 3903, byteLength = 1220, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> trainerTotalResultInfoItems;

    /** 馬主コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6343, byteLength = 6)
    private java.lang.String ownerCd;

    /** 馬主名(法人格有) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6349, byteLength = 64)
    private java.lang.String ownerNameWithCorp;

    /** 馬主名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6413, byteLength = 64)
    private java.lang.String ownerNameWithoutCorp;

    /** 生産者コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6597, byteLength = 6)
    private java.lang.String breederCd;

    /** 生産者名(法人格有) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6603, byteLength = 70)
    private java.lang.String breederNameWithCorp;

    /** 生産者名(法人格無) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6673, byteLength = 70)
    private java.lang.String breederNameWithoutCorp;

    /** 本年･累計成績情報 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 6743, byteLength = 60, repeatCount = 2)
    private java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> breederTotalResultInfoItems;


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
        return RaceResultDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 芝1200以下・着回数を返します。
     * @return 芝1200以下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1200Items() {
        return finishCountTurf1200Items;
    }

    /**
     * 芝1200以下・着回数を設定します。
     * @param finishCountTurf1200Items 芝1200以下・着回数
     */
    public void setFinishCountTurf1200Items(java.util.List<java.lang.Integer> finishCountTurf1200Items) {
        this.finishCountTurf1200Items = finishCountTurf1200Items;
    }

    /**
     * 芝1201-1400・着回数を返します。
     * @return 芝1201-1400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1201To1400Items() {
        return finishCountTurf1201To1400Items;
    }

    /**
     * 芝1201-1400・着回数を設定します。
     * @param finishCountTurf1201To1400Items 芝1201-1400・着回数
     */
    public void setFinishCountTurf1201To1400Items(java.util.List<java.lang.Integer> finishCountTurf1201To1400Items) {
        this.finishCountTurf1201To1400Items = finishCountTurf1201To1400Items;
    }

    /**
     * 芝1401-1600・着回数を返します。
     * @return 芝1401-1600・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1401To1600Items() {
        return finishCountTurf1401To1600Items;
    }

    /**
     * 芝1401-1600・着回数を設定します。
     * @param finishCountTurf1401To1600Items 芝1401-1600・着回数
     */
    public void setFinishCountTurf1401To1600Items(java.util.List<java.lang.Integer> finishCountTurf1401To1600Items) {
        this.finishCountTurf1401To1600Items = finishCountTurf1401To1600Items;
    }

    /**
     * 芝1601-1800・着回数を返します。
     * @return 芝1601-1800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1601To1800Items() {
        return finishCountTurf1601To1800Items;
    }

    /**
     * 芝1601-1800・着回数を設定します。
     * @param finishCountTurf1601To1800Items 芝1601-1800・着回数
     */
    public void setFinishCountTurf1601To1800Items(java.util.List<java.lang.Integer> finishCountTurf1601To1800Items) {
        this.finishCountTurf1601To1800Items = finishCountTurf1601To1800Items;
    }

    /**
     * 芝1801-2000・着回数を返します。
     * @return 芝1801-2000・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1801To2000Items() {
        return finishCountTurf1801To2000Items;
    }

    /**
     * 芝1801-2000・着回数を設定します。
     * @param finishCountTurf1801To2000Items 芝1801-2000・着回数
     */
    public void setFinishCountTurf1801To2000Items(java.util.List<java.lang.Integer> finishCountTurf1801To2000Items) {
        this.finishCountTurf1801To2000Items = finishCountTurf1801To2000Items;
    }

    /**
     * 芝2001-2200・着回数を返します。
     * @return 芝2001-2200・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2001To2200Items() {
        return finishCountTurf2001To2200Items;
    }

    /**
     * 芝2001-2200・着回数を設定します。
     * @param finishCountTurf2001To2200Items 芝2001-2200・着回数
     */
    public void setFinishCountTurf2001To2200Items(java.util.List<java.lang.Integer> finishCountTurf2001To2200Items) {
        this.finishCountTurf2001To2200Items = finishCountTurf2001To2200Items;
    }

    /**
     * 芝2201-2400・着回数を返します。
     * @return 芝2201-2400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2201To2400Items() {
        return finishCountTurf2201To2400Items;
    }

    /**
     * 芝2201-2400・着回数を設定します。
     * @param finishCountTurf2201To2400Items 芝2201-2400・着回数
     */
    public void setFinishCountTurf2201To2400Items(java.util.List<java.lang.Integer> finishCountTurf2201To2400Items) {
        this.finishCountTurf2201To2400Items = finishCountTurf2201To2400Items;
    }

    /**
     * 芝2401-2800・着回数を返します。
     * @return 芝2401-2800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2401To2800Items() {
        return finishCountTurf2401To2800Items;
    }

    /**
     * 芝2401-2800・着回数を設定します。
     * @param finishCountTurf2401To2800Items 芝2401-2800・着回数
     */
    public void setFinishCountTurf2401To2800Items(java.util.List<java.lang.Integer> finishCountTurf2401To2800Items) {
        this.finishCountTurf2401To2800Items = finishCountTurf2401To2800Items;
    }

    /**
     * 芝2801以上・着回数を返します。
     * @return 芝2801以上・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2801Items() {
        return finishCountTurf2801Items;
    }

    /**
     * 芝2801以上・着回数を設定します。
     * @param finishCountTurf2801Items 芝2801以上・着回数
     */
    public void setFinishCountTurf2801Items(java.util.List<java.lang.Integer> finishCountTurf2801Items) {
        this.finishCountTurf2801Items = finishCountTurf2801Items;
    }

    /**
     * ダ1200以下・着回数を返します。
     * @return ダ1200以下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1200Items() {
        return finishCountDirt1200Items;
    }

    /**
     * ダ1200以下・着回数を設定します。
     * @param finishCountDirt1200Items ダ1200以下・着回数
     */
    public void setFinishCountDirt1200Items(java.util.List<java.lang.Integer> finishCountDirt1200Items) {
        this.finishCountDirt1200Items = finishCountDirt1200Items;
    }

    /**
     * ダ1201-1400・着回数を返します。
     * @return ダ1201-1400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1201To1400Items() {
        return finishCountDirt1201To1400Items;
    }

    /**
     * ダ1201-1400・着回数を設定します。
     * @param finishCountDirt1201To1400Items ダ1201-1400・着回数
     */
    public void setFinishCountDirt1201To1400Items(java.util.List<java.lang.Integer> finishCountDirt1201To1400Items) {
        this.finishCountDirt1201To1400Items = finishCountDirt1201To1400Items;
    }

    /**
     * ダ1401-1600・着回数を返します。
     * @return ダ1401-1600・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1401To1600Items() {
        return finishCountDirt1401To1600Items;
    }

    /**
     * ダ1401-1600・着回数を設定します。
     * @param finishCountDirt1401To1600Items ダ1401-1600・着回数
     */
    public void setFinishCountDirt1401To1600Items(java.util.List<java.lang.Integer> finishCountDirt1401To1600Items) {
        this.finishCountDirt1401To1600Items = finishCountDirt1401To1600Items;
    }

    /**
     * ダ1601-1800・着回数を返します。
     * @return ダ1601-1800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1601To1800Items() {
        return finishCountDirt1601To1800Items;
    }

    /**
     * ダ1601-1800・着回数を設定します。
     * @param finishCountDirt1601To1800Items ダ1601-1800・着回数
     */
    public void setFinishCountDirt1601To1800Items(java.util.List<java.lang.Integer> finishCountDirt1601To1800Items) {
        this.finishCountDirt1601To1800Items = finishCountDirt1601To1800Items;
    }

    /**
     * ダ1801-2000・着回数を返します。
     * @return ダ1801-2000・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1801To2000Items() {
        return finishCountDirt1801To2000Items;
    }

    /**
     * ダ1801-2000・着回数を設定します。
     * @param finishCountDirt1801To2000Items ダ1801-2000・着回数
     */
    public void setFinishCountDirt1801To2000Items(java.util.List<java.lang.Integer> finishCountDirt1801To2000Items) {
        this.finishCountDirt1801To2000Items = finishCountDirt1801To2000Items;
    }

    /**
     * ダ2001-2200・着回数を返します。
     * @return ダ2001-2200・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2001To2200Items() {
        return finishCountDirt2001To2200Items;
    }

    /**
     * ダ2001-2200・着回数を設定します。
     * @param finishCountDirt2001To2200Items ダ2001-2200・着回数
     */
    public void setFinishCountDirt2001To2200Items(java.util.List<java.lang.Integer> finishCountDirt2001To2200Items) {
        this.finishCountDirt2001To2200Items = finishCountDirt2001To2200Items;
    }

    /**
     * ダ2201-2400・着回数を返します。
     * @return ダ2201-2400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2201To2400Items() {
        return finishCountDirt2201To2400Items;
    }

    /**
     * ダ2201-2400・着回数を設定します。
     * @param finishCountDirt2201To2400Items ダ2201-2400・着回数
     */
    public void setFinishCountDirt2201To2400Items(java.util.List<java.lang.Integer> finishCountDirt2201To2400Items) {
        this.finishCountDirt2201To2400Items = finishCountDirt2201To2400Items;
    }

    /**
     * ダ2401-2800・着回数を返します。
     * @return ダ2401-2800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2401To2800Items() {
        return finishCountDirt2401To2800Items;
    }

    /**
     * ダ2401-2800・着回数を設定します。
     * @param finishCountDirt2401To2800Items ダ2401-2800・着回数
     */
    public void setFinishCountDirt2401To2800Items(java.util.List<java.lang.Integer> finishCountDirt2401To2800Items) {
        this.finishCountDirt2401To2800Items = finishCountDirt2401To2800Items;
    }

    /**
     * ダ2801以上・着回数を返します。
     * @return ダ2801以上・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2801Items() {
        return finishCountDirt2801Items;
    }

    /**
     * ダ2801以上・着回数を設定します。
     * @param finishCountDirt2801Items ダ2801以上・着回数
     */
    public void setFinishCountDirt2801Items(java.util.List<java.lang.Integer> finishCountDirt2801Items) {
        this.finishCountDirt2801Items = finishCountDirt2801Items;
    }

    /**
     * 札幌芝・着回数を返します。
     * @return 札幌芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfSapporoItems() {
        return finishCountTurfSapporoItems;
    }

    /**
     * 札幌芝・着回数を設定します。
     * @param finishCountTurfSapporoItems 札幌芝・着回数
     */
    public void setFinishCountTurfSapporoItems(java.util.List<java.lang.Integer> finishCountTurfSapporoItems) {
        this.finishCountTurfSapporoItems = finishCountTurfSapporoItems;
    }

    /**
     * 函館芝・着回数を返します。
     * @return 函館芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfHakodateItems() {
        return finishCountTurfHakodateItems;
    }

    /**
     * 函館芝・着回数を設定します。
     * @param finishCountTurfHakodateItems 函館芝・着回数
     */
    public void setFinishCountTurfHakodateItems(java.util.List<java.lang.Integer> finishCountTurfHakodateItems) {
        this.finishCountTurfHakodateItems = finishCountTurfHakodateItems;
    }

    /**
     * 福島芝・着回数を返します。
     * @return 福島芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfFukushimaItems() {
        return finishCountTurfFukushimaItems;
    }

    /**
     * 福島芝・着回数を設定します。
     * @param finishCountTurfFukushimaItems 福島芝・着回数
     */
    public void setFinishCountTurfFukushimaItems(java.util.List<java.lang.Integer> finishCountTurfFukushimaItems) {
        this.finishCountTurfFukushimaItems = finishCountTurfFukushimaItems;
    }

    /**
     * 新潟芝・着回数を返します。
     * @return 新潟芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfNiigataItems() {
        return finishCountTurfNiigataItems;
    }

    /**
     * 新潟芝・着回数を設定します。
     * @param finishCountTurfNiigataItems 新潟芝・着回数
     */
    public void setFinishCountTurfNiigataItems(java.util.List<java.lang.Integer> finishCountTurfNiigataItems) {
        this.finishCountTurfNiigataItems = finishCountTurfNiigataItems;
    }

    /**
     * 東京芝・着回数を返します。
     * @return 東京芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfTokyoItems() {
        return finishCountTurfTokyoItems;
    }

    /**
     * 東京芝・着回数を設定します。
     * @param finishCountTurfTokyoItems 東京芝・着回数
     */
    public void setFinishCountTurfTokyoItems(java.util.List<java.lang.Integer> finishCountTurfTokyoItems) {
        this.finishCountTurfTokyoItems = finishCountTurfTokyoItems;
    }

    /**
     * 中山芝・着回数を返します。
     * @return 中山芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfNakayamaItems() {
        return finishCountTurfNakayamaItems;
    }

    /**
     * 中山芝・着回数を設定します。
     * @param finishCountTurfNakayamaItems 中山芝・着回数
     */
    public void setFinishCountTurfNakayamaItems(java.util.List<java.lang.Integer> finishCountTurfNakayamaItems) {
        this.finishCountTurfNakayamaItems = finishCountTurfNakayamaItems;
    }

    /**
     * 中京芝・着回数を返します。
     * @return 中京芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfChukyoItems() {
        return finishCountTurfChukyoItems;
    }

    /**
     * 中京芝・着回数を設定します。
     * @param finishCountTurfChukyoItems 中京芝・着回数
     */
    public void setFinishCountTurfChukyoItems(java.util.List<java.lang.Integer> finishCountTurfChukyoItems) {
        this.finishCountTurfChukyoItems = finishCountTurfChukyoItems;
    }

    /**
     * 京都芝・着回数を返します。
     * @return 京都芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfKyotoItems() {
        return finishCountTurfKyotoItems;
    }

    /**
     * 京都芝・着回数を設定します。
     * @param finishCountTurfKyotoItems 京都芝・着回数
     */
    public void setFinishCountTurfKyotoItems(java.util.List<java.lang.Integer> finishCountTurfKyotoItems) {
        this.finishCountTurfKyotoItems = finishCountTurfKyotoItems;
    }

    /**
     * 阪神芝・着回数を返します。
     * @return 阪神芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfHanshinItems() {
        return finishCountTurfHanshinItems;
    }

    /**
     * 阪神芝・着回数を設定します。
     * @param finishCountTurfHanshinItems 阪神芝・着回数
     */
    public void setFinishCountTurfHanshinItems(java.util.List<java.lang.Integer> finishCountTurfHanshinItems) {
        this.finishCountTurfHanshinItems = finishCountTurfHanshinItems;
    }

    /**
     * 小倉芝・着回数を返します。
     * @return 小倉芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfKokuraItems() {
        return finishCountTurfKokuraItems;
    }

    /**
     * 小倉芝・着回数を設定します。
     * @param finishCountTurfKokuraItems 小倉芝・着回数
     */
    public void setFinishCountTurfKokuraItems(java.util.List<java.lang.Integer> finishCountTurfKokuraItems) {
        this.finishCountTurfKokuraItems = finishCountTurfKokuraItems;
    }

    /**
     * 札幌ダ・着回数を返します。
     * @return 札幌ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtSapporoItems() {
        return finishCountDirtSapporoItems;
    }

    /**
     * 札幌ダ・着回数を設定します。
     * @param finishCountDirtSapporoItems 札幌ダ・着回数
     */
    public void setFinishCountDirtSapporoItems(java.util.List<java.lang.Integer> finishCountDirtSapporoItems) {
        this.finishCountDirtSapporoItems = finishCountDirtSapporoItems;
    }

    /**
     * 函館ダ・着回数を返します。
     * @return 函館ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtHakodateItems() {
        return finishCountDirtHakodateItems;
    }

    /**
     * 函館ダ・着回数を設定します。
     * @param finishCountDirtHakodateItems 函館ダ・着回数
     */
    public void setFinishCountDirtHakodateItems(java.util.List<java.lang.Integer> finishCountDirtHakodateItems) {
        this.finishCountDirtHakodateItems = finishCountDirtHakodateItems;
    }

    /**
     * 福島ダ・着回数を返します。
     * @return 福島ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtFukushimaItems() {
        return finishCountDirtFukushimaItems;
    }

    /**
     * 福島ダ・着回数を設定します。
     * @param finishCountDirtFukushimaItems 福島ダ・着回数
     */
    public void setFinishCountDirtFukushimaItems(java.util.List<java.lang.Integer> finishCountDirtFukushimaItems) {
        this.finishCountDirtFukushimaItems = finishCountDirtFukushimaItems;
    }

    /**
     * 新潟ダ・着回数を返します。
     * @return 新潟ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtNiigataItems() {
        return finishCountDirtNiigataItems;
    }

    /**
     * 新潟ダ・着回数を設定します。
     * @param finishCountDirtNiigataItems 新潟ダ・着回数
     */
    public void setFinishCountDirtNiigataItems(java.util.List<java.lang.Integer> finishCountDirtNiigataItems) {
        this.finishCountDirtNiigataItems = finishCountDirtNiigataItems;
    }

    /**
     * 東京ダ・着回数を返します。
     * @return 東京ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtTokyoItems() {
        return finishCountDirtTokyoItems;
    }

    /**
     * 東京ダ・着回数を設定します。
     * @param finishCountDirtTokyoItems 東京ダ・着回数
     */
    public void setFinishCountDirtTokyoItems(java.util.List<java.lang.Integer> finishCountDirtTokyoItems) {
        this.finishCountDirtTokyoItems = finishCountDirtTokyoItems;
    }

    /**
     * 中山ダ・着回数を返します。
     * @return 中山ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtNakayamaItems() {
        return finishCountDirtNakayamaItems;
    }

    /**
     * 中山ダ・着回数を設定します。
     * @param finishCountDirtNakayamaItems 中山ダ・着回数
     */
    public void setFinishCountDirtNakayamaItems(java.util.List<java.lang.Integer> finishCountDirtNakayamaItems) {
        this.finishCountDirtNakayamaItems = finishCountDirtNakayamaItems;
    }

    /**
     * 中京ダ・着回数を返します。
     * @return 中京ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtChukyoItems() {
        return finishCountDirtChukyoItems;
    }

    /**
     * 中京ダ・着回数を設定します。
     * @param finishCountDirtChukyoItems 中京ダ・着回数
     */
    public void setFinishCountDirtChukyoItems(java.util.List<java.lang.Integer> finishCountDirtChukyoItems) {
        this.finishCountDirtChukyoItems = finishCountDirtChukyoItems;
    }

    /**
     * 京都ダ・着回数を返します。
     * @return 京都ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtKyotoItems() {
        return finishCountDirtKyotoItems;
    }

    /**
     * 京都ダ・着回数を設定します。
     * @param finishCountDirtKyotoItems 京都ダ・着回数
     */
    public void setFinishCountDirtKyotoItems(java.util.List<java.lang.Integer> finishCountDirtKyotoItems) {
        this.finishCountDirtKyotoItems = finishCountDirtKyotoItems;
    }

    /**
     * 阪神ダ・着回数を返します。
     * @return 阪神ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtHanshinItems() {
        return finishCountDirtHanshinItems;
    }

    /**
     * 阪神ダ・着回数を設定します。
     * @param finishCountDirtHanshinItems 阪神ダ・着回数
     */
    public void setFinishCountDirtHanshinItems(java.util.List<java.lang.Integer> finishCountDirtHanshinItems) {
        this.finishCountDirtHanshinItems = finishCountDirtHanshinItems;
    }

    /**
     * 小倉ダ・着回数を返します。
     * @return 小倉ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtKokuraItems() {
        return finishCountDirtKokuraItems;
    }

    /**
     * 小倉ダ・着回数を設定します。
     * @param finishCountDirtKokuraItems 小倉ダ・着回数
     */
    public void setFinishCountDirtKokuraItems(java.util.List<java.lang.Integer> finishCountDirtKokuraItems) {
        this.finishCountDirtKokuraItems = finishCountDirtKokuraItems;
    }

    /**
     * 札幌障・着回数を返します。
     * @return 札幌障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleSapporoItems() {
        return finishCountObstacleSapporoItems;
    }

    /**
     * 札幌障・着回数を設定します。
     * @param finishCountObstacleSapporoItems 札幌障・着回数
     */
    public void setFinishCountObstacleSapporoItems(java.util.List<java.lang.Integer> finishCountObstacleSapporoItems) {
        this.finishCountObstacleSapporoItems = finishCountObstacleSapporoItems;
    }

    /**
     * 函館障・着回数を返します。
     * @return 函館障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleHakodateItems() {
        return finishCountObstacleHakodateItems;
    }

    /**
     * 函館障・着回数を設定します。
     * @param finishCountObstacleHakodateItems 函館障・着回数
     */
    public void setFinishCountObstacleHakodateItems(java.util.List<java.lang.Integer> finishCountObstacleHakodateItems) {
        this.finishCountObstacleHakodateItems = finishCountObstacleHakodateItems;
    }

    /**
     * 福島障・着回数を返します。
     * @return 福島障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleFukushimaItems() {
        return finishCountObstacleFukushimaItems;
    }

    /**
     * 福島障・着回数を設定します。
     * @param finishCountObstacleFukushimaItems 福島障・着回数
     */
    public void setFinishCountObstacleFukushimaItems(java.util.List<java.lang.Integer> finishCountObstacleFukushimaItems) {
        this.finishCountObstacleFukushimaItems = finishCountObstacleFukushimaItems;
    }

    /**
     * 新潟障・着回数を返します。
     * @return 新潟障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleNiigataItems() {
        return finishCountObstacleNiigataItems;
    }

    /**
     * 新潟障・着回数を設定します。
     * @param finishCountObstacleNiigataItems 新潟障・着回数
     */
    public void setFinishCountObstacleNiigataItems(java.util.List<java.lang.Integer> finishCountObstacleNiigataItems) {
        this.finishCountObstacleNiigataItems = finishCountObstacleNiigataItems;
    }

    /**
     * 東京障・着回数を返します。
     * @return 東京障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleTokyoItems() {
        return finishCountObstacleTokyoItems;
    }

    /**
     * 東京障・着回数を設定します。
     * @param finishCountObstacleTokyoItems 東京障・着回数
     */
    public void setFinishCountObstacleTokyoItems(java.util.List<java.lang.Integer> finishCountObstacleTokyoItems) {
        this.finishCountObstacleTokyoItems = finishCountObstacleTokyoItems;
    }

    /**
     * 中山障・着回数を返します。
     * @return 中山障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleNakayamaItems() {
        return finishCountObstacleNakayamaItems;
    }

    /**
     * 中山障・着回数を設定します。
     * @param finishCountObstacleNakayamaItems 中山障・着回数
     */
    public void setFinishCountObstacleNakayamaItems(java.util.List<java.lang.Integer> finishCountObstacleNakayamaItems) {
        this.finishCountObstacleNakayamaItems = finishCountObstacleNakayamaItems;
    }

    /**
     * 中京障・着回数を返します。
     * @return 中京障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleChukyoItems() {
        return finishCountObstacleChukyoItems;
    }

    /**
     * 中京障・着回数を設定します。
     * @param finishCountObstacleChukyoItems 中京障・着回数
     */
    public void setFinishCountObstacleChukyoItems(java.util.List<java.lang.Integer> finishCountObstacleChukyoItems) {
        this.finishCountObstacleChukyoItems = finishCountObstacleChukyoItems;
    }

    /**
     * 京都障・着回数を返します。
     * @return 京都障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleKyotoItems() {
        return finishCountObstacleKyotoItems;
    }

    /**
     * 京都障・着回数を設定します。
     * @param finishCountObstacleKyotoItems 京都障・着回数
     */
    public void setFinishCountObstacleKyotoItems(java.util.List<java.lang.Integer> finishCountObstacleKyotoItems) {
        this.finishCountObstacleKyotoItems = finishCountObstacleKyotoItems;
    }

    /**
     * 阪神障・着回数を返します。
     * @return 阪神障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleHanshinItems() {
        return finishCountObstacleHanshinItems;
    }

    /**
     * 阪神障・着回数を設定します。
     * @param finishCountObstacleHanshinItems 阪神障・着回数
     */
    public void setFinishCountObstacleHanshinItems(java.util.List<java.lang.Integer> finishCountObstacleHanshinItems) {
        this.finishCountObstacleHanshinItems = finishCountObstacleHanshinItems;
    }

    /**
     * 小倉障・着回数を返します。
     * @return 小倉障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleKokuraItems() {
        return finishCountObstacleKokuraItems;
    }

    /**
     * 小倉障・着回数を設定します。
     * @param finishCountObstacleKokuraItems 小倉障・着回数
     */
    public void setFinishCountObstacleKokuraItems(java.util.List<java.lang.Integer> finishCountObstacleKokuraItems) {
        this.finishCountObstacleKokuraItems = finishCountObstacleKokuraItems;
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
     * 騎手本年･累計成績情報を返します。
     * @return 騎手本年･累計成績情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> getJockeyTotalResultInfoItems() {
        return jockeyTotalResultInfoItems;
    }

    /**
     * 騎手本年･累計成績情報を設定します。
     * @param jockeyTotalResultInfoItems 騎手本年･累計成績情報
     */
    public void setJockeyTotalResultInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> jockeyTotalResultInfoItems) {
        this.jockeyTotalResultInfoItems = jockeyTotalResultInfoItems;
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
     * 調教師本年･累計成績情報を返します。
     * @return 調教師本年･累計成績情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> getTrainerTotalResultInfoItems() {
        return trainerTotalResultInfoItems;
    }

    /**
     * 調教師本年･累計成績情報を設定します。
     * @param trainerTotalResultInfoItems 調教師本年･累計成績情報
     */
    public void setTrainerTotalResultInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoDto> trainerTotalResultInfoItems) {
        this.trainerTotalResultInfoItems = trainerTotalResultInfoItems;
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
     * 生産者名(法人格有)を返します。
     * @return 生産者名(法人格有)
     */
    public java.lang.String getBreederNameWithCorp() {
        return breederNameWithCorp;
    }

    /**
     * 生産者名(法人格有)を設定します。
     * @param breederNameWithCorp 生産者名(法人格有)
     */
    public void setBreederNameWithCorp(java.lang.String breederNameWithCorp) {
        this.breederNameWithCorp = breederNameWithCorp;
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
     * 本年･累計成績情報を返します。
     * @return 本年･累計成績情報
     */
    public java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> getBreederTotalResultInfoItems() {
        return breederTotalResultInfoItems;
    }

    /**
     * 本年･累計成績情報を設定します。
     * @param breederTotalResultInfoItems 本年･累計成績情報
     */
    public void setBreederTotalResultInfoItems(java.util.List<org.stormcat.jvbeans.jvlink.definitions.dto.child.TotalResultInfoSimpleDto> breederTotalResultInfoItems) {
        this.breederTotalResultInfoItems = breederTotalResultInfoItems;
    }

}