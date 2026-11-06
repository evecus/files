package coil3.fetch;

import coil3.ImageLoader;
import coil3.Uri;
import coil3.decode.DataSource;
import coil3.decode.ImageSourceKt;
import coil3.fetch.Fetcher;
import coil3.request.Options;
import defpackage.au;
import defpackage.cu;
import defpackage.cz;
import defpackage.er0;
import defpackage.fj0;
import defpackage.hf1;
import defpackage.j42;
import defpackage.jx4;
import defpackage.nt3;
import defpackage.o7;
import defpackage.p70;
import defpackage.s83;
import defpackage.xt;
import defpackage.z50;
import defpackage.zy;

/* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
/* loaded from: classes2.dex */
public final class DataUriFetcher implements Fetcher {
    private static final String BASE64_TAG = ";base64,";
    private static final Companion Companion = new Companion(null);
    private final Options options;
    private final Uri uri;

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    /* loaded from: classes.dex */
    public static final class Factory implements Fetcher.Factory<Uri> {
        @Override // coil3.fetch.Fetcher.Factory
        public Fetcher create(Uri uri, Options options, ImageLoader imageLoader) {
            if (j42.c(uri.getScheme(), "data")) {
                return new DataUriFetcher(uri, options);
            }
            return null;
        }
    }

    public DataUriFetcher(Uri uri, Options options) {
        this.uri = uri;
        this.options = options;
    }

