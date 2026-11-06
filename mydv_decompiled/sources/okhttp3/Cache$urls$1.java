package okhttp3;

import defpackage.i42;
import defpackage.sv2;
import defpackage.w72;
import defpackage.zy;
import java.io.IOException;
import java.util.Iterator;
import okhttp3.internal.cache.DiskLruCache;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, w72 {
    private boolean canRemove;
    private final Iterator<DiskLruCache.Snapshot> delegate;
    private String nextUrl;

    public Cache$urls$1(Cache cache) {
        this.delegate = cache.getCache$okhttp().snapshots();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.nextUrl != null) {
            return true;
        }
        this.canRemove = false;
        while (this.delegate.hasNext()) {
            try {
                DiskLruCache.Snapshot next = this.delegate.next();
                try {
                    continue;
                    this.nextUrl = sv2.m(next.getSource(0)).w(Long.MAX_VALUE);
                    i42.h0(next, null);
                    return true;
                } finally {
                    try {
                        continue;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public String next() {
        if (!hasNext()) {
            zy.k();
            return null;
        }
        String str = this.nextUrl;
        str.getClass();
        this.nextUrl = null;
        this.canRemove = true;
        return str;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (this.canRemove) {
            this.delegate.remove();
        } else {
            zy.i("remove() before next()");
        }
    }
}
