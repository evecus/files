package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.os.Build;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ts.PsExtractor;
import defpackage.ay1;
import defpackage.dy1;
import defpackage.hr;
import defpackage.j0;
import defpackage.x24;
import j$.util.Comparator;
import j$.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
final class AudioDescriptorUtil {
    static final String TAG = "AudioDescriptorUtil";

    private AudioDescriptorUtil() {
    }

    public static dy1 getAllChannelMasksFromSadbs(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 34 || list == null) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor b = j0.b(it.next());
            if (b.getStandard() == 2) {
                byte[] descriptor = b.getDescriptor();
                if (descriptor.length != 3) {
                    Log.w(TAG, "Invalid SADB length: " + descriptor.length);
                } else {
                    arrayList.add(Integer.valueOf(getChannelMaskFromSadb(descriptor)));
                }
            }
        }
        List.EL.sort(arrayList, new a());
        return dy1.p(arrayList);
    }

    public static dy1 getAllLpcmChannelMasksFromPcmSads(java.util.List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            ay1 ay1Var = dy1.J;
            return x24.M;
        }
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new hr((byte) 0))));
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor b = j0.b(it.next());
            if (b.getStandard() == 1) {
                byte[] descriptor = b.getDescriptor();
                if (descriptor.length != 3) {
                    Log.w(TAG, "Invalid SAD length: " + descriptor.length);
                } else {
                    byte b2 = descriptor[0];
                    int i = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(Util.getAudioTrackChannelConfig(i)));
                    }
                }
            }
        }
        return dy1.p(treeSet);
    }

    public static int getChannelMaskFromSadb(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 34 && bArr.length == 3) {
            byte b = bArr[0];
            r2 = (b & 1) != 0 ? 12 : 0;
            if ((b & 2) != 0) {
                r2 |= 32;
            }
            if ((b & 4) != 0) {
                r2 |= 16;
            }
            if ((b & 8) != 0) {
                r2 |= PsExtractor.AUDIO_STREAM;
            }
            if ((b & 16) != 0) {
                r2 |= 1024;
            }
            if ((b & 32) != 0) {
                r2 |= 768;
            }
            if ((b & 128) != 0) {
                r2 |= 201326592;
            }
            byte b2 = bArr[1];
            if ((b2 & 1) != 0) {
                r2 |= 81920;
            }
            if ((b2 & 2) != 0) {
                r2 |= 8192;
            }
            if ((b2 & 4) != 0) {
                r2 |= 32768;
            }
            if ((b2 & 8) != 0) {
                r2 |= 6144;
            }
            if ((b2 & 16) != 0) {
                r2 |= 33554432;
            }
            if ((b2 & 32) != 0) {
                r2 |= 262144;
            }
            if ((b2 & 64) != 0) {
                r2 |= 6144;
            }
            if ((b2 & 128) != 0) {
                r2 |= 3145728;
            }
            byte b3 = bArr[2];
            if ((b3 & 1) != 0) {
                r2 |= 655360;
            }
            if ((b3 & 2) != 0) {
                r2 |= 8388608;
            }
            if ((b3 & 4) != 0) {
                return 20971520 | r2;
            }
        }
        return r2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getAllChannelMasksFromSadbs$0(Integer num, Integer num2) {
        return Integer.bitCount(num2.intValue()) - Integer.bitCount(num.intValue());
    }
}
