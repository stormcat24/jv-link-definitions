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
package org.stormcat.jvbeans.jvlink.definitions.code;
 
/**
 * <b>2001.競馬場コード</b> のEnumによる表現です。
 * @author jv-beans-gen
 * @since 0.1
 *
 */
public enum CourseCd implements org.stormcat.jvbeans.common.constants.PairValueEnum<String> {

    /** 未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ) */
    NONE("未設定・未整備時の初期値(主に地方競馬・海外国際レースに関するデータ)", "00", "", "", "", "", null),
    
    /** 札幌競馬場  */
    SAPPORO("札幌競馬場 ", "01", "札", "札幌", "札幌", "SAPPORO", null),
    
    /** 函館競馬場 */
    HAKODATE("函館競馬場", "02", "函", "函館", "函館", "HAKODATE", null),
    
    /** 福島競馬場 */
    FUKUSHIMA("福島競馬場", "03", "福", "福島", "福島", "FUKUSHIMA", null),
    
    /** 新潟競馬場 */
    NIIGATA("新潟競馬場", "04", "新", "新潟", "新潟", "NIIGATA", null),
    
    /** 東京競馬場 */
    TOKYO("東京競馬場", "05", "東", "東京", "東京", "TOKYO", null),
    
    /** 中山競馬場  */
    NAKAYAMA("中山競馬場 ", "06", "中", "中山", "中山", "NAKAYAMA", null),
    
    /** 中京競馬場 */
    CHUKYO("中京競馬場", "07", "名", "中京", "中京", "CHUKYO", null),
    
    /** 京都競馬場 */
    KYOTO("京都競馬場", "08", "京", "京都", "京都", "KYOTO", null),
    
    /** 阪神競馬場 */
    HANSHIN("阪神競馬場", "09", "阪", "阪神", "阪神", "HANSHIN", null),
    
    /** 小倉競馬場 */
    KOKURA("小倉競馬場", "10", "小", "小倉", "小倉", "KOKURA", null),
    
    /** 門別競馬場  */
    MONBETSU("門別競馬場 ", "30", "門", "門別", "門別", "MONBETSU", null),
    
    /** 北見競馬場  */
    KITAMI("北見競馬場 ", "31", "北", "北見", "北見", "KITAMI", null),
    
    /** 岩見沢競馬場 */
    IWAMIZAWA("岩見沢競馬場", "32", "岩", "岩見", "岩見沢", "IWAMIZAWA", null),
    
    /** 帯広競馬場 */
    OBIHIRO("帯広競馬場", "33", "帯", "帯広", "帯広", "OBIHIRO", null),
    
    /** 旭川競馬場 */
    ASAHIKAWA("旭川競馬場", "34", "旭", "旭川", "旭川", "ASAHIKAWA", null),
    
    /** 盛岡競馬場 */
    MORIOKA("盛岡競馬場", "35", "盛", "盛岡", "盛岡", "MORIOKA", null),
    
    /** 水沢競馬場 */
    MIZUSAWA("水沢競馬場", "36", "水", "水沢", "水沢", "MIZUSAWA", null),
    
    /** 上山競馬場 */
    KAMINOYAMA("上山競馬場", "37", "上", "上山", "上山", "KAMINOYAMA", null),
    
    /** 三条競馬場 */
    SANJYO("三条競馬場", "38", "三", "三条", "三条", "SANJYO", null),
    
    /** 足利競馬場 */
    ASHIKAGA("足利競馬場", "39", "足", "足利", "足利", "ASHIKAGA", null),
    
    /** 宇都宮競馬場 */
    UTSUNOMIYA("宇都宮競馬場", "40", "宇", "宇都", "宇都宮", "UTSUNOMIYA", null),
    
    /** 高崎競馬場  */
    TAKASAKI("高崎競馬場 ", "41", "高", "高崎", "高崎", "TAKASAKI", null),
    
    /** 浦和競馬場 */
    URAWA("浦和競馬場", "42", "浦", "浦和", "浦和", "URAWA", null),
    
    /** 船橋競馬場  */
    FUNABASHI("船橋競馬場 ", "43", "船", "船橋", "船橋", "FUNABASHI", null),
    
    /** 大井競馬場 */
    OHI("大井競馬場", "44", "大", "大井", "大井", "OHI", null),
    
    /** 川崎競馬場 */
    KAWASAKI("川崎競馬場", "45", "川", "川崎", "川崎", "KAWASAKI", null),
    
