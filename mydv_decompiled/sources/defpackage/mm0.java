package defpackage;

import android.os.Bundle;
import android.util.Pair;
import androidx.media3.common.Format;
import androidx.media3.common.Label;
import androidx.media3.common.MediaItem;
import androidx.media3.common.StreamKey;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import androidx.media3.common.audio.DefaultGainProvider;
import androidx.media3.common.text.Cue;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import j$.util.Objects;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final /* synthetic */ class mm0 implements pn1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ mm0(byte b) {
        this.a = b;
    }

    @Override // defpackage.pn1
    public final Object apply(Object obj) {
        Float lambda$new$0;
        String lambda$toLogString$0;
        int i;
        Integer lambda$getTrackTypes$0;
        byte b = 1;
        switch (this.a) {
            case 0:
                return ((Cue) obj).toSerializableBundle();
            case 1:
                return Cue.fromBundle((Bundle) obj);
            case 2:
                return ((Cue) obj).toBinderBasedBundle();
            case 3:
                lambda$new$0 = DefaultGainProvider.Builder.lambda$new$0((Pair) obj);
                return lambda$new$0;
            case 4:
                return ((TrackGroupArray) obj).toBundle();
            case 5:
                return ((DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 6:
                return TrackGroupArray.fromBundle((Bundle) obj);
            case 7:
                return DefaultTrackSelector.SelectionOverride.fromBundle((Bundle) obj);
            case 8:
                return ((Label) obj).toBundle();
            case 9:
                return Label.fromBundle((Bundle) obj);
            case 10:
                lambda$toLogString$0 = Format.lambda$toLogString$0((Label) obj);
                return lambda$toLogString$0;
            case 11:
                return ((StreamKey) obj).toBundle();
            case 12:
                return ((MediaItem.SubtitleConfiguration) obj).toBundle();
            case 13:
                return StreamKey.fromBundle((Bundle) obj);
            case 14:
                return MediaItem.SubtitleConfiguration.fromBundle((Bundle) obj);
            case 15:
                String str = (String) obj;
                k50 k50Var = nx2.g;
                k50Var.getClass();
                int length = str.length() - 1;
                while (true) {
                    if (length >= 0) {
                        if (k50Var.b(str.charAt(length))) {
                            length--;
                        } else {
                            b = 0;
                        }
                    }
                }
                if (b != 0 && !str.isEmpty()) {
                    return str;
                }
                StringBuilder sb = new StringBuilder(str.length() + 16);
                sb.append('\"');
                while (r0 < str.length()) {
                    char charAt = str.charAt(r0);
                    if (charAt == '\r' || charAt == '\\' || charAt == '\"') {
                        sb.append('\\');
                    }
                    sb.append(charAt);
                    r0++;
                }
                sb.append('\"');
                return sb.toString();
            case 16:
                Collection collection = (Collection) obj;
                int i2 = qy1.L;
                if (collection instanceof qy1) {
                    return (qy1) collection;
                }
                boolean z = collection instanceof qy1;
                if (z) {
                    d34 d34Var = (d34) ((qy1) collection);
                    py1 py1Var = d34Var.O;
                    if (py1Var == null) {
                        py1Var = new py1(d34Var, b);
                        d34Var.O = py1Var;
                    }
                    i = py1Var.size();
                } else {
                    i = 11;
                }
                oy1 oy1Var = new oy1();
                oy1Var.b = false;
                ad3 ad3Var = new ad3();
                ad3Var.d(i);
                oy1Var.a = ad3Var;
                if (z) {
                    qy1 qy1Var = (qy1) collection;
                    ad3 ad3Var2 = qy1Var instanceof d34 ? ((d34) qy1Var).M : null;
                    if (ad3Var2 != null) {
                        ad3Var.a(Math.max(ad3Var.c, ad3Var2.c));
                        r0 = ad3Var2.c == 0 ? -1 : 0;
                        while (r0 >= 0) {
                            sp0.u(r0, ad3Var2.c);
                            Object obj2 = ad3Var2.a[r0];
                            sp0.u(r0, ad3Var2.c);
                            oy1Var.c(ad3Var2.b[r0], obj2);
                            r0++;
                            if (r0 >= ad3Var2.c) {
                                r0 = -1;
                            }
                        }
                    } else {
                        sy1 m = qy1Var.m();
                        ad3 ad3Var3 = oy1Var.a;
                        ad3Var3.a(Math.max(ad3Var3.c, m.size()));
                        for (zc3 zc3Var : qy1Var.m()) {
                            oy1Var.c(zc3Var.a(), zc3Var.a);
                        }
                    }
                } else {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        oy1Var.a(it.next());
                    }
                }
                Objects.requireNonNull(oy1Var.a);
                if (oy1Var.a.c == 0) {
                    return d34.P;
                }
                oy1Var.b = true;
                return new d34(oy1Var.a);
            case 17:
                return new StringIndexOutOfBoundsException((String) obj);
            case 18:
                return Format.fromBundle((Bundle) obj);
            case 19:
                lambda$getTrackTypes$0 = TrackGroupArray.lambda$getTrackTypes$0((TrackGroup) obj);
                return lambda$getTrackTypes$0;
            case 20:
                return ((TrackGroup) obj).toBundle();
            case 21:
                return TrackGroup.fromBundle((Bundle) obj);
            case 22:
                return ((TrackSelectionOverride) obj).toBundle();
            case 23:
                return TrackSelectionOverride.fromBundle((Bundle) obj);
            case 24:
                return ((Tracks.Group) obj).toBundle();
            default:
                return Tracks.Group.fromBundle((Bundle) obj);
        }
    }
}
