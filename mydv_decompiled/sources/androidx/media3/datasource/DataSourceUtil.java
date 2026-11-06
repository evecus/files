package androidx.media3.datasource;

import defpackage.r7;
import defpackage.zy;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static void closeQuietly(DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (IOException unused) {
            }
        }
    }

    public static byte[] readExactly(DataSource dataSource, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = dataSource.read(bArr, i2, i - i2);
            if (read == -1) {
                zy.i(r7.x(i2, i, "Not enough data could be read: ", " < "));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static byte[] readToEnd(DataSource dataSource) {
        byte[] bArr = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArr.length) {
                bArr = Arrays.copyOf(bArr, bArr.length * 2);
            }
            i = dataSource.read(bArr, i2, bArr.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return Arrays.copyOf(bArr, i2);
    }
}
