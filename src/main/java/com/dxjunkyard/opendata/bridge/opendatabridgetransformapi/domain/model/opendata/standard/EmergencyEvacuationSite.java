package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.standard;

import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.License;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.netty.util.internal.StringUtil;
import jakarta.annotation.Nonnull;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Optional;

@RequiredArgsConstructor
@Getter
@Builder
public class EmergencyEvacuationSite {

    /**
     * 全国地方公共団体コード
     * <p>
     * 掲載区分:推奨
     * 説明:情報の管理主体である団体の全国地方公共団体コードを6桁で記載
     * 形式:文字列（半角数字）
     * 例:011002
     * </p>
     */
    @Nullable
    private final String localGovCode;

    /**
     * 緊急避難場所ID
     * <p>
     * 掲載区分:推奨
     * 説明:地方公共団体内で指定緊急避難場所が一意に決まるよう、IDを設定し、記載
     * 形式:文字列（半角英数字）
     * 例:CC0100022200
     * </p>
     */
    @Nullable
    private final String id;

    /**
     * 名称
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所の通称や建物等の名前を記載
     * 形式:文字列
     * 例:○○小学校
     * </p>
     */
    @Nonnull
    private final String name;

    /**
     * 名称_カナ
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の通称や建物等の名前をカナで記載
     * 形式:文字列（全角カナ）
     * 例:○○ショウガッコウ
     * </p>
     */
    @Nullable
    private final String nameKana;

    /**
     * 名称_英字
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の通称や建物等の名前を英語で記載。
     * 形式:文字列（半角英数字）
     * 例:○○elementary school
     * </p>
     */
    @Nullable
    private final String nameEnglish;

    /**
     * 所在地_全国地方公共団体コード
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の所在地の管理主体である団体の全国地方公共団体コードを6桁で記載
     * 形式:文字列（半角数字）
     * 例:011088
     * </p>
     */
    @Nullable
    private final String addressCode;

    /**
     * 町字ID
     * <p>
     * 掲載区分:推奨
     * 説明 :指定緊急避難場所の住所の町字IDを記載。アドレス・ベース・レジストリ」のページを参照。
     * 形式:文字列（半角数字）
     * 例:0001000
     * <a href="https://www.digital.go.jp/policies/base_registry_address.html">アドレス・ベース・レジストリ</a>
     * </p>
     */
    @Nullable
    private final String townId;

    /**
     * 所在地_連結表記
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所の住所（都道府県から建物名等までを連結した表記）を記載
     * 形式:文字列
     * 例:北海道札幌市厚別区2○-○○○ビル1階
     * </p>
     */
    @NonNull
    private final String address;

    /**
     * 所在地_都道府県
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の住所（都道府県）を記載
     * 形式:文字列
     * 例:北海道
     * </p>
     */
    @Nullable
    private final String prefecture;

    /**
     * 所在地_市区町村
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の住所（市区町村）を記載
     * 形式:文字列
     * 例:札幌市
     * </p>
     */
    @Nullable
    private final String city;

    /**
     * 所在地_町字
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の住所（町字）を記載
     * 形式:文字列
     * 例:厚別区2
     * </p>
     */
    @Nullable
    private final String town;

    /**
     * 所在地_番地以下
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の住所（番地以下）を記載
     * 形式:文字列
     * 例:○-○
     * </p>
     */
    @Nullable
    private final String addressDetail;

    /**
     * 建物名等(方書)
     * <p>
     * 掲載区分:任意
     * 説明:指定緊急避難場所の住所（建物名等）を記載
     * 形式:文字列
     * 例:○○ビル1階
     * </p>
     */
    @Nullable
    private final String buildingInfo;

    /**
     * 緯度
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の緯度を記載
     * 形式:文字列（半角文字）
     * 例:43.064310
     * </p>
     */
    @Nullable
    private final BigDecimal latitude;

