package androidx.media3.common;

import androidx.media3.common.MediaMetadata;
import androidx.media3.common.util.Util;
import defpackage.dy1;
import defpackage.jl2;
import defpackage.mr3;
import defpackage.sr3;
import defpackage.zx1;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class Metadata {
    private final Entry[] entries;
    public final long presentationTimeUs;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public interface Entry {
        byte[] getWrappedMetadataBytes();

        Format getWrappedMetadataFormat();

        void populateMediaMetadata(MediaMetadata.Builder builder);
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    private <T extends Entry> T entryIfMatches(Entry entry, Class<T> cls, mr3 mr3Var) {
        if (!cls.isAssignableFrom(entry.getClass())) {
            return null;
        }
        T cast = cls.cast(entry);
        if (mr3Var.apply(cast)) {
            return cast;
        }
        return null;
    }

    public Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new Metadata(j, this.entries);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            Metadata metadata = (Metadata) obj;
            if (Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs) {
                return true;
            }
        }
        return false;
    }

    public Entry get(int i) {
        return this.entries[i];
    }

    public <T extends Entry> dy1 getEntriesOfType(Class<T> cls) {
        zx1 n = dy1.n();
        for (Entry entry : this.entries) {
            if (cls.isAssignableFrom(entry.getClass())) {
                n.c(cls.cast(entry));
            }
        }
        return n.f();
    }

    public <T extends Entry> T getFirstEntryOfType(Class<T> cls) {
        return (T) getFirstMatchingEntry(cls, sr3.I);
    }

    public <T extends Entry> T getFirstMatchingEntry(Class<T> cls, mr3 mr3Var) {
        for (Entry entry : this.entries) {
            T t = (T) entryIfMatches(entry, cls, mr3Var);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public <T extends Entry> dy1 getMatchingEntries(Class<T> cls, mr3 mr3Var) {
        zx1 n = dy1.n();
        for (Entry entry : this.entries) {
            Entry entryIfMatches = entryIfMatches(entry, cls, mr3Var);
            if (entryIfMatches != null) {
                n.c(entryIfMatches);
            }
        }
        return n.f();
    }

    public int hashCode() {
        return jl2.L(this.presentationTimeUs) + (Arrays.hashCode(this.entries) * 31);
    }

    public int length() {
        return this.entries.length;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == C.TIME_UNSET) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.presentationTimeUs;
        }
        sb.append(str);
        return sb.toString();
    }

    public Metadata(long j, Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }
}
