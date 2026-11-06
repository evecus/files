package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class ie1 {
    public final String a;
    public final HashMap b = new HashMap();

    public ie1(String str) {
        this.a = str;
    }

    public final void a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            s83.t("Name must not be empty");
            return;
        }
        try {
            this.b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        if (indexOf == -1) {
            hn3.i(uri, "Unable to find path from root: ");
            return null;
        }
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.b.get(decode);
        if (file == null) {
            hn3.i(uri, "Unable to find configured root for ");
            return null;
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (FileProvider.d(canonicalFile.getPath()).startsWith(FileProvider.d(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            hn3.i(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }

    public final Uri c(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.d(canonicalPath).startsWith(FileProvider.d(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                s83.t(hf1.w("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            hn3.i(file, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
