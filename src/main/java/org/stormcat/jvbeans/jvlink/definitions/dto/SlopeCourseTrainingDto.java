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
 * レコードフォーマットID {@link HC} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "HC", byteLength = 60)
public class SlopeCourseTrainingDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code HC}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum SlopeCourseTrainingDataDiv implements org.stormcat.jvbeans.config.DataDiv {

        _1("初期値", "1"),

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
        private SlopeCourseTrainingDataDiv(String name, String value) {
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

    /** トレセン区分 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 1)
    private java.lang.Integer trainingCenterDiv;

    /** 調教年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 13, byteLength = 8)
    private java.util.Date trainingDate;

    /** 調教時刻 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 21, byteLength = 4)
    private java.lang.String trainingTime;

    /** 血統登録番号 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 25, byteLength = 10)
    private java.lang.String bloodRegistNo;

    /** 4ハロンタイム合計(800M～0M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 35, byteLength = 4, correction = 0.1f)
    private java.lang.Float furlongTotal4;

    /** ラップタイム(800M～600M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 39, byteLength = 3, correction = 0.1f)
    private java.lang.Float furlongLap4;

    /** 3ハロンタイム合計(600M～0M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 42, byteLength = 4, correction = 0.1f)
    private java.lang.Float furlongTotal3;

    /** ラップタイム(600M～400M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 46, byteLength = 3, correction = 0.1f)
    private java.lang.Float furlongLap3;

    /** 2ハロンタイム合計(400M～0M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 49, byteLength = 4, correction = 0.1f)
    private java.lang.Float furlongTotal2;

    /** ラップタイム(400M～200M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 53, byteLength = 3, correction = 0.1f)
    private java.lang.Float furlongLap2;

    /** ラップタイム(200M～0M) */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 56, byteLength = 3, correction = 0.1f)
    private java.lang.Float furlongLap1;


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
        return SlopeCourseTrainingDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * トレセン区分を返します。
     * @return トレセン区分
     */
    public java.lang.Integer getTrainingCenterDiv() {
        return trainingCenterDiv;
    }

    /**
     * トレセン区分を設定します。
     * @param trainingCenterDiv トレセン区分
     */
    public void setTrainingCenterDiv(java.lang.Integer trainingCenterDiv) {
        this.trainingCenterDiv = trainingCenterDiv;
    }

    /**
     * 調教年月日を返します。
     * @return 調教年月日
     */
    public java.util.Date getTrainingDate() {
        return trainingDate;
    }

    /**
     * 調教年月日を設定します。
     * @param trainingDate 調教年月日
     */
    public void setTrainingDate(java.util.Date trainingDate) {
        this.trainingDate = trainingDate;
    }

    /**
     * 調教時刻を返します。
     * @return 調教時刻
     */
    public java.lang.String getTrainingTime() {
        return trainingTime;
    }

    /**
     * 調教時刻を設定します。
     * @param trainingTime 調教時刻
     */
    public void setTrainingTime(java.lang.String trainingTime) {
        this.trainingTime = trainingTime;
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
     * 4ハロンタイム合計(800M～0M)を返します。
     * @return 4ハロンタイム合計(800M～0M)
     */
    public java.lang.Float getFurlongTotal4() {
        return furlongTotal4;
    }

    /**
     * 4ハロンタイム合計(800M～0M)を設定します。
     * @param furlongTotal4 4ハロンタイム合計(800M～0M)
     */
    public void setFurlongTotal4(java.lang.Float furlongTotal4) {
        this.furlongTotal4 = furlongTotal4;
    }

    /**
     * ラップタイム(800M～600M)を返します。
     * @return ラップタイム(800M～600M)
     */
    public java.lang.Float getFurlongLap4() {
        return furlongLap4;
    }

    /**
     * ラップタイム(800M～600M)を設定します。
     * @param furlongLap4 ラップタイム(800M～600M)
     */
    public void setFurlongLap4(java.lang.Float furlongLap4) {
        this.furlongLap4 = furlongLap4;
    }

    /**
     * 3ハロンタイム合計(600M～0M)を返します。
     * @return 3ハロンタイム合計(600M～0M)
     */
    public java.lang.Float getFurlongTotal3() {
        return furlongTotal3;
    }

    /**
     * 3ハロンタイム合計(600M～0M)を設定します。
     * @param furlongTotal3 3ハロンタイム合計(600M～0M)
     */
    public void setFurlongTotal3(java.lang.Float furlongTotal3) {
        this.furlongTotal3 = furlongTotal3;
    }

    /**
     * ラップタイム(600M～400M)を返します。
     * @return ラップタイム(600M～400M)
     */
    public java.lang.Float getFurlongLap3() {
        return furlongLap3;
    }

    /**
     * ラップタイム(600M～400M)を設定します。
     * @param furlongLap3 ラップタイム(600M～400M)
     */
    public void setFurlongLap3(java.lang.Float furlongLap3) {
        this.furlongLap3 = furlongLap3;
    }

    /**
     * 2ハロンタイム合計(400M～0M)を返します。
     * @return 2ハロンタイム合計(400M～0M)
     */
    public java.lang.Float getFurlongTotal2() {
        return furlongTotal2;
    }

    /**
     * 2ハロンタイム合計(400M～0M)を設定します。
     * @param furlongTotal2 2ハロンタイム合計(400M～0M)
     */
    public void setFurlongTotal2(java.lang.Float furlongTotal2) {
        this.furlongTotal2 = furlongTotal2;
    }

    /**
     * ラップタイム(400M～200M)を返します。
     * @return ラップタイム(400M～200M)
     */
    public java.lang.Float getFurlongLap2() {
        return furlongLap2;
    }

    /**
     * ラップタイム(400M～200M)を設定します。
     * @param furlongLap2 ラップタイム(400M～200M)
     */
    public void setFurlongLap2(java.lang.Float furlongLap2) {
        this.furlongLap2 = furlongLap2;
    }

    /**
     * ラップタイム(200M～0M)を返します。
     * @return ラップタイム(200M～0M)
     */
    public java.lang.Float getFurlongLap1() {
        return furlongLap1;
    }

    /**
     * ラップタイム(200M～0M)を設定します。
     * @param furlongLap1 ラップタイム(200M～0M)
     */
    public void setFurlongLap1(java.lang.Float furlongLap1) {
        this.furlongLap1 = furlongLap1;
    }

}