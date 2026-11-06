package androidx.media3.exoplayer.upstream.contentsteering;

import android.net.Uri;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.media3.common.C;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import androidx.media3.exoplayer.upstream.contentsteering.SteeringManifest;
import defpackage.x24;
import defpackage.zx1;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class SteeringManifestParser implements ParsingLoadable.Parser<SteeringManifest> {
    private static final String STEERING_MANIFEST_JSON_NAME_BASE_ID = "BASE-ID";
    private static final String STEERING_MANIFEST_JSON_NAME_HOST = "HOST";
    private static final String STEERING_MANIFEST_JSON_NAME_ID = "ID";
    private static final String STEERING_MANIFEST_JSON_NAME_PARAMS = "PARAMS";
    private static final String STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES = "PATHWAY-CLONES";
    private static final String STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY = "PATHWAY-PRIORITY";
    private static final String STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS = "PER-RENDITION-URIS";
    private static final String STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS = "PER-VARIANT-URIS";
    private static final String STEERING_MANIFEST_JSON_NAME_RELOAD_URI = "RELOAD-URI";
    private static final String STEERING_MANIFEST_JSON_NAME_TTL = "TTL";
    private static final String STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT = "URI-REPLACEMENT";
    private static final String STEERING_MANIFEST_JSON_NAME_VERSION = "VERSION";

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface StringConverter<T> {
        T convert(String str);
    }

    private static <T> void parseMap(JsonReader jsonReader, StringConverter<T> stringConverter, Map<String, T> map) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                map.put(nextName, stringConverter.convert(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    private static SteeringManifest.PathwayClone parsePathwayClone(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        SteeringManifest.UriReplacement uriReplacement = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(STEERING_MANIFEST_JSON_NAME_BASE_ID) && jsonReader.peek().equals(JsonToken.STRING)) {
                str = jsonReader.nextString();
            } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_ID) && jsonReader.peek().equals(JsonToken.STRING)) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_URI_REPLACEMENT) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                uriReplacement = parseUriReplacement(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw ParserException.createForMalformedSteeringManifest("BASE-ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (str2 == null) {
            throw ParserException.createForMalformedSteeringManifest("ID field is missing in a PATHWAY-CLONE object", null);
        }
        if (uriReplacement != null) {
            return new SteeringManifest.PathwayClone(str, str2, uriReplacement);
        }
        throw ParserException.createForMalformedSteeringManifest("URI-REPLACEMENT field is missing in a PATHWAY-CLONE object", null);
    }

    private static void parsePathwayClonesArray(JsonReader jsonReader, zx1 zx1Var) {
        jsonReader.beginArray();
        boolean z = false;
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                zx1Var.c(parsePathwayClone(jsonReader));
                z = true;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (!z) {
            throw ParserException.createForMalformedSteeringManifest("The PATHWAY-CLONES array is present but empty", null);
        }
    }

    private static void parsePathwayPriorityArray(JsonReader jsonReader, zx1 zx1Var) {
        HashSet hashSet = new HashSet();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            if (jsonReader.peek().equals(JsonToken.STRING)) {
                String nextString = jsonReader.nextString();
                if (!hashSet.add(nextString)) {
                    throw ParserException.createForMalformedSteeringManifest("The pathway ID (" + nextString + ") appears more than once in the PATHWAY-PRIORITY array", null);
                }
                zx1Var.c(nextString);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endArray();
        if (hashSet.isEmpty()) {
            throw ParserException.createForMalformedSteeringManifest("The PATHWAY-PRIORITY array is present but empty", null);
        }
    }

    private static SteeringManifest.UriReplacement parseUriReplacement(JsonReader jsonReader) {
        jsonReader.beginObject();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        String str = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(STEERING_MANIFEST_JSON_NAME_HOST) && jsonReader.peek().equals(JsonToken.STRING)) {
                str = jsonReader.nextString();
                if (str.isEmpty()) {
                    throw ParserException.createForMalformedSteeringManifest("The HOST string is present but empty", null);
                }
            } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_PARAMS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                final byte b = 0;
                parseMap(jsonReader, new StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                    @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                    public final Object convert(String str2) {
                        String lambda$parseUriReplacement$0;
                        switch (b) {
                            case 0:
                                lambda$parseUriReplacement$0 = SteeringManifestParser.lambda$parseUriReplacement$0(str2);
                                return lambda$parseUriReplacement$0;
                            default:
                                return Uri.parse(str2);
                        }
                    }
                }, hashMap);
            } else {
                final byte b2 = 1;
                if (nextName.equals(STEERING_MANIFEST_JSON_NAME_PER_VARIANT_URIS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                    parseMap(jsonReader, new StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                        @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                        public final Object convert(String str2) {
                            String lambda$parseUriReplacement$0;
                            switch (b2) {
                                case 0:
                                    lambda$parseUriReplacement$0 = SteeringManifestParser.lambda$parseUriReplacement$0(str2);
                                    return lambda$parseUriReplacement$0;
                                default:
                                    return Uri.parse(str2);
                            }
                        }
                    }, hashMap2);
                } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_PER_RENDITION_URIS) && jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                    parseMap(jsonReader, new StringConverter() { // from class: androidx.media3.exoplayer.upstream.contentsteering.a
                        @Override // androidx.media3.exoplayer.upstream.contentsteering.SteeringManifestParser.StringConverter
                        public final Object convert(String str2) {
                            String lambda$parseUriReplacement$0;
                            switch (b2) {
                                case 0:
                                    lambda$parseUriReplacement$0 = SteeringManifestParser.lambda$parseUriReplacement$0(str2);
                                    return lambda$parseUriReplacement$0;
                                default:
                                    return Uri.parse(str2);
                            }
                        }
                    }, hashMap3);
                } else {
                    jsonReader.skipValue();
                }
            }
        }
        jsonReader.endObject();
        return new SteeringManifest.UriReplacement(str, hashMap, hashMap2, hashMap3);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public SteeringManifest parse(Uri uri, InputStream inputStream) {
        long j;
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream));
        try {
            if (!jsonReader.peek().equals(JsonToken.BEGIN_OBJECT)) {
                throw ParserException.createForMalformedSteeringManifest("Steering manifest JSON should be an object at root", null);
            }
            zx1 zx1Var = new zx1(4);
            zx1 zx1Var2 = new zx1(4);
            jsonReader.beginObject();
            long j2 = C.TIME_UNSET;
            Uri uri2 = null;
            int i = 1;
            loop0: while (true) {
                j = j2;
                while (jsonReader.hasNext()) {
                    String nextName = jsonReader.nextName();
                    if (nextName.equals(STEERING_MANIFEST_JSON_NAME_VERSION) && jsonReader.peek().equals(JsonToken.NUMBER)) {
                        i = jsonReader.nextInt();
                    } else if (!nextName.equals(STEERING_MANIFEST_JSON_NAME_TTL) || !jsonReader.peek().equals(JsonToken.NUMBER)) {
                        if (nextName.equals(STEERING_MANIFEST_JSON_NAME_RELOAD_URI) && jsonReader.peek().equals(JsonToken.STRING)) {
                            uri2 = Uri.parse(jsonReader.nextString());
                        } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_PRIORITY) && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                            parsePathwayPriorityArray(jsonReader, zx1Var);
                        } else if (nextName.equals(STEERING_MANIFEST_JSON_NAME_PATHWAY_CLONES) && jsonReader.peek().equals(JsonToken.BEGIN_ARRAY)) {
                            parsePathwayClonesArray(jsonReader, zx1Var2);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                }
                j2 = jsonReader.nextInt() * 1000;
            }
            jsonReader.endObject();
            x24 f = zx1Var.f();
            if (f.isEmpty()) {
                throw ParserException.createForMalformedSteeringManifest("PATHWAY-PRIORITY field is missing", null);
            }
            SteeringManifest steeringManifest = new SteeringManifest(i, j, uri2, f, zx1Var2.f());
            jsonReader.close();
            return steeringManifest;
        } catch (Throwable th) {
            try {
                jsonReader.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$parseUriReplacement$0(String str) {
        return str;
    }
}