    /** 金沢競馬場 */
    KANAZAWA("金沢競馬場", "46", "金", "金沢", "金沢", "KANAZAWA", null),
    
    /** 笠松競馬場  */
    KASAMATSU("笠松競馬場 ", "47", "笠", "笠松", "笠松", "KASAMATSU", null),
    
    /** 名古屋競馬場 */
    NAGOYA("名古屋競馬場", "48", "古", "名古", "名古屋", "NAGOYA", null),
    
    /** 紀三井寺競馬場 */
    KIMIIDERA("紀三井寺競馬場", "49", "紀", "紀三", "紀三寺", "KIMIIDERA", null),
    
    /** 園田競馬場 */
    SONODA("園田競馬場", "50", "園", "園田", "園田", "SONODA", null),
    
    /** 姫路競馬場  */
    HIMEJI("姫路競馬場 ", "51", "姫", "姫路", "姫路", "HIMEJI", null),
    
    /** 益田競馬場 */
    MASUDA("益田競馬場", "52", "益", "益田", "益田", "MASUDA", null),
    
    /** 福山競馬場 */
    FUKUYAMA("福山競馬場", "53", "福", "福山", "福山", "FUKUYAMA", null),
    
    /** 高知競馬場  */
    KOCHI("高知競馬場 ", "54", "高", "高知", "高知", "KOCHI", null),
    
    /** 佐賀競馬場 */
    SAGA("佐賀競馬場", "55", "佐", "佐賀", "佐賀", "SAGA", null),
    
    /** 荒尾競馬場  */
    ARAO("荒尾競馬場 ", "56", "荒", "荒尾", "荒尾", "ARAO", null),
    
    /** 中津競馬場 */
    NAKATSU("中津競馬場", "57", "中", "中津", "中津", "NAKATSU", null),
    
    /** 札幌競馬場（地方競馬） */
    SAPPORO_NAR("札幌競馬場（地方競馬）", "58", "札", "札幌", "札幌", "SAPPORO(NAR)", null),
    
    /** 函館競馬場（地方競馬） */
    HAKODATE_NAR("函館競馬場（地方競馬）", "59", "函", "函館", "函館", "HAKODATE(NAR)", null),
    
    /** 新潟競馬場（地方競馬） */
    NIIGATA_NAR("新潟競馬場（地方競馬）", "60", "新", "新潟", "新潟", "NIIGATA(NAR)", null),
    
    /** 中京競馬場（地方競馬） */
    CHUKYO_NAR("中京競馬場（地方競馬）", "61", "名", "中京", "中京", "CHUKYO(NAR)", null),
    
    /** その他の外国 */
    FOREIGN("その他の外国", "A0", "外", "他外", "他外国", "", null),
    
    /** 日本 */
    JAPAN("日本", "A2", "日", "日本", "日本", "Japan", "JPN"),
    
    /** アメリカ */
    UNITED_STATES_OF_AMERICA("アメリカ", "A4", "米", "アメ", "アメリ", "United States of America", "USA"),
    
    /** イギリス */
    GREAT_BRITAIN("イギリス", "A6", "英", "イギ", "イギリ", "Great Britain", "GB"),
    
    /** フランス */
    FRANCE("フランス", "A8", "仏", "フラ", "フラン", "France", "FR"),
    
    /** インド */
    INDIA("インド", "B0", "印", "イン", "インド", "India", "IND"),
    
    /** アイルランド */
    IRELAND("アイルランド", "B2", "愛", "アイ", "アイル", "Ireland", "IRE"),
    
    /** ニュージーランド */
    NEW_ZEALAND("ニュージーランド", "B4", "新", "ニュ", "ニュー", "New Zealand", "NZ"),
    
    /** オーストラリア */
    AUSTRALIA("オーストラリア", "B6", "豪", "オー", "オース", "Australia", "AUS"),
    
    /** カナダ */
    CANADA("カナダ", "B8", "加", "カナ", "カナダ", "Canada", "CAN"),
    
    /** イタリア  */
    ITALY("イタリア ", "C0", "伊", "イタ", "イタリ", "Italy", "ITY"),
    
    /** ドイツ */
    GERMANY("ドイツ", "C2", "独", "ドイ", "ドイツ", "Germany", "GER"),
    
    /** オマーン */
    OMAN("オマーン", "C5", "オ", "オマ", "オマー", "Oman", "OMN"),
    
    /** イラク */
    IRAQ("イラク", "C6", "イ", "イラ", "イラク", "Iraq", "IRQ"),
    
