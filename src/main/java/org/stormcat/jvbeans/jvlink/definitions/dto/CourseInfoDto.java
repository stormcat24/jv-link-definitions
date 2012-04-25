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
 * レコードフォーマットID {@link CS} に対応するDtoです。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
@org.stormcat.jvbeans.annotation.JvBean(recordTypeId = "CS", byteLength = 6829)
public class CourseInfoDto extends org.stormcat.jvbeans.jvlink.JvBindingDto {

    /**
     * {@code CS}に対応したデータ区分を表現するEnumです。
     * @author jv-beans-gen
     * @since 0.3
     *
     */
    public enum CourseInfoDataDiv implements org.stormcat.jvbeans.config.DataDiv {

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
        private CourseInfoDataDiv(String name, String value) {
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

    /** 競馬場コード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 12, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.CourseCd courseCd;

    /** 距離 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 14, byteLength = 4)
    private java.lang.Integer distance;

    /** トラックコード */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 18, byteLength = 2)
    private org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd;

    /** コース改修年月日 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 20, byteLength = 8)
    private java.util.Date courseRepairDate;

    /** コース説明 */
    @org.stormcat.jvbeans.annotation.JvProperty(position = 28, byteLength = 6800)
    private java.lang.String courseDiscription;


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
        return CourseInfoDataDiv.valueOf(java.lang.String.format("_%s", dataDiv));
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
     * 距離を返します。
     * @return 距離
     */
    public java.lang.Integer getDistance() {
        return distance;
    }

    /**
     * 距離を設定します。
     * @param distance 距離
     */
    public void setDistance(java.lang.Integer distance) {
        this.distance = distance;
    }

    /**
     * トラックコードを返します。
     * @return トラックコード
     */
    public org.stormcat.jvbeans.jvlink.definitions.code.TrackCd getTrackCd() {
        return trackCd;
    }

    /**
     * トラックコードを設定します。
     * @param trackCd トラックコード
     */
    public void setTrackCd(org.stormcat.jvbeans.jvlink.definitions.code.TrackCd trackCd) {
        this.trackCd = trackCd;
    }

    /**
     * コース改修年月日を返します。
     * @return コース改修年月日
     */
    public java.util.Date getCourseRepairDate() {
        return courseRepairDate;
    }

    /**
     * コース改修年月日を設定します。
     * @param courseRepairDate コース改修年月日
     */
    public void setCourseRepairDate(java.util.Date courseRepairDate) {
        this.courseRepairDate = courseRepairDate;
    }

    /**
     * コース説明を返します。
     * @return コース説明
     */
    public java.lang.String getCourseDiscription() {
        return courseDiscription;
    }

    /**
     * コース説明を設定します。
     * @param courseDiscription コース説明
     */
    public void setCourseDiscription(java.lang.String courseDiscription) {
        this.courseDiscription = courseDiscription;
    }

}