package defpackage;

import com.github.mytv.dv.model.MixPlaylistPagination;
import java.util.List;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class tw3 {
    public final List a;
    public final int b;
    public final String c;
    public final MixPlaylistPagination d;
    public final long e;

    public /* synthetic */ tw3(List list, int i, String str, MixPlaylistPagination mixPlaylistPagination, int i2) {
        this(list, i, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : mixPlaylistPagination, System.nanoTime());
    }

    public static tw3 a(tw3 tw3Var, List list, int i, MixPlaylistPagination mixPlaylistPagination, int i2) {
        if ((i2 & 2) != 0) {
            i = tw3Var.b;
        }
        int i3 = i;
        String str = tw3Var.c;
        if ((i2 & 8) != 0) {
            mixPlaylistPagination = tw3Var.d;
        }
        long j = tw3Var.e;
        tw3Var.getClass();
        return new tw3(list, i3, str, mixPlaylistPagination, j);
    }

    public final long b() {
        return this.e;
    }

    public final MixPlaylistPagination c() {
        return this.d;
    }

    public final int d() {
        return this.b;
    }

    public final List e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw3)) {
            return false;
        }
        tw3 tw3Var = (tw3) obj;
        return j42.c(this.a, tw3Var.a) && this.b == tw3Var.b && j42.c(this.c, tw3Var.c) && j42.c(this.d, tw3Var.d) && this.e == tw3Var.e;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        MixPlaylistPagination mixPlaylistPagination = this.d;
        int hashCode3 = mixPlaylistPagination != null ? mixPlaylistPagination.hashCode() : 0;
        long j = this.e;
        return ((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerContext(videos=");
        sb.append(this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", channelTagId=");
        sb.append(this.c);
        sb.append(", mixPlaylist=");
        sb.append(this.d);
        sb.append(", contextId=");
        return r7.D(sb, this.e, ")");
    }

    public tw3(List list, int i, String str, MixPlaylistPagination mixPlaylistPagination, long j) {
        this.a = list;
        this.b = i;
        this.c = str;
        this.d = mixPlaylistPagination;
        this.e = j;
    }
}
