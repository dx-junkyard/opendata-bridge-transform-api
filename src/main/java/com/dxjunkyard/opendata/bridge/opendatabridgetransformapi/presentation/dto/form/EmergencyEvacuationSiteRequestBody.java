package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.form;

import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.License;
import com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.domain.model.opendata.standard.EmergencyEvacuationSite;
import io.micrometer.common.util.StringUtils;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nonnull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

@RequiredArgsConstructor
@Schema(description = "指定緊急避難場所")
@Getter
public class EmergencyEvacuationSiteRequestBody {

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
    @Schema(description = "全国地方公共団体コード。掲載区分:推奨。説明:情報の管理主体である団体の全国地方公共団体コードを6桁で記載", example = "011002")
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
    @Schema(description = "緊急避難場所ID。掲載区分:推奨。説明:地方公共団体内で指定緊急避難場所が一意に決まるよう、IDを設定し、記載", example = "CC0100022200")
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
    @Schema(description = "名称。掲載区分:必須。説明:指定緊急避難場所の通称や建物等の名前を記載", example = "○○小学校")
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
    @Schema(description = "名称_カナ。掲載区分:推奨。説明:指定緊急避難場所の通称や建物等の名前をカナで記載", example = "○○ショウガッコウ")
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
    @Schema(description = "名称_英字。掲載区分:推奨。説明:指定緊急避難場所の通称や建物等の名前を英語で記載", example = "○○elementary school")
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
    @Schema(description = "所在地_全国地方公共団体コード。掲載区分:推奨。説明:指定緊急避難場所の所在地の管理主体である団体の全国地方公共団体コードを6桁で記載", example = "011088")
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
    @Schema(description = "町字ID。掲載区分:推奨。説明 :指定緊急避難場所の住所の町字IDを記載。アドレス・ベース・レジストリのページを参照", example = "0001000")
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
    @Schema(description = "所在地_連結表記。掲載区分:必須。説明:指定緊急避難場所の住所（都道府県から建物名等までを連結した表記）を記載", example = "北海道札幌市厚別区2○-○○○ビル1階")
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
    @Schema(description = "所在地_都道府県。掲載区分:推奨。説明:指定緊急避難場所の住所（都道府県）を記載", example = "北海道")
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
    @Schema(description = "所在地_市区町村。掲載区分:推奨。説明:指定緊急避難場所の住所（市区町村）を記載", example = "札幌市")
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
    @Schema(description = "所在地_町字。掲載区分:推奨。説明:指定緊急避難場所の住所（町字）を記載", example = "厚別区2")
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
    @Schema(description = "所在地_番地以下。掲載区分:推奨。説明:指定緊急避難場所の住所（番地以下）を記載", example = "○-○")
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
    @Schema(description = "建物名等(方書)。掲載区分:任意。説明:指定緊急避難場所の住所（建物名等）を記載", example = "○○ビル1階")
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
    @Schema(description = "緯度。掲載区分:推奨。説明:指定緊急避難場所の緯度を記載", example = "43.064310")
    private final BigDecimal latitude;

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
    @Schema(description = "経度。掲載区分:推奨。説明:指定緊急避難場所の経度を記載", example = "141.346814")
    private final BigDecimal longitude;


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
    @Schema(description = "標高。掲載区分:任意。説明:指定緊急避難場所の標高を記載", example = "30.5")
    private final BigDecimal altitude;

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
    @Schema(description = "電話番号。掲載区分:必須。説明:指定緊急避難場所の連絡先（電話番号）を記載", example = "(00)0000-0000")
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
    @Schema(description = "内線番号。掲載区分:任意。説明:指定緊急避難場所の連絡先（内線番号）を記載", example = "00000")
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
    @Schema(description = "連絡先メールアドレス。掲載区分:任意。説明:指定緊急避難場所の連絡先（メールアドレス）を記載", example = "XXXX@ooo.lg.jp")
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
    @Schema(description = "連絡先FormURL。掲載区分:任意。説明:連絡先がWebFormの場合のURL", example = "http://www.ooo.lg.jp/abc.html")
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
    @Schema(description = "連絡先備考（その他、SNSなど）。掲載区分:任意。説明:SNSなどの連絡手段がある場合に記入", example = "Twitter: xxx; Instagram: xxx")
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
    @Schema(description = "郵便番号。掲載区分:任意。説明:指定緊急避難場所の郵便番号を記載", example = "1234567")
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
    @Schema(description = "市区町村コード。掲載区分:必須。説明:設置主体である市区町村コードを記載", example = "011002")
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
    @Schema(description = "地方公共団体名。掲載区分:任意。説明:設置主体である地方公共団体名を記載", example = "北海道札幌市")
    private final String organizationName;

