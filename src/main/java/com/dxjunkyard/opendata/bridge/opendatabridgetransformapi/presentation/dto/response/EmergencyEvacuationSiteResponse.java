package com.dxjunkyard.opendata.bridge.opendatabridgetransformapi.presentation.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

@RequiredArgsConstructor
@Schema(description = "指定緊急避難場所の情報")
@Getter
@Builder
public class EmergencyEvacuationSiteResponse {

    @Schema(description = "全国地方公共団体コード。掲載区分 : 推奨。説明 : 情報の管理主体である団体の全国地方公共団体コードを6桁で記載", example = "011002", nullable = true)
    @Nullable
    private final String localGovCode;

    @Schema(description = "緊急避難場所ID。掲載区分 : 推奨。説明 : 地方公共団体内で指定緊急避難場所が一意に決まるよう、IDを設定し、記載", example = "CC0100022200", nullable = true)
    @Nullable
    private final String id;

    @Schema(description = "名称。掲載区分 : 必須。説明 : 指定緊急避難場所の通称や建物等の名前を記載", example = "○○小学校")
    @NonNull
    private final String name;

    @Schema(description = "名称_カナ。掲載区分 : 推奨。説明 : 指定緊急避難場所の通称や建物等の名前をカナで記載", example = "○○ショウガッコウ", nullable = true)
    @Nullable
    private final String nameKana;

    @Schema(description = "名称_英字。掲載区分 : 推奨。説明 : 指定緊急避難場所の通称や建物等の名前を英語で記載", example = "○○elementary school", nullable = true)
    @Nullable
    private final String nameEnglish;

    @Schema(description = "所在地_全国地方公共団体コード。掲載区分 : 推奨。説明 : 指定緊急避難場所の所在地の管理主体である団体の全国地方公共団体コードを6桁で記載", example = "011088", nullable = true)
    @Nullable
    private final String addressCode;

    @Schema(description = "町字ID。掲載区分 : 推奨。説明 :指定緊急避難場所の住所の町字IDを記載。アドレス・ベース・レジストリのページを参照", example = "0001000", nullable = true)
    @Nullable
    private final String townId;

    @Schema(description = "所在地_連結表記。掲載区分 : 必須。説明 : 指定緊急避難場所の住所（都道府県から建物名等までを連結した表記）を記載", example = "北海道札幌市厚別区2○-○○○ビル1階")
    @NonNull
    private final String address;

    @Schema(description = "所在地_都道府県。掲載区分 : 推奨。説明 : 指定緊急避難場所の住所（都道府県）を記載", example = "北海道", nullable = true)
    @Nullable
    private final String prefecture;

    @Schema(description = "所在地_市区町村。掲載区分 : 推奨。説明 : 指定緊急避難場所の住所（市区町村）を記載", example = "札幌市", nullable = true)
    @Nullable
    private final String city;

    @Schema(description = "所在地_町字。掲載区分 : 推奨。説明 : 指定緊急避難場所の住所（町字）を記載", example = "厚別区2", nullable = true)
    @Nullable
    private final String town;

    @Schema(description = "所在地_番地以下。掲載区分 : 推奨。説明 : 指定緊急避難場所の住所（番地以下）を記載", example = "○-○", nullable = true)
    @Nullable
    private final String addressDetail;

    @Schema(description = "建物名等(方書)。掲載区分 : 任意。説明 : 指定緊急避難場所の住所（建物名等）を記載", example = "○○ビル1階", nullable = true)
    @Nullable
    private final String buildingInfo;

    @Schema(description = "緯度。掲載区分 : 推奨。説明 : 指定緊急避難場所の緯度を記載", example = "43.064310", nullable = true)
    @Nullable
    private final String latitude;

    @Schema(description = "経度。掲載区分 : 推奨。説明 : 指定緊急避難場所の経度を記載", example = "141.346814", nullable = true)
    @Nullable
    private final String longitude;

    @Schema(description = "標高。掲載区分 : 任意。説明 : 指定緊急避難場所の標高を記載", example = "30.5", nullable = true)
    @Nullable
    private final String altitude;

    @Schema(description = "電話番号。掲載区分 : 必須。説明 : 指定緊急避難場所の連絡先（電話番号）を記載", example = "(00)0000-0000")
    @NonNull
    private final String phoneNumber;

