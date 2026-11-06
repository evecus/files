package androidx.media3.common.util;

import defpackage.sp0;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public abstract class LibraryLoader {
    private static final String TAG = "LibraryLoader";
    private boolean isAvailable;
    private boolean loadAttempted;
    private String[] nativeLibraries;

    public LibraryLoader(String... strArr) {
        this.nativeLibraries = strArr;
    }

    public synchronized boolean isAvailable() {
        if (this.loadAttempted) {
            return this.isAvailable;
        }
        this.loadAttempted = true;
        try {
            for (String str : this.nativeLibraries) {
                loadLibrary(str);
            }
            this.isAvailable = true;
        } catch (UnsatisfiedLinkError e) {
            Log.w(TAG, "Failed to load " + Arrays.toString(this.nativeLibraries), e);
        }
        return this.isAvailable;
    }

    public abstract void loadLibrary(String str);

    public synchronized void setLibraries(String... strArr) {
        sp0.A(!this.loadAttempted, "Cannot set libraries after loading");
        this.nativeLibraries = strArr;
    }
}