    /**
     * 災害種別_洪水
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(火災)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @Nonnull
    @Schema(description = "災害種別_洪水。掲載区分:必須。説明:指定緊急避難場所が対応している災害(火災)を記載", example = "true")
    private final Boolean disasterFlood;

    /**
     * 災害種別_崖崩れ、土石流及び地滑り
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(崖崩れ、土石流及び地滑り)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @Nonnull
    @Schema(description = "災害種別_崖崩れ、土石流及び地滑り。掲載区分:必須。説明:指定緊急避難場所が対応している災害(崖崩れ、土石流及び地滑り)を記載", example = "true")
    private final Boolean disasterLandslide;

    /**
     * 災害種別_高潮
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(高潮)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_高潮。掲載区分:必須。説明:指定緊急避難場所が対応している災害(高潮)を記載", example = "true")
    private final Boolean disasterHighTide;

    /**
     * 災害種別_地震
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(地震)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_地震。掲載区分:必須。説明:指定緊急避難場所が対応している災害(地震)を記載", example = "true")
    private final Boolean disasterEarthquake;

    /**
     * 災害種別_津波
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(津波)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_津波。掲載区分:必須。説明:指定緊急避難場所が対応している災害(津波)を記載", example = "true")
    private final Boolean disasterTsunami;

    /**
     * 災害種別_大規模な火事
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(大規模な火事)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_大規模な火事。掲載区分:必須。説明:指定緊急避難場所が対応している災害(大規模な火事)を記載", example = "true")
    private final Boolean disasterLargeFire;

    /**
     * 災害種別_内水氾濫
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(内水氾濫)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_内水氾濫。掲載区分:必須。説明:指定緊急避難場所が対応している災害(内水氾濫)を記載", example = "true")
    private final Boolean disasterInlandWaterFlooding;

    /**
     * 災害種別_火山現象
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が対応している災害(火山現象)を記載
     * 形式:対応あり：1、対応なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "災害種別_火山現象。掲載区分:必須。説明:指定緊急避難場所が対応している災害(火山現象)を記載", example = "true")
    private final Boolean disasterVolcanicPhenomenon;

    /**
     * 指定避難所との重複
     * <p>
     * 掲載区分:必須
     * 説明:指定緊急避難場所が指定避難所と重複している場合は1、重複していない場合は空文字を記載
     * 形式:重複あり：1、重複なし：空文字
     * </p>
     */
    @NonNull
    @Schema(description = "指定避難所との重複。掲載区分:必須。説明:指定緊急避難場所が指定避難所と重複している場合は1、重複していない場合は空文字を記載", example = "true")
    private final Boolean overlapWithShelter;

    /**
     * 想定収容人数
     * <p>
     * 掲載区分:推奨
     * 説明:指定緊急避難場所に収容可能な人数を記載
     * 形式:文字列
     * 例:810
     * </p>
     */
    @Nullable
    @Schema(description = "想定収容人数。掲載区分:推奨。説明:指定緊急避難場所に収容可能な人数を記載", example = "810")
    private final Integer capacity;

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
    @Schema(description = "対象となる町会・自治会。掲載区分:推奨。説明:指定緊急避難場所へ避難する対象の地域等を「;」（半角のセミコロン）区切りで記載", example = "○○町;△△町")
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
    @Schema(description = "URL。掲載区分:推奨。説明:指定緊急避難場所のURLを記載", example = "http://www.ooo.lg.jp/abc.html")
    private final String url;

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
    @Schema(description = "画像。掲載区分:推奨。説明:画像の格納先URLを記載", example = "http://www.city.ooo.lg.jp/image/file0101.jpg")
    private final String image;

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
    @Schema(description = "画像_ライセンス。掲載区分:推奨。説明:画像に対するライセンスについて記載", example = "CC_BY_4_0")
    private final License imageLicense;

    /**
     * 備考
     * <p>
     * 掲載区分:任意
     * 説明:特記事項等あれば記載。
     * 形式:文字列
     * </p>
     */
    @Nullable
    @Schema(description = "備考。掲載区分:任意。説明:特記事項等あれば記載", example = "特記事項等あれば記載")
    private final String notes;

    @NonNull
    public EmergencyEvacuationSite toEmergencyEvacuationSite() {
        return EmergencyEvacuationSite.builder()
                .localGovCode(localGovCode)
                .id(id)
                .name(name)
                .nameKana(nameKana)
                .nameEnglish(nameEnglish)
                .addressCode(addressCode)
                .townId(townId)
                .address(address)
                .prefecture(prefecture)
                .city(city)
                .town(town)
                .addressDetail(addressDetail)
                .buildingInfo(buildingInfo)
                .latitude(latitude)
                .longitude(longitude)
                .altitude(altitude)
                .phoneNumber(phoneNumber)
                .extensionNumber(extensionNumber)
                .emailAddress(emailAddress)
                .formUrl(formUrl)
                .contactRemarks(contactRemarks)
                .postalCode(postalCode)
                .cityCode(cityCode)
                .organizationName(organizationName)
                .disasterFlood(disasterFlood)
                .disasterLandslide(disasterLandslide)
                .disasterHighTide(disasterHighTide)
                .disasterEarthquake(disasterEarthquake)
                .disasterTsunami(disasterTsunami)
                .disasterLargeFire(disasterLargeFire)
                .disasterInlandWaterFlooding(disasterInlandWaterFlooding)
                .disasterVolcanicPhenomenon(disasterVolcanicPhenomenon)
                .overlapWithShelter(overlapWithShelter)
                .capacity(capacity)
                .targetCommunities(targetCommunities)
                .url(toURL(url))
                .image(toURL(image))
                .imageLicense(imageLicense)
                .notes(notes)
                .build();
    }

    /**
     * 文字列をURLに変換する
     *
     * @param value 文字列
     * @return URL
     */
    @Nullable
    private static URL toURL(final @Nullable String value) {
        return Optional.ofNullable(value)
                .filter(StringUtils::isNotBlank)
                .map(v -> {
                    try {
                        return new URL(v);
                    } catch (final MalformedURLException e) {
                        return null;
                    }
                })
                .orElse(null);
    }
}
