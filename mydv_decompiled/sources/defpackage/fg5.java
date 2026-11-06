package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class fg5 extends hc4 {
    public final /* synthetic */ byte e;

    public /* synthetic */ fg5(byte b) {
        this.e = b;
    }

    public static int j0(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            hc4 hc4Var = lg5.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return lg5.b(i, ve5.e(j, bArr));
        }
        if (i2 == 2) {
            return lg5.c(i, ve5.e(j, bArr), ve5.e(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // defpackage.hc4
    public final int c0(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int i4 = i;
        switch (this.e) {
            case 0:
                while (i4 < i2 && bArr[i4] >= 0) {
                    i4++;
                }
                if (i4 < i2) {
                    while (i4 < i2) {
                        int i5 = i4 + 1;
                        byte b2 = bArr[i4];
                        if (b2 < 0) {
                            if (b2 < -32) {
                                if (i5 >= i2) {
                                    return b2;
                                }
                                if (b2 >= -62) {
                                    i4 += 2;
                                    if (bArr[i5] > -65) {
                                    }
                                }
                                return -1;
                            }
                            if (b2 >= -16) {
                                if (i5 >= i2 - 2) {
                                    return lg5.d(bArr, i5, i2);
                                }
                                int i6 = i4 + 2;
                                byte b3 = bArr[i5];
                                if (b3 <= -65 && (((b3 + 112) + (b2 << 28)) >> 30) == 0) {
                                    int i7 = i4 + 3;
                                    if (bArr[i6] <= -65) {
                                        i4 += 4;
                                        if (bArr[i7] > -65) {
                                        }
                                    }
                                }
                                return -1;
                            }
                            if (i5 >= i2 - 1) {
                                return lg5.d(bArr, i5, i2);
                            }
                            int i8 = i4 + 2;
                            byte b4 = bArr[i5];
                            if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                                i4 += 3;
                                if (bArr[i8] > -65) {
                                }
                            }
                            return -1;
                        }
                        i4 = i5;
                    }
                }
                return 0;
            default:
                if ((i4 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i2)));
                }
                long j = i4;
                int i9 = (int) (i2 - j);
                if (i9 < 16) {
                    i3 = 0;
                    b = 0;
                } else {
                    int i10 = 8 - (((int) j) & 7);
                    long j2 = j;
                    i3 = 0;
                    b = 0;
                    while (true) {
                        if (i3 < i10) {
                            long j3 = j2 + 1;
                            if (ve5.e(j2, bArr) >= 0) {
                                i3++;
                                j2 = j3;
                            }
                        } else {
                            while (true) {
                                int i11 = i3 + 8;
                                if (i11 <= i9 && (ve5.i(ve5.f + j2, bArr) & (-9187201950435737472L)) == 0) {
                                    j2 += 8;
                                    i3 = i11;
                                }
                            }
                            while (true) {
                                if (i3 < i9) {
                                    long j4 = j2 + 1;
                                    if (ve5.e(j2, bArr) >= 0) {
                                        i3++;
                                        j2 = j4;
                                    }
                                } else {
                                    i3 = i9;
                                }
                            }
                        }
                    }
                }
                int i12 = i9 - i3;
                long j5 = j + i3;
                while (true) {
                    byte b5 = b;
                    while (true) {
                        if (i12 > 0) {
                            long j6 = j5 + 1;
                            b5 = ve5.e(j5, bArr);
                            if (b5 >= 0) {
                                i12--;
                                j5 = j6;
                            } else {
                                j5 = j6;
                            }
                        }
                    }
                    if (i12 == 0) {
                        return b;
                    }
                    int i13 = i12 - 1;
                    if (b5 < -32) {
                        if (i13 == 0) {
                            return b5;
                        }
                        i12 -= 2;
                        if (b5 >= -62) {
                            long j7 = j5 + 1;
                            if (ve5.e(j5, bArr) <= -65) {
                                j5 = j7;
                            }
                        }
                    } else if (b5 < -16) {
                        if (i13 < 2) {
                            return j0(j5, bArr, b5, i13);
                        }
                        i12 -= 3;
                        long j8 = j5 + 1;
                        byte e = ve5.e(j5, bArr);
                        if (e <= -65 && ((b5 != -32 || e >= -96) && (b5 != -19 || e < -96))) {
                            j5 += 2;
                            if (ve5.e(j8, bArr) > -65) {
                            }
                        }
                    } else {
                        if (i13 < 3) {
                            return j0(j5, bArr, b5, i13);
                        }
                        i12 -= 4;
                        long j9 = j5 + 1;
                        byte e2 = ve5.e(j5, bArr);
                        if (e2 <= -65 && (((e2 + 112) + (b5 << 28)) >> 30) == 0) {
                            long j10 = j5 + 2;
                            if (ve5.e(j9, bArr) <= -65) {
                                j5 += 3;
                                if (ve5.e(j10, bArr) > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.hc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String u(byte[] r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg5.u(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    @Override // defpackage.hc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(java.lang.String r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg5.w(java.lang.String, byte[], int, int):int");
    }
}
