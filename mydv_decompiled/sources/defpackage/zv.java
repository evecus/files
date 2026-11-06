package defpackage;

import java.math.BigInteger;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public abstract class zv {
    public static final BigInteger a = BigInteger.valueOf(0);
    public static final BigInteger b = BigInteger.valueOf(1);
    public static final BigInteger c;

    static {
        BigInteger.valueOf(2L);
        BigInteger.valueOf(3L);
        c = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    }

    public static BigInteger a(int i, SecureRandom secureRandom) {
        if (i < 1) {
            s83.t("bitLength must be at least 1");
            return null;
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i2 * 8) - i))));
        return new BigInteger(1, bArr);
    }

    public static BigInteger b(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            s83.t("'min' may not be greater than 'max'");
            return null;
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return b(a, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (int i = 0; i < 1000; i++) {
            BigInteger a2 = a(bigInteger2.bitLength(), secureRandom);
            if (a2.compareTo(bigInteger) >= 0 && a2.compareTo(bigInteger2) <= 0) {
                return a2;
            }
        }
        return a(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    public static BigInteger c(byte[] bArr, int i, int i2) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
