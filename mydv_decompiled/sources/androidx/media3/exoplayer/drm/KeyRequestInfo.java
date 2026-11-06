package androidx.media3.exoplayer.drm;

import androidx.media3.common.DrmInitData;
import androidx.media3.exoplayer.source.LoadEventInfo;
import defpackage.dy1;
import defpackage.zx1;
import java.util.List;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class KeyRequestInfo {
    public final dy1 loadInfos;
    public final dy1 schemeDatas;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Builder {
        private final zx1 loadEventInfos = dy1.n();
        private dy1 schemeDatas;

        public Builder addLoadInfo(LoadEventInfo loadEventInfo) {
            this.loadEventInfos.c(loadEventInfo);
            return this;
        }

        @SideEffectFree
        public KeyRequestInfo build() {
            return new KeyRequestInfo(this);
        }

        public Builder setSchemeDatas(List<DrmInitData.SchemeData> list) {
            this.schemeDatas = dy1.p(list);
            return this;
        }
    }

    private KeyRequestInfo(Builder builder) {
        this.loadInfos = builder.loadEventInfos.f();
        this.schemeDatas = builder.schemeDatas;
    }
}
