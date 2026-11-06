package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import defpackage.b00;
import defpackage.dy1;
import defpackage.j42;
import defpackage.ux1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class AssetListParser implements ParsingLoadable.Parser<Pair<HlsInterstitialsAdsLoader.AssetList, JSONObject>> {
    private static final String ASSET_LIST_JSON_NAME_ASSET_ARRAY = "ASSETS";
    private static final String ASSET_LIST_JSON_NAME_DURATION = "DURATION";
    private static final String ASSET_LIST_JSON_NAME_LABEL_ID = "LABEL-ID";
    private static final String ASSET_LIST_JSON_NAME_OFFSET = "OFFSET";
    private static final String ASSET_LIST_JSON_NAME_SKIP_CONTROL = "SKIP-CONTROL";
    private static final String ASSET_LIST_JSON_NAME_URI = "URI";

    private static HlsInterstitialsAdsLoader.AssetList getAssetListFromRawJson(JSONObject jSONObject) {
        if (!jSONObject.has(ASSET_LIST_JSON_NAME_ASSET_ARRAY)) {
            throw new JSONException("missing ASSETS attribute");
        }
        j42.l(4, "initialCapacity");
        Object[] objArr = new Object[4];
        JSONArray jSONArray = jSONObject.getJSONArray(ASSET_LIST_JSON_NAME_ASSET_ARRAY);
        int i = 0;
        int i2 = 0;
        while (i < jSONArray.length()) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_URI)) {
                throw new JSONException("missing URI attribute");
            }
            if (!jSONObject2.has(ASSET_LIST_JSON_NAME_DURATION)) {
                throw new JSONException("missing DURATION attribute");
            }
            HlsInterstitialsAdsLoader.Asset asset = new HlsInterstitialsAdsLoader.Asset(Uri.parse(jSONObject2.getString(ASSET_LIST_JSON_NAME_URI)), (long) (jSONObject2.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d));
            int i3 = i2 + 1;
            int b = ux1.b(objArr.length, i3);
            if (b > objArr.length) {
                objArr = Arrays.copyOf(objArr, b);
            }
            objArr[i2] = asset;
            i++;
            i2 = i3;
        }
        AdPlaybackState.SkipInfo skipInfo = null;
        if (jSONObject.has(ASSET_LIST_JSON_NAME_SKIP_CONTROL)) {
            JSONObject jSONObject3 = jSONObject.getJSONObject(ASSET_LIST_JSON_NAME_SKIP_CONTROL);
            skipInfo = new AdPlaybackState.SkipInfo(jSONObject3.has(ASSET_LIST_JSON_NAME_OFFSET) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_OFFSET) * 1000000.0d) : 0L, jSONObject3.has(ASSET_LIST_JSON_NAME_DURATION) ? (long) (jSONObject3.getDouble(ASSET_LIST_JSON_NAME_DURATION) * 1000000.0d) : C.TIME_UNSET, jSONObject3.has(ASSET_LIST_JSON_NAME_LABEL_ID) ? jSONObject3.getString(ASSET_LIST_JSON_NAME_LABEL_ID) : null);
        }
        return new HlsInterstitialsAdsLoader.AssetList(dy1.m(i2, objArr), skipInfo);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public Pair<HlsInterstitialsAdsLoader.AssetList, JSONObject> parse(Uri uri, InputStream inputStream) {
        try {
            JSONObject jSONObject = new JSONObject(new String(b00.b(inputStream), StandardCharsets.UTF_8));
            return new Pair<>(getAssetListFromRawJson(jSONObject), jSONObject);
        } catch (IOException | JSONException e) {
            throw ParserException.createForMalformedManifest(e.getMessage(), e);
        }
    }
}