    /** アラブ首長国連邦 */
    UNITED_ARAB_EMIRATES("アラブ首長国連邦", "C7", "首 (ア)", "ア首", "アラブ", "United Arab Emirates", "UAE"),
    
    /** シリア */
    SYRIAN("シリア", "C8", "叙", "シリ", "シリア", "Syrian", "SYR"),
    
    /** スウェーデン */
    SWEDEN("スウェーデン", "D0", "瑞", "スウ", "スウェ", "Sweden", "SWE"),
    
    /** ハンガリー */
    HUNGARY("ハンガリー", "D2", "洪", "ハン", "ハンガ", "Hungary", "HUN"),
    
    /** ポルトガル */
    PORTUGAL("ポルトガル", "D4", "葡", "ポル", "ポルト", "Portugal", "POR"),
    
    /** ロシア */
    RUSSIA("ロシア", "D6", "露", "ロシ", "ロシア", "Russia", "RUS"),
    
    /** ウルグアイ */
    URUGUAY("ウルグアイ", "D8", "宇", "ウル", "ウルグ", "Uruguay", "URU"),
    
    /** ペルー */
    PERU("ペルー", "E0", "秘", "ペル", "ペルー", "Peru", "PER"),
    
    /** アルゼンチン */
    ARGENTINA("アルゼンチン", "E2", "亜", "アル", "アルゼ", "Argentina", "ARG"),
    
    /** ブラジル */
    BRAZIL("ブラジル", "E4", "伯", "ブラ", "ブラジ", "Brazil", "BRZ"),
    
    /** ベルギー */
    BELGIUM("ベルギー", "E6", "白", "ベル", "ベルギ", "Belgium", "BEL"),
    
    /** トルコ */
    TURKEY("トルコ", "E8", "土", "トル", "トルコ", "Turkey", "TUR"),
    
    /** 韓国 */
    KOREA("韓国", "F0", "韓", "韓国", "韓国", "Korea", "KOR"),
    
    /** 中国 */
    CHINA("中国", "F1", "中", "中国", "中国", "China", "CHN"),
    
    /** チリ */
    CHILE("チリ", "F2", "智", "チリ", "チリ", "Chile", "CHI"),
    
    /** パナマ  */
    PANAMA("パナマ ", "F8", "巴", "パナ", "パナマ", "Panama", "PAN"),
    
    /** 香港 */
    HONG_KONG("香港", "G0", "香", "香港", "香港", "Hong Kong", "HK"),
    
    /** スペイン */
    SPAIN("スペイン", "G2", "西", "スペ", "スペイ", "Spain", "SPA"),
    
    /** 西ドイツ */
    WEST_GERMANY("西ドイツ", "H0", "独", "西独", "西独", "West Germany", "GER"),
    
    /** 南アフリカ */
    SOUTH_AFRICA("南アフリカ", "H2", "南　(阿)", "南ア", "南アフ", "South Africa", "SAF"),
    
    /** スイス */
    SWITZERLAND("スイス", "H4", "ス", "スイ", "スイス", "Switzerland", "SWI"),
    
    /** モナコ */
    MONACO("モナコ", "H6", "モ", "モナ", "モナコ", "Monaco", "MCO"),
    
    /** フィリピン */
    PHILIPPINES("フィリピン", "H8", "比", "フィ", "フィリ", "Philippines", "PHI"),
    
    /** プエルトリコ */
    PUERTO_RICO("プエルトリコ", "I0", "プ", "プエ", "プエル", "Puerto Rico", "PUE"),
    
    /** コロンビア */
    COLOMBIA("コロンビア", "I2", "コ", "コロ", "コロン", "Colombia", "COL"),
    
    /** チェコスロバキア */
    CZECHOSLOVAKIA("チェコスロバキア", "I4", "チ", "チェ", "チェコ", "Czechoslovakia", "CZE"),
    
    /** チェコ */
    CZECH_REPUBLIC("チェコ", "I6", "チ", "チェ", "チェコ", "Czech Republic", "CZE"),
    
    /** スロバキア */
    SLOVAKIA("スロバキア", "I8", "ス", "スロ", "スロバ", "Slovakia", "SLO"),
    
    /** エクアドル */
    ECUADOR("エクアドル", "J0", "エ", "エク", "エクア", "Ecuador", "ECU"),
    
    /** ギリシャ */
    GREECE("ギリシャ", "J2", "ギ", "ギリ", "ギリシ", "Greece", "GR"),
    
