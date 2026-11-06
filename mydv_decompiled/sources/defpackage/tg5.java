package defpackage;

import coil3.disk.DiskCache;
import coil3.disk.UtilsKt;
import com.github.mytv.dv.model.Video;
import com.github.mytv.dv.model.VideoBigThumb;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final /* synthetic */ class tg5 implements rm1 {
    public final /* synthetic */ byte I;

    public /* synthetic */ tg5(byte b) {
        this.I = b;
    }

    @Override // defpackage.rm1
    public final Object invoke() {
        DiskCache instance_delegate$lambda$0;
        KSerializer _childSerializers$_anonymous_;
        KSerializer _childSerializers$_anonymous_$0;
        KSerializer _childSerializers$_anonymous_2;
        switch (this.I) {
            case 0:
                instance_delegate$lambda$0 = UtilsKt.instance_delegate$lambda$0();
                return instance_delegate$lambda$0;
            case 1:
                return wd5.a;
            case 2:
                _childSerializers$_anonymous_ = Video._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_;
            case 3:
                _childSerializers$_anonymous_$0 = Video._childSerializers$_anonymous_$0();
                return _childSerializers$_anonymous_$0;
            default:
                _childSerializers$_anonymous_2 = VideoBigThumb._childSerializers$_anonymous_();
                return _childSerializers$_anonymous_2;
        }
    }
}
