package androidx.media3.datasource.cache;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public class ContentMetadataMutations {
    private final Map<String, Object> editedValues = new HashMap();
    private final List<String> removedValues = new ArrayList();

    private ContentMetadataMutations checkAndSet(String str, Object obj) {
        Map<String, Object> map = this.editedValues;
        str.getClass();
        obj.getClass();
        map.put(str, obj);
        this.removedValues.remove(str);
        return this;
    }

    public static ContentMetadataMutations setContentLength(ContentMetadataMutations contentMetadataMutations, long j) {
        return contentMetadataMutations.set(ContentMetadata.KEY_CONTENT_LENGTH, j);
    }

    public static ContentMetadataMutations setRedirectedUri(ContentMetadataMutations contentMetadataMutations, Uri uri) {
        return uri == null ? contentMetadataMutations.remove(ContentMetadata.KEY_REDIRECTED_URI) : contentMetadataMutations.set(ContentMetadata.KEY_REDIRECTED_URI, uri.toString());
    }

    public Map<String, Object> getEditedValues() {
        HashMap hashMap = new HashMap(this.editedValues);
        for (Map.Entry entry : hashMap.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return DesugarCollections.unmodifiableMap(hashMap);
    }

    public List<String> getRemovedValues() {
        return DesugarCollections.unmodifiableList(new ArrayList(this.removedValues));
    }

    public ContentMetadataMutations remove(String str) {
        this.removedValues.add(str);
        this.editedValues.remove(str);
        return this;
    }

    public ContentMetadataMutations set(String str, byte[] bArr) {
        return checkAndSet(str, Arrays.copyOf(bArr, bArr.length));
    }

    public ContentMetadataMutations set(String str, long j) {
        return checkAndSet(str, Long.valueOf(j));
    }

    public ContentMetadataMutations set(String str, String str2) {
        return checkAndSet(str, str2);
    }
}