    /** マレーシア */
    MALAYSIA("マレーシア", "J4", "馬", "マレ", "マレー", "Malaysia", "MAL"),
    
    /** メキシコ */
    MEXICO("メキシコ", "J6", "墨", "メキ", "メキシ", "Mexico", "MEX"),
    
    /** モロッコ */
    MOROCCO("モロッコ", "J8", "摩", "モロ", "モロッ", "Morocco", "MOR"),
    
    /** パキスタン */
    PAKISTAN("パキスタン", "K0", "基", "パキ", "パキス", "Pakistan", "PAK"),
    
    /** ポーランド */
    POLAND("ポーランド", "K2", "波", "ポー", "ポーラ", "Poland", "POL"),
    
    /** パラグアイ */
    PARAGUAY("パラグアイ", "K4", "拉", "パラ", "パラグ", "Paraguay", "PRY"),
    
    /** サウジアラビア */
    SAUDI_ARABIA("サウジアラビア", "K6", "サ", "サウ", "サウジ", "Saudi Arabia", "SDA"),
    
    /** キプロス */
    CYPRUS("キプロス", "K8", "キ", "キプ", "キプロ", "Cyprus", "CYP"),
    
    /** タイ */
    THAILAND("タイ", "L0", "泰", "タイ", "タイ", "Thailand", "THA"),
    
    /** ウクライナ */
    UKRAINE("ウクライナ", "L2", "烏", "ウク", "ウクラ", "Ukraine", "UKR"),
    
    /** ベネズエラ */
    VENEZUELA("ベネズエラ", "L4", "ベ", "ベネ", "ベネゼ", "Venezuela", "VEN"),
    
    /** ユーゴスラビア */
    YUGOSLAVIA("ユーゴスラビア", "L6", "ユ", "ユー", "ユーゴ", "Yugoslavia", "YUG"),
    
    /** デンマーク */
    DENMARK("デンマーク", "L8", "丁", "デン", "デンマ", "Denmark", "DEN"),
    
    /** シンガポール */
    SINGAPORE("シンガポール", "M0", "嘉", "シン", "シンガ", "Singapore", "SIN"),
    
    /** マカオ */
    MACAU("マカオ", "M2", "澳", "澳門", "マカオ", "Macau", "MAC"),
    
    /** オーストリア */
    AUSTRIA("オーストリア", "M4", "墺", "墺", "墺国", "Austria", "AUT"),
    
    /** ヨルダン */
    JORDAN("ヨルダン", "M6", "約", "約", "ヨルダ", "Jordan", "JOR"),
    
    ;

    /** 場名 */
    private String name;
    
    /** 値 */
    private String value;
    
    /** 場略名(1文字) */
    private String nameChar1;
    
    /** 場略名(2文字) */
    private String nameChar2;
    
    /** 場略名(3文字) */
    private String nameChar3;
    
    /** 場欧字名 */
    private String nameEng;
    
    /** 場欧字略名(3文字) */
    private String nameEngChar3;

    private CourseCd(String name, String value, String nameChar1, String nameChar2,
        String nameChar3, String nameEng, String nameEngChar3) {
        this.name = name;
        this.value = value;
        this.nameChar1 = nameChar1;
        this.nameChar2 = nameChar2;
        this.nameChar3 = nameChar3;
        this.nameEng = nameEng;
        this.nameEngChar3 = nameEngChar3;
    }
    
    /**
     * {@inheritDoc}
     */
    public String getName() {
        return this.name;
    }    

    /**
     * {@inheritDoc}
     */
    public String getValue() {
        return this.value;
    }
    
    /**
     * 場略名(1文字)を返します。
     * @return 場略名(1文字)
     */
    public String getCourseNameChar1() {
        return this.nameChar1;
    }

    /**
     * 場略名(2文字)を返します。
     * @return 場略名(2文字)
     */    
    public String getCourseNameChar2() {
        return this.nameChar2;
    }
    
    /**
     * 場略名(3文字)を返します。
     * @return 場略名(3文字)
     */
    public String getCourseNameChar3() {
        return this.nameChar3;
    }
    
    /**
     * 場欧字名を返します。
     * @return 場欧字名
     */
    public String getCourseNameEng() {
        return this.nameEng;
    }

    /**
     * 場欧字略名(3文字)を返します。
     * @return 場欧字略名(3文字)
     */    
    public String getCourseNameEngChar3() {
        return this.nameEngChar3;
    }
    
}