    /**
     * 緯度を文字列にして返す
     *
     * @return 緯度
     */
    @Nullable
    @JsonIgnore
    public String getLatitudeString() {
        return Optional.ofNullable(latitude)
                .map(BigDecimal::toPlainString)
                .orElse(null);
    }

    /**
     * 経度
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所の経度を記載
     * 形式:文字列（半角文字）
     * 例:141.346814
     * </p>
     */
    @Nullable
    private final BigDecimal longitude;

    /**
     * 経度を文字列にして返す
     *
     * @return 経度
     */
    @Nullable
    @JsonIgnore
    public String getLongitudeString() {
        return Optional.ofNullable(longitude)
                .map(BigDecimal::toPlainString)
                .orElse(null);
    }


    /**
     * 標高
     * <p>
     * 掲載区分:任意
     * 説明:指定緊急避難場所の標高を記載
     * 形式:文字列（半角文字）
     * 例:30.5
     * </p>
     */
    @Nullable
    private final BigDecimal altitude;

    /**
     * 標高を文字列にして返す
     *
     * @return 標高
     */
    @Nullable
    @JsonIgnore
    public String getAltitudeString() {
        return Optional.ofNullable(altitude)
                .map(BigDecimal::toPlainString)
                .orElse(null);
    }

    /**
     * 電話番号
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所の連絡先（電話番号）を記載
     * 形式:文字列（半角文字）
     * 例:(00)0000-0000
     * </p>
     */
    @Nonnull
    private final String phoneNumber;

    /**
     * 内線番号
     * <p>
     * 掲載区分:任意
     * 説明:指定緊急避難場所の連絡先（内線番号）を記載
     * 形式:文字列（半角文字）
     * 例:00000
     * </p>
     */
    @Nullable
    private final String extensionNumber;

    /**
     * 連絡先メールアドレス
     * <p>
     * 掲載区分:任意
     * 説明:指定緊急避難場所の連絡先（メールアドレス）を記載
     * 形式:文字列
     * 例:XXXX@ooo.lg.jp
     * </p>
     */
    @Nullable
    private final String emailAddress;

    /**
     * 連絡先FormURL
     * <p>
     * 掲載区分:任意
     * 説明:連絡先がWebFormの場合のURL
     * 形式:URI
     * 例:http://www.ooo.lg.jp/abc.html
     * </p>
     */
    @Nullable
    private final String formUrl;

    /**
     * 連絡先備考（その他、SNSなど）
     * <p>
     * 掲載区分:任意
     * 説明:SNSなどの連絡手段がある場合に記入
     * 形式:文字列
     * 例:Twitter: xxx; Instagram: xxx
     * </p>
     */
    @Nullable
    private final String contactRemarks;

    /**
     * 郵便番号
     * <p>
     * 掲載区分:任意
     * 説明:指定緊急避難場所の郵便番号を記載
     * 形式:文字列（半角数字）
     * 例:1234567
     * </p>
     */
    @Nullable
    private final String postalCode;

    /**
     * 市区町村コード
     * <p>
     * 掲載区分:必須
     * 説明:設置主体である市区町村コードを記載
     * 形式:文字列（半角数字）
     * 例:011002
     * </p
     */
    @Nonnull
    private final String cityCode;

    /**
     * 地方公共団体名
     * <p>
     * 掲載区分:任意
     * 説明:設置主体である地方公共団体名を記載
     * 形式:文字列
     * 例:北海道札幌市
     * </p>
     */
    @Nullable
    private final String organizationName;

