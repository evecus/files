package androidx.media3.exoplayer.audio;

import androidx.media3.common.util.Util;
import defpackage.s83;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes.dex */
public final class PcmAudioUtil {
    private PcmAudioUtil() {
    }

    public static ByteBuffer rampUpVolume(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        while (byteBuffer.hasRemaining() && i3 < i4) {
            write32BitIntPcm(order, (int) ((readAs32BitIntPcm(byteBuffer, i) * i3) / i4), i);
            if (byteBuffer.position() == position + i2) {
                i3++;
                position = byteBuffer.position();
            }
        }
        order.put(byteBuffer);
        order.flip();
        return order;
    }

    public static int readAs32BitIntPcm(ByteBuffer byteBuffer, int i) {
        if (i == 2) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i == 3) {
            return ((byteBuffer.get() & 255) - 128) << 24;
        }
        if (i == 4) {
            float constrainValue = Util.constrainValue(byteBuffer.getFloat(), -1.0f, 1.0f);
            return constrainValue < 0.0f ? (int) ((-constrainValue) * (-2.1474836E9f)) : (int) (constrainValue * 2.1474836E9f);
        }
        if (i == 21) {
            return ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i == 22) {
            return ((byteBuffer.get() & 255) << 24) | (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
        }
        if (i == 268435456) {
            return ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
        }
        if (i == 1342177280) {
            return ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
        }
        if (i == 1610612736) {
            return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
        }
        if (i == 1879048192) {
            double constrainValue2 = Util.constrainValue(byteBuffer.getDouble(), -1.0d, 1.0d);
            return constrainValue2 < 0.0d ? (int) ((-constrainValue2) * (-2.147483648E9d)) : (int) (constrainValue2 * 2.147483647E9d);
        }
        if (i == 1895825408) {
            float constrainValue3 = Util.constrainValue(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
            return constrainValue3 < 0.0f ? (int) ((-constrainValue3) * (-2.1474836E9f)) : (int) (constrainValue3 * 2.1474836E9f);
        }
        if (i == 1912602624) {
            double constrainValue4 = Util.constrainValue(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), -1.0d, 1.0d);
            return constrainValue4 < 0.0d ? (int) ((-constrainValue4) * (-2.147483648E9d)) : (int) (constrainValue4 * 2.147483647E9d);
        }
        s83.r();
        return 0;
    }

    public static void write32BitIntPcm(ByteBuffer byteBuffer, int i, int i2) {
        if (i2 == 2) {
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 3) {
            byteBuffer.put((byte) ((i >> 24) + 128));
            return;
        }
        if (i2 == 4) {
            if (i < 0) {
                byteBuffer.putFloat((-i) / (-2.1474836E9f));
                return;
            } else {
                byteBuffer.putFloat(i / 2.1474836E9f);
                return;
            }
        }
        if (i2 == 21) {
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 22) {
            byteBuffer.put((byte) i);
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 24));
            return;
        }
        if (i2 == 268435456) {
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            return;
        }
        if (i2 == 1342177280) {
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
            return;
        }
        if (i2 == 1610612736) {
            byteBuffer.put((byte) (i >> 24));
            byteBuffer.put((byte) (i >> 16));
            byteBuffer.put((byte) (i >> 8));
            byteBuffer.put((byte) i);
            return;
        }
        if (i2 == 1879048192) {
            if (i < 0) {
                byteBuffer.putDouble((-i) / (-2.147483648E9d));
                return;
            } else {
                byteBuffer.putDouble(i / 2.147483647E9d);
                return;
            }
        }
        if (i2 == 1895825408) {
            byteBuffer.putInt(Integer.reverseBytes(Float.floatToIntBits(i < 0 ? (-i) / (-2.1474836E9f) : i / 2.1474836E9f)));
        } else if (i2 == 1912602624) {
            byteBuffer.putLong(Long.reverseBytes(Double.doubleToLongBits(i < 0 ? (-i) / (-2.147483648E9d) : i / 2.147483647E9d)));
        } else {
            s83.r();
        }
    }
}
