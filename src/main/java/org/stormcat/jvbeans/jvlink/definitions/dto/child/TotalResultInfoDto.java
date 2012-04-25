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
package org.stormcat.jvbeans.jvlink.definitions.dto.child;

 /**
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public class TotalResultInfoDto {

    /** 　　設定年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 4)
    private java.lang.Integer settingYear;

    /** 　　平地本賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 5, byteLength = 10)
    private java.lang.String addedMoneyTotalFlat;

    /** 　　障害本賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 15, byteLength = 10)
    private java.lang.String addedMoneyTotalObstacle;

    /** 　　平地付加賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 25, byteLength = 10)
    private java.lang.String stakesMoneyTotalFlat;

    /** 　　障害付加賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 10)
    private java.lang.String stakesMoneyTotalObstacle;

    /** 　　芝着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 45, byteLength = 5, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfItems;

    /** 　　ダート着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 75, byteLength = 5, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtItems;

    /** 　　障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 105, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleItems;

    /** 　　芝1200以下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 129, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1200Items;

    /** 　　芝1201-1400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 153, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1201To1400Items;

    /** 　　芝1401-1600・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 177, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1401To1600Items;

    /** 　　芝1601-1800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 201, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1601To1800Items;

    /** 　　芝1801-2000・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 225, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1801To2000Items;

    /** 　　芝2001-2200・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 249, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2001To2200Items;

    /** 　　芝2201-2400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 273, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2201To2400Items;

    /** 　　芝2401-2800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 297, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2401To2800Items;

    /** 　　芝2801以上・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 321, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2801Items;

    /** 　　ダ1200以下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 345, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1200Items;

    /** 　　ダ1201-1400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 369, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1201To1400Items;

    /** 　　ダ1401-1600・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 393, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1401To1600Items;

    /** 　　ダ1601-1800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 417, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1601To1800Items;

    /** 　　ダ1801-2000・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 441, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1801To2000Items;

    /** 　　ダ2001-2200・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 465, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2001To2200Items;

    /** 　　ダ2201-2400・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 489, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2201To2400Items;

    /** 　　ダ2401-2800・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 513, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2401To2800Items;

    /** 　　ダ2801以上・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 537, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2801Items;

    /** 　　札幌芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 561, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfSapporoItems;

    /** 　　函館芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 585, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfHakodateItems;

    /** 　　福島芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 609, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfFukushimaItems;

    /** 　　新潟芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 633, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfNiigataItems;

    /** 　　東京芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 657, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfTokyoItems;

    /** 　　中山芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 681, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfNakayamaItems;

    /** 　　中京芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 705, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfChukyoItems;

    /** 　　京都芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 729, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfKyotoItems;

    /** 　　阪神芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 753, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfHanshinItems;

    /** 　　小倉芝・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 777, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurfKokuraItems;

    /** 　　札幌ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 801, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtSapporoItems;

    /** 　　函館ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 825, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtHakodateItems;

    /** 　　福島ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 849, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtFukushimaItems;

    /** 　　新潟ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 873, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtNiigataItems;

    /** 　　東京ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 897, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtTokyoItems;

    /** 　　中山ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 921, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtNakayamaItems;

    /** 　　中京ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 945, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtChukyoItems;

    /** 　　京都ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 969, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtKyotoItems;

    /** 　　阪神ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 993, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtHanshinItems;

    /** 　　小倉ダ・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1017, byteLength = 4, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirtKokuraItems;

    /** 　　札幌障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1041, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleSapporoItems;

    /** 　　函館障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1059, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleHakodateItems;

    /** 　　福島障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1077, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleFukushimaItems;

    /** 　　新潟障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1095, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleNiigataItems;

    /** 　　東京障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1113, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleTokyoItems;

    /** 　　中山障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1131, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleNakayamaItems;

    /** 　　中京障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1149, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleChukyoItems;

    /** 　　京都障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1167, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleKyotoItems;

    /** 　　阪神障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1185, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleHanshinItems;

    /** 　　小倉障・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1203, byteLength = 3, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleKokuraItems;


    /**
     * 　　設定年を返します。
     * @return 　　設定年
     */
    public java.lang.Integer getSettingYear() {
        return settingYear;
    }

    /**
     * 　　設定年を設定します。
     * @param settingYear 　　設定年
     */
    public void setSettingYear(java.lang.Integer settingYear) {
        this.settingYear = settingYear;
    }

    /**
     * 　　平地本賞金合計を返します。
     * @return 　　平地本賞金合計
     */
    public java.lang.String getAddedMoneyTotalFlat() {
        return addedMoneyTotalFlat;
    }

    /**
     * 　　平地本賞金合計を設定します。
     * @param addedMoneyTotalFlat 　　平地本賞金合計
     */
    public void setAddedMoneyTotalFlat(java.lang.String addedMoneyTotalFlat) {
        this.addedMoneyTotalFlat = addedMoneyTotalFlat;
    }

    /**
     * 　　障害本賞金合計を返します。
     * @return 　　障害本賞金合計
     */
    public java.lang.String getAddedMoneyTotalObstacle() {
        return addedMoneyTotalObstacle;
    }

    /**
     * 　　障害本賞金合計を設定します。
     * @param addedMoneyTotalObstacle 　　障害本賞金合計
     */
    public void setAddedMoneyTotalObstacle(java.lang.String addedMoneyTotalObstacle) {
        this.addedMoneyTotalObstacle = addedMoneyTotalObstacle;
    }

    /**
     * 　　平地付加賞金合計を返します。
     * @return 　　平地付加賞金合計
     */
    public java.lang.String getStakesMoneyTotalFlat() {
        return stakesMoneyTotalFlat;
    }

    /**
     * 　　平地付加賞金合計を設定します。
     * @param stakesMoneyTotalFlat 　　平地付加賞金合計
     */
    public void setStakesMoneyTotalFlat(java.lang.String stakesMoneyTotalFlat) {
        this.stakesMoneyTotalFlat = stakesMoneyTotalFlat;
    }

    /**
     * 　　障害付加賞金合計を返します。
     * @return 　　障害付加賞金合計
     */
    public java.lang.String getStakesMoneyTotalObstacle() {
        return stakesMoneyTotalObstacle;
    }

    /**
     * 　　障害付加賞金合計を設定します。
     * @param stakesMoneyTotalObstacle 　　障害付加賞金合計
     */
    public void setStakesMoneyTotalObstacle(java.lang.String stakesMoneyTotalObstacle) {
        this.stakesMoneyTotalObstacle = stakesMoneyTotalObstacle;
    }

    /**
     * 　　芝着回数を返します。
     * @return 　　芝着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfItems() {
        return finishCountTurfItems;
    }

    /**
     * 　　芝着回数を設定します。
     * @param finishCountTurfItems 　　芝着回数
     */
    public void setFinishCountTurfItems(java.util.List<java.lang.Integer> finishCountTurfItems) {
        this.finishCountTurfItems = finishCountTurfItems;
    }

    /**
     * 　　ダート着回数を返します。
     * @return 　　ダート着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtItems() {
        return finishCountDirtItems;
    }

    /**
     * 　　ダート着回数を設定します。
     * @param finishCountDirtItems 　　ダート着回数
     */
    public void setFinishCountDirtItems(java.util.List<java.lang.Integer> finishCountDirtItems) {
        this.finishCountDirtItems = finishCountDirtItems;
    }

    /**
     * 　　障害着回数を返します。
     * @return 　　障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleItems() {
        return finishCountObstacleItems;
    }

    /**
     * 　　障害着回数を設定します。
     * @param finishCountObstacleItems 　　障害着回数
     */
    public void setFinishCountObstacleItems(java.util.List<java.lang.Integer> finishCountObstacleItems) {
        this.finishCountObstacleItems = finishCountObstacleItems;
    }

    /**
     * 　　芝1200以下・着回数を返します。
     * @return 　　芝1200以下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1200Items() {
        return finishCountTurf1200Items;
    }

    /**
     * 　　芝1200以下・着回数を設定します。
     * @param finishCountTurf1200Items 　　芝1200以下・着回数
     */
    public void setFinishCountTurf1200Items(java.util.List<java.lang.Integer> finishCountTurf1200Items) {
        this.finishCountTurf1200Items = finishCountTurf1200Items;
    }

    /**
     * 　　芝1201-1400・着回数を返します。
     * @return 　　芝1201-1400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1201To1400Items() {
        return finishCountTurf1201To1400Items;
    }

    /**
     * 　　芝1201-1400・着回数を設定します。
     * @param finishCountTurf1201To1400Items 　　芝1201-1400・着回数
     */
    public void setFinishCountTurf1201To1400Items(java.util.List<java.lang.Integer> finishCountTurf1201To1400Items) {
        this.finishCountTurf1201To1400Items = finishCountTurf1201To1400Items;
    }

    /**
     * 　　芝1401-1600・着回数を返します。
     * @return 　　芝1401-1600・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1401To1600Items() {
        return finishCountTurf1401To1600Items;
    }

    /**
     * 　　芝1401-1600・着回数を設定します。
     * @param finishCountTurf1401To1600Items 　　芝1401-1600・着回数
     */
    public void setFinishCountTurf1401To1600Items(java.util.List<java.lang.Integer> finishCountTurf1401To1600Items) {
        this.finishCountTurf1401To1600Items = finishCountTurf1401To1600Items;
    }

    /**
     * 　　芝1601-1800・着回数を返します。
     * @return 　　芝1601-1800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1601To1800Items() {
        return finishCountTurf1601To1800Items;
    }

    /**
     * 　　芝1601-1800・着回数を設定します。
     * @param finishCountTurf1601To1800Items 　　芝1601-1800・着回数
     */
    public void setFinishCountTurf1601To1800Items(java.util.List<java.lang.Integer> finishCountTurf1601To1800Items) {
        this.finishCountTurf1601To1800Items = finishCountTurf1601To1800Items;
    }

    /**
     * 　　芝1801-2000・着回数を返します。
     * @return 　　芝1801-2000・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1801To2000Items() {
        return finishCountTurf1801To2000Items;
    }

    /**
     * 　　芝1801-2000・着回数を設定します。
     * @param finishCountTurf1801To2000Items 　　芝1801-2000・着回数
     */
    public void setFinishCountTurf1801To2000Items(java.util.List<java.lang.Integer> finishCountTurf1801To2000Items) {
        this.finishCountTurf1801To2000Items = finishCountTurf1801To2000Items;
    }

    /**
     * 　　芝2001-2200・着回数を返します。
     * @return 　　芝2001-2200・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2001To2200Items() {
        return finishCountTurf2001To2200Items;
    }

    /**
     * 　　芝2001-2200・着回数を設定します。
     * @param finishCountTurf2001To2200Items 　　芝2001-2200・着回数
     */
    public void setFinishCountTurf2001To2200Items(java.util.List<java.lang.Integer> finishCountTurf2001To2200Items) {
        this.finishCountTurf2001To2200Items = finishCountTurf2001To2200Items;
    }

    /**
     * 　　芝2201-2400・着回数を返します。
     * @return 　　芝2201-2400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2201To2400Items() {
        return finishCountTurf2201To2400Items;
    }

    /**
     * 　　芝2201-2400・着回数を設定します。
     * @param finishCountTurf2201To2400Items 　　芝2201-2400・着回数
     */
    public void setFinishCountTurf2201To2400Items(java.util.List<java.lang.Integer> finishCountTurf2201To2400Items) {
        this.finishCountTurf2201To2400Items = finishCountTurf2201To2400Items;
    }

    /**
     * 　　芝2401-2800・着回数を返します。
     * @return 　　芝2401-2800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2401To2800Items() {
        return finishCountTurf2401To2800Items;
    }

    /**
     * 　　芝2401-2800・着回数を設定します。
     * @param finishCountTurf2401To2800Items 　　芝2401-2800・着回数
     */
    public void setFinishCountTurf2401To2800Items(java.util.List<java.lang.Integer> finishCountTurf2401To2800Items) {
        this.finishCountTurf2401To2800Items = finishCountTurf2401To2800Items;
    }

    /**
     * 　　芝2801以上・着回数を返します。
     * @return 　　芝2801以上・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2801Items() {
        return finishCountTurf2801Items;
    }

    /**
     * 　　芝2801以上・着回数を設定します。
     * @param finishCountTurf2801Items 　　芝2801以上・着回数
     */
    public void setFinishCountTurf2801Items(java.util.List<java.lang.Integer> finishCountTurf2801Items) {
        this.finishCountTurf2801Items = finishCountTurf2801Items;
    }

    /**
     * 　　ダ1200以下・着回数を返します。
     * @return 　　ダ1200以下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1200Items() {
        return finishCountDirt1200Items;
    }

    /**
     * 　　ダ1200以下・着回数を設定します。
     * @param finishCountDirt1200Items 　　ダ1200以下・着回数
     */
    public void setFinishCountDirt1200Items(java.util.List<java.lang.Integer> finishCountDirt1200Items) {
        this.finishCountDirt1200Items = finishCountDirt1200Items;
    }

    /**
     * 　　ダ1201-1400・着回数を返します。
     * @return 　　ダ1201-1400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1201To1400Items() {
        return finishCountDirt1201To1400Items;
    }

    /**
     * 　　ダ1201-1400・着回数を設定します。
     * @param finishCountDirt1201To1400Items 　　ダ1201-1400・着回数
     */
    public void setFinishCountDirt1201To1400Items(java.util.List<java.lang.Integer> finishCountDirt1201To1400Items) {
        this.finishCountDirt1201To1400Items = finishCountDirt1201To1400Items;
    }

    /**
     * 　　ダ1401-1600・着回数を返します。
     * @return 　　ダ1401-1600・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1401To1600Items() {
        return finishCountDirt1401To1600Items;
    }

    /**
     * 　　ダ1401-1600・着回数を設定します。
     * @param finishCountDirt1401To1600Items 　　ダ1401-1600・着回数
     */
    public void setFinishCountDirt1401To1600Items(java.util.List<java.lang.Integer> finishCountDirt1401To1600Items) {
        this.finishCountDirt1401To1600Items = finishCountDirt1401To1600Items;
    }

    /**
     * 　　ダ1601-1800・着回数を返します。
     * @return 　　ダ1601-1800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1601To1800Items() {
        return finishCountDirt1601To1800Items;
    }

    /**
     * 　　ダ1601-1800・着回数を設定します。
     * @param finishCountDirt1601To1800Items 　　ダ1601-1800・着回数
     */
    public void setFinishCountDirt1601To1800Items(java.util.List<java.lang.Integer> finishCountDirt1601To1800Items) {
        this.finishCountDirt1601To1800Items = finishCountDirt1601To1800Items;
    }

    /**
     * 　　ダ1801-2000・着回数を返します。
     * @return 　　ダ1801-2000・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1801To2000Items() {
        return finishCountDirt1801To2000Items;
    }

    /**
     * 　　ダ1801-2000・着回数を設定します。
     * @param finishCountDirt1801To2000Items 　　ダ1801-2000・着回数
     */
    public void setFinishCountDirt1801To2000Items(java.util.List<java.lang.Integer> finishCountDirt1801To2000Items) {
        this.finishCountDirt1801To2000Items = finishCountDirt1801To2000Items;
    }

    /**
     * 　　ダ2001-2200・着回数を返します。
     * @return 　　ダ2001-2200・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2001To2200Items() {
        return finishCountDirt2001To2200Items;
    }

    /**
     * 　　ダ2001-2200・着回数を設定します。
     * @param finishCountDirt2001To2200Items 　　ダ2001-2200・着回数
     */
    public void setFinishCountDirt2001To2200Items(java.util.List<java.lang.Integer> finishCountDirt2001To2200Items) {
        this.finishCountDirt2001To2200Items = finishCountDirt2001To2200Items;
    }

    /**
     * 　　ダ2201-2400・着回数を返します。
     * @return 　　ダ2201-2400・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2201To2400Items() {
        return finishCountDirt2201To2400Items;
    }

    /**
     * 　　ダ2201-2400・着回数を設定します。
     * @param finishCountDirt2201To2400Items 　　ダ2201-2400・着回数
     */
    public void setFinishCountDirt2201To2400Items(java.util.List<java.lang.Integer> finishCountDirt2201To2400Items) {
        this.finishCountDirt2201To2400Items = finishCountDirt2201To2400Items;
    }

    /**
     * 　　ダ2401-2800・着回数を返します。
     * @return 　　ダ2401-2800・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2401To2800Items() {
        return finishCountDirt2401To2800Items;
    }

    /**
     * 　　ダ2401-2800・着回数を設定します。
     * @param finishCountDirt2401To2800Items 　　ダ2401-2800・着回数
     */
    public void setFinishCountDirt2401To2800Items(java.util.List<java.lang.Integer> finishCountDirt2401To2800Items) {
        this.finishCountDirt2401To2800Items = finishCountDirt2401To2800Items;
    }

    /**
     * 　　ダ2801以上・着回数を返します。
     * @return 　　ダ2801以上・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2801Items() {
        return finishCountDirt2801Items;
    }

    /**
     * 　　ダ2801以上・着回数を設定します。
     * @param finishCountDirt2801Items 　　ダ2801以上・着回数
     */
    public void setFinishCountDirt2801Items(java.util.List<java.lang.Integer> finishCountDirt2801Items) {
        this.finishCountDirt2801Items = finishCountDirt2801Items;
    }

    /**
     * 　　札幌芝・着回数を返します。
     * @return 　　札幌芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfSapporoItems() {
        return finishCountTurfSapporoItems;
    }

    /**
     * 　　札幌芝・着回数を設定します。
     * @param finishCountTurfSapporoItems 　　札幌芝・着回数
     */
    public void setFinishCountTurfSapporoItems(java.util.List<java.lang.Integer> finishCountTurfSapporoItems) {
        this.finishCountTurfSapporoItems = finishCountTurfSapporoItems;
    }

    /**
     * 　　函館芝・着回数を返します。
     * @return 　　函館芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfHakodateItems() {
        return finishCountTurfHakodateItems;
    }

    /**
     * 　　函館芝・着回数を設定します。
     * @param finishCountTurfHakodateItems 　　函館芝・着回数
     */
    public void setFinishCountTurfHakodateItems(java.util.List<java.lang.Integer> finishCountTurfHakodateItems) {
        this.finishCountTurfHakodateItems = finishCountTurfHakodateItems;
    }

    /**
     * 　　福島芝・着回数を返します。
     * @return 　　福島芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfFukushimaItems() {
        return finishCountTurfFukushimaItems;
    }

    /**
     * 　　福島芝・着回数を設定します。
     * @param finishCountTurfFukushimaItems 　　福島芝・着回数
     */
    public void setFinishCountTurfFukushimaItems(java.util.List<java.lang.Integer> finishCountTurfFukushimaItems) {
        this.finishCountTurfFukushimaItems = finishCountTurfFukushimaItems;
    }

    /**
     * 　　新潟芝・着回数を返します。
     * @return 　　新潟芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfNiigataItems() {
        return finishCountTurfNiigataItems;
    }

    /**
     * 　　新潟芝・着回数を設定します。
     * @param finishCountTurfNiigataItems 　　新潟芝・着回数
     */
    public void setFinishCountTurfNiigataItems(java.util.List<java.lang.Integer> finishCountTurfNiigataItems) {
        this.finishCountTurfNiigataItems = finishCountTurfNiigataItems;
    }

    /**
     * 　　東京芝・着回数を返します。
     * @return 　　東京芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfTokyoItems() {
        return finishCountTurfTokyoItems;
    }

    /**
     * 　　東京芝・着回数を設定します。
     * @param finishCountTurfTokyoItems 　　東京芝・着回数
     */
    public void setFinishCountTurfTokyoItems(java.util.List<java.lang.Integer> finishCountTurfTokyoItems) {
        this.finishCountTurfTokyoItems = finishCountTurfTokyoItems;
    }

    /**
     * 　　中山芝・着回数を返します。
     * @return 　　中山芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfNakayamaItems() {
        return finishCountTurfNakayamaItems;
    }

    /**
     * 　　中山芝・着回数を設定します。
     * @param finishCountTurfNakayamaItems 　　中山芝・着回数
     */
    public void setFinishCountTurfNakayamaItems(java.util.List<java.lang.Integer> finishCountTurfNakayamaItems) {
        this.finishCountTurfNakayamaItems = finishCountTurfNakayamaItems;
    }

    /**
     * 　　中京芝・着回数を返します。
     * @return 　　中京芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfChukyoItems() {
        return finishCountTurfChukyoItems;
    }

    /**
     * 　　中京芝・着回数を設定します。
     * @param finishCountTurfChukyoItems 　　中京芝・着回数
     */
    public void setFinishCountTurfChukyoItems(java.util.List<java.lang.Integer> finishCountTurfChukyoItems) {
        this.finishCountTurfChukyoItems = finishCountTurfChukyoItems;
    }

    /**
     * 　　京都芝・着回数を返します。
     * @return 　　京都芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfKyotoItems() {
        return finishCountTurfKyotoItems;
    }

    /**
     * 　　京都芝・着回数を設定します。
     * @param finishCountTurfKyotoItems 　　京都芝・着回数
     */
    public void setFinishCountTurfKyotoItems(java.util.List<java.lang.Integer> finishCountTurfKyotoItems) {
        this.finishCountTurfKyotoItems = finishCountTurfKyotoItems;
    }

    /**
     * 　　阪神芝・着回数を返します。
     * @return 　　阪神芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfHanshinItems() {
        return finishCountTurfHanshinItems;
    }

    /**
     * 　　阪神芝・着回数を設定します。
     * @param finishCountTurfHanshinItems 　　阪神芝・着回数
     */
    public void setFinishCountTurfHanshinItems(java.util.List<java.lang.Integer> finishCountTurfHanshinItems) {
        this.finishCountTurfHanshinItems = finishCountTurfHanshinItems;
    }

    /**
     * 　　小倉芝・着回数を返します。
     * @return 　　小倉芝・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurfKokuraItems() {
        return finishCountTurfKokuraItems;
    }

    /**
     * 　　小倉芝・着回数を設定します。
     * @param finishCountTurfKokuraItems 　　小倉芝・着回数
     */
    public void setFinishCountTurfKokuraItems(java.util.List<java.lang.Integer> finishCountTurfKokuraItems) {
        this.finishCountTurfKokuraItems = finishCountTurfKokuraItems;
    }

    /**
     * 　　札幌ダ・着回数を返します。
     * @return 　　札幌ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtSapporoItems() {
        return finishCountDirtSapporoItems;
    }

    /**
     * 　　札幌ダ・着回数を設定します。
     * @param finishCountDirtSapporoItems 　　札幌ダ・着回数
     */
    public void setFinishCountDirtSapporoItems(java.util.List<java.lang.Integer> finishCountDirtSapporoItems) {
        this.finishCountDirtSapporoItems = finishCountDirtSapporoItems;
    }

    /**
     * 　　函館ダ・着回数を返します。
     * @return 　　函館ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtHakodateItems() {
        return finishCountDirtHakodateItems;
    }

    /**
     * 　　函館ダ・着回数を設定します。
     * @param finishCountDirtHakodateItems 　　函館ダ・着回数
     */
    public void setFinishCountDirtHakodateItems(java.util.List<java.lang.Integer> finishCountDirtHakodateItems) {
        this.finishCountDirtHakodateItems = finishCountDirtHakodateItems;
    }

    /**
     * 　　福島ダ・着回数を返します。
     * @return 　　福島ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtFukushimaItems() {
        return finishCountDirtFukushimaItems;
    }

    /**
     * 　　福島ダ・着回数を設定します。
     * @param finishCountDirtFukushimaItems 　　福島ダ・着回数
     */
    public void setFinishCountDirtFukushimaItems(java.util.List<java.lang.Integer> finishCountDirtFukushimaItems) {
        this.finishCountDirtFukushimaItems = finishCountDirtFukushimaItems;
    }

    /**
     * 　　新潟ダ・着回数を返します。
     * @return 　　新潟ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtNiigataItems() {
        return finishCountDirtNiigataItems;
    }

    /**
     * 　　新潟ダ・着回数を設定します。
     * @param finishCountDirtNiigataItems 　　新潟ダ・着回数
     */
    public void setFinishCountDirtNiigataItems(java.util.List<java.lang.Integer> finishCountDirtNiigataItems) {
        this.finishCountDirtNiigataItems = finishCountDirtNiigataItems;
    }

    /**
     * 　　東京ダ・着回数を返します。
     * @return 　　東京ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtTokyoItems() {
        return finishCountDirtTokyoItems;
    }

    /**
     * 　　東京ダ・着回数を設定します。
     * @param finishCountDirtTokyoItems 　　東京ダ・着回数
     */
    public void setFinishCountDirtTokyoItems(java.util.List<java.lang.Integer> finishCountDirtTokyoItems) {
        this.finishCountDirtTokyoItems = finishCountDirtTokyoItems;
    }

    /**
     * 　　中山ダ・着回数を返します。
     * @return 　　中山ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtNakayamaItems() {
        return finishCountDirtNakayamaItems;
    }

    /**
     * 　　中山ダ・着回数を設定します。
     * @param finishCountDirtNakayamaItems 　　中山ダ・着回数
     */
    public void setFinishCountDirtNakayamaItems(java.util.List<java.lang.Integer> finishCountDirtNakayamaItems) {
        this.finishCountDirtNakayamaItems = finishCountDirtNakayamaItems;
    }

    /**
     * 　　中京ダ・着回数を返します。
     * @return 　　中京ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtChukyoItems() {
        return finishCountDirtChukyoItems;
    }

    /**
     * 　　中京ダ・着回数を設定します。
     * @param finishCountDirtChukyoItems 　　中京ダ・着回数
     */
    public void setFinishCountDirtChukyoItems(java.util.List<java.lang.Integer> finishCountDirtChukyoItems) {
        this.finishCountDirtChukyoItems = finishCountDirtChukyoItems;
    }

    /**
     * 　　京都ダ・着回数を返します。
     * @return 　　京都ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtKyotoItems() {
        return finishCountDirtKyotoItems;
    }

    /**
     * 　　京都ダ・着回数を設定します。
     * @param finishCountDirtKyotoItems 　　京都ダ・着回数
     */
    public void setFinishCountDirtKyotoItems(java.util.List<java.lang.Integer> finishCountDirtKyotoItems) {
        this.finishCountDirtKyotoItems = finishCountDirtKyotoItems;
    }

    /**
     * 　　阪神ダ・着回数を返します。
     * @return 　　阪神ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtHanshinItems() {
        return finishCountDirtHanshinItems;
    }

    /**
     * 　　阪神ダ・着回数を設定します。
     * @param finishCountDirtHanshinItems 　　阪神ダ・着回数
     */
    public void setFinishCountDirtHanshinItems(java.util.List<java.lang.Integer> finishCountDirtHanshinItems) {
        this.finishCountDirtHanshinItems = finishCountDirtHanshinItems;
    }

    /**
     * 　　小倉ダ・着回数を返します。
     * @return 　　小倉ダ・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirtKokuraItems() {
        return finishCountDirtKokuraItems;
    }

    /**
     * 　　小倉ダ・着回数を設定します。
     * @param finishCountDirtKokuraItems 　　小倉ダ・着回数
     */
    public void setFinishCountDirtKokuraItems(java.util.List<java.lang.Integer> finishCountDirtKokuraItems) {
        this.finishCountDirtKokuraItems = finishCountDirtKokuraItems;
    }

    /**
     * 　　札幌障・着回数を返します。
     * @return 　　札幌障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleSapporoItems() {
        return finishCountObstacleSapporoItems;
    }

    /**
     * 　　札幌障・着回数を設定します。
     * @param finishCountObstacleSapporoItems 　　札幌障・着回数
     */
    public void setFinishCountObstacleSapporoItems(java.util.List<java.lang.Integer> finishCountObstacleSapporoItems) {
        this.finishCountObstacleSapporoItems = finishCountObstacleSapporoItems;
    }

    /**
     * 　　函館障・着回数を返します。
     * @return 　　函館障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleHakodateItems() {
        return finishCountObstacleHakodateItems;
    }

    /**
     * 　　函館障・着回数を設定します。
     * @param finishCountObstacleHakodateItems 　　函館障・着回数
     */
    public void setFinishCountObstacleHakodateItems(java.util.List<java.lang.Integer> finishCountObstacleHakodateItems) {
        this.finishCountObstacleHakodateItems = finishCountObstacleHakodateItems;
    }

    /**
     * 　　福島障・着回数を返します。
     * @return 　　福島障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleFukushimaItems() {
        return finishCountObstacleFukushimaItems;
    }

    /**
     * 　　福島障・着回数を設定します。
     * @param finishCountObstacleFukushimaItems 　　福島障・着回数
     */
    public void setFinishCountObstacleFukushimaItems(java.util.List<java.lang.Integer> finishCountObstacleFukushimaItems) {
        this.finishCountObstacleFukushimaItems = finishCountObstacleFukushimaItems;
    }

    /**
     * 　　新潟障・着回数を返します。
     * @return 　　新潟障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleNiigataItems() {
        return finishCountObstacleNiigataItems;
    }

    /**
     * 　　新潟障・着回数を設定します。
     * @param finishCountObstacleNiigataItems 　　新潟障・着回数
     */
    public void setFinishCountObstacleNiigataItems(java.util.List<java.lang.Integer> finishCountObstacleNiigataItems) {
        this.finishCountObstacleNiigataItems = finishCountObstacleNiigataItems;
    }

    /**
     * 　　東京障・着回数を返します。
     * @return 　　東京障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleTokyoItems() {
        return finishCountObstacleTokyoItems;
    }

    /**
     * 　　東京障・着回数を設定します。
     * @param finishCountObstacleTokyoItems 　　東京障・着回数
     */
    public void setFinishCountObstacleTokyoItems(java.util.List<java.lang.Integer> finishCountObstacleTokyoItems) {
        this.finishCountObstacleTokyoItems = finishCountObstacleTokyoItems;
    }

    /**
     * 　　中山障・着回数を返します。
     * @return 　　中山障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleNakayamaItems() {
        return finishCountObstacleNakayamaItems;
    }

    /**
     * 　　中山障・着回数を設定します。
     * @param finishCountObstacleNakayamaItems 　　中山障・着回数
     */
    public void setFinishCountObstacleNakayamaItems(java.util.List<java.lang.Integer> finishCountObstacleNakayamaItems) {
        this.finishCountObstacleNakayamaItems = finishCountObstacleNakayamaItems;
    }

    /**
     * 　　中京障・着回数を返します。
     * @return 　　中京障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleChukyoItems() {
        return finishCountObstacleChukyoItems;
    }

    /**
     * 　　中京障・着回数を設定します。
     * @param finishCountObstacleChukyoItems 　　中京障・着回数
     */
    public void setFinishCountObstacleChukyoItems(java.util.List<java.lang.Integer> finishCountObstacleChukyoItems) {
        this.finishCountObstacleChukyoItems = finishCountObstacleChukyoItems;
    }

    /**
     * 　　京都障・着回数を返します。
     * @return 　　京都障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleKyotoItems() {
        return finishCountObstacleKyotoItems;
    }

    /**
     * 　　京都障・着回数を設定します。
     * @param finishCountObstacleKyotoItems 　　京都障・着回数
     */
    public void setFinishCountObstacleKyotoItems(java.util.List<java.lang.Integer> finishCountObstacleKyotoItems) {
        this.finishCountObstacleKyotoItems = finishCountObstacleKyotoItems;
    }

    /**
     * 　　阪神障・着回数を返します。
     * @return 　　阪神障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleHanshinItems() {
        return finishCountObstacleHanshinItems;
    }

    /**
     * 　　阪神障・着回数を設定します。
     * @param finishCountObstacleHanshinItems 　　阪神障・着回数
     */
    public void setFinishCountObstacleHanshinItems(java.util.List<java.lang.Integer> finishCountObstacleHanshinItems) {
        this.finishCountObstacleHanshinItems = finishCountObstacleHanshinItems;
    }

    /**
     * 　　小倉障・着回数を返します。
     * @return 　　小倉障・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountObstacleKokuraItems() {
        return finishCountObstacleKokuraItems;
    }

    /**
     * 　　小倉障・着回数を設定します。
     * @param finishCountObstacleKokuraItems 　　小倉障・着回数
     */
    public void setFinishCountObstacleKokuraItems(java.util.List<java.lang.Integer> finishCountObstacleKokuraItems) {
        this.finishCountObstacleKokuraItems = finishCountObstacleKokuraItems;
    }

}