    @Schema(description = "内線番号。掲載区分 : 任意。説明 : 指定緊急避難場所の連絡先（内線番号）を記載", example = "00000", nullable = true)
    @Nullable
    private final String extensionNumber;

    @Schema(description = "連絡先メールアドレス。掲載区分 : 任意。説明 : 指定緊急避難場所の連絡先（メールアドレス）を記載", example = "XXXX@ooo.lg.jp", nullable = true)
    @Nullable
    private final String emailAddress;

    @Schema(description = "連絡先FormURL。掲載区分 : 任意。説明 : 連絡先がWebFormの場合のURL", example = "http://www.ooo.lg.jp/abc.html", nullable = true)
    @Nullable
    private final String formUrl;

    @Schema(description = "連絡先備考（その他、SNSなど）。掲載区分 : 任意。説明 : SNSなどの連絡手段がある場合に記入", example = "Twitter: xxx; Instagram: xxx", nullable = true)
    @Nullable
    private final String contactRemarks;

    @Schema(description = "郵便番号。掲載区分 : 任意。説明 : 指定緊急避難場所の郵便番号を記載", example = "1234567", nullable = true)
    @Nullable
    private final String postalCode;

    @Schema(description = "市区町村コード。掲載区分 : 必須。説明 : 設置主体である市区町村コードを記載。形式 : 文字列（半角数字）", example = "011002")
    @NonNull
    private final String cityCode;

    @Schema(description = "地方公共団体名。掲載区分 : 任意。説明 : 設置主体である地方公共団体名を記載", example = "北海道札幌市", nullable = true)
    @Nullable
    private final String organizationName;

    @Schema(description = "災害種別_洪水。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(洪水)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterFlood;

    @Schema(description = "災害種別_崖崩れ、土石流及び地滑り。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(崖崩れ、土石流及び地滑り)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterLandslide;

    @Schema(description = "災害種別_高潮。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(高潮)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterHighTide;

    @Schema(description = "災害種別_地震。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(地震)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterEarthquake;

    @Schema(description = "災害種別_津波。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(津波)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterTsunami;

    @Schema(description = "災害種別_大規模な火事。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(大規模な火事)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterLargeFire;

    @Schema(description = "災害種別_内水氾濫。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(内水氾濫)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterInlandWaterFlooding;

    @Schema(description = "災害種別_火山現象。掲載区分 : 必須。説明 : 指定緊急避難場所が対応している災害(火山現象)を記載。形式 : 対応あり：1、対応なし：空文字")
    @NonNull
    private final String disasterVolcanicPhenomenon;

    @Schema(description = "指定避難所との重複。掲載区分 : 必須。説明 : 指定緊急避難場所が指定避難所と重複している場合は1、重複していない場合は空文字を記載。形式 : 重複している：1、重複していない：空文字")
    @NonNull
    private final String overlapWithShelter;

    @Schema(description = "想定収容人数。掲載区分 : 推奨。説明 : 指定緊急避難場所に収容可能な人数を記載。形式 : 文字列", example = "810人（2平方メートルあたり1人）", nullable = true)
    @Nullable
    private final String capacity;

    @Schema(description = "対象となる町会・自治会。掲載区分 : 推奨。説明 : 指定緊急避難場所へ避難する対象の地域等を「;」（半角のセミコロン）区切りで記載。形式 : 文字列", example = "○○町;△△町", nullable = true)
    @Nullable
    private final String targetCommunities;

    @Schema(description = "URL。掲載区分 : 推奨。説明 : 指定緊急避難場所のURLを記載。形式 : URI", example = "http://www.ooo.lg.jp/abc.html", nullable = true)
    @Nullable
    private final String url;

    @Schema(description = "画像。掲載区分 : 推奨。説明 : 画像の格納先URLを記載。形式 : URI", example = "http://www.city.ooo.lg.jp/image/file0101.jpg", nullable = true)
    @Nullable
    private final String image;

    @Schema(description = "画像_ライセンス。掲載区分 : 推奨。説明 : 画像に対するライセンスについて記載。形式 : 文字列", example = "CC BY 4.0", nullable = true)
    @Nullable
    private final String imageLicense;

    @Schema(description = "備考。掲載区分 : 任意。説明 : 特記事項等あれば記載。形式 : 文字列", nullable = true)
    @Nullable
    private final String notes;

}
