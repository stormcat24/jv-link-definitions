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
public class TotalResultInfoMiddleDto {

    /** 　　設定年 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1, byteLength = 4)
    private java.lang.Integer settingYear;

    /** 　　平地本賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 5, byteLength = 10, correction = 100.0f)
    private java.lang.Long addedMoneyTotalFlat;

    /** 　　障害本賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 15, byteLength = 10, correction = 100.0f)
    private java.lang.Long addedMoneyTotalObstacle;

    /** 　　平地付加賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 25, byteLength = 10, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalFlat;

    /** 　　障害付加賞金合計 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 10, correction = 100.0f)
    private java.lang.Long stakesMoneyTotalObstacle;

    /** 　　平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 45, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountFlatItems;

    /** 　　障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 81, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountObstacleItems;

    /** 　　札幌平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 117, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountSapporoFlatItems;

    /** 　　札幌障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 153, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountSapporoObstacleItems;

    /** 　　函館平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 189, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountHakodateFlatItems;

    /** 　　函館障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 225, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountHakodateObstacleItems;

    /** 　　福島平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 261, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountFukushimaFlatItems;

    /** 　　福島障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 297, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountFukushimaObstacleItems;

    /** 　　新潟平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 333, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountNiigataFlatItems;

    /** 　　新潟障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 369, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountNiigataObstacleItems;

    /** 　　東京平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 405, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTokyoFlatItems;

    /** 　　東京障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 441, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTokyoObstacleItems;

    /** 　　中山平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 477, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountNakayamaFlatItems;

    /** 　　中山障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 513, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountNakayamaObstacleItems;

    /** 　　中京平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 549, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountChukyoFlatItems;

    /** 　　中京障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 585, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountChukyoObstacleItems;

    /** 　　京都平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 621, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountKyotoFlatItems;

    /** 　　京都障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 657, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountKyotoObstacleItems;

    /** 　　阪神平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 693, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountHanshinFlatItems;

    /** 　　阪神障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 729, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountHanshinObstacleItems;

    /** 　　小倉平地着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 765, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountKokuraFlatItems;

    /** 　　小倉障害着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 801, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountKokuraObstacleItems;

    /** 　　芝16下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 837, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf1600Items;

    /** 　　芝22下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 873, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2200Items;

    /** 　　芝22超・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 909, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountTurf2200OverItems;

    /** 　　ダ16下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 945, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt1600Items;

    /** 　　ダ22下・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 981, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2200Items;

    /** 　　ダ22超・着回数 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 1017, byteLength = 6, repeatCount = 6)
    private java.util.List<java.lang.Integer> finishCountDirt2200OverItems;


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
    public java.lang.Long getAddedMoneyTotalFlat() {
        return addedMoneyTotalFlat;
    }

    /**
     * 　　平地本賞金合計を設定します。
     * @param addedMoneyTotalFlat 　　平地本賞金合計
     */
    public void setAddedMoneyTotalFlat(java.lang.Long addedMoneyTotalFlat) {
        this.addedMoneyTotalFlat = addedMoneyTotalFlat;
    }

    /**
     * 　　障害本賞金合計を返します。
     * @return 　　障害本賞金合計
     */
    public java.lang.Long getAddedMoneyTotalObstacle() {
        return addedMoneyTotalObstacle;
    }

    /**
     * 　　障害本賞金合計を設定します。
     * @param addedMoneyTotalObstacle 　　障害本賞金合計
     */
    public void setAddedMoneyTotalObstacle(java.lang.Long addedMoneyTotalObstacle) {
        this.addedMoneyTotalObstacle = addedMoneyTotalObstacle;
    }

    /**
     * 　　平地付加賞金合計を返します。
     * @return 　　平地付加賞金合計
     */
    public java.lang.Long getStakesMoneyTotalFlat() {
        return stakesMoneyTotalFlat;
    }

    /**
     * 　　平地付加賞金合計を設定します。
     * @param stakesMoneyTotalFlat 　　平地付加賞金合計
     */
    public void setStakesMoneyTotalFlat(java.lang.Long stakesMoneyTotalFlat) {
        this.stakesMoneyTotalFlat = stakesMoneyTotalFlat;
    }

    /**
     * 　　障害付加賞金合計を返します。
     * @return 　　障害付加賞金合計
     */
    public java.lang.Long getStakesMoneyTotalObstacle() {
        return stakesMoneyTotalObstacle;
    }

    /**
     * 　　障害付加賞金合計を設定します。
     * @param stakesMoneyTotalObstacle 　　障害付加賞金合計
     */
    public void setStakesMoneyTotalObstacle(java.lang.Long stakesMoneyTotalObstacle) {
        this.stakesMoneyTotalObstacle = stakesMoneyTotalObstacle;
    }