    /**
     * 災害種別_洪水
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(火災)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @Nonnull
    private final Boolean disasterFlood;

    /**
     * 災害種別_洪水を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterFloodString() {
        return disasterFlood ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_崖崩れ、土石流及び地滑り
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(崖崩れ、土石流及び地滑り)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @Nonnull
    private final Boolean disasterLandslide;

    /**
     * 災害種別_洪水を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterLandslideString() {
        return disasterLandslide ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_高潮
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(高潮)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterHighTide;

    /**
     * 災害種別_高潮を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterHighTideString() {
        return disasterHighTide ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_地震
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(地震)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterEarthquake;

    /**
     * 災害種別_地震を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterEarthquakeString() {
        return disasterEarthquake ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_津波
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(津波)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterTsunami;

    /**
     * 災害種別_津波を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterTsunamiString() {
        return disasterTsunami ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_大規模な火事
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(大規模な火事)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterLargeFire;

    /**
     * 災害種別_大規模な火事を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterLargeFireString() {
        return disasterLargeFire ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_内水氾濫
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(内水氾濫)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterInlandWaterFlooding;

    /**
     * 災害種別_内水氾濫を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterInlandWaterFloodingString() {
        return disasterInlandWaterFlooding ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 災害種別_火山現象
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(火山現象)を記載
     * 形式:対応あり：true、対応なし：false
     * </p>
     */
    @NonNull
    private final Boolean disasterVolcanicPhenomenon;

    /**
     * 災害種別_火山現象を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getDisasterVolcanicPhenomenonString() {
        return disasterVolcanicPhenomenon ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 指定避難所との重複
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が指定避難所と重複している場合は1、重複していない場合は空文字を記載
     * 形式:重複あり：true、重複なし：false
     * </p>
     */
    @NonNull
    private final Boolean overlapWithShelter;

    /**
     * 指定避難所との重複を文字列にして返す
     *
     * @return true: 1, false: 空文字
     */
    @NonNull
    @JsonIgnore
    public String getOverlapWithShelterString() {
        return overlapWithShelter ? "1" : StringUtil.EMPTY_STRING;
    }

    /**
     * 想定収容人数
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所に収容可能な人数を記載
     * 形式:数値
     * 例:810
     * </p>
     */
    @Nullable
    private final Integer capacity;

    /**
     * 想定収容人数を文字列にして返す
     *
     * @return 想定収容人数
     */
    @Nullable
    @JsonIgnore
    public String getCapacityString() {
        return Optional.ofNullable(capacity)
                .map(value -> String.format("%d人", value))
                .orElse(null);
    }

    /**
     * 対象となる町会・自治会
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所へ避難する対象の地域等を「;」（半角のセミコロン）区切りで記載。
     * 形式:文字列
     * 例:○○町;△△町
     * </p>
     */
    @Nullable
    private final String targetCommunities;

    /**
     * URL
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所のURLを記載
     * 形式:URI
     * 例:http://www.ooo.lg.jp/abc.html
     * </p>
     */
    @Nullable
    private final URL url;

    /**
     * URLを文字列にして返す
     *
     * @return URL
     */
    @Nullable
    public String getUrlString() {
        return Optional.ofNullable(url)
                .map(URL::toString)
                .orElse(null);
    }

    /**
     * 画像
     * <p>
     * 掲載区分:推奨
     * 説明:画像の格納先URLを記載。
     * 形式:URI
     * 例:http://www.city.ooo.lg.jp/image/file0101.jpg
     * </p>
     */
    @Nullable
    private final URL image;

    /**
     * 画像を文字列にして返す
     *
     * @return 画像
     */
    @Nullable
    public String getImageString() {
        return Optional.ofNullable(image)
                .map(URL::toString)
                .orElse(null);
    }

    /**
     * 画像_ライセンス
     * <p>
     * 掲載区分:推奨
     * 説明:画像に対するライセンスについて記載。
     * 形式:文字列
     * 例:CC BY 4.0
     * </p>
     */
    @Nullable
    private final License imageLicense;

    /**
     * 画像_ライセンスを文字列にして返す
     *
     * @return 画像_ライセンス
     */
    @Nullable
    @JsonIgnore
    public String getImageLicenseString() {
        return Optional.ofNullable(imageLicense)
                .map(License::getLabel)
                .orElse(null);
    }

    /**
     * 備考
     * <p>
     * 掲載区分:任意
     * 説明:特記事項等あれば記載。
     * 形式:文字列
     * </p>
     */
    @Nullable
    private final String notes;
}

