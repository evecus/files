package defpackage;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class gg5 extends fb4 {
    public final /* synthetic */ byte e;

    public /* synthetic */ gg5(byte b) {
        this.e = b;
    }

    public static int g0(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            fb4 fb4Var = ng5.a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return ng5.b(i, we5.e(j, bArr));
        }
        if (i2 == 2) {
            return ng5.c(i, we5.e(j, bArr), we5.e(j + 1, bArr));
        }
        throw new AssertionError();
    }

    @Override // defpackage.fb4
    public final int N(byte[] bArr, int i, int i2) {
        byte b;
        int i3;
        int i4;
        int i5 = i;
        byte b2 = -19;
        switch (this.e) {
            case 0:
                while (i5 < i2 && bArr[i5] >= 0) {
                    i5++;
                }
                if (i5 < i2) {
                    while (i5 < i2) {
                        int i6 = i5 + 1;
                        byte b3 = bArr[i5];
                        if (b3 >= 0) {
                            i5 = i6;
                        } else if (b3 < -32) {
                            if (i6 >= i2) {
                                return b3;
                            }
                            if (b3 < -62) {
                                return -1;
                            }
                            i5 += 2;
                            if (bArr[i6] > -65) {
                                return -1;
                            }
                        } else if (b3 < -16) {
                            if (i6 >= i2 - 1) {
                                return ng5.d(bArr, i6, i2);
                            }
                            int i7 = i5 + 2;
                            byte b4 = bArr[i6];
                            if (b4 > -65) {
                                return -1;
                            }
                            if (b3 == -32 && b4 < -96) {
                                return -1;
                            }
                            if (b3 == -19 && b4 >= -96) {
                                return -1;
                            }
                            i5 += 3;
                            if (bArr[i7] > -65) {
                                return -1;
                            }
                        } else {
                            if (i6 >= i2 - 2) {
                                return ng5.d(bArr, i6, i2);
                            }
                            int i8 = i5 + 2;
                            byte b5 = bArr[i6];
                            if (b5 > -65 || (((b5 + 112) + (b3 << 28)) >> 30) != 0) {
                                return -1;
                            }
                            int i9 = i5 + 3;
                            if (bArr[i8] > -65) {
                                return -1;
                            }
                            i5 += 4;
                            if (bArr[i9] > -65) {
                                return -1;
                            }
                        }
                    }
                }
                return 0;
            default:
                int i10 = 2;
                if ((i5 | i2 | (bArr.length - i2)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)));
                }
                long j = i5;
                int i11 = (int) (i2 - j);
                if (i11 < 16) {
                    b = 0;
                    i3 = 0;
                } else {
                    long j2 = j;
                    b = 0;
                    i3 = 0;
                    while (true) {
                        if (i3 < i11) {
                            long j3 = j2 + 1;
                            if (we5.e(j2, bArr) >= 0) {
                                i3++;
                                j2 = j3;
                            }
                        } else {
                            i3 = i11;
                        }
                    }
                }
                int i12 = i11 - i3;
                long j4 = j + i3;
                while (true) {
                    byte b6 = b;
                    while (true) {
                        if (i12 > 0) {
                            long j5 = j4 + 1;
                            byte e = we5.e(j4, bArr);
                            if (e >= 0) {
                                i12--;
                                b6 = e;
                                j4 = j5;
                            } else {
                                b6 = e;
                                j4 = j5;
                            }
                        }
                    }
                    if (i12 == 0) {
                        return b;
                    }
                    int i13 = i12 - 1;
                    if (b6 < -32) {
                        if (i13 == 0) {
                            return b6;
                        }
                        i12 -= 2;
                        if (b6 < -62) {
                            return -1;
                        }
                        long j6 = j4 + 1;
                        if (we5.e(j4, bArr) > -65) {
                            return -1;
                        }
                        j4 = j6;
                        i4 = i10;
                    } else if (b6 >= -16) {
                        i4 = i10;
                        if (i13 < 3) {
                            return g0(j4, bArr, b6, i13);
                        }
                        i12 -= 4;
                        long j7 = j4 + 1;
                        byte e2 = we5.e(j4, bArr);
                        if (e2 > -65 || (((e2 + 112) + (b6 << 28)) >> 30) != 0) {
                            return -1;
                        }
                        long j8 = j4 + 2;
                        if (we5.e(j7, bArr) > -65) {
                            return -1;
                        }
                        j4 += 3;
                        if (we5.e(j8, bArr) > -65) {
                            return -1;
                        }
                    } else {
                        if (i13 < i10) {
                            return g0(j4, bArr, b6, i13);
                        }
                        i12 -= 3;
                        i4 = i10;
                        long j9 = j4 + 1;
                        byte e3 = we5.e(j4, bArr);
                        if (e3 > -65) {
                            return -1;
                        }
                        if (b6 == -32 && e3 < -96) {
                            return -1;
                        }
                        if (b6 == b2 && e3 >= -96) {
                            return -1;
                        }
                        j4 += 2;
                        if (we5.e(j9, bArr) > -65) {
                            return -1;
                        }
                    }
                    i10 = i4;
                    b2 = -19;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f3  */
    @Override // defpackage.fb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String j(byte[] r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg5.j(byte[], int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0184  */
    @Override // defpackage.fb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l(java.lang.String r26, byte[] r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gg5.l(java.lang.String, byte[], int, int):int");
    }
}