    /**
     * 　　平地着回数を返します。
     * @return 　　平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountFlatItems() {
        return finishCountFlatItems;
    }

    /**
     * 　　平地着回数を設定します。
     * @param finishCountFlatItems 　　平地着回数
     */
    public void setFinishCountFlatItems(java.util.List<java.lang.Integer> finishCountFlatItems) {
        this.finishCountFlatItems = finishCountFlatItems;
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
     * 　　札幌平地着回数を返します。
     * @return 　　札幌平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountSapporoFlatItems() {
        return finishCountSapporoFlatItems;
    }

    /**
     * 　　札幌平地着回数を設定します。
     * @param finishCountSapporoFlatItems 　　札幌平地着回数
     */
    public void setFinishCountSapporoFlatItems(java.util.List<java.lang.Integer> finishCountSapporoFlatItems) {
        this.finishCountSapporoFlatItems = finishCountSapporoFlatItems;
    }

    /**
     * 　　札幌障害着回数を返します。
     * @return 　　札幌障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountSapporoObstacleItems() {
        return finishCountSapporoObstacleItems;
    }

    /**
     * 　　札幌障害着回数を設定します。
     * @param finishCountSapporoObstacleItems 　　札幌障害着回数
     */
    public void setFinishCountSapporoObstacleItems(java.util.List<java.lang.Integer> finishCountSapporoObstacleItems) {
        this.finishCountSapporoObstacleItems = finishCountSapporoObstacleItems;
    }

    /**
     * 　　函館平地着回数を返します。
     * @return 　　函館平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountHakodateFlatItems() {
        return finishCountHakodateFlatItems;
    }

    /**
     * 　　函館平地着回数を設定します。
     * @param finishCountHakodateFlatItems 　　函館平地着回数
     */
    public void setFinishCountHakodateFlatItems(java.util.List<java.lang.Integer> finishCountHakodateFlatItems) {
        this.finishCountHakodateFlatItems = finishCountHakodateFlatItems;
    }

    /**
     * 　　函館障害着回数を返します。
     * @return 　　函館障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountHakodateObstacleItems() {
        return finishCountHakodateObstacleItems;
    }

    /**
     * 　　函館障害着回数を設定します。
     * @param finishCountHakodateObstacleItems 　　函館障害着回数
     */
    public void setFinishCountHakodateObstacleItems(java.util.List<java.lang.Integer> finishCountHakodateObstacleItems) {
        this.finishCountHakodateObstacleItems = finishCountHakodateObstacleItems;
    }

    /**
     * 　　福島平地着回数を返します。
     * @return 　　福島平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountFukushimaFlatItems() {
        return finishCountFukushimaFlatItems;
    }

    /**
     * 　　福島平地着回数を設定します。
     * @param finishCountFukushimaFlatItems 　　福島平地着回数
     */
    public void setFinishCountFukushimaFlatItems(java.util.List<java.lang.Integer> finishCountFukushimaFlatItems) {
        this.finishCountFukushimaFlatItems = finishCountFukushimaFlatItems;
    }

    /**
     * 　　福島障害着回数を返します。
     * @return 　　福島障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountFukushimaObstacleItems() {
        return finishCountFukushimaObstacleItems;
    }

    /**
     * 　　福島障害着回数を設定します。
     * @param finishCountFukushimaObstacleItems 　　福島障害着回数
     */
    public void setFinishCountFukushimaObstacleItems(java.util.List<java.lang.Integer> finishCountFukushimaObstacleItems) {
        this.finishCountFukushimaObstacleItems = finishCountFukushimaObstacleItems;
    }

    /**
     * 　　新潟平地着回数を返します。
     * @return 　　新潟平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountNiigataFlatItems() {
        return finishCountNiigataFlatItems;
    }

    /**
     * 　　新潟平地着回数を設定します。
     * @param finishCountNiigataFlatItems 　　新潟平地着回数
     */
    public void setFinishCountNiigataFlatItems(java.util.List<java.lang.Integer> finishCountNiigataFlatItems) {
        this.finishCountNiigataFlatItems = finishCountNiigataFlatItems;
    }

    /**
     * 　　新潟障害着回数を返します。
     * @return 　　新潟障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountNiigataObstacleItems() {
        return finishCountNiigataObstacleItems;
    }

    /**
     * 　　新潟障害着回数を設定します。
     * @param finishCountNiigataObstacleItems 　　新潟障害着回数
     */
    public void setFinishCountNiigataObstacleItems(java.util.List<java.lang.Integer> finishCountNiigataObstacleItems) {
        this.finishCountNiigataObstacleItems = finishCountNiigataObstacleItems;
    }

    /**
     * 　　東京平地着回数を返します。
     * @return 　　東京平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTokyoFlatItems() {
        return finishCountTokyoFlatItems;
    }

    /**
     * 　　東京平地着回数を設定します。
     * @param finishCountTokyoFlatItems 　　東京平地着回数
     */
    public void setFinishCountTokyoFlatItems(java.util.List<java.lang.Integer> finishCountTokyoFlatItems) {
        this.finishCountTokyoFlatItems = finishCountTokyoFlatItems;
    }

    /**
     * 　　東京障害着回数を返します。
     * @return 　　東京障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTokyoObstacleItems() {
        return finishCountTokyoObstacleItems;
    }

    /**
     * 　　東京障害着回数を設定します。
     * @param finishCountTokyoObstacleItems 　　東京障害着回数
     */
    public void setFinishCountTokyoObstacleItems(java.util.List<java.lang.Integer> finishCountTokyoObstacleItems) {
        this.finishCountTokyoObstacleItems = finishCountTokyoObstacleItems;
    }

    /**
     * 　　中山平地着回数を返します。
     * @return 　　中山平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountNakayamaFlatItems() {
        return finishCountNakayamaFlatItems;
    }

    /**
     * 　　中山平地着回数を設定します。
     * @param finishCountNakayamaFlatItems 　　中山平地着回数
     */
    public void setFinishCountNakayamaFlatItems(java.util.List<java.lang.Integer> finishCountNakayamaFlatItems) {
        this.finishCountNakayamaFlatItems = finishCountNakayamaFlatItems;
    }

    /**
     * 　　中山障害着回数を返します。
     * @return 　　中山障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountNakayamaObstacleItems() {
        return finishCountNakayamaObstacleItems;
    }

    /**
     * 　　中山障害着回数を設定します。
     * @param finishCountNakayamaObstacleItems 　　中山障害着回数
     */
    public void setFinishCountNakayamaObstacleItems(java.util.List<java.lang.Integer> finishCountNakayamaObstacleItems) {
        this.finishCountNakayamaObstacleItems = finishCountNakayamaObstacleItems;
    }

    /**
     * 　　中京平地着回数を返します。
     * @return 　　中京平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountChukyoFlatItems() {
        return finishCountChukyoFlatItems;
    }

    /**
     * 　　中京平地着回数を設定します。
     * @param finishCountChukyoFlatItems 　　中京平地着回数
     */
    public void setFinishCountChukyoFlatItems(java.util.List<java.lang.Integer> finishCountChukyoFlatItems) {
        this.finishCountChukyoFlatItems = finishCountChukyoFlatItems;
    }

    /**
     * 　　中京障害着回数を返します。
     * @return 　　中京障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountChukyoObstacleItems() {
        return finishCountChukyoObstacleItems;
    }

    /**
     * 　　中京障害着回数を設定します。
     * @param finishCountChukyoObstacleItems 　　中京障害着回数
     */
    public void setFinishCountChukyoObstacleItems(java.util.List<java.lang.Integer> finishCountChukyoObstacleItems) {
        this.finishCountChukyoObstacleItems = finishCountChukyoObstacleItems;
    }

    /**
     * 　　京都平地着回数を返します。
     * @return 　　京都平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountKyotoFlatItems() {
        return finishCountKyotoFlatItems;
    }

    /**
     * 　　京都平地着回数を設定します。
     * @param finishCountKyotoFlatItems 　　京都平地着回数
     */
    public void setFinishCountKyotoFlatItems(java.util.List<java.lang.Integer> finishCountKyotoFlatItems) {
        this.finishCountKyotoFlatItems = finishCountKyotoFlatItems;
    }

    /**
     * 　　京都障害着回数を返します。
     * @return 　　京都障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountKyotoObstacleItems() {
        return finishCountKyotoObstacleItems;
    }

    /**
     * 　　京都障害着回数を設定します。
     * @param finishCountKyotoObstacleItems 　　京都障害着回数
     */
    public void setFinishCountKyotoObstacleItems(java.util.List<java.lang.Integer> finishCountKyotoObstacleItems) {
        this.finishCountKyotoObstacleItems = finishCountKyotoObstacleItems;
    }

    /**
     * 　　阪神平地着回数を返します。
     * @return 　　阪神平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountHanshinFlatItems() {
        return finishCountHanshinFlatItems;
    }

    /**
     * 　　阪神平地着回数を設定します。
     * @param finishCountHanshinFlatItems 　　阪神平地着回数
     */
    public void setFinishCountHanshinFlatItems(java.util.List<java.lang.Integer> finishCountHanshinFlatItems) {
        this.finishCountHanshinFlatItems = finishCountHanshinFlatItems;
    }

    /**
     * 　　阪神障害着回数を返します。
     * @return 　　阪神障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountHanshinObstacleItems() {
        return finishCountHanshinObstacleItems;
    }

    /**
     * 　　阪神障害着回数を設定します。
     * @param finishCountHanshinObstacleItems 　　阪神障害着回数
     */
    public void setFinishCountHanshinObstacleItems(java.util.List<java.lang.Integer> finishCountHanshinObstacleItems) {
        this.finishCountHanshinObstacleItems = finishCountHanshinObstacleItems;
    }

    /**
     * 　　小倉平地着回数を返します。
     * @return 　　小倉平地着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountKokuraFlatItems() {
        return finishCountKokuraFlatItems;
    }

    /**
     * 　　小倉平地着回数を設定します。
     * @param finishCountKokuraFlatItems 　　小倉平地着回数
     */
    public void setFinishCountKokuraFlatItems(java.util.List<java.lang.Integer> finishCountKokuraFlatItems) {
        this.finishCountKokuraFlatItems = finishCountKokuraFlatItems;
    }

    /**
     * 　　小倉障害着回数を返します。
     * @return 　　小倉障害着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountKokuraObstacleItems() {
        return finishCountKokuraObstacleItems;
    }

    /**
     * 　　小倉障害着回数を設定します。
     * @param finishCountKokuraObstacleItems 　　小倉障害着回数
     */
    public void setFinishCountKokuraObstacleItems(java.util.List<java.lang.Integer> finishCountKokuraObstacleItems) {
        this.finishCountKokuraObstacleItems = finishCountKokuraObstacleItems;
    }

    /**
     * 　　芝16下・着回数を返します。
     * @return 　　芝16下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf1600Items() {
        return finishCountTurf1600Items;
    }

    /**
     * 　　芝16下・着回数を設定します。
     * @param finishCountTurf1600Items 　　芝16下・着回数
     */
    public void setFinishCountTurf1600Items(java.util.List<java.lang.Integer> finishCountTurf1600Items) {
        this.finishCountTurf1600Items = finishCountTurf1600Items;
    }

    /**
     * 　　芝22下・着回数を返します。
     * @return 　　芝22下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2200Items() {
        return finishCountTurf2200Items;
    }

    /**
     * 　　芝22下・着回数を設定します。
     * @param finishCountTurf2200Items 　　芝22下・着回数
     */
    public void setFinishCountTurf2200Items(java.util.List<java.lang.Integer> finishCountTurf2200Items) {
        this.finishCountTurf2200Items = finishCountTurf2200Items;
    }

    /**
     * 　　芝22超・着回数を返します。
     * @return 　　芝22超・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountTurf2200OverItems() {
        return finishCountTurf2200OverItems;
    }

    /**
     * 　　芝22超・着回数を設定します。
     * @param finishCountTurf2200OverItems 　　芝22超・着回数
     */
    public void setFinishCountTurf2200OverItems(java.util.List<java.lang.Integer> finishCountTurf2200OverItems) {
        this.finishCountTurf2200OverItems = finishCountTurf2200OverItems;
    }

    /**
     * 　　ダ16下・着回数を返します。
     * @return 　　ダ16下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt1600Items() {
        return finishCountDirt1600Items;
    }

    /**
     * 　　ダ16下・着回数を設定します。
     * @param finishCountDirt1600Items 　　ダ16下・着回数
     */
    public void setFinishCountDirt1600Items(java.util.List<java.lang.Integer> finishCountDirt1600Items) {
        this.finishCountDirt1600Items = finishCountDirt1600Items;
    }

    /**
     * 　　ダ22下・着回数を返します。
     * @return 　　ダ22下・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2200Items() {
        return finishCountDirt2200Items;
    }

    /**
     * 　　ダ22下・着回数を設定します。
     * @param finishCountDirt2200Items 　　ダ22下・着回数
     */
    public void setFinishCountDirt2200Items(java.util.List<java.lang.Integer> finishCountDirt2200Items) {
        this.finishCountDirt2200Items = finishCountDirt2200Items;
    }

    /**
     * 　　ダ22超・着回数を返します。
     * @return 　　ダ22超・着回数
     */
    public java.util.List<java.lang.Integer> getFinishCountDirt2200OverItems() {
        return finishCountDirt2200OverItems;
    }

    /**
     * 　　ダ22超・着回数を設定します。
     * @param finishCountDirt2200OverItems 　　ダ22超・着回数
     */
    public void setFinishCountDirt2200OverItems(java.util.List<java.lang.Integer> finishCountDirt2200OverItems) {
        this.finishCountDirt2200OverItems = finishCountDirt2200OverItems;
    }

}