    @Override // coil3.fetch.Fetcher
    public Object fetch(fj0 fj0Var) {
        int i;
        int i2;
        byte[] bArr;
        boolean z;
        int i3;
        int i4 = 0;
        char c = 6;
        int J = jx4.J(this.uri.toString(), BASE64_TAG, 0, false, 6);
        Uri uri = this.uri;
        if (J == -1) {
            s83.k(uri, "invalid data uri: ");
            return null;
        }
        int I = jx4.I(uri.toString(), ':', 0, 6);
        Uri uri2 = this.uri;
        if (I == -1) {
            s83.k(uri2, "invalid data uri: ");
            return null;
        }
        String substring = uri2.toString().substring(I + 1, J);
        xt xtVar = au.c;
        String uri3 = this.uri.toString();
        int i5 = J + 8;
        int length = uri3.length();
        xtVar.getClass();
        boolean z2 = xtVar.b;
        p70.E(i5, length, uri3.length());
        byte[] bytes = uri3.substring(i5, length).getBytes(z50.d);
        bytes.getClass();
        int length2 = bytes.length;
        p70.E(0, length2, bytes.length);
        int i6 = -2;
        if (length2 == 0) {
            i2 = 0;
        } else {
            if (length2 == 1) {
                s83.t(hf1.u(length2, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "));
                return null;
            }
            if (z2) {
                int i7 = 0;
                i = length2;
                while (true) {
                    char c2 = c;
                    if (i7 >= length2) {
                        break;
                    }
                    int i8 = cu.a[bytes[i7] & 255];
                    if (i8 < 0) {
                        if (i8 == -2) {
                            i -= length2 - i7;
                            break;
                        }
                        i--;
                    }
                    i7++;
                    c = c2;
                }
            } else if (bytes[length2 - 1] == 61) {
                i = length2 - 1;
                if (bytes[length2 - 2] == 61) {
                    i = length2 - 2;
                }
            } else {
                i = length2;
            }
            i2 = (int) ((i * 6) / 8);
        }
        byte[] bArr2 = new byte[i2];
        int[] iArr = xtVar.a ? cu.b : cu.a;
        int i9 = -8;
        int i10 = 0;
        int i11 = 8;
        int i12 = -8;
        int i13 = 0;
        while (true) {
            if (i13 >= length2) {
                bArr = bytes;
                z = false;
                break;
            }
            if (i12 != i9 || (i3 = i13 + 3) >= length2) {
                bArr = bytes;
            } else {
                bArr = bytes;
                int i14 = i13 + 4;
                int i15 = (iArr[bArr[i13 + 2] & 255] << 6) | (iArr[bytes[i13 + 1] & 255] << 12) | (iArr[bytes[i13] & 255] << 18) | iArr[bArr[i3] & 255];
                if (i15 >= 0) {
                    bArr2[i4] = (byte) (i15 >> 16);
                    int i16 = i4 + 2;
                    bArr2[i4 + 1] = (byte) (i15 >> 8);
                    i4 += 3;
                    bArr2[i16] = (byte) i15;
                    bytes = bArr;
                    i13 = i14;
                    i6 = -2;
                    i9 = -8;
                }
            }
            int i17 = bArr[i13] & 255;
            int i18 = iArr[i17];
            if (i18 >= 0) {
                i13++;
                i10 = (i10 << 6) | i18;
                int i19 = i12 + 6;
                if (i19 >= 0) {
                    bArr2[i4] = (byte) (i10 >>> i19);
                    i10 &= (1 << i19) - 1;
                    i12 -= 2;
                    i4++;
                } else {
                    i12 = i19;
                }
                bytes = bArr;
                i6 = -2;
                i9 = -8;
                i11 = 8;
            } else if (i18 == -2) {
                if (i12 == -8) {
                    s83.t(hf1.u(i13, "Redundant pad character at index "));
                    return null;
                }
                if (i12 != -6) {
                    if (i12 == -4) {
                        int i20 = i13 + 1;
                        if (z2) {
                            while (i20 < length2) {
                                if (cu.a[bArr[i20] & 255] != -1) {
                                    break;
                                }
                                i20++;
                            }
                        }
                        if (i20 == length2 || bArr[i20] != 61) {
                            s83.t(hf1.u(i20, "Missing one pad character at index "));
                            return null;
                        }
                        i13 = i20 + 1;
                        z = true;
                        i6 = -2;
                    } else if (i12 != -2) {
                        zy.i("Unreachable");
                        return null;
                    }
                }
                i13++;
                z = true;
                i6 = -2;
            } else {
                if (!z2) {
                    char c3 = (char) i17;
                    o7.k(i11);
                    String num = Integer.toString(i17, i11);
                    num.getClass();
                    throw new IllegalArgumentException("Invalid symbol '" + c3 + "'(" + num + ") at index " + i13);
                }
                i13++;
                bytes = bArr;
                i6 = -2;
                i9 = -8;
            }
        }
        if (i12 == i6) {
            s83.t("The last unit of input does not have enough bits");
            return null;
        }
        if (i12 != -8 && !z) {
            s83.t("The padding option is set to PRESENT, but the input is not properly padded");
            return null;
        }
        if (i10 != 0) {
            s83.t("The pad bits must be zeros");
            return null;
        }
        if (z2) {
            while (i13 < length2) {
                if (cu.a[bArr[i13] & 255] != -1) {
                    break;
                }
                i13++;
            }
        }
        if (i13 >= length2) {
            if (i4 != i2) {
                zy.i("Check failed.");
                return null;
            }
            cz czVar = new cz();
            czVar.m196write(bArr2, 0, i2);
            return new SourceFetchResult(ImageSourceKt.ImageSource$default(czVar, this.options.getFileSystem(), null, 4, null), substring, DataSource.MEMORY);
        }
        int i21 = bArr[i13] & 255;
        StringBuilder sb = new StringBuilder("Symbol '");
        sb.append((char) i21);
        sb.append("'(");
        o7.k(8);
        String num2 = Integer.toString(i21, 8);
        num2.getClass();
        sb.append(num2);
        sb.append(") at index ");
        s83.t(nt3.n(sb, i13 - 1, " is prohibited after the pad character"));
        return null;
    }

    /* compiled from: r8-map-id-c2f6a97aa2e8a24cc4494d4253d5e904442917ade8115d3074f7f7c1f1495db8 */
    public static final class Companion {
        public /* synthetic */ Companion(er0 er0Var) {
            this();
        }

        private Companion() {
        }
    }